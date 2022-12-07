package q615X;

import java.util.Scanner;

// 구조체 = class 로 구성해서 코딩하는 문제
class Student { // 클래서 변수명은 필히 대문자로
	private String name; // 일반적인 형태 private
	private int kor;
	private int eng;

	public Student(String name, int kor, int eng) {// 파라민트
		this.name = name;
		this.kor = kor;
		this.eng = eng; // 생성자 = 받아오는 자료 부분

	}

	public void print() {
		System.out.print(name + " " + kor + " " + eng);
	}

	public int getKor() {
		return kor;

	}
	public int getEng() {
			return eng;
	}
}  // 여기까지 1단계?????

	public class Main1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Student[] stu = new Student[2]; 
			for(int i =0 ; i<stu.length;i++) {
				String name = sc.next();
				int kor = sc.nextInt();
				int eng = sc.nextInt();
				stu[i] = new Student(name, kor, eng); //반복문 돌면서 생성자들 만들어준다.
			}
			sc.close();
			for(int i =0; i<stu.length; i++) {
				stu[i].print();  //line 18 으로 이동출력
			}
		}

			public int getKor() {
				int sum=0;
				for(int i=0;i<stu.length; i++) {
					sum +=stu[i].getKor();
				}
				public int getEng() {
					int sum=0;
					for(int i=0;i<stu.length; i++) {
						sum +=stu[i].getEng();
					}
					return sum / stu.length;
				}
			}
		}
	
