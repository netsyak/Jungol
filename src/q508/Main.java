package q508;

public class Main {

	public static void main(String[] args) {
		String a = "item",b = "count",c = "price";
		String d = "pen",e = "20",f = "100";
		String g = "note",h = "5",i = "95";
		String j = "eraser",k = "110",l = "97";

		System.out.printf("%10s%10s%10s\n",a,b,c);
		System.out.printf("%10s%10s%10s\n",d,e,f);
		System.out.printf("%10s%10s%10s\n",g,h,i);
		System.out.printf("%10s%10s%10s\n",j,k,l);
		System.out.printf("-------------------------------\n");
		System.out.printf("%10s","Item");
		System.out.printf("%10s","count");
		System.out.printf("%10s\n","price");
		System.out.printf("%10s","pen");
		System.out.printf("%10s","20");
		System.out.printf("%10s\n","100");
		System.out.printf("%10s","note");
		System.out.printf("%10s","5");
		System.out.printf("%10s\n","95");
		System.out.printf("%10s","eraser");
		System.out.printf("%10s","110");
		System.out.printf("%10s\n","97");
		System.out.printf("-------------------------------\n");





		String[] str = { "item", "count", "price",
				"pen", "20", "100",
				"note", "5", "95",
				"erase", "110", "97" };
		for (int inp = 0; inp <= 11; inp++) {
			if ((inp % 3) == 0 && inp != 0) {
				System.out.printf("\n");
			}
			System.out.printf("%10s", str[inp]);
		}

	}
}

