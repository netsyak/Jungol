package q524;

import java.util.Scanner ;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
	
		boolean c = (a!= 0);
		boolean d = (b!= 0);
			
		System.out.print((c && d)+" "+ (c || d));
					
	}
      
}