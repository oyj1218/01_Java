package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {

	private Scanner sc = new Scanner(System.in);

	// Member 5칸짜리 객체 배열 선언 및 할당
	private Member[] memberArr = new Member[5];

	// 현재 로그인한 회원의 정보를 저장할 변수 선언
	private Member loginMember = null;

	public void displayMenu() { // 메뉴 화면 출력 기능

		int menuNum = 0; // 메뉴 선택용 변수

		do { // 한 번은 무조건 반복
			System.out.println("======회원 정보 관리 프로그램 v2======");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색(지역)");
			System.out.println("0. 프로그램 종료");

			System.out.print("메뉴 입력 >> ");
			menuNum = sc.nextInt(); // 필드에 작성된 Scanner sc 사용


			switch(menuNum) {
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(login()); break;
			case 3 : System.out.println(selectMember()); break;
			case 4 : System.out.println(updateMember()); break;
			case 5 : System.out.println(searchRegion());; break;

			case 0 : System.out.println("프로그램을 종료합니다"); break; 
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}

		} while(menuNum !=0);
	}
	// 회원가입 메소드
	public String signUp() {
		System.out.println("\n========= 회원 가입 ==========");

		// 객체 배열(memberArr)에 가입한 회원 정보를 저장할 예정
		// -> 새로운 회원 정보를 저장할 공간이 있는지 확인하고
		// 	  빈 공간의 인덱스 번호를 얻어오기 --> 새로운 메소드 작성

		int index = emptyIndex(); // memberArr 배열에서 비어있는 인덱스를 반환 받음

		if(index == -1) { // 비어있는 인덱스가 없을 경우 -> 회원 가입 불가
			return "회원 가입이 불가능합니다. (인원 수 초과)";
		}
		System.out.println("현재 회원 수 : "+ index);

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

		System.out.print("지역 : ");
		String region = sc.next();

		// 비밀번호, 비밀번호 확인 일치 시 회원가입
		if(memberPw1.equals(memberPw2)) {
			// Member 객체를 생성해서 할당된 주소를 memberArr 비어있는 인덱스에 대입
			memberArr[index] = new Member(memberId, memberPw2, memberName, memberAge, region);
			return "회원 가입 성공!";
		}
		else {
			return "회원 가입 실패(비밀번호 불일치)";
		}
	}

	// memberArr의 비어있는 인덱스 번호를 반환하는 메소드
	// 단, 비어있는 인덱스가 없으면 -1 반환
	public int emptyIndex() {

		// memberArr 배열을 0번 인덱스부터 끝까지 접근해서
		// 참조하는 값이 null인 경우의 인덱스를 반환
		for(int i=0; i<memberArr.length; i++) {
			if(memberArr[i] == null) {
				return i; // 현재 메소드를 종료하고 호출한 곳으로
				// i 값을 가지고 돌아감
			}
		}
		// for문을 수행했지만 return이 되지 않은 경우 해당 위치 코드가 수행된다!
		// -> for문에서 return 되지 않았다 == 배열에 빈칸이 없다
		// == -1 반환

		return -1;
	}

	// 로그인 메소드
	public String login() {
		System.out.println("\n========== 로그인 ===========");

		System.out.print("아이디 입력 : ");
		String memberId = sc.next();

		System.out.print("비밀번호 : ");
		String memberPw1 = sc.next();

		// 1) memberArr 배열 내 요소를 순서대로 접근하여 null이 아닌지 확인
		for(int i=0; i<memberArr.length; i++) {
			if(memberArr[i] == null) { // 회원의 정보가 있을 경우

				// 2) 회원 정보의 아이디, 비밀번호와
				// 	  입력 받은 아이디, 비밀번호와 같은지 확인
				return "회원 가입부터 해주세요";
			} else {
				if(memberArr[i].getMemberId().equals(memberId) && 
						memberArr[i].getMemberPw().equals(memberPw1)) {

					// 3) 로그인 회원 정보 객체를 참조하는 변수 loginMember에
					//    현재 접근 중인 memberArr[i] 요소에 저장된 주소를 얕은 복사
					loginMember = memberArr[i];
					break; // 더 이상 같은 아이디, 비밀번호가 없기 때문에 for문 종료
				}
			}
		}

		// 4) 로그인 성공/실패 여부에 따라 결과 값을 반환
		if(loginMember == null) { // 로그인 실패
			return "아이디 또는 비밀번호가 일치하지 않습니다";
		} else { // 로그인 성공
			return loginMember.getMemberName() + "님 환영합니다";
		}

	}

	public String selectMember(){
		System.out.println("\n======= 회원 정보 조회 ========");

		// 회원 정보 조회 메소드
		// 이름 :유저일
		// 아이디 : user01
		// 나이 : 26세
		// 지역 : 서울

		if(loginMember == null){  // 로그인이 안 되어 있을 때
			return "로그인 후 해주세요";

		} else { // 로그인이 될 
			String str = "이름 : " + loginMember.getMemberName();
			str += "\n아이디 : " + loginMember.getMemberId();
			str += "\n나이 : " + loginMember.getMemberAge() + "세";
			str += "\n지역 : " + loginMember.getRegion();
			return str;

		}

	}

	public String updateMember() {
		System.out.println("\n======= 회원 정보 수정 =======");
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
			String str = "아이디 : " + inputId + "으로 수정되었습니다";
			str += "\n이름 : " + inputName + "으로 수정되었습니다";
			str += "\n나이 : " + inputAge + "세로 수정되었습니다";
			return str;
		}
		return "비밀번호가 틀립니다. 다시 입력해주세요";
	}

	public String searchRegion() {
		if(loginMember==null){ // 로그인이 안될 때
			return "로그인 후 해주세요";
		}
		// 로그인 될 때
		System.out.print("검색할 지역 명을 입력해주세요 : ");
		String inputRegion = sc.next();

		if(inputRegion.equals(loginMember.getRegion())) { // 입력한 비밀번호랑 실제 비밀번호가 같으면
			String str = "이름 : " + loginMember.getMemberName();
			return str;
		}
		return "비밀번호가 틀립니다. 다시 입력해주세요";

	}
}


