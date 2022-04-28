/**
       첫 번째, 문제 풀이 220428
       결과 : --
       피드백 : 
               1) 몇 일 전부터 눈여겨보던 문제인데, count세는데서 애를 먹고있다...내일은 꼭 풀자!
              
           
 */

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class Solution17 {

	public int solution(String s) {
		/**
		 * 
		 * 1. 최대 압축 단위를 찾는다
		 * 		1-1. String을 char 배열로 만든다.
		 * 			1/2 만큼
		 * 			ex. 8 -> 4 / 7-> 3
		 * 2. 큰 압축 단위부터, 압축 되는지 확인해본다
		 * 3. 압축되서 최종 숫자수를 저장해두는 변수를 만든다.(최종result)
		 * 
		 */
		
		char[] charArray = s.toCharArray();
		int maxComp = (int)charArray.length/2;
		
		
        int answer = 0;
        
        answer = compressStr(maxComp,charArray);
        
        return answer;
    }
	
	public int compressStr(int maxComp,char[] charArray) {
		if(maxComp<1) {
			return 0;
		}
		int result=0;
		int unitCount =1;
		int unitSum =0;
		StringBuilder strBuild = new StringBuilder();
		for(int j=0;j<maxComp;j++) {
			strBuild.append(charArray[j]);
		}
		
		for(int i=maxComp;;) {
			
			StringBuilder strBuild2 = new StringBuilder();
			for(int j=i;j<(maxComp+i);j++) {
				strBuild2.append(charArray[j]);
			}

			if(strBuild.toString().equals(strBuild2.toString())) {
				unitCount++;
			}
			else {
				result += String.valueOf(unitCount).length()+maxComp;
				unitCount=1;
				strBuild = strBuild2;
			}
			
			
			i=i+maxComp;
			
			if((i+maxComp)>charArray.length) {
				for(int j=i;j<charArray.length;j++) {
					result++;
				}
				break;
			}
			
			
		}
		if(unitSum==0) {
			result = String.valueOf(unitCount).length()+maxComp;
		}
		
		System.out.println("total count is "+result);
		int result2 = compressStr(--maxComp,charArray);
		if(result>result2 && result2!=0) {
			result = result2;
		}
		
		
		return result;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Solution17 sol = new Solution17();
		String s ="aabbaccc";
		System.out.println(sol.solution(s));
	}
}
