package com.yedam.student;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class StudentDAO extends DAO{
	private static StudentDAO studentDao = null;
	
	private StudentDAO() {
		
	}
	
	//싱글톤 공부하기
	public static StudentDAO getInstance() {
		if(studentDao == null) {
			studentDao = new StudentDAO();
		}
		return studentDao;
		
	}
	
	//학생 정보 전체 조회
	public List<Student> getStudentList(){
		List<Student> list = new ArrayList<>();
		Student student = null;
		
		try {
			conn();
			String sql = "SELECT * FROM student";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				student = new Student();
				student.setStdId(rs.getInt("std_id"));
				student.setStdName(rs.getString("ste_name"));
				student.setStdMajor(rs.getString("std_major"));
				student.setStdGrade(rs.getDouble("std_grade"));
				list.add(student);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
			
		return list;
	}
	//학생 정보등록
	public int insertStudent(Student student) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO student VALUES (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, student.getStdId());
			pstmt.setString(2, student.getStdName());
			pstmt.setString(3, student.getStdMajor());
			pstmt.setDouble(4, student.getStdGrade());
			
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//학생 퇴학
	public int deleteStudent(String name) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM student WHERE ste_name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(2, name);
			
			result = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	
	//학생 정보수정 (전공)
	
	
}
