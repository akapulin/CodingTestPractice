/**
      첫 번째, 문제 풀이
      결과 : 통과
      피드백 : 
              1) Stream에 대해 공부할 필요성을 느꼈다.
              2) 다른사람풀이 주석 참고
*/



class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for(int i=0;i<10;i++){
            for(int j=0;j<numbers.length;j++){
                if(numbers[j]==i){
                    break;
                }
                if(j==numbers.length-1){
                    if(numbers[j]!=i){
                        answer += i;
                    }
                }
            }
        }
        //방법1. 합산값 45라는 기준을 맞추고, numbers의 합 빼주기
        //방법2. IntStream.range(0, 10).filter(i -> Arrays.stream(numbers).noneMatch(num -> i == num)).sum();
        return answer;
    }
}
