package q576;

import java.util.Scanner;

public class Main {
	public int aa(int num1, char op, int num2) {

	int result= 0;

	if(op=='+')
	{
		result = num1 + num2;

	}else if(op=='-')
	{
		result = num1 - num2;
	}else if(op=='*')
	{
		result = num1 * num2;
	}else if(op=='/')
	{
		result = num1 / num2;
	}
	return result;
}

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 =sc.nextInt();
		char p = sc.next().charAt(0);
		int n2 =sc.nextInt();
		sc.close();
	

	Main mm = new Main();// 참조변수,객체 생성
	int s = mm.aa(n1, p, n2);
	System.out.print(n1+" "+p+" "+n2+" = "+s);
}
}






