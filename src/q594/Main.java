package q594;
//문자열을 입력받은 뒤 그 문자열을 이어서 
//두 번 출력하는 프로그램을 작성하시오.
//문자열의 길이는 100이하이다.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String a = sc.next(); // 공백전까지 포함. line 은 공백포함
//		sc.close();
//		System.out.print(a + a);

		String a = sc.next();
		sc.close();
		for(int i=1; i<3; i++) {
			System.out.print(a);
		}
	
	}
}
