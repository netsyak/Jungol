package function_q170;

public class Main_170_T {

	public void printAt() {
		System.out.println("@@@@@@@@@@");
	}

	public static void main(String[] args) {
		Main_170_T m = new Main_170_T();
		//방법 1
		System.out.println("first");
		m.printAt();
		System.out.println("second");
		m.printAt();
		System.out.println("third");
		m.printAt();
		
		//방법 2
		String[] str= new String{"first", "second", "third"};
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
			m.printAt();
	}
}
}