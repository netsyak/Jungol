package q616;

import java.util.Scanner;

class CenterPoint {
	private int x1, x2, x3;
	private int y1, y2, y3;

	public CenterPoint(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;

	}

	void printTri() {
		double x = ((x1 + x2 + x3));
		double y = ((y1 + y2 + y3));
		System.out.printf("(%.1f, %.1f)", x / 3, y / 3);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		sc.close();

		CenterPoint p = new CenterPoint(x1, y1, x2, y2, x3, y3);
		p.printTri();

	}

}
