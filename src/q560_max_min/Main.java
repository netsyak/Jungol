package q560_max_min;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int min = arr[0]; // 최소값을 넣을 수 있는 변수 만듬. [0]값부터 순서대로 비교하기
		//int min =1000; (1)
		//int min = Integer.MAX_VLAUE;    변수 3개 중에 한가지 선택으로 진행 가능
			
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) { //비교 시작  
				min = arr[i];
		// 다른 풀이 방법 1.
			//if ( min> arr[i])  
			// min = arr[i];

		// 다른 풀이 방법 2.
			// ==  min = arr[i]< min : arr[i] : min  
				
			}
		}
		System.out.println(min);

	}
}
