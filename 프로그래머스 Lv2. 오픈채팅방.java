/**
      첫 번째, 문제 풀이
      결과 : 통과
      피드백 : 
              1) 반복문을 2번 사용해서 아쉬웠지만 change시 다시 검색해야 한다는 점때문에 사용하였다.
*/
import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> resultList = new ArrayList<String>();
        HashMap<String,String> userList = new HashMap<String, String>();

        //아이디랑, 닉네임은 저장상태
        for(int i=0;i<record.length;i++) {
            String[] info = record[i].split(" ");
            if(!info[0].equals("Leave")) {
                userList.put(info[1], info[2]);
            }

        }
        //문장만들기
        for(int i=0;i<record.length;i++) {
            String[] info = record[i].split(" ");
            String str = getSentence(info[0]);
            if(str.length()>0) {
                resultList.add(userList.get(info[1])+str);
            }
        }
        String[] answer = new String[resultList.size()];
        for(int i=0;i<answer.length;i++) {
            answer[i] = resultList.get(i);
        }

        return answer;

    }
        private String getSentence(String sen) {
        String result = "";
        switch(sen) {
        case "Enter":
            result = "님이 들어왔습니다.";  
            break;
        case "Leave":
            result = "님이 나갔습니다.";
            break;
        case "Change":
            break;
        }
        return result;
    }
}
