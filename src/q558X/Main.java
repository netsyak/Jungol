package q558X;

//100 개의 정수를 저장할 수 있는 배열을 선언하고 
//정수를 차례로 입력받다가 0 이 입력되면 0 을 제외하고 
//그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 
//차례대로 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] == 0) {
//				for (i = i - 1; i >= 0; i--) { // 역순 출력 과정
//					System.out.print(arr[i] + " ");
				for (int j= -1; j >= 0; j--) { // 역순 출력 과정
					System.out.print(arr[j] + " ");
				}
				break;
			}
		}
		sc.close();
	}

}
