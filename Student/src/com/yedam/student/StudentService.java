package com.yedam.student;

import java.util.List;
import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);

	// 정보 조회
	public void getStudentList() {
		List<Student> list = StudentDAO.getInstance().getStudentList();
		for (int i = 0; i < list.size(); i++) {
			System.out.println("학번  : " + list.get(i).getStdId());
			System.out.println("이름  : " + list.get(i).getStdName());
			System.out.println("전공  : " + list.get(i).getStdMajor());
			System.out.println("학번  : " + list.get(i).getStdGrade());
			System.out.println("================================");
		}
	}

	// 학생 등록
	public void insertStudent() {
		int id = 0;
		String name = "";
		String major = "";
		Double grade = (double) 0;

		Student student = new Student();

//			while (true) {
//			if (student == null) {
//				student = new Student();
//				System.out.println("정보를 입력해 주세요.");
//				student.setStdId(id);
//				break;
//			} else {
//				System.out.println("이 학번은 이미 존재합니다. 다시 입력하세요.");
//			}
//		}
//		
		System.out.println("학번 > ");
		id = Integer.parseInt(sc.nextLine());
		student.setStdId(id);

		System.out.println("이름 >");

		name = sc.nextLine();

		System.out.println("전공 >");

		major = sc.nextLine();

		System.out.println("학점 >");

		grade = Double.parseDouble(sc.nextLine());

		student.setStdName(name);
		student.setStdMajor(major);
		student.setStdGrade(grade);

		int result = StudentDAO.getInstance().insertStudent(student);

		if (result == 1) {
			System.out.println("정상 등록 되었습니다.");
		} else {
			System.out.println("등록에 실패 했습니다.");
		}

	}
	
	// 학생 퇴학
	
	public void deleteStudent() {
		System.out.println("학생의 이름을 입력하세요 >");
		String name = sc.next();
		
		int result = StudentDAO.getInstance().deleteStudent(name);
		
		if(result == 1) {
			System.out.println(name +" 학생 퇴학 완료");
		}else {
			System.out.println("오류!");
		}
		
		
		
	}
	
	
	
	

}
