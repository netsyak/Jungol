package q1304;
import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr;
		int n;
		int num = 0;
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[j][i] = num++;  
		
				
			System.out.print(arr[j][i]);
			System.out.println();
			}
				sc.close();
			}
		}
	}


