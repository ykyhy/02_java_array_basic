package step2_01.array;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임
 * 
 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
 *    back에 모든 수가 채워지면 게임은 종료된다.
 * 예)
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * 입력1 : 2
 * 입력2 : 4
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 0, 0, 0, 0, 0]
 * 
 * 입력1 : 5
 * 입력2 : 7
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 2, 0, 2, 0, 0]
 * 
 */

public class ArrayEx15_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		int cnt  = 0;
		int firstInput = 0;
		int secondInput = 0;
		int idx = 1;
		int same = 0;
		
		// 셔플 구현(Shuffle) : 배열의 요소들을 무작위로 섞음
		while (cnt < 1000) {			
			int tempRan = ran.nextInt(9) + 1;
			int temp = front[0]; 
			front[0] = front[tempRan];
			front[tempRan] = temp;
			cnt++;
		}//front 배열은 다 섞임
			
		while(idx <= 6) {
			for (int i=0; i<front.length; i++) {//front 배열 프린트
				System.out.print(front[i] + " ");
			}
			System.out.println();
		
			for (int i=0; i<front.length; i++) {//back 배열 프린트
				System.out.print(back[i] + " ");
			}
			System.out.println();
			
			System.out.print("입력1 : ");
			firstInput = scan.nextInt();
			System.out.print("입력2 : ");
			secondInput = scan.nextInt();
			
			if(front[firstInput] == front[secondInput]) {
				if(front[firstInput] != idx) {
					System.out.println("순서에 맞게 입력해주세요.");
					continue;
				}
				else {
					
				back[firstInput] = idx;
				back[secondInput] = idx;
				idx++;
				System.out.println("맞았습니다.");
				}
			}
			else {
				System.out.println("틀렸습니다.");
				continue;
			}
			
			
			for (int i = 0; i < back.length; i++) {
				if(back[i] == front[i]) {
					same++;
				}
						
			}//같으면 종료 조건 생성
			
			if(same == 10) {
				System.out.println("게임 종료");
				break;
			}
			
		}
		
		scan.close();
			
	}
	
}
