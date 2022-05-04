/**
       첫 번째, 문제 풀이
       결과 : 테스트케이스 통과 / 효율성 실패
       피드백 : 
               1) 아직 lv1도 배울게 많다
               2) arr[i-1]과 비교를 하는게 아니라, arr[i-1]을 다른 변수로 저장해두고, 그 변수와 비교하면 더 깔끔하다.
               3) list->array 로 변환할 때 toArray 는 primitive type이 적용이 안되서, stream으로 처리해야하는 것을 알았다.
           
 */

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {


        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(i==0){
                list.add(arr[i]);
            }
            if(i!=0&&arr[i]!=arr[i-1]){
                list.add(arr[i]);
            }
        }
        /*
        * primitive type은 toArray가 안된다!
        *int[] answer = list.toArray(new int[list.size()]);
        */
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
