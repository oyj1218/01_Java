package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.vo.Car;
import edu.kh.poly.ex1.model.vo.Spark;
import edu.kh.poly.ex1.model.vo.Tesla;

public class PolyService {

	public void ex1() {
		// 다형성 확인 예제

		// Car 객체 생성
		Car car = new Car();
		// 부모타입 참조변수 = 부모 객체

		// Tesla 객체 생성
		Tesla tesla = new Tesla();
		// 자식타입 참조변수 = 자식 객체

		// ************* 다형성 *************
		// 다양한 형태를 지닌다
		Car car2 = new Tesla(); // -> 오류 발생 안 함
		// 왜? Tesla 객체를 참조하는 변수의 타입이 Car(부모)이기 때문에
		// Tesla 객체가 Car(부모) 객체로 변화함

		Car car3 = new Spark();
		// 부모타입 참조변수 = 자식 객체


		// ***** 다형성(업캐스팅) 작성법 *****

		// 1) 자식 객체가 부모 객체로 변했기 때문에
		// 	  자식만의 고유한 필드, 메소드를 사용할 수 없다

		// 1-1) car (부모 = 부모)
		car.setEngine("v6 6기통 엔진");
		car.setFuel("휘발유");
		car.setWheel(4);


		// 1-2) tesla(자식 = 자식)
		tesla.setEngine("전기모터");
		tesla.setFuel("전기");
		tesla.setWheel(4);
		tesla.setBatteryCapacity(1000000);
		// Tesla 메소드 모두 사용 가능

		// 1-3) car2 (부모 = 자식(Tesla))
		car2.setEngine("전기모터");
		car2.setFuel("전기");
		car2.setWheel(4);
		// car2.setBatteryCapacity(1000000);
		// 오류 발생 : The method setBatteryCapacity(int) is undefined for the type Car
		// 업캐스팅 되었기에 부모만을 바라보고 있기에 본인의 고유 기능을 사용할 수 없다


		// 1-4) car3 (부모 = 자식(Spark))
		car3.setEngine("경차 엔진");
		car3.setFuel("휘발유");
		car3.setWheel(4);
		// car3.setDiscountOffer(0.5);
		// 오류 발생 : The method setDiscountOffer(double) is undefined for the type Car
		// 업캐스팅 되었기에 부모만을 바라보고 있기에 본인의 고유 기능을 사용할 수 없다

		// ---------------------------------------------------------

		// 2) 다형성을 이용한 객체 배열

		// 객체 배열 : 같은 객체 참조 자료형의 변수를 하나의 묶음으로 다루는 것

		// + 다형성 적용 -> 부모 타입 참조 자료형의 변수를 하나의 묶음으로 다루는 것

		Car[] arr = new Car[3]; // 부모 타입 참조 변수 배열 선언 및 할당
		// 각 배열 요소가 Car타입 참조 변수

		arr[0] = car; // Car 주소를 넣었다 == Car 객체
		// Car 참조 변수 주소값 가짐

		arr[1] = car2; // Tesla 주소를 넣었다 == Tesla 객체
		// Car 참조 변수 주소값 가짐

		arr[2] = car3; // Spark 주소를 넣었다 == Spark 객체
		// Car 참조 변수 주소값 가짐

		// 상속 + 다형성
		// 상속 특징 : 일련의 클래스들에 대한 공통적인 규약 정의
		// 		  	 -> Car 상속 클래스는 모두 Car가 가지고 있는 필드, 메소드를 물려받음
		//				즉, 모두 getEngine()을 가지고 있다
		// 다형성(업캐스팅) : 부모 타입 참조 변수 arr[i]로 자식 객체를 참조할 수 있다.
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 인덱스의 엔진 : "+ arr[i].getEngine());

		}
	}
	public void ex2() {
		// 3) 다형성(업캐스팅)을 이용한 매개변수 사용법

		Tesla t = new Tesla("전기모터", "전기", 4, 10000000);
		Spark s = new Spark("경차 엔진", "휘발유", 4, 0.5);
		Car c = new Car("엔진", "경유", 12);

		printCar(t);
		printCar(s);
		printCar(c);

		System.out.println("-------------------------------------");

		// 4) 다형성을 이용한 반환형 사용법
		// Car[] arr = {new Car(), new Tesla(), new Spark()};
		Car[] arr = {createCar(1), createCar(2), createCar(3)};
						// Car	 	 Car			Car
						//	       (Tesla)		  (Spark)
						//	  arr[1] = new Tesla();
		
		
		// arr[0]; // Car
		// arr[1]; // Tesla
		// arr[2]; // Spark
		
		// instanceof 연산자 : 객체의 자료형을 검사하는 연산자
		// -> 참조하는 객체가 특정 자료형 이거나 부모 쪽 상속 관계인지를 확인
		
		// arr[1]이 참조한느 객체가 Tesla이면 true, 아니면 false
		System.out.println(arr[1] instanceof Tesla); // true
		
		// arr[1]이 참조한느 객체가 Spark이면 true, 아니면 false
		System.out.println(arr[1] instanceof Spark); // false
		
		// arr[1]이 참조한느 객체가 Car이면 true, 아니면 false
		System.out.println(arr[1] instanceof Car); // true
		
		System.out.println("-----------------------------");
		
		for(int i=0; i<arr.length; i++) {
			/*
			if(arr[i] instanceof Tesla) {
				System.out.println("Tesla 객체입니다");
			} else if(arr[i] instanceof Car) { // 여기가 true이기 때문에, Spark 쪽도 Car로 결과값이 나옴
				System.out.println("Car 객체입니다");
			} else {
				System.out.println("Spark 객체입니다");
			} */
			
			if(arr[i] instanceof Tesla) {
				System.out.println("Tesla 객체입니다");
			} else if(arr[i] instanceof Spark) {
				System.out.println("Spark 객체입니다");
			} else { // 부모를 맨 마지막으로 해야한다
				System.out.println("Car 객체입니다");
			}
			
			
		}
		
		
	}

	// 전달 받은 Car 또는 자식 객체의 엔진, 연료, 바퀴 개수를 출력하는 메소드
	// 각각 set로 가져오기 힘드니깐 메소드로 한번에 만들기
	public void printCar(Car temp) {
		// Tesla, Spark 둘 다 들어가야 하는데 둘은 완전히 다름
		// Car temp(임시적으로 쓴 것)
		// 매개변수에 부모 타입 참조변수를 작성하면 모든 자식 객체를 전달 받을 수 있다

		// t는 Tesla의 주소를 가져옴 == 매개변수에 작성된 참조형 변수에는 주소가 저장된다(얕은 복사)
		// 메소드 내부 변수 + 매개변수 == 지역 변수(Local Variable) : 해당 {}안에서만 사용 가능

		System.out.println("엔진 : " + temp.getEngine());
		System.out.println("연료 : " + temp.getFuel());
		System.out.println("바퀴 개수 : " + temp.getWheel() + "개");
		System.out.println();

	}

	// 전달 받은 매개변수에 따라서 Car 또는 자식 객체를 생성하고
	// 생성된 객체의 주소를 반환
	public Car createCar(int num) {
		Car result = null;
		// null == 아무것도 참조하고 있지 않음
		
		switch(num) {
		case 1 : result = new Car(); break;
		case 2 : result = new Tesla(); break;
		case 3 : result = new Spark(); break;
		
		}
		
		// 반환형은 Car 이지만
		// case2, 3이면 Car의 자식 객체의 주소가 반환된다.
		return result;
		
	}
	public void ex3() {
		// ***** 다형성 중 다운 캐스팅 *****
		
		// - 다운 캐스팅이란?
		// 부모 타입 참조 변수가 자식 객체를 참조하는
		// 업 캐스팅 상태에서만 진행할 수 있는 기술로
		
		// 부모 타입을 자식 타입으로 "강제 형변환" 해서
		// 자식 개체의 본래 필드, 메소드를 사용 가능하게 한다.
		
		Car c1 = new Tesla("전기모터", "전기", 4, 500000);
		// System.out.println(c1.getBatteryCapacity());
		// 오류발생 : The method getBatteryCapacity() is undefined for the type Car
		System.out.println(((Tesla)c1).getBatteryCapacity());
		// 주의!!! "." 연산자가 
		// (Tesla) 형변환 연산자보다 우선 순위가 높음
		// 형변환을 먼저 실행해라 (Tesla)c1.getBatteryCapacity() 
		//                -> ((Tesla)c1).getBatteryCapacity()
		
		// <효율적인 다운 캐스팅 방법>
		// ()를 이용한 방법도 가능하지만, 번거롭기에 얕은 복사 이용하기
		// - 얕은 복사를 이용한다
		
		// Tesla t1 = c1; // 오류발생 : 자료형이 맞지 않음 -> 맞춰준다
		Tesla t1 = (Tesla)c1;
		
		System.out.println(t1.getBatteryCapacity());
	}
	
	public void ex4() {
		
		// !!!!!!!!! 다운 캐스팅 주의 사항 !!!!!!!!!
		// 업 캐스팅 때문에 사용 못했던 자식 부분을 다시 쓰고 싶을 때 강제로 형변환해서 사용하게 한 것
		
		Car c1 = new Tesla();
		// 부모 = 자식1
		// Spark s1 = (Spark)c1;
		// 자식2 = (다운캐스팅)부모
		
		// Car가 Tesla안에 있는 Car 참조하고 있음
		// Spark랑 Tesla는 상관없기에 실행하면 오류가 남 
		// java.lang.ClassCastException'
		// -> c1이 참조하는 객체는 Tesla인데
		// 	  Spark 참조변수로 Tesla 참조하려고 해서 문제 발생
		
		// @@@ 해결 방법 : instanceof(객체 자료형이 맞는지 아닌지 확인해줌)와 같이 사용!
		if(c1 instanceof Spark) {
			Spark s1 = (Spark)c1; // 다운캐스팅
			System.out.println("다운캐스팅 성공");
			
		} else {
			System.out.println("실패(Spark 타입이 아님)");
			// Spark 타입 아니라서 다운캐스팅이 안 된다.
		}
		
		// 업캐스팅 할 때 자식 부분을 다시 사용하기 위해서 강제 형변환으로 사용 가능하게 만들어줌
		// 이때 자료형이 서로 맞아야함
		// instanceof 사용하기
	}
	
	public void ex5() {
		// 바인딩(Binding)
		// - 실제 실행할 메소드 코드와 호출하는 코드를 연결 시키는 것
		
		Car c1 = new Car("경유 엔진", "경유", 8);
		
		System.out.println(c1.getEngine());
		// Car 객체에 있는 getEngine() 메소드를 호출 == 바인딩
		// String edu.kh.poly.ex1.model.vo.Car.getEngine()
		
		// 프로그램 "실행 전"
		// - 컴파일러는 getEngine() 메소드가 Car에 있는 걸로 인식해서
		// c1.getEngine() 호출 코드와
		// String edu.kh.poly.ex1.model.vo.Car.getEngine() 메소드 코드를 연결
		// --> [정적 바인딩]
		
		System.out.println(c1.toString());
		// String edu.kh.poly.ex1.model.vo.Car.toString()
		// Car 참조변수 c1을 이용해서
		// Car 객체에 있는 오버라이딩된 toString() 메소드를 호출
		
		
		// ** 다형성 적용 시 바인딩 **
		Car c2 = new Spark("엔진", "휘발유", 4, 0.4);
		// 업캐스팅 적용 -> 부모 부분만 참조 가능한 상태
		
		System.out.println(c2.toString());
		// String edu.kh.poly.ex1.model.vo.Car.toString()
		// 참조변수 c2가 Car 타입이므로
		// toString()도 Car의 toString()을 호출 - 정적 바인딩
		
		// 하지만 실행해보면 자식(Spark)의 toString()이 호출되는 것을 확인!
		// -> 컴파일 시에는 부모(Car)와 바인딩 == [정적 바인딩]
		// -> "실행 시"에는 자식(Spark)의 오버라이딩된 메소드와 바인딩 == [동적 바인딩]
		
		
		// ** 동적 바인딩 활용 방법 **
		
		Car[] arr = {
				new Car("v6 엔진", "경유", 12),
				new Tesla("전기 모터", "전기", 4, 50000000),
				new Spark("v8 엔진", "무연", 4, 0.3)
		};
		
		// arr 배열 요소가 참조하는 모든 객체의 필드 값을 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 요소 : "+ arr[i].toString());
			// 실행 전 : String edu.kh.poly.ex1.model.vo.Car.toString() - 정적 바인딩
			// 실행 후 : 각 객체의 오버라이딩된 toString()이 호출됨 - 동적 바인딩
			
		}
		
		// ** 동적 바인딩 장점(자식의 오버라이딩) **
		// - 업캐스팅 상태의 참조 변수를 별도의 다운 캐스팅 없이 자신의 오버라이딩된 메소드를 수행할 수 있다

	}
	

}
