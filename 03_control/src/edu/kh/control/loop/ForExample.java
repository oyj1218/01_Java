package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	/* for문
	 * - 끝이 정해져 있는 (횟수가 지정되어 있는) 반복문
	 * 
	 * [작성법]
	 * for(초기식 ; 조건식 ; 증감식 ;) {
	 * 
	 * 		반복 수행할 코드
	 * 
	 * }
	 * 
	 * - 초기식 : for문을 제어하는 용도의 변수 선언
	 * 
	 * - 조건식 : for문의 반복 여부를 지정하는 식
	 * 			보통 초기식에서 사용된 변수를 이용하여 조건식을 작성함
	 * 
	 * - 증감식 : 초기식에 사용된 변수를
	 * 			for문이 끝날 때 마다 증가 또는 감소 시켜서
	 * 			조건식의 결과를 변하게 하는 식
	 * 
	 * */


	public void ex1() {
		// for문 기초 사용법1
		// - 1~10 출력하기
		// --> 1부터 10까지 1씩 증가하며 출력

		for(int i = 1 ; 	i <= 10 ; 		i++) {
			// 1) 초기식;	   2), 5) 조건식;   4) 증감식

			// 3), 6) 반복 수행할 코드
			System.out.println(i + "출력");

		}


		// 1, 2, 3, 4 수행 후 -> 5~7 반복(조건식이 true일 때 까지)

	}

	public void ex2() {
		// for 기초 사용법2

		for(int i = 3 ; i <= 7 ; i++){

			// 3에서 7까지 1씩 증가하며 출력
			//		-> i의 값이 7이하일 때 true가 되는 조건식
			System.out.println(i + "출력");
		}


		// 3 4 5 6 7

	}

	public void ex3() {
		// 2부터 17까지 1씩 증가하며 출력

		for(int i = 2; i <= 17 ; i++){
			System.out.println(i + " ");	
		}
	}


	public void ex4() {
		// 1부터 입력 받은 수까지 2씩 증가하며 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받은 수: ");
		int num = sc.nextInt();

		for(int i = 1; i <= num  ; i = i + 2){
			// i = i + 2 -> 1에 기존 1값 + 2
			System.out.println(i + " ");
		}
	}

	public void ex5() {

		// 1부터 입력 받은 실수 까지 0.5씩 증가하며 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받은 실수 : ");
		double num = sc.nextDouble();

		for(double i = 1; i <= num  ; i = i + 0.5){

			System.out.println(i + " ");
		}
	}


	public void ex6() {

		// 영어 알파벳 A 부터 Z까지 한 줄로 출력

		// * char 자료형은 문자형이지만 실제로는 정수(문자표 번호)를 저장한다.		
		for(char i = 'A'; i <= 'Z' ; i++){

			System.out.println(i + " ");

		}

		for(int i = 'A'; i <= 'Z' ; i++){

			System.out.println((char)i + " ");
		}
	}

	public void ex7() {
		// 10에서 1까지 1씩 감소하며 출력

		for(int i = 10 ; i >= 1 ; i--) {
			System.out.println(i + " ");

		}

	}

	public void ex8() {
		// for문 응용 1 : 반복문을 이용한 값의 누적

		// 1부터 10까지 모든 정수의 합 구하기

		int sum = 0; // 반복되어 증가하는 i값의 합계를 저장할 변수
		// 0으로 시작하는 이유 : 아무것도 더하지 않음으로
		//					  정확히 결과를 도출할 수 있기 때문

		for(int i = 1 ; i <= 10 ; i++) {
			// sum = sum + i;
			sum += i;
			// System.out.println("합계 : " + sum); // 계속 추가되는 값 출력
		}
		System.out.println("합계 : " + sum); // 마지막 결과값만 출력

	}


	public void ex9() {
		// for문 응용 1 : 정수 5개를 입력 받아서 합계 구하기

		// ex)
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 입력 4 : 40
		// 입력 5 : 50

		// 합계 : 150

		Scanner sc = new Scanner(System.in);

		int sum = 0; 

		for(int i = 1 ; i <= 5 ; i++) {

			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			sum += input; // sum에 입력 받은 input 값을 누적

			// System.out.println(input);
			// {} 안에서 생성된 변수는 {} 밖에서는 사용할 수 없다.
			// -> {} 끝나는 시점에 사라지기 때문에

		}

		// System.out.println(input); // 에러
		System.out.println("합계 : " + sum);
	}


	public void ex10() {

		// 정수를 몇 번 입력 받을지 먼저 입력 받고
		// 입력된 정수의 합계를 출력

		// ex)
		// 입력 받을 정수의 개수 : 3
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 합계 : 60

		// ex)
		// 입력 받을 정수의 개수 : 2
		// 입력 1 : 10
		// 입력 2 : 20
		// 합계 : 30

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받을 정수의 개수 : ");
		int numInt = sc.nextInt();

		int sum = 0;

		for(int i = 1 ; i <= numInt ; i++) {

			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			sum += input; // sum에 입력 받은 input 값을 누적
		}

		System.out.println("합계 : " + sum);

	}		

	public void ex11() {
		// 1 부터 20 까지 1씩 증가하면서 출력
		for(int i= 1 ; i <= 20 ; i++) {
			if (i % 5 == 0) {
				System.out.printf(" (%d) ", i);
			}
			else {
				System.out.printf(" %d ", i);
			}


		}
		// 단, 5의 배수에 () 를 붙여서 출력
		// ex) 1 2 3 4 (5) 6 7 8 9 (10) 11 ...


	}

	public void ex12() {
		// 1 부터 20까지 1씩 증가하면서 출력
		// 단, 입력 받은 수의 배수는 () 표시

		// ex)
		// 괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6) ...

		// 괄호를 표시할 배수 : 4
		// 1 2 3 (4) 5 6 7 (8) 9 ...

		Scanner sc = new Scanner(System.in);
		System.out.print("괄호를 표시할 배수 : ");
		int num = sc.nextInt();

		for(int i= 1 ; i <= 20 ; i++) {
			if (i % num == 0) {
				System.out.printf(" (%d) ", i);
			}
			else {
				System.out.printf(" %d ", i);
			}
		}
	}

	public void ex13() {
		// [구구단 출력]
		// 2 ~ 9 사이 수를 하나 입력 받아
		// 해당 단을 출력
		// 단, 입력 받은 수가 2 ~9 사이 숫자가 아니면 "잘못 입력 하셨습니다" 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();

		if (2 <= dan && dan <= 9) {
			for(int i= 1 ; i <= 9 ; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
		}
		else {
			System.out.println("잘못 입력 하셨습니다");

		}
	}


	public void ex14() {
		// [19단 출력기]
		// 2 ~ 19단 사이 단을 입력 받아서 x 1 ~ x 19 까지 출력
		// 단, 2 ~ 19 사이 단이 입력되지 않으면 "잘못 입력 하셨습니다." 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();

		if (2 <= dan && dan <= 19) {
			for(int i= 1 ; i <= 19 ; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
		}
		else {
			System.out.println("잘못 입력 하셨습니다.");

		}
	}

	// *** 중첩 반복문 

	public void ex15() {
		// 구구단 모두 출력하기 
		Scanner sc = new Scanner(System.in);


		for(int dan = 2; dan <= 9; dan++) { // 2~9 단까지 차례대로 증가

			// 안쪽 for문이 반복하면서 하나의 단을 한 줄로 출력
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%2d X %2d = %2d", dan, i, dan * i);

			}
			System.out.println(); // 아무 내용 없는 println() == 줄바꿈


		}

	}

	public void ex16() {
		// 구구단 역순 출력
		Scanner sc = new Scanner(System.in);


		for(int dan = 9; dan >= 2; dan--) { // 9단 -> 2단 까지 역방향
			for(int i = 1; i <= 9; i++) { // 수 1-> 9 정방향
				System.out.printf("%2d X %2d = %2d", dan, i, dan * i);
			} // 한 단의 출력 종료
			System.out.println(); // 줄바꿈

		}
	}


	public void ex17() {
		// 2중 for문을 이용해서 다음 모양을 출력하시오.

		// 12345
		// 12345
		// 12345
		// 12345

		Scanner sc = new Scanner(System.in);

		for(int x = 1; x <= 5; x++) {// 5바퀴 반복하는 for문
			for(int i = 1; i <= 5; i++) { // 12345
				System.out.print(i);
			}
			System.out.println(); // 줄바꿈

		}


		System.out.println("-------------------------");


		for(int x = 1; x <= 3; x++) {// 3바퀴 반복하는 for문
			for(int i = 5; i >= 1; i--) { // 54321
				System.out.print(i);
			}
			System.out.println(); // 줄바꿈

		}
	}

	public void ex18() {

		// 2중 for문을 이용하여 다음 모양을 출력하시오.

		// 1
		// 12
		// 123
		// 1234

		Scanner sc = new Scanner(System.in);


		for(int x = 1 ; x <= 4; x++) { // 4바퀴 반복
			for(int i = 1; i <= x; i++) { // 1 , 12
				System.out.print(i);
			}
			System.out.println(); // 줄바꿈
		}

		// x가 1일 때 i == 1
		// x가 2일 때 i == 1, 2
		// x가 3일 때 i == 1, 2, 3
		// x가 4일 때 i == 1, 2, 3, 4

		System.out.println("-------------------------");

		// 4321
		// 321
		// 21
		// 1

		for(int x = 5; x >= 1; x--) { // 5바퀴
			for(int i = x; i >= 1; i--) { // 4321
				System.out.print(i);
			}

			System.out.println(); // 줄바꿈

		}
	}


	public void ex19() {

		// count (숫자 세기)

		// 1부터 20까지 1씩 증가하면서
		// 3의 배수의 총 개수 출력

		// 3 6 9 12 15 18 : 6개


		int count = 0; // 3의 배수의 개수를 세기 위한 변수
		int sum = 0;
		for(int i = 1; i <=20; i++) { // 1부터 20까지
			if(i % 3 == 0) { // 3의 배수
				System.out.print(i + " ");
				count++; //  if문이 동작할 때마다 1씩 증가
				sum += i;
			}
		}
		System.out.printf(": %d개\n", count);
		System.out.printf("3의 배수의 합계 : %d\n", sum);


	}

	public void ex20() {

		// 2중 for문 count를 이용해서 아래 모양 출력하기
		// 1  2  3  4
		// 5  6  7  8
		// 9 10 11 12
		char count = 'a';
		for(int x=1; x<=3; x++) { // 3줄
			for(int i=1; i<=5; i++) { // 5칸
				System.out.printf("%3s", count);
				count++;
			}
			System.out.println();


		}
	}
}




