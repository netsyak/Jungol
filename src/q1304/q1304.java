package q1304;
import java.util.Scanner;

public class q1304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int num = 1;
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
		//	System.out.println();
		}
	}
}
//}
//for(int i = 1; i <= n; i++ ) {
//    for(int j = i; j <= n * n; j = j + n) {
//       System.out.print(j + " ");
//    }
//    System.out.println();