package q614X;

import java.util.Scanner;

class Education {
	private String school;
	private int grade;

	public Education(String school, int grade) {

	
		this.school = school;
		this.grade = grade;
	}

	public void print() {
		System.out.println(grade + " grade "+"in " + school + " school");
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		String school1 = "Jejuelementary";
		int grade1 = 6 ;
		sc.close();

		Education edu = new Education(school, grade);
		Education edu1 = new Education(school1, grade1);
		edu1.print();
		edu.print();
	}
}