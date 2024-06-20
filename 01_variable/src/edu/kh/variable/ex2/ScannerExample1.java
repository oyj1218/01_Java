package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample1 {
	public static void main(String[] args) {

		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게 하는 역할

		// Scanner 생성
		// -> 프로그램 안에 스캐너라는 기계를 만드는 것
		Scanner sc = new Scanner(System.in);
		//Scanner cannot be resolved to a type
		// 오류 원인 -> 민들고 싶은데 설계도(class)가 없어서 못 만들고 있음

		// 망고가 없으면 수입해 오는 것처럼 수입해오기 = 설계도 수입하기 = import
		// -> import 구문 작성 시 오류 해결

		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt();
		// nextInt() : 다음 입력된 정수를 읽어옴 (키보드로 입력된 정수를 읽어옴)


		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();


		System.out.printf("%d + %d = %d", input1, input2, input1 + input2);
		// 애플리케이션이라고 부르는 이유 : 입력한 값에 따라 값이 다르기 때문

	}

}
