package edu.kh.inheritance.practice.model.service;

import java.util.Scanner;

import edu.kh.inheritance.practice.model.vo.Employee;
import edu.kh.inheritance.practice.model.vo.Student;

public class PracticeService {

	public void homework() {

		Scanner sc = new Scanner(System.in);


		Student[] stu = new Student[3];
		stu[0] = new Student("카리나", 20, 168.2, 70.0, 1, "정보시스템공학과");
		stu[1] = new Student("정해인", 21, 187.3, 80.0, 2, "경영학과");
		stu[2] = new Student("박서준", 23, 179.0, 45.0, 4, "정보통신공학과");

		for( Student std : stu ) {
			System.out.println(std);
		}


		Employee[] emp = new Employee[10];
		int count = 0;
		boolean flag = true;


		while(flag) {
			System.out.print("이름 : ");
			String name = sc.next();

			System.out.print("나이 : ");
			int age = sc.nextInt();

			System.out.print("신장 : ");
			double height = sc.nextDouble();

			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();

			System.out.print("급여 : ");
			int salary = sc.nextInt();

			System.out.print("부서 : ");
			String dept = sc.next();

			emp[count] = new Employee(name, age, height, weight, salary, dept);

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
			System.out.println(emp[i]);
		}
	}
}