package q539X;
// 합계 평균
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[100];
		int i = 0;
		int sum = 0;
//		for (;;) {
//			ar[i] = sc.nextInt();
//			sum +=ar[i];
//			if (ar[i++] >= 100) {
//				sc.close();
//				break;
//			}
//		} 
//		for (int j = 0; j <= i; j++) {
//			System.out.print(ar[j] + " ");
//		}
		for (int j=0; j<=i; j++) {
			sum +=ar[j];
		}
		System.out.println(sum);
		System.out.printf("%.1f",(double)sum/i);
	 sc.close();
	}
}
