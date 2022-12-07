package q2046;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		switch(num2) {
		
		case 1: // 종류 1
		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num1; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		  }
		case 2:	
		for (int i = 1; i <= num1; i++) {
      		if(i%2==0) {
				for(int j=1;j<=num1;j++) {
					System.out.print(j+" ");
				}
				}else {
					for(int j=num1 ;j>0;j--) {
						System.out.print(j+" ");
					}
				}
      		System.out.println();
      		}
		case 3:
			for(int i=1 ; i<=num1; i++) {
				for(int j=i,c=0;c<num1;c++,j+=i) {
					System.out.print(j+" ");
				}
				System.out.println();
				}
			break;
			}
		}
	}

		
