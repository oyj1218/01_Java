package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService { // 클래스
	// public MemberService(int a) {}

	// 속성(필드)
	private Scanner sc = new Scanner(System.in);
	// System.in : 자바에서 기본적으로 지정해둔 입력 장치(키보드)

	private Member memberInfo = null; // 회원가입 : 가입한 회원의 정보를 저장할 변수
	private Member loginMember = null; // 로그인 : 로그인한 회원의 정보를 저장할 변수



	// 기능(생성자, 메소드)
	public MemberService() {} // 기본 생성자

	// ** 메소드 작성법 **

	// [접근제한자] 	 [예약어]		 	 반환형			메소드명([매개변수]){}
	// public   	 static			기본자료형		
	// protected 	 final	     참조형(배열, 클래스)
	// (dafault)    abstract	     void
	// private	  static final

	public void displayMenu() { // 메뉴 화면 출력 기능

		int menuNum = 0; // 메뉴 선택용 변수

		do { // 한 번은 무조건 반복
			System.out.println("======회원 정보 관리 프로그램 v1======");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");

			System.out.print("메뉴 입력 >> ");
			menuNum = sc.nextInt(); // 필드에 작성된 Scanner sc 사용


			switch(menuNum) {
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(login()); break;
			case 3 : System.out.println(selectMember()); break;
			case 4 : System.out.println(UpdateMember()); break;
			case 0 : System.out.println("프로그램을 종료합니다"); break; 
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}

		} while(menuNum !=0);
	}

	// 회원 가입 기능
	public String signUp() {
		// void는 반환형인데, 해당 메소드가 끝나고 호출한 곳으로 돌아갈 때 반환할 값이 없다
		// String : String 자료형 값을 가지고 돌아간디


		// 같은 클래스 내부에 있는 필드, 메소드는 이름만 불러도 호출 가능!
		System.out.println("\n********* 회원 가입 ***********");

		System.out.print("아이디 : ");
		String memberId = sc.next();

		System.out.print("비밀번호 : ");
		String memberPw1 = sc.next();

		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.next();

		System.out.print("이름 : ");
		String memberName = sc.next();

		System.out.print("나이 : ");
		int memberAge = sc.nextInt();

		// 비밀번호, 비밀번호 확인이 일치하면 회원가입
		// 일치하지 않으면 회원가입 실패
		if(memberPw1.equals(memberPw2)) { // 일치하는 경우

			// 입력 받은 정보를 이용해서 Member 객체를 생성한 후
			// 자바에서의 객체는 new연산자이기에 new 사용
			// new Member(memberId, memberPw1, memberName, memberAge);
			// 생성된 객체의 주소를 필드에 있는 memberInfo에 대입
			memberInfo = new Member(memberId, memberPw1, memberName, memberAge);
			return "회원 가입 성공!!";

		} else { // 일치하지 않는 경우
			return "회원 가입 실패!!(비밀번호 불일치)";
		}
	}

	public String login() {
		System.out.println("******** 로그인 ********");

		// 회원 가입을 했는지 부터 확인
		// == memberInfo가 객체를 참고하고 있는지 확인
		if(memberInfo == null) {// 회원가입을 먼저 안 한 경우
			// null : 아무것도 참조하고 있지 않음
			return "회원 가입부터 진행해주세요.";
		}  else {
			System.out.print("아이디 : ");
			String memberId = sc.next();

			System.out.print("비밀번호 : ");
			String memberPw = sc.next();


			// 회원 가입 정보에서
			// 저장된 아이디, 비밀번호가
			// 입력된 아이디, 비밀번호와 같으면 "로그인 성공"
			// 아니면 "아이디 또는 비밀번호가 일치하지 않습니다"
			if(memberId.equals(memberInfo.getMemberId()) 
					&& memberPw.equals(memberInfo.getMemberPw())) {
				loginMember = memberInfo;
				// 참조형			Member 객체 주소(얕은 복사)

				// 회원 가입 정보를 loginMember에 대입하여
				// 어떤 회원이 로그인 했는지 구분할 수 있게 함

				return loginMember.getMemberName() + "님 환영합니다";

			} else {
				return "아이디 또는 비밀번호가 일치하지 않습니다";
			}
		}
	}


	public String selectMember(){
		System.out.println("******** 회원 정보 조회 ********");

		// 1) 로그인 여부 확인 -> 필드 loginMember가 참조하는 객체가 있는지 확인
		if(loginMember == null){ 
			// loginMember가 참조하는 객체가 없을 경우(null)

			return "로그인 후 해주세요";
			// return 구문이 수행되면 해당 메소드는 즉시 종료되고
			// 호출한 곳으로 돌아감
		}

		// 2) 로그인이 되어있는 경우
		// 	  회원 정보를 출력할 문자열을 만들어서 반환(return)
		// 	  (단, 비밀번호 제외)

		// 이름 : 유저일
		// 아이디 : user01
		// 나이 : 35세


		// return 여러 개 못 만듦

		String str = "이름 : " + loginMember.getMemberName();
		//String 	  edu.kh.oop.method.model.vo.Member.getMemberName()
		//반환형		  				메소드 코드 위치

		str += "\n아이디 : " + loginMember.getMemberId();
		str += "\n나이 : " + loginMember.getMemberAge() + "세";

		return str;
	}

	public String UpdateMember() {
		System.out.println("\n******** 회원 정보 수정 ********");
		if(loginMember==null){ // 로그인이 안될 때
			return "로그인 후 해주세요";

		} // 로그인이 될 때


		System.out.print("비밀번호 확인 : ");
		String inputPw = sc.next();

		if(inputPw.equals(loginMember.getMemberPw())) { // 입력한 비밀번호랑 실제 비밀번호가 같으면
			System.out.print("수정하고 싶은 아이디 : ");
			String inputId = sc.next();

			System.out.print("수정하고 싶은 이름 : ");
			String inputName = sc.next();
			
			System.out.print("수정하고 싶은 나이 : ");
			int inputAge = sc.nextInt();

			loginMember.setMemberId(inputId);
			loginMember.setMemberName(inputName);
			loginMember.setMemberAge(inputAge);
			String str = "이름 : " + inputId + "으로 수정되었습니다";
			str += "\n아이디 : " + inputName + "으로 수정되었습니다";
			str += "\n나이 : " + inputAge + "세로 수정되었습니다";
			
			return str;
		}
		return "비밀번호가 틀립니다. 다시 입력해주세요";
	}
}



