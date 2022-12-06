package q531;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		sc.close();

		if (50.80 >= weight) {
			System.out.println("Flyweight");
		} else if (61.23 >= weight) {
			System.out.println("Lightweight");
		} else if (72.57 >= weight) {
			System.out.println("Middleweight");
		} else if (88.45 >= weight) {
			System.out.println("Cruiserweight");
		} else if (weight > 88.45) {
			System.out.println("Heavyweight");
		}

	}

}
