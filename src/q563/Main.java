package q563;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

	//	int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		for (int i=0; i<arr.length; i++) {
			int max = -1, idx = -1;
			for (int j=0; j< arr.length; j++) {
				if(max < arr[i]) {
					max=arr[j];
					idx = j;
				}
			}
				System.out.print(" ["+max + "] ");
				arr[idx] = -1;
			}
		for (int j =0 ; j< arr.length; j++) {
			System.out.print()
		}
		}
	}
