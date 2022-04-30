/**
       첫 번째, 문제 풀이
       결과 : --
       피드백 : 
               1) 한 번에, 통과했지만 효율성케이스3,4 안됨
                 
       두 번째, 문제 풀이
       결과 : --
       피드백 : 
               1) 무한 잘못됨을 반복함...더욱 효율성은 나빠지고 실패 테스트케이스도 나타남
               2) for2번으로도 해결이 안됨
       
       세 번째, 문제 풀이
       결과 : 성공
       피드백 : 
               1) 3시간 넘게 걸려서 다른사람풀이 도움을 받음
               2) Arraysort와 startsWith으로 5줄로 해결(ㅜㅜ)~! 
               3) startsWith을 구현하려면 7줄이나 필요했는데 이제는 그럴필요가 없구나 확실히 알았다! 
               4) 다음번에 1시간 넘게 걸리면, 넘어가야겠다 
              
 */

import java.util.*;

public class Solution18 {
	public boolean solution(String[] phone_book) {

		boolean answer = true;
		
		Arrays.sort(phone_book);
		
		for(int i=0;i<phone_book.length-1;i++) {
			if(phone_book[i+1].startsWith(phone_book[i])) {
				answer=false;
				break;
			}
		}
		
		/*
		for (int i = 0; i < phone_book.length; i++) {
			
			for(int j=0;j<arrayList.size();j++) {
				String str1=""; //작은수
				String str2=""; //큰수
				if(phone_book[i].length()>arrayList.get(j).length()) {
					str1 = arrayList.get(j);
					str2 = phone_book[i];
				}
				else {
					str1 = phone_book[i];
					str2 =  arrayList.get(j);
				}
				if(str2.contains(str1)) {
					//앞접두사 검사
					String str3 = str2.substring(0,str1.length());
					if(str1.equals(str3)) {
						answer = false;
						break;
					}
					
					//뒤접두사검사
					String str4 = str2.substring(str2.length()-str1.length());
					if(str1.equals(str4)) {
						answer = false;
						break;
					}
				}
				
			
			}
			if(answer==false) {
				break;
			}
			arrayList.add(phone_book[i]);

		}
		
		*/
		
		//나중에 삽입하는게 무조건 length가 길다!
		/*ArrayList<String> arrayList2 = new ArrayList<String>();
		for(int i=0;i<phone_book.length;i++) {
			arrayList.add(phone_book[i]);
			arrayList2.add(phone_book[i]);
		}
		for(int i=0;i<arrayList.size();i++) {
			for(int j=0;j<arrayList2.size();j++) {
				if(i!=j) {
					if(arrayList.get(i).contains(arrayList2.get(j))) {
						answer = false;
						break;
					}
				}
			}
			if(answer == false) {
				break;
			}
		}
		*/
		
		
		/*
		for(int i=0;i<phone_book.length;i++) {
			String str1 = phone_book[i];
			for(int j=0;j<arrayList.size();j++) {
				String str2 = arrayList.get(j);
				//포함된 문자열인가?
				if(str2.contains(str1) || str1.contains(str2)) {
					//접두사인가?
					int minLength = str1.length()>str2.length()? str2.length() : str1.length();
					String compStr1 = str1.substring(0, minLength);
					String compStr2 = str2.substring(0, minLength);
					if(compStr1.equals(compStr2)) {
						answer = false;
						break;
					}
				}
			}
			if(answer==false) {
				break;
			}
			arrayList.add(str1);
		}
		*/
		
		
		/*
		for (int i = 0; i < phone_book.length; i++) {
			char[] temp = phone_book[i].toCharArray();
			
			
			for(int j=0;j<arrayList.size();j++) {
				char[] temp2 = arrayList.get(j).toCharArray();
				int k=0;
				if(i!=j) {
					for(;k<temp.length&&k<temp2.length;k++) {
						if(temp[k]!=temp2[k]) {
							break;
						}
						if(temp[k]==temp2[k]) {
							if(k==temp.length-1 || k==temp2.length-1) {
								k+=5;
								break;
							}
						}
					}
					if(k>temp.length || k>temp2.length) {
						answer = false;
						break;
					}
				}
				
			}
			arrayList.add(phone_book[i]);

		}
		
		*/
		return answer;
	}

	public static void main(String[] args) {
		String[] str = {"111113", "1112", "12"};
		Solution18 sol = new Solution18();
		System.out.println(sol.solution(str));
	}

}
