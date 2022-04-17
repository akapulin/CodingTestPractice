/**
      첫 번째, 문제 풀이
      결과 : 통과
      피드백 : 
              1) 카카오 문제치고는 비교적 짧은 시간에 풀었다.
              2) 다른사람풀이를 보고 java에 Stack이라는 내장 클래스가 있는 것을 알았다!! 
*/
import java.util.ArrayList;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList <Integer> basket = new ArrayList<Integer>();
        basket.add(0);
        for(int i=0;i<moves.length;i++) {
            for(int j=0;j<board.length;j++) {
                if(board[j][moves[i]-1]!=0) {
                    answer += getBasketBubble(basket,num);
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }

        }
        return answer;
    }
    private int getBasketBubble(ArrayList<Integer> basket, int num) {
        int bubble =0;
        if(basket.get(basket.size()-1)==num) {
            basket.remove(basket.size()-1);
            bubble = 2;
        }
        else {
            basket.add(num);
        }
        return bubble;
    }
}
