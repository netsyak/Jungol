package q9052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();

//			System.out.print(score[i] + " ");
		}
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum +=score[i];
		}
		double avg = (double)sum/score.length;
		System.out.println("총점 : "+sum);
		System.out.printf("평균 : "+avg);
		sc.close();
   	   }
	
}

