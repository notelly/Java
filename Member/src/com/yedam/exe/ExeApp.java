package com.yedam.exe;

import java.util.Scanner;

import com.yedoam.member.MemberService;

public class ExeApp {
	Scanner sc = new Scanner(System.in);
	MemberService ms = new MemberService();

	public ExeApp() {
		start();
	}

	private void start() {
		boolean run = true;
		String menu = "";
		while (run) {

			// 1. 로그인이 되어 있을 때 메뉴

			if (MemberService.memberInfo != null) {
				System.out.println("1. 회원 조회 | 2. 회원 등록 | 3. 회원 탈퇴 | 4. 회원 수정 | 5. 로그아웃 ");
				System.out.println("입력 >");
				menu = sc.nextLine();

				if (menu.equals("1")) {
					ms.getMemberList();

				} else if (menu.equals("2")) {

					ms.insertMember();

				} else if (menu.equals("3")) {

					ms.deleteMember();					
					
				}else if (menu.equals("4")) {

					ms.updateMember();					
					
				}else if (menu.equals("5")) {
					ms.logout();
				}
			}

			// 2. 로그인이 안되어 있을 때 메뉴
			else if (MemberService.memberInfo == null) {
				System.out.println("1. 로그인 | 2. 종료 ");
				System.out.println("입력 > ");
				menu = sc.nextLine();

				if (menu.equals("1")) {
					ms.login();
				} else if (menu.equals("2")) {
					System.out.println("end of Prog");
					break;
				}
			}

		}
	}
}
