package q556;

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[10];
				
		for (int i=0 ; i<arr.length; i++) {
			arr[i]= sc.nextInt();			
		}
		sc.close();
		
		for (int i=0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
