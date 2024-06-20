package edu.kh.exception.test;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("정수 입력(0 입력 시 종료) : ");
			int input = sc.nextInt();
			
			// int a = 99.9; // 자료형이 맞지 않아 연산을 못해서 "컴파일 에러"(코드 틀림)
				// 코드로 수정 가능
				// 1) (int)99.9 : 강제 형변환
				// 2) double a = 99.9; : 변수 자료형을 double로 변경
				// 3) 99.9 -> 99 또는 100으로 변경
			
			if(input == 0) {
				break;
			}
		}
		
		// 런타임 에러 예제
		// 런타임 에러 : 프로그램 수행 중 발생하는 에러
		// 			  주로 if문으로 처리 가능
		
		int[] arr = new int [3]; //  인덱스는 2까지
		
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
		// arr[3] = 30;
		// java.lang.ArrayIndexOutOfBoundsException : 배열 범위 초과 예외
		
		if(arr.length >= 3) { // 배열의 인덱스 범위 초과시
			System.out.println("배열의 범위를 초과했습니다.");
			
		} else {
			arr[3] = 30;
			
		}
	}
}
