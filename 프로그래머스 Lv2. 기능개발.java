/**
      첫 번째, 문제 풀이
      결과 : 통과
      피드백 : 
              1) 스택, 큐 문제라 어설프게 남아 Que 클래스를 구현해서 풀었다
              2) 개인적으로 본문에 while안에 코드를 깔끔하게 짠거같아 마음에 든다...!
              3) 큐 class와 prgoresses 처리 클래스를 따로 만들면 좋았을 것 같다.
*/
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        /*
         * 1. 매일 날이 가도록 반복문을 만든다. 
           2. progresses의 speed를 반영한다. 
           3. progresses의 첫번째 값이 100인지 체크한다 
           4. 그 다음 번 값들도 100인지 체크한다. 
           5. 100이면, answer에 추가하고 아니면 반복문을 시행한다.
         * 
         */
        Que que = new Que(progresses);
        Que queSpeeds = new Que(speeds);
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        while (!QueSpeeds.isNull()) {
            que.addOneday(queSpeeds);
            int num = 0;
            while (que.isOneTaskComplete()) {
                num++;
                que.pop();
                queSpeeds.pop();
            }
            if(num!=0) {
                answerList.add(num);
            }

        }
        System.out.println(answerList.toString());
      
        int[] answer = new int[answerList.size()];
        for(int i=0;i< answer.length;i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}

class Que {
    ArrayList<Integer> list;

    Que(int[] progresses) {
        this.list = new ArrayList<Integer>();
        for (int i : progresses) {
            this.list.add(i);
        }
    }

    ArrayList<Integer> getList() {
        return this.list;
    }

    boolean isNull() {
        if (this.list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    void push(int i) {
        this.list.add(i);
    }

    boolean pop() {
        if (this.list != null && this.list.size() > 0) {
            this.list.remove(0);
            return true;
        } else {
            return false;
        }
    }

    int getNumber(int index) {
        int num = 0;
        if (this.list != null && this.list.size() > 0) {
            num = this.list.get(index);
        }
        return num;
    }

    void addOneday(Que speeds) {
        for (int i = 0; i < speeds.getList().size(); i++) {
            this.list.set(i, this.getList().get(i) + speeds.getList().get(i));
        }
    }

    boolean isOneTaskComplete() {
        if (this.list.size()>0 && this.list.get(0) >= 100 ) {
            return true;
        } else {
            return false;
        }
    }
}
