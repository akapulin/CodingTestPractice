/**

      첫 번째, 문제 풀이
      결과 : 통과
      피드백 :
            1) 한 번에 통과는 했지만, 어중간한 정규식 처리 - 조금만 생각해보면 전부 정규식으로 깔끔하게 처리 가능했는데 아쉽다.
          
*/

class Solution {
    public String solution(String new_id) {
        String answer = new_id;
        //1단계. 대문자 -> 소문자 치환
        answer = charToLowerCase(answer);
        //2단계. 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자 제거
        answer = charDeleteByCondition(answer);
        //3단계. 마침표가 2번 이상 연속된 부분을 하나의 마침표로 치환
        answer = charReplaceTwoPeriod(answer);
        //4단계. 마침표가 처음이나 끝에 위치한다면 제거
        answer = charReplaceStartEndPeriod(answer);
        //5단계. 빈 문자열이면, a대입
        answer = charIsBlank(answer);
        //6단계. 16자 이상일 경우, 나머지 제거, 제거 후 끝이 마침표라면 마침표도 제거
        answer = charOverLimit(answer);
        //7단계. 2글자 이하라면, 길이가 3이 될 때 까지 마지막 문자 붙이기
        answer = charShort(answer);

        return answer;
    }
    //7단계
    private String charShort(String id) {
        String str = id;
        if(str.length()<3) {
            String endChar = getEndChar(str);
            while(true) {
                str = str + endChar;
                if(str.length()>=3) {
                    break;
                }
            }
        }
        return str;
    }
    //6단계
    private String charOverLimit(String id) {
        String str = id;
        if(str.length()>15) {
            str = str.substring(0,15);
            String endChar = getEndChar(str);
            if(endChar.equals(".")) {
                str = str.substring(0,str.length()-1);
            }
        }
        return str;
    }

    //5단계
    private String charIsBlank(String id) {
        String str = id;
        if(str.length()<=0) {
            str="a";
        }
        return str;
    }

    //4단계
    private String charReplaceStartEndPeriod(String id) {
        String str = id;

        if(str.length()>2) {
            String startChar = getStartChar(str);
            String endChar = getEndChar(str);

            if(startChar.equals(".")) {
                str = str.substring(1,str.length());
            }
            if(endChar.equals(".")) {
                str = str.substring(0,str.length()-1);
            }
        }
        else {
            str = str.replace(".", "");
        }
        return str;
    }

    //3단계
    private String charReplaceTwoPeriod(String id) {
        String str = id;
        str = str.replaceAll("[..]+", ".");
        return str;
    }


    //2단계
    private String charDeleteByCondition(String id) {
        String str = id;
        str = str.replaceAll("[^a-z0-9\\-_.]*", "");
        return str;
    }

    //1단계
    private String charToLowerCase(String id) {
        String str = id;
        str = str.toLowerCase();
        return str;
    }

    private String getStartChar(String id) {
        String startChar = id.substring(0, 1);
        return startChar;
    }
    private String getEndChar(String id) {
        String endChar = id.substring(id.length()-1,id.length());
        return endChar;
    }

}
