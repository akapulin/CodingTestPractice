/**
      첫 번째, 문제 풀이
      결과 : 통과
      피드백 : 
              1) charArray.length를 변수 처리했으면 더 좋았을 듯 하다.
*/

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        if(charArray.length%2==0){
            answer = String.valueOf(charArray[charArray.length/2-1])+String.valueOf(charArray[charArray.length/2]);
        }else{
            answer = String.valueOf(charArray[(int)(charArray.length/2)]);
        }
        return answer;
    }
}
