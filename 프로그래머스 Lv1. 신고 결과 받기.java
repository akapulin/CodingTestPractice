/**

      첫 번째, 문제 풀이
      결과 : 시간초과로 테스트 2개만 통과
      이유 :
            1) 답을 찾기 위해 필요한 정보가 무엇인지 정확히 인지 못함
            2) 시간 생각안하고 HashMap, ArrayList, 3중 for문 사용

*/

/*

/*
		int[] criminalCount = new int[id_list.length];
		
		HashMap<Integer, ArrayList<String>> reporter = new HashMap<Integer, ArrayList<String>>();
		//초기화
		for(int i=0;i<id_list.length;i++) {
		
			reporter.put(i, new ArrayList<String>());
		}	
		*/

		//신고당한 횟수 찾기
		/*
		for(int i=0;i<report.length;i++) {
			String[] str = report[i].split(" ");
			for(int j=0;j<id_list.length;j++) {
				if(id_list[j].equals(str[1])) {
					if(!reporter.get(j).contains(str[0])) {
						criminalCount[j]+=1;
						reporter.get(j).add(str[0]);
					}
					break;
				}
			}
		}*/
		
		//신고당한 횟수 
		/*
		for(int i=0;i<criminalCount.length;i++) {
			if(criminalCount[i]>=k) {
				for(int j=0;j<report.length;j++) {
					String[] str = report[j].split(" ");
					
					if(str[1].equals(id_list[i])) {
						for(int l=0;l<id_list.length;l++) {
							if(id_list[l].equals(str[0])) {
								answer[l]+=1;
								break;
							}
						}
					}
				}
			}
		}
		*/

*/
/**

    두 번째, 문제 풀이
    결과 : 통과
    이유 : 
          1) for문과 hashmap, list의 과중 사용이 오히려 느리지 않을까 생각해 이중배열로 문제 해결
          2) 조건에 report 배열의 길이가 상당히 길이서 report는 1번만 사용하도록 하고 id_list 배열 위주로 기준을 세운 후 해결

    피드백 :
          1) 다른 사람 문제풀이 결과, distinct 혹은 hashset으로 중복제거를 먼저 처리
          2) java로 문제를 풀었는데 너무나 c 답게 풀이 함

*/
class Solution {
    private int findIndex(String[] id_list, String name){
        int num=0;
        for(int i=0;i<id_list.length;i++){
            if(id_list[i].equals(name)){
                num=i;
                break;
            }
        }
        return num;
    }
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        boolean[][] reporter = new boolean[id_list.length][id_list.length];
        int[] criminal = new int[id_list.length];

        for(int i=0;i<report.length;i++){
            String[] str= report[i].split(" ");
            int r_index = findIndex(id_list,str[0]);
            int c_index = findIndex(id_list,str[1]);
            if(!reporter[r_index][c_index]){
                reporter[r_index][c_index] = true;
                criminal[c_index]+=1;
            }
        }

        for(int i =0;i<id_list.length;i++){
            if(criminal[i]>=k){
                for(int j=0;j<id_list.length;j++){
                    if(reporter[j][i]==true){
                        answer[j]+=1;
                    }
                }
            }
        }
        return answer;
    }
}
  
  
  
  
  
  
  
  
  
  
