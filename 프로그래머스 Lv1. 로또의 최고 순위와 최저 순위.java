/**
      첫 번째, 문제 풀이
      결과 : 통과
      피드백 : 
              1) 생각나는대로 예외처리 사항을 쪼개서 if문으로 처리함
              2) 코드가 지저분하여, 수정 필요
*/


/**
      두 번째, 문제 풀이
      결과 : 통과
      피드백 : 
              1) 다른사람 풀이를 참조하여 예외가 안생기도록 코드 줄임
*/
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};

		//로또 번호 비교를 위해서 리스트로 만들기
		ArrayList<Integer> lottosList = changeToList(lottos);
		ArrayList<Integer> win_numsList = changeToList(win_nums);

		//현재 등수 알아내기
		answer = getRank(lottosList, win_numsList);
		
		return answer;

    }
    private int getCount( int num ) {
		int i = 0;
		if(num==0) {
			i = 6;
		}
		else {
			i = Math.abs(num - 7);
		}
		return i;
	}
    private int[] getRank(ArrayList<Integer> lottosList, ArrayList<Integer> win_numsList) {
		int[] answer = { 0, 0 };
		int count = 0;
		int zeroCount = 0;
		
		for(int num : lottosList) {
			if(win_numsList.contains(num)) {
				count++;
			}
			if(num==0) {
				zeroCount++;
			}
		}
		answer[0] = getCount(count+zeroCount);
		answer[1] = getCount(count);		
		

		return answer;
	}
    private ArrayList<Integer> changeToList(int[] array){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i: array) {
			arrayList.add(i);
		}
		
		return arrayList;
		
	}
}
