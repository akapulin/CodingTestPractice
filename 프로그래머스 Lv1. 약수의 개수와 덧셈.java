/**
      첫 번째, 문제 풀이
      결과 : 통과
      피드백 :
            1) 제곱수의 경우 약수의 갯수가 홀수 / 반대는 짝수라고 한다
          
*/

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<=right;i++){
            int num = getAliquot(i);
            if(num%2==0){
                answer += i;
            }
            else{
                answer -= i;
            }
        }



        return answer;
    }

     private int getAliquot(int n){
        int result=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                result++;
            }
        }
        return result;
    }
}
