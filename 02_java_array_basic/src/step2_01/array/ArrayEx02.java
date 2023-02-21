package step2_01.array;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		//배열 사용 예시1
		String[] test1 = new String[3];
		double[] test2 = new double[5];
		char[] test3 = new char[4];
		boolean[] test4 = new boolean[6];
		
		//배열 사용 예시2 : 축약형 (배열을 처음 생성할 때만 가능)
		
		int[] arr1 = {10,20,30,40,50,60,70};
		double[] arr2 = {12.2 , 322.32 , 322.33 , 44.42 , 32.1};
		String[] arr3 = {"한놈", "두시기" , "석삼" , "너구리"};
		char[] arr4 = {'x' , 'e' , 'r' };
		
		// arr1 = {1,2,34,5}; 비문

		
		
		
		
		//배열 사용 예시3 : 다른 문법과의 조합
		int[] arr5 = new int[10000];
		
		for (int i = 0; i < arr5.length; i++) {
			arr5[i] = i + 1;
		}
		
		//배열 요소 순회
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		//(참고) 배열이 익숙해진 후에 사용
		// Arrays.toString(배열명); : 배열의 모든 요소 출력

		System.out.print(Arrays.toString(arr3));
		System.out.println();
		System.out.print(Arrays.toString(arr4));
		
	}

}
