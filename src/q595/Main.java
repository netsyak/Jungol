package q595;
//문자열을 "Hong Gil Dong"으로 초기화 한 후 
//3번부터 6번까지의 문자를 차례로 출력하시오.
public class Main {

	public static void main(String[] args) {
		String str = "Hong Gi Dong";
		
		char a= str.charAt(3); 
		char b= str.charAt(4); 
		char c= str.charAt(5); 
		char d= str.charAt(6); 
	
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
		
//		1. 선생님 코딩
//		System.out.print(str.charAt(3));
//		System.out.print(str.charAt(4));
//		System.out.print(str.charAt(5));
//		System.out.print(str.charAt(6));
	
		
//	for(int i=3;i<=6;i++) {
//		System.out.print(str.charAt(i)); -- 앞에서 한 글자씩 출력하기
//	}
//	
	}

}
