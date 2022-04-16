/**
      첫 번째, 문제 풀이
      결과 : 통과
      피드백 : 
              1) 처음에 ArrayList와 HashMap을 사용해 풀이하려 했으나, sort가 더 간단하지 않을까 해서 풀었더니 Map을 사용하는 문제였다(!!) 
              2) HashMap을 사용할 경우, 1개로 사용해서 풀면 간단하다!
*/


import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        /*
        // 나의 풀이
        // 둘다 알파벳순으로 정렬해서 비교하면 안될까?
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i =0; i<completion.length;i++) {
          if(!participant[i].equals(completion[i])) {
            answer = participant[i];
            break;
          }
        }
        if(answer.length()==0) {
          answer = participant[participant.length-1];
        }*/


        //다른사람 풀이 참고
        //기존에 참가자들을 +1 시켜주고, 참가 완료자 에게 -1 씩 해주면, 여러 동명이인이 생겨도 문제없음
        HashMap<String, Integer> str_map = new HashMap<String, Integer>();
        //디폴트값 1, 중복된 사람 2
        for(String str : participant) {
          str_map.put(str, str_map.getOrDefault(str,0)+1);
        }
        for(String str : completion) {
          str_map.put(str, str_map.get(str)-1);
        }
        for (String key : str_map.keySet()) {
                if (str_map.get(key) != 0){
                    answer = key;
                }
            }
		
        return answer;
    }
}
