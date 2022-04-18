/**
      첫 번째, 문제 풀이
      결과 : 통과
      피드백 : 
              1) 3중 for문을 사용하였는데, 이 문제는 이 외에 더 개선할 만한 부분이 찾기 힘들었다.
*/

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for(int j=i+1;j<nums.length-1;j++) {
                for(int k=j+1;k<nums.length;k++) {
                    int addNum = nums[i]+nums[j]+nums[k];
                    if(checkPrimeNum(addNum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    private boolean checkPrimeNum(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false; 
            }
        }
        return true;
    }
}
