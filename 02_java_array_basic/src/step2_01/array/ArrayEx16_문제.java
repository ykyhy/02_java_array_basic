package step2_01.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[1단계] : 1 to 4
 * 
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 가장 작은수 1부터(다음은 2) 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
 
 * 예)
 * [ 4 2 3 1 ]
 * 
 * 입력 : 3  (가장 작은수 1이 3번째에 위치 )
 * 4 2 3 9
 * 입력 : 1  ( 그 다음으로 작은 수 2가 1번째에 위치 )
 * 4 9 3 9
 * 입력 : 2  ( 그 다음으로 작은 수 3이 2번째에 위치 )
 * 4 9 9 9
 * 입력 : 0  ( 그 다음으로 작은 수 4가 0번째에 위치 )
 * 9 9 9 9
 * 
 * 코드 종료
 */


public class ArrayEx16_문제 {

	public static void main(String[] args) {
		
		Random ran = new Random(); 
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[4];
		
		boolean[] isCheck = new boolean[4];
		
		int idx = 0;
		
		while(idx<4) {
			
			int seat = ran.nextInt(4)+1;
			
			if(isCheck[seat-1] == false) {
				
				isCheck[seat-1] = true;
				
				arr[idx] = seat;
				
				idx++;
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		int correctNum = 0;
	
		for (int i = 0; i >=0; i++) {
			
			int min = 5;
			
			for (int j = 0; j < arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
				}
			}//최솟값 찾기
			
			System.out.print("입력 : ");
			
			int myAnswer = scan.nextInt();
			
			if(arr[myAnswer-1] == min) {
				
				arr[myAnswer-1] = 9;
				
				System.out.println(Arrays.toString(arr));
				
				correctNum++;
				
			}
			else {
				System.out.println("틀렸습니다.");
				continue;
			}
			
			if(correctNum == 4) {
				System.out.println("모두 맞추셨습니다.");
				break;
			}
				
		}
			
		scan.close();	
		
		
	}
	
}
