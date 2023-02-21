package step2_01.array;

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[3단계] : 예외처리
 */



public class ArrayEx06_문제 {

	public static void main(String[] args) {
		
		int[] studentNums = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		Scanner scan = new Scanner(System.in);
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		int yourNum = scan.nextInt();
		int tOrf = 0;
		
		for (int i = 0; i <	studentNums.length; i++) {
			
			if(yourNum == studentNums[i]) {
				System.out.println("학번 입력 : " + yourNum + " 성적 : " + scores[i]);
			}
			
			for (int j = 0; j < studentNums.length; j++) {
				if(studentNums[j] != yourNum) {
					tOrf++;
			}
				}

			}
		if(tOrf != 0) {
			
			System.out.println("학번 입력 : " + yourNum + " 해당 학번은 존재하지 않습니다.");
			
		}
		scan.close();
		
	}
	
}
