package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 기본문제
 */

public class ArrayEx03_문제 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		
		// 문제1) for문을 이용하여 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		// 문제2) 1번에서 생성한 arr에서 4의 배수만 출력
		// 정답2) 20 40
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		
		System.out.println();
		
		// 문제3) 1번에서 생성한 arr에서 4의 배수의 합 출력
		// 정답3) 60
		
		int fourMulti = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				fourMulti  += arr[i];
			}
		}
		System.out.println(fourMulti);
		
		// 문제4) 1번에서 생성한 arr에서 4의 배수의 개수를 출력
		// 정답4) 2
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt  += 1;
			}
		}
		System.out.println(cnt);
		
		cnt = 0;
		
		// 문제5) 1번에서 생성한 arr에서 짝수의 개수를 출력
		// 정답5) 5
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				cnt  += 1;
			}
		}
		System.out.println(cnt);
		
		scan.close();
	}
	
}
