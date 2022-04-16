/**
      첫 번째, 문제 풀이
      결과 : 통과
      피드백 : 
              1) true or false 처리는 삼항연산자로 처리하면 좋겠다
*/


class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0;i<signs.length;i++){
            if(signs[i]==true){
                answer = answer + absolutes[i];    
            }
            else{
                answer = answer - absolutes[i];
            }
          //answer += (signs[i])? +absolutes[i] : -absolutes[i];
        }

        return answer;
    }
}
