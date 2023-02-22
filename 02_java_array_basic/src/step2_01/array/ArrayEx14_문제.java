package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

public class ArrayEx14_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int player = 0;
		int menuSelect;
		
	while(true){
		
	
		for (int i=0; i < game.length; i++) {
			if (game[i] == 2) {
				player = i; //플레이어의 위치 저장
			}
			}
			System.out.println();
			System.out.println(Arrays.toString(game));
			System.out.println();	
			System.out.println("왼쪽[1] 오른쪽[2] 종료[3] 중에 하나를 입력하세요");
			
			menuSelect = scan.nextInt();
			
			if(player == 0) {
				if(menuSelect == 1) {
				System.out.println("이미 맨 왼쪽에 위치합니다.");
				System.out.println("\n현재 상태 : " + Arrays.toString(game));
				continue;
				}
				else if(menuSelect == 2) {
					game[player] =  0; //오른쪽으로 한칸 이동
					game[player+1] = 2;
					continue;
				}
			}
			else if(player == 14) {
				if(menuSelect == 2) {
					System.out.println("이미 맨 오른쪽에 위치합니다.");
					System.out.println("\n현재 상태 : " + Arrays.toString(game));
					continue;
					}
					else if(menuSelect == 1) {
						game[player] =  0; //왼쪽으로 한칸 이동
						game[player-1] = 2;
						continue;
					}
			}
			
			if(menuSelect == 1){
				game[player] =  0; //왼쪽으로 한칸 이동a
				game[player-1] = 2;
				continue;
			}
			else if(menuSelect == 2){
				game[player] =  0; //오른쪽으로 한칸 이동
				game[player+1] = 2;
				continue;
			}
			else { // 종료
				System.out.println("종료합니다.");
				break;
			}
			
			
	}			
	scan.close();
	}
	
}
