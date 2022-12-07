package q1303;

// 바둑판 모양 상자 문제)너비 칸 숫자배열
// ex) 3 X 3
// 1 2 3
// 4 5 6
// 7 8 9


import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		 int num = 1 ;
		 sc.close();
		 for (int i = 0; i<x; i++) {
			 for(int j =0 ; j<y; j++) {
				 System.out.printf("%d ",num++);
			 }
			 System.out.println();
	
		 }
	}
}
