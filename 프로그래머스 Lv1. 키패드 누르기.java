/**
      첫 번째, 문제 풀이
      결과 : 통과
      피드백 : 
              1) else 부분과 별도의 getDistance 함수를 좀 더 깔끔하게 하면 좋을 듯 하다
              2) 카카오 문제는 참 재밌다
*/

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        /*
             *  필요한것 : 현재 왼손 위치, 오른손 위치
             *  
             */

            int right_pos = -1;
            int left_pos = -1;

            StringBuffer str_buffer = new StringBuffer();

            for(int i = 0; i<numbers.length;i++) {
                int num =numbers[i];
                if(num==1 || num==4 || num==7 ) {
                    str_buffer.append("L");
                    left_pos = num;
                }
                else if(num==3 || num==6 || num==9) {
                    str_buffer.append("R");
                    right_pos = num;
                }
                else {
                    int right_distance = getDistance(right_pos, num);
                    int left_distance = getDistance(left_pos, num);

                    if(right_distance>left_distance) {
                        str_buffer.append("L");
                        left_pos = num;
                    }
                    else if(right_distance<left_distance) {
                        str_buffer.append("R");
                        right_pos = num;
                    }
                    else {
                        if(hand.equals("right")) {
                            str_buffer.append("R");
                            right_pos = num;
                        }
                        else {
                            str_buffer.append("L");
                            left_pos = num;
                        }
                    }

                }
            }
            answer = str_buffer.toString();
        return answer;
    }
    private int getDistance(int pos, int num) {
        int distinct =0;
        //int pos_acct = 0;
        //int num_acct = 0;
        int[] pos_coordinate = {0,0};
        int[] num_coordinate = {0,0};

        int[][] keypad = { {1,2,3} , {4,5,6}, {7,8,9}, {-1,0,-1} };
        for(int i=0;i<keypad.length;i++) {
            for(int j=0;j<keypad[0].length;j++) {
                if(keypad[i][j]==num) {
                    num_coordinate[0] =i;
                    num_coordinate[1] =j;
                }
                if(keypad[i][j]==pos) {
                    pos_coordinate[0] =i;
                    pos_coordinate[1] =j;
                }
            }
        }

        distinct = Math.abs(num_coordinate[0]-pos_coordinate[0]);
        distinct += Math.abs(num_coordinate[1]-pos_coordinate[1]);


        return distinct;
    }
}
