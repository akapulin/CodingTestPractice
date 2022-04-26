/**
       첫 번째, 문제 풀이
       결과 : 테스트케이스 통과 / 효율성 실패
       피드백 : 
               1) 제일 오래걸리는 테스트 케이스 2000ms
               2) 풀이는 쉬웠으나, 2000ms 나오는 것 보고 풀이를 물어보는 문제가 아니였구나 깨달음
               3) for문2번, while(true) 1번사용
           
 */

/**
       두 번째, 문제 풀이
       결과 : 테스트케이스 통과 / 효율성 실패
       피드백 : 
               1) 2000ms -> 500ms -> 300ms 줄임
               2) 첫번째 ArrayList가 문제였나? 싶어서 배열로 품 -> 결과 더 최악 
               3) 조건문을 줄이고, break문 순서를 바꿔서 500ms 정도로 나옴 하지만 효율성 실패...
           
 */


/**
       세 번째, 문제 풀이
       결과 : 테스트케이스 통과 / 효율성 통과
       피드백 : 
               1) 너무 답이 안나와서 질문코너 살짝 참고하니, 스택을 이용하여 O(n)에 풀었다고함, 왜 스택이지? 생각하니
               2) char배열을 arrayList에 넣을 때 부터, 중복을 걸러주면 되었다!!!
               3) for문 1개로 최종 50ms 정도로 나왔다.
               4) 이런 비슷한 문제를 풀었던 적이 있었는데 또 낚인 듯한 기분.. 다음에는 더 빨리 눈치채기를! 
           
 */


import java.util.ArrayList;
import java.util.LinkedList;

public class Solution16 {
	public int solution(String s) {
		int answer = -1;

		char[] charArray = s.toCharArray();
		ArrayList<Character> strList = new ArrayList<Character>();

		for (int i = 0; i < charArray.length; i++) {

			if (strList.size() > 0) {
				if (charArray[i] == strList.get(strList.size() - 1)) {
					strList.remove(strList.size() - 1);
					continue;
				}
			}

			strList.add(charArray[i]);
		}
    
     if(strList.size()==0)
          answer=1;
     else
          answer=0;
		

		/*
		 * int i=0; while(i<strList.size()-1) { if(strList.get(i)==strList.get(i+1)) {
		 * int k=i; strList.remove(i); strList.remove(i); if((k-1)>0) { i=k-1; } else {
		 * i=0; } continue; } i++; } for(int j=0;j<strList.size();j++) {
		 * System.out.println(strList.get(j)); }
		 */
		/*
		 * for(int i=0;i<charArray.length;) { if(i<charArray.length-1) { StringBuilder
		 * strBuilder = new StringBuilder(); strBuilder.append(charArray[i]);
		 * strBuilder.append(charArray[i+1]); i=i+2; strList.add(strBuilder.toString());
		 * continue; } if(i==charArray.length-1) { StringBuilder strBuilder = new
		 * StringBuilder(); strBuilder.append(charArray[i]);
		 * strList.add(strBuilder.toString()); } i++; } for(int
		 * i=0;i<strList.size();i++) { System.out.println(strList.get(i)); }
		 * 
		 */

		/*
		 * int i=0;
		 * 
		 * while(true) { if(i==charArray.length-1) { break; }
		 * if((i<charArray.length-1)&&charArray[i]!='A') { if(charArray[i+1]!='A') {
		 * if(charArray[i]==charArray[i+1]) { charArray[i]='A'; charArray[i+1]='A'; i=0;
		 * continue; } }else { for(int j=i+1;j<charArray.length;j++) {
		 * if(charArray[i]==charArray[j]) { charArray[i]='A'; charArray[j]='A'; i=0;
		 * 
		 * break; } }
		 * 
		 * 
		 * }
		 * 
		 * 
		 * } i++;
		 * 
		 * } answer = 0; boolean checkTrue = false; for(int j=0;j<charArray.length;j++)
		 * { System.out.println(charArray[j]); if(charArray[j]!='A') checkTrue = true; }
		 * if(checkTrue == false) { answer =1; }
		 * 
		 */

		/*
		 * int i=0; while(true) { if(charList.size()==0 || i==charList.size()-1) {
		 * break; } if(charList.get(i)==charList.get(i+1)) { charList.remove(i);
		 * charList.remove(i); i=0; continue; }
		 * 
		 * 
		 * i++; }
		 * 
		 * 
		 * if(charList.size()==0) { answer = 1; } else { answer = 0; }
		 * 
		 */

		return answer;
	}

	public static void main(String[] args) {
		String s = "baabaa";
		Solution16 sol = new Solution16();
		System.out.println(sol.solution(s));
	}

}
