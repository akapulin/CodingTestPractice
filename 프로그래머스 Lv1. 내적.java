/**
      첫 번째, 문제 풀이
      결과 : 통과
      피드백 : 
              1) 주석참고

*/

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i =0; i<a.length; i++){
            int num = a[i]*b[i];
            answer += num;
        }
        //다른사람문제풀이참고
        //return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
        return answer;
    }
}
