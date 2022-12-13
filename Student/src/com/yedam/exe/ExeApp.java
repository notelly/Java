package com.yedam.exe;

import java.util.Scanner;

import com.yedam.student.StudentService;

public class ExeApp {
	
	Scanner sc = new Scanner(System.in);
	StudentService std = new StudentService();
	
	
	
	
	public ExeApp() {
		run();
	}
	
	private void run() {
		String menu = "";
		while(true) {
			System.out.println(" 1. 학생 정보 조회 | 2. 학생 등록 | 3. 학생 퇴학 | 4. 학생 전공 변경 | 5. 종료");
			System.out.println("입력 > ");
			menu = sc.nextLine();
			
			if (menu.equals("1")) {
				
				std.getStudentList();
				
			}else if(menu.equals("2")) {
				
				std.insertStudent();
				
			}else if(menu.equals("3")) {
				
				std.deleteStudent();
				
			}else if(menu.equals("4")) {
				
			}else if(menu.equals("5")) {
				System.out.println("end of prog");
				break;
			}
			
		}
	}
	
	
}
