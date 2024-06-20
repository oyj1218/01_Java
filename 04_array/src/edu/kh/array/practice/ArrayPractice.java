package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1(){

		int [] arr = new int[9]; // 길이가 9번째 배열 선언 0 1 2 3 4 5 6 7 8 9

		int sum = 0;
		for(int i=0; i< arr.length; i++) { // 0~9
			arr[i] = i+1; // [0] = 1, [1] = 2 ...
			System.out.print(arr[i] + " ");

			if(i % 2 == 0 ) {
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}

	public void practice2() {

		int [] arr = new int[9]; // [0]~[9]

		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = 9-i; // [0] = 9 [1] = 8 [2] = 7
			System.out.print(arr[i] + " ");

			if(i % 2 > 0 ) {
				sum = sum + arr[i];
			}

		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt(); // 5

		int[] arr = new int[input]; // [0]~[5]

		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1; 
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
	
	

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();
		}

		System.out.print("검색할 값 : ");
		int search = sc.nextInt();

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				System.out.println("인덱스 : " + i);
				flag = true;
				break;
			}
		}

		if (flag == false)
			System.out.println("일치하는 값이 존재하지 않습니다.");
	}


	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : "); 
		String input = sc.nextLine(); // hello

		char[] arr = new char[input.length()]; // hello 길이만큼 0~5
		for(int i=0; i<arr.length; i++) { 
			arr[i]=input.charAt(i); // [0] = h , [1] = e
		}

		int count=0; // count 몇 개

		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);


		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : " , input, ch);
		for(int i=0; i<arr.length; i++) {
			if(ch == arr[i]) {
				System.out.print(i + " ");
				count++;

			}

		}
		System.out.println();

		if(count > 0) {
			System.out.println(ch + " 개수 : " + count);
		} else {
			System.out.println("존재하지 않습니다");
		}
	}


	public void practice6() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		System.out.print("정수 : "); 
		int input = sc.nextInt();

		int[] arr = new int[input];

		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println("\n총 합 : " + sum);


	}


	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("주민등록번호(-포함) : ");
		String str = sc.nextLine();

		char [] arr = new char[str.length()];

		for(int i=0; i<arr.length; i++) {

			if(i>=8) {
				arr[i] ='*';
				System.out.print(arr[i]);
			} else {
				arr[i] = str.charAt(i);
				System.out.print(arr[i]);
			}

		}
	}


	public void practice8() {
		Scanner sc = new Scanner(System.in);

		while(true) { // 3 이상의 홀수가 입력 될 때 까지 무한 반복
			// -> 3 이상 홀수가 입력되면 break문으로 종료
			System.out.print("정수 : ");
			int input = sc.nextInt();


			if(input %2==0 || input<3){ // 짝수 또는 3 미만인 경우 -> 반복
				System.out.println("다시 입력하세요.");
			}
			else {
				// 입력 받은 정수 만큼의 크기를 가지는 배열 생성
				int[] arr = new int[input];

				int num = 0; // arr 배열에 대입될 값
				for(int i=0; i<arr.length; i++) {

					if(i<=arr.length/2) { // 중간 이전 까지 -> 증가
						arr[i] = ++num;
					} else { // 중간 이후 -> 감소
						arr[i] = --num;


					} // 출력 시, 추가 (단, 마지막 제외)
					if(i==arr.length-1) { // 마지막 바퀴
						System.out.print(arr[i]);
					}
					else {
						System.out.print(arr[i]+ ", ");
					}

				} 
				break; // while 반복 멈춤
			} 
		}
	}


	public void practice9() {
		Scanner sc = new Scanner(System.in);

		int[] input = new int[10]; // 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당

		System.out.print("발생한 난수 : ");

		for (int i=0; i<input.length; i++) { // 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요
			int random = (int)(Math.random() * 10 + 1);

			System.out.print(random + " ");

		}


	}


	//  10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
	//   1~10 사이의 난수를 발생시켜 배열에 초기화 후
	//   배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
	public void practice10() {

		int[] arr= new int[10];

		System.out.print("발생한 난수 : ");

		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}

		int min = arr[0];
		int max = arr[0];

		for(int i=0; i<arr.length; i++) {

			if(max < arr[i]) {
				max = arr[i];

			} else if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}


	public void practice11() {
		int[] arr = new int[10]; // 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당

		System.out.print("발생한 난수 : ");


		for (int i=0; i<arr.length; i++) { 
			// 난수 생성 -> 대입(단, 중복 제거)
			arr[i] = (int)(Math.random() * 10 + 1); // 1 ~ 10사이 난수

			// 중복 확인 시 i값을 감소 시켜
			// 다음 반복에서 현재 인덱스에 난수 덮어쓰기

			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) { // 현재 생성된 난수가 앞서 대입된 난수와 같은 경우 == 중복
					i--; // i를 i 감소 시킴
					// 바깥쪽 for문 반복 시 i가 다시 1 증가
					// -1 + 1 == 0 (제자리)
					break;
				}
			}

		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice12() {
		// 1) 정수 6개를 저장할 배열 선언 및 할당
		int[] lotto = new int[6];
		// 2) 생성된 배열을 처음부터 끝까지 순차 접근하는 for문 작성

		for(int i=0; i<lotto.length; i++) {

			// 3) 1 ~ 45 사이의 난수 생성
			int random = (int)(Math.random() * 45 + 1);

			// 4) 생성된 난수를 순서대로 배열 요소에 대입
			lotto[i] = random;

			// 5) 중복 검사를 위한 for문 작성
			for(int j=0; j<i; j++) {

				// 6) 현재 생성된 난수와 같은 수가
				//	  앞쪽 요소에 있는지 검사
				if(random==lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}


	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : "); // 문자열을 입력 받아
		String input = sc.nextLine();

		// 문자열에 어떤 문자가 들어갔는지 배열에 저장
		char[] str = new char[input.length()];

		int count = 0; // 카운트용 변수

		System.out.print("문자열에 있는 문자 : ");
		for(int i=0; i<str.length; i++) {
			str[i]=input.charAt(i); // 문자열에 있는 문자 : a, p, p, l, i, c, a, t, i, o, n


			boolean flag = true;
			// 중복 검사 + flag
			// application
			// 배열 : [a, p, p, l, i, c, a, t, i, o, n]
			// 화면 : a, p, l, i, c, t, o, n
			for(int j=0; j<i; j++) { // 중복 검사용 for문
				if(str[i] == str[j]) {
					flag = false;
					break;
				}
			}
			if(flag) { // flag가 true인 경우 == 중복이 없었다라는 의미

				if(i==0) { // 첫 바퀴인 경우
					System.out.print(str[i]); 
				}
				else {
					System.out.print(", " + str[i]);
				}
				count++;
			}
		}
		System.out.println("\n문자 개수 : " + count);
	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요 : ");
		String[] arr = new String[sc.nextInt()];
		sc.nextLine();

		int index = 0;

		while (true) {
			for (int i = index; i < arr.length; i++) {
				System.out.print(i + 1 + "번째 문자열 : ");
				arr[i] = sc.nextLine();
			}

			index = arr.length;

			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char plus = sc.next().charAt(0);

			if (plus == 'Y' || plus == 'y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				String[] arr2 = new String[arr.length + sc.nextInt()];
				sc.nextLine();

				System.arraycopy(arr, 0, arr2, 0, arr.length);
				arr = arr2;

			} else if (plus == 'N' || plus == 'n') {
				System.out.println(Arrays.toString(arr));
				break;

			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
	}
}





