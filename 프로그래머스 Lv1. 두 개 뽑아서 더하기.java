/**
       첫 번째, 문제 풀이
       결과 : 통과
       피드백 : 
               1) HashSet정렬법에 대해서 배웠다
               2) TreeSet도 사용해보았지만 살짝 느렸다.

import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {

        HashSet<Integer> results = new HashSet<Integer>();
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(i!=j){
                    results.add(numbers[i]+numbers[j]);
                }
            }
        }
        List<Integer> sortResults = new ArrayList<Integer>(results);
        Collections.sort(sortResults);
        int[] answer = new int[sortResults.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = sortResults.get(i);
        }
        
        //TreeSet이용
        /*
        TreeSet<Integer> results2 = new TreeSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {
          for (int j = 0; j < numbers.length; j++) {
            if (i != j) {
              results2.add(numbers[i] + numbers[j]);
            }
          }
        }

        int[] answer = new int[results2.size()];
        Iterator<Integer> iter = results2.iterator();

        for(int i=0;i<answer.length;i++) {
          answer[i] = iter.next();
        }
        */
        return answer;
    }
}

           
 */
