package q617;

import java.util.Scanner;

class Human {
	private String name;
	private int height;

	public Human(String name, int height) {

		this.name = name;
		this.height = height;
	}

	public void print() {
		System.out.println(name + " " + height);
	}

	pulblic int getHeight
	
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Human[] human = new Human[5];


		int i = 0;
		int j = i;
		int k = j;
		int min = 0;
		for (i = 0; i < human.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			}
			sc.close();

			
				for (k = 0; k < height.length; k++) {
					if (min > height[k]) {
						min = height[k];

					}
				}

