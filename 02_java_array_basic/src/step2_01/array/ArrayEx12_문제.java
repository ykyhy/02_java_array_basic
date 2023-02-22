package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

public class ArrayEx12_문제 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		
		int changePlace = 0;
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		System.out.print("인덱스1 입력 : ");
		int index1 = scan.nextInt();
		System.out.print("인덱스2 입력 : ");
		int index2 = scan.nextInt();
		
		changePlace = arr[index1];
		
		arr[index1] = arr[index2];
		
		arr[index2] = changePlace;
		
		System.out.println(Arrays.toString(arr));
		
		changePlace = 0;
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//        값2 입력 : 50
		//		  {50, 20, 30, 40, 10}
		
		int[] arr2 = {10,20,30,40,50};
		
		System.out.print("값1 입력 : ");
		int value1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		int value2 = scan.nextInt();
		
		int value1Add = 0;
		
		int value2Add = 0;
		
		for (int i = 0; i < arr2.length; i++) {
			if(value1 == arr2[i]) {
				value1Add = i;
			}
			
			if(value2 == arr2[i]) {
				value2Add = i;
			}		
		}
		changePlace = arr2[value1Add];
		
		arr2[value1Add] = arr2[value2Add];
		
		arr2[value2Add] = changePlace;
		
		System.out.println(Arrays.toString(arr2));
		
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		int hakbun1Add = 0;
		int hakbun2Add = 0;
		changePlace = 0;
		System.out.print("학번1 입력 : ");
		int hakbun1 = scan.nextInt();
		
		System.out.print("학번2 입력 : ");
		int hakbun2 = scan.nextInt();
		
		for (int i = 0; i < hakbuns.length; i++) {
			if(hakbun1 == hakbuns[i]) {
				hakbun1Add = i;
			}
			
			if(hakbun2 == hakbuns[i]) {
				hakbun2Add = i;
			}		
		}
		changePlace = scores[hakbun1Add];
		
		scores[hakbun1Add] = scores[hakbun2Add];
		
		scores[hakbun2Add] = changePlace;
		
		System.out.println(Arrays.toString(scores));
		
		scan.close();
		
	}
	
}
