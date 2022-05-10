/**
       첫 번째, 문제 풀이
       결과 : 성공
       피드백 : 
               1) 일단 이런 문제는 무조건 O(n)이라는 것을 눈치채서 한 번의 for문으로 풀려고 시도했다.
               2) ArrayList만들었다가 stack을 요구하는 문제임을 눈치챘다.
               3) 코테연습도 계속 하다보니까 속도가 확실히 빨라지는구나~! 5분만에 해결

              
 */
import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(char c : charArray) {
            if(stack.size()!=0) {
                char lastChar = stack.lastElement();
                if(lastChar=='('&&c==')') {
                    stack.pop();
                    continue;
                }
            }
            stack.add(c);
        }
        if(stack.size()!=0) {
            answer = false;
        }
        return answer;
    }
}
