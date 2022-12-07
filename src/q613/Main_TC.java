package q613;

import java.util.Scanner;

class Student {  // 이름 학교명 학년을  입력받아 
	private String name;
	private String school;
	private int grade;
	// 설계도class

	public Student(String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}// 생성자- 계속 자동 추출하려는 내용

	public void print() { // 고정 출력 값을 도출함  
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade); 
	}// 추가출력 내용 기입하려면...(필요출력 내용 추가)
}

public class Main_TC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();

//	    System.out.println(name);
//	 	System.out.println(school);
//	 	System.out.println(grade);

		Student stu = new Student(name, school, grade); // 인스터스를 늘릴려면...(학생수 늘어날 때 추가기입)
		stu.print();// 위 print()로 (Line17.) 이동 하여 출력 진행한다.
	}
}
