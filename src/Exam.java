
public class Exam {

	public static void main(String[] args) {
		double v1 = 5;
		double v2 = 2;

		double result1 = v1 + v2;
		System.out.println("result1 : " + result1);

		double result2 = v1 - v2;
		System.out.println("result2 : " + result2);

		double result3 = v1 * v2;
		System.out.println("result3 : " + result3);

		double result4 = v1 / v2; // 몫만 나온다 그래서 2  나머지 수는 안나옴
		System.out.println("result4 : " + result4);

		double result5 = v1 % v2;  // 나눈 후 나머지 수만 나옴
		System.out.println("result5 : " + result5);

		double result6 = (double) v1 / v2; 
		System.out.println("result6 : " + result6);
		// (double) ~~~~~ 이후의 변수를 double 형태로 변경해서 진행
		
	}

}
