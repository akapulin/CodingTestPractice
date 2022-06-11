/**
      첫 번째, 문제 풀이
      결과 : 통과
      피드백 : 
              1) 이런 문제를 탐욕법(Greedy)라고 한다.
              2) 내가 이해하기 쉬우려고 student배열을 1로 초기화 했는데, 다 풀고나니 없어도 되겠다.
*/
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] student = new int[n];
        /*1 2 3 4 5
        2 0 2 0 2
        1 2 3 4 5
        1 1 1 1 2*/
        for(int i=0;i<student.length;i++){
            student[i] = 1;
        }
        for(int i=0;i<reserve.length;i++){
            student[reserve[i]-1]++;
        }
        for(int i=0;i<lost.length;i++){
            student[lost[i]-1]--;
        }

        for(int i=0;i<student.length;i++){
            if(student[i]==0){
                //왼쪽먼저
                if(i>0){
                    if(student[i-1]>1){
                        student[i-1]--;
                        student[i]++;
                        continue;
                    }
                }
                //오른쪽
                if(i<student.length-1){
                    if(student[i+1]>1){
                        student[i+1]--;
                        student[i]++;
                        continue;
                    }
                }
            }
        }
        for(int i=0;i<student.length;i++){
            if(student[i]>0){
                answer++;
            }
        }

        return answer;
    }
}
