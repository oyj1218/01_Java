package edu.kh.objarray.practice.model.service;

import java.util.Scanner;

import edu.kh.objarray.practice.model.vo.Student;


public class PracticeService {
	// 1) 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.

	private Scanner sc = new Scanner(System.in);

	private Student[] std = new Student[10];

	public void start() {
		int count = 0;
		boolean flag = true;
		// 2)while문을 사용하여 학생들의 정보를 계속 입력 받고
		while(flag) {
			System.out.print("학년 : ");
			int grade = sc.nextInt();

			System.out.print("반 : ");
			int classroom = sc.nextInt();

			System.out.print("이름 : ");
			String name = sc.next();

			System.out.print("국어점수 : ");
			int kor = sc.nextInt();

			System.out.print("영어점수 : ");
			int eng = sc.nextInt();

			System.out.print("수학점수 : ");
			int math = sc.nextInt();

			std[count] = new Student(grade, classroom, name, kor, eng, math);
			count++;

			while(true) {
				System.out.print("계속 입력하시겠습니까?(Y/N) : ");
				char input = sc.next().toUpperCase().charAt(0);

				if(count == 10 || input == 'N') {
					flag = false;
					break;
				}

				if(input == 'Y') {
					break;

				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
		}
		for(int i=0; i<count; i++) {
			System.out.println(std[i]);
		}
	}
}




