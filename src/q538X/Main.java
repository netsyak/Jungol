package q538X;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(;;) {  //먼저 물음문자이 나오게  무한으로 "for(;;)"
		 System.out.print("number?");
		 int inp = sc.nextInt();
		 
		 if (inp >0) {
			 System.out.println("positive integer");
		 } else if (inp <0) {
			 System.out.println("negative number");
		 } else {
			sc.close();  // 현 위치에서 scanner 를 종료한다. 이전에 하면 문제 발생
			 break;
		 }
		 
		
		}
		
		
	}

}
