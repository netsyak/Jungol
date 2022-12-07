package q593X;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		
 		for (;;) {
 			System.out.print("ASCII code =? ");
 			int a = sc.nextInt();
 			if (a>=33 && a<=127) {  
 					System.out.printf("%c\n",a);
 			}else
 			sc.close();
 			
// 		int inp=0; // 시작 전에 변수 초기화를 하기 (*습관 드리기)
//	do {
//	//	System.out.print("ASCII code =? ");
//	//	inp = sc.nextInt();
//		if(inp<33 || inp> 127) {
//			break;
//		}
//		System.out.printf("%c\n",inp);
//	}while (inp>=33 && inp<=127);
//	sc.close();
	
	
	}
}
