package q557X;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] arr = new char [10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next().charAt(0);
		}
		sc.close();
			System.out.printf(arr[0]+" "+arr[3]+" "+arr[6]);
		}
	}


