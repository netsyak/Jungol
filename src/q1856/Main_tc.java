package q1856;

import java.util.Scanner;

public class Main_tc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 세로
		int m = sc.nextInt(); // 가로
		sc.close();

		// 방법 1.
//		int num= 1;
//		for ( int i =0; i <n; i++ ) {
//			if(i%2==0){
//			for(int j=m; j<m; j++) {
//				System.out.printf("%d",num++ );
//			}
//			}else {
//				num = num + (m-1);
//				for (int j =0; j<m; j++){
//						System.out.print(num + " ");
//						num--;
//			}
//		}
//				System.out.println();
//		}
//	}
//}

		int[][] arr = new int[n][m];
		int num = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; i < m; j++) {
					arr[i][j] = num++;
				}
			} else {
				for (int j = m - 1; j >= 0; j--) {
					arr[i][j] = num++;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

// 3x4		n
//1  2  3  4//8  7  6  5//9 10 11 12//16 15 14 13    	 
