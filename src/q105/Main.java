package q105;

public class Main {
	public static void main(String[] args) {

		String a = "Seoul", b = "Pusan", c = "Incheon", d = "Daegu", e = "Gwangju";
		String a1 = "10,312,545", b1 = "3,567,910", c1 = "2,758,296", d1 = "2,511,676", e1 = "1,454,636";
		String a2 = "+91,375", b2 = "+5,868", c2 = "+64,888", d2 = "+17,230", e2 = "+29,774";

		System.out.printf("%15s%15s%15s\n", a, a1, a2);
		System.out.printf("%15s%15s%15s\n", b, b1, b2);
		System.out.printf("%15s%15s%15s\n", c, c1, c2);
		System.out.printf("%15s%15s%15s\n", d, d1, d2);
		System.out.printf("%15s%15s%15s", e, e1, e2);
	}
}
