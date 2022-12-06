package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			char x = sc.next().charAt(0); // 첫째 문자열의 첫번째 문자 출력
			sc.close();
			
		if (x == 'A' ) {
		 System.out.println("Excellent");		 
	   } else if (x == 'B') {
		   System.out.println("Good");
	   } else if (x == 'C') {
		   System.out.println("Usually");
	   } else if (x == 'D') {
		   System.out.println("Effort");
	   } else if (x == 'F') {
		   System.out.println("Failure");
	   } else {
		   System.out.println("error");
	   }
	}		
}
