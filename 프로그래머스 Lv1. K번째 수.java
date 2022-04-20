/**
       첫 번째, 문제 풀이
       결과 : 통과
       피드백 : 
               1) today, I tested on the Ipad, so the code is little strange but result is good
           

 */



import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer =  new int[commands.length];
        int aNum =0;
        for(int m=0;m<commands.length;m++){
            int i =commands[m][0]-1;
        int j =commands[m][1];
            int k=commands[m][2];
            int [] temp = new int[j-i+1];
            int num =0;
            for(;i<j;i++,num++){
                temp[num] = array[i];
            }
            Arrays.sort(temp);
            answer[aNum]=temp[k];
            aNum++;
        }

        return answer;
    }

}
