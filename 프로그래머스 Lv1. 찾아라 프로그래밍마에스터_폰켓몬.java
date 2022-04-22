/**
       첫 번째, 문제 풀이
       결과 : 통과
       피드백 : 
               1) HashSet으로 중복문제를 해결
               2) stream.collector로도 해결가능 
           
 */

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int num : nums){
            hashSet.add(num);
        }
        if(hashSet.size()>(nums.length/2)) {
            answer = nums.length/2;
        }
        else {
            answer = hashSet.size();
        }
        return answer;
    }
}
