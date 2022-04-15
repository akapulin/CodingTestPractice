/**
      첫 번째, 문제 풀이
      결과 : 통과
      피드백 : 
              1) 나름 고민해서 풀었는데, 다른사람 풀이를 보니 replaceAll로 처리....반성
       
*/
import java.util.ArrayList;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr_alpha = {"zero", "one", "two", "three", "four", "five", "six", "seven","eight","nine"};
        ArrayList<Integer> list_answer = new ArrayList<Integer>();
        char[] arr_char = s.toCharArray();
        int i=0;
        StringBuffer word = new StringBuffer("");
        while(i<arr_char.length) {
            //숫자면
            if(Character.isDigit(arr_char[i])) {
                list_answer.add(Character.getNumericValue(arr_char[i]));
                i++;
            }
            //영문이면
            else {
                word.append(arr_char[i]);
                for(int j=0;j<arr_alpha.length;j++) {
                    if(word.toString().equals(arr_alpha[j])) {
                        list_answer.add(getNumber(arr_alpha[j]));
                        word.setLength(0);
                    }
                }
                i++;
            }
        }
       StringBuffer str_buffer = new StringBuffer();
        for(int num : list_answer) {
            str_buffer.append(String.valueOf(num));
        }
        answer = Integer.parseInt(str_buffer.toString());
        return answer;
    }
    private int getNumber(String str) {
        int num = 0;
        switch(str) {
        case "zero":
            num = 0;
            break;
        case "one":
            num = 1;
            break;
        case "two":
            num = 2;
            break;
        case "three":
            num = 3;
            break;
        case "four":
            num = 4;
            break;
        case "five":
            num = 5;
            break;
        case "six":
            num = 6;
            break;
        case "seven":
            num = 7;
            break;
        case "eight":
            num = 8;
            break;
        case "nine":
            num = 9;
            break;

        }

        return num;

    }
}
