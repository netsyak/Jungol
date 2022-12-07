package q578;

import java.util.Scanner;

class Ggd {
	private int n1;
	private int n2;

	public void input() {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
	}
	

	public static void main(String[] args) {
		
		if (num1 > num2) {
		int tmp =num1;
		 num1 = num2;
		 num2= tmp;
		}
		
		for(int i =num1; i<=num2 ; i++) {
			System.out.printf("== %ddan ==\n",i); 
			for(int j =1; j <=9 ; j++) {
				System.out.printf("%d * %d = %2d\n",i,j,(i*j)); 
			}
		System.out.println();

				
		Main gg = new Main();
		int ggds = gg.ggd(num1, num2);
		
	}
	}
}
