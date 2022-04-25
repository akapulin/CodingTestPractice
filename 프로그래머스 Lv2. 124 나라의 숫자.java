
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
/**
       첫 번째, 문제 풀이
       결과 : 통과
       피드백 : 
               1) 조금 더 규칙을 찾아보면 코드를 더 줄일 수 있었을 것 같다.
           
 */
  
  class Solution {
    public String solution(int n) {
        String answer = "";
         String str = getNum(n,answer);
        return str;
    }
     private String getNum(int n, String str) {
         if(n%3==1) {
            int num = (int)n/3;
            if(num>=1) {
                str = str + getNum(num,str);
            }
            str = str + "1";


         }else if(n%3==2) {
             int num = (int)n/3;
             if(num>=1) {
                 str = str + getNum(num,str);
            }
             str = str + "2";

         }else if(n%3==0) {
            int num = ((int)n/3)-1;
            if(num>=1) {
                str = str + getNum(num,str);
            }

            str = str + "4";
         }

        return str;

    }
}
