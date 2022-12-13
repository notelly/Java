package com.yedoam.member;

import java.util.List;
import java.util.Scanner;

public class MemberService {
	Scanner sc = new Scanner(System.in);
	// member의 정보를 자바 전역에 공유하기 위해 static 변수 선언
	// 1.데이터가 들어가 있는 경우 -> 로그인이 되어있다.
	// 2.데이터가 없어서 null인 경우 -> 로그인이 안 되어 있다.
	public static Member memberInfo = null;

	// 1.로그인
	public void login() { // login 함수를 가지고 와서 실행
		Member member = new Member();
		// id 입력하는 변수
		String id = "";
		// pw 입력하는 변수
		String pw = "";

		// id, pw 입력 함.
		System.out.println("ID > ");
		id = sc.nextLine();
		System.out.println("PW > ");
		pw = sc.nextLine();

		// member는 id만 가지고 있는 객체
		member.setMemberId(id);
		// id를 통해서 회원의 정보를 조회하고, 조회 된 결과를
		// member객체에 넣어주는 부분
		// 1. id를 통해서 조회가 되었다. -> 회원의 정보가 존재하고, 입력한 ID도 맞다.
		// -> 따라서, 입력한 비밀번호와 조회한 비밀번호가 맞으면,
		// -> 로그인 시켜주면 됨.
		// -> meber 객체는 회원 정보가 들어있다.
		// 2. id를 통해서 조회가 되지 않았다. -> 회원의 정보가 없다.
		// -> member 객체는 null
		member = MemberDAO.getInstance().login(member); // login 값을 저장해서 이곳저곳에 데리고 가 줌.

		// 조회한 정보와 내가 입력한 정보가 같은지 비교

		if (member != null) {
			/*
			 * if(member.getMemberId().equals(id)) { System.out.println("아이디가 틀립니다."); } 이건
			 * 당연히 필요없음.
			 */
			if (member.getMemberPw().equals(pw)) {
				// 로그인 완료 -> member의 정보를 자바 전역에 공유.
				System.out.println("정상 로그인 되었습니다.");
				System.out.println("🎀 " + member.getMemberId() + " 님 환영합니다. 🎀");
				// 로그인 성공한 member의 정보를 memberInfo에 넣음.
				memberInfo = member;
			} else {
				System.out.println("비밀번호가 틀립니다.");
			}
		} else {
			System.out.println("아이디가 존재하지 않습니다.");
		}

	}

	// 로그아웃 아이디 값이 null이면 로그아웃 된거임
	public void logout() {
		memberInfo = null;
		System.out.println("정상적으로 로그아웃 되었습니다.");
	}

	public void getMemberList() {
		List<Member> list = MemberDAO.getInstance().getMemberList();
		for (int i = 0; i < list.size(); i++) {
//			//관리자와 사용자를 나누어 출력
//			System.out.println("ID : " + list.get(i).getMemberId());
//			System.out.println("PW : " + list.get(i).getMemberPw());
//			System.out.println("ADDR : " + list.get(i).getMemberAddr());
//			System.out.println("PHONE : " + list.get(i).getMemberPhone());
//			
//			//list 안에 i번쨰 안에 있는 member의 객체 필드 값 중에 GRADE를 대문자로
//			//바꾼다음 N와 비교해서 같으면 관리자, 아니면 사용자
//			if(list.get(i).getMemberRank().toUpperCase().equals("N")) {
//				System.out.println("GRADE : 관리자");
//			}else {
//				System.out.println("GRADE : 사용자");
//			
			// 회원에 대한 조회
			System.out.println(list.get(i).toString()); // 오버라이딩 된 것을 가지고 와서 간단하게 정보 보는 법. // 오버라이딩을 수정하면 원하는 형태로 볼 수
														// 있다.
			System.out.println("======================================");
		}
	}

	// 회원 등록
	public void insertMember() {
		String id = "";
		String pw = "";
		String addr = "";
		String rank = "";
		int phone = 0;

		Member member = new Member();

		while (true) {
			System.out.println("ID > ");
			id = sc.nextLine();
			// 중복을 체크 확인 후, while 탈출
			// null이면 회원가입 가능
			member.setMemberId(id);

			member = MemberDAO.getInstance().login(member);

			if (member == null) {
				member = new Member(); // null이면 메모리를 넣을 수 있는 공간이 할당 되지 않는다.
				// 초기화 한번 시켜주고 써야함.
				System.out.println("회원가입 가능한 아이디 입니다");
				member.setMemberId(id);
				break;
			} else {
				System.out.println("이미 존재하는 아이디 입니다. 다시 입력하세요.");
			}
		}
		System.out.println("PW > ");

		pw = sc.nextLine();

		System.out.println("ADDR >");

		addr = sc.nextLine();

		System.out.println("PHONE >");

		phone = Integer.parseInt(sc.nextLine());

		member.setMemberPw(pw);
		member.setMemberAddr(addr);
		member.setMemberPhone(phone);
		member.setMemberRank("N");

		int result = MemberDAO.getInstance().insertMember(member);

		if (result == 1) {
			System.out.println("정상 회원 가입되었습니다.");
		} else {
			System.out.println("회원가입 실패 했습니다.");
		}
	}
	// 회원 탈퇴(삭제)
	
	public void deleteMember() {
		System.out.println("삭제 ID >");
		String id = sc.nextLine();
		
		int result = MemberDAO.getInstance().deleteMember(id);
	
			
		if(result == 1) {
			System.out.println("ID 삭제 완료");
		}else {
			System.out.println("ID 삭제 완료");
		}
		
		
	}
	
	//회원 수정(비밀번호)
	public void updateMember() {
		//아이디와 패스워드를 담을 객체
		Member member = new Member();
		
		//짧고 간단하지만 별로 좋은 코드는 아님
		System.out.println("수정 PW >");
		member.setMemberPw(sc.nextLine());
		System.out.println("ID >");
		member.setMemberId(sc.nextLine());
		
		int result = MemberDAO.getInstance().updateMember(member);
		
		if (result ==  1) {
			System.out.println("정상 수정 되었습니다.");
		}else {
			System.out.println("수정 되었습니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
