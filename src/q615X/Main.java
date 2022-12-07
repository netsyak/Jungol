package q615X;

import java.util.Scanner;

class sch {
	private String name;
	private int kor;
	private int eng;
	private int avg;

	public sch (String name, int cs1,  int cs2,int avg) {
		this.name = name;
		this.kor= kor;
		this.eng= eng;
		this.avg = avg;

		public Void print() {
			System.out.println(name + " " + kor + " " + eng);
			System.out.println("avg" + avg);
		}

		public int getKor() {
			return kor;
		}

		public int getEng() {
			return eng;
		}
	}

	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Student[] stu = new Student[2];
			for(int i=0;i<stu.length;i++) {
				String name = sc.next();
				int kor = sc.nextInt();
				int eng = sc.nextInt();	 
				int avg = (kor+eng)/stu.length;
				stu[i]= new Student(name, kor, eng);

			}
			sc.close();

		}




	}
