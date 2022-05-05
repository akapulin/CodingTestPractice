/**
       03.구간합구하기 문제 풀이
       결과 : --
       피드백 : 
               1) 완전 수학이다1 
                 
       04.구간합구하기2 문제 풀이
       결과 : --
       피드백 : 
               1) 완전 수학이다2
               2) 백준식 입력받는 시스템이 적응이 안되서, 인자받아서 풀었다.
       
       05.구간합구하기3 문제 풀이
       결과 : --
       피드백 : 
               1) 완전 수학이다3
               2) 위 3문제 2시간 가까이 책만 읽어서 프로세스는 이해 했는데, 코드로 풀자니 너무 어색하고 5번 코드는 아예 이해가 안간다 설명너무불친절;;ㅠㅠ 
                  설명은 조합으로 적어놓고, 코드쪽에서는 다른 수학공식이 나와서 모르겠다 ... 뒤에 더 보다보면 이해가 될까?
               3) 이렇게 공식외워서 풀 것같으면 수능공부랑 뭐가 다르지...? 코딩테스트에 회의감들었다..진짜 대학때 알고리즘 수업듣던 딱 그 기분이다 이걸 어따 써먹지!!
                  
        
              
 */


//03.구간합구하기
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/*
		int N[] = {5,4,3,2,1};
		int M[] = {1,3};
		
		int A[]= new int[N.length];
		A[0] = N[0];
		for(int i=1;i<A.length;i++) {
			A[i] = A[i-1] + N[i];
		}
		int result=0;
		for(int i=M[1]-1;i>M[0];i--) {
			result+=A[i];
		}
		System.out.println(result);
		*/
		
		
		
	}
}

//04.구간합구하기2
public class Solution22 {
	public int solution(int[] XY, int[][] NM) {
		
		int result =0;

		int[][] array = new int[NM.length][NM[0].length];
		for(int i=1;i<array.length;i++) {
			for(int j=1;j<array[0].length;j++) {
				array[i][j] = array[i-1][j]+array[i][j-1]-array[i-1][j-1]+NM[i][j];
			}
		}
		int x1 = XY[0];
		int y1 = XY[1];
		int x2 = XY[2];
		int y2 = XY[3];
		
		result = array[x2][y2]-array[x1-1][y2]-array[x2][y1-1]+array[x1-1][y1-1];	
		
		return result;
	}
	public static void main(String[] args) {
		
		int[] XY = {2,2,3,4};
		int[][] NM = {{0,0,0,0,0},{0,1,2,3,4},{0,2,3,4,5},{0,3,4,5,6},{0,4,5,6,7}};
		
		Solution22 sol = new Solution22();
		
		System.out.println(sol.solution(XY, NM));
	}
}


