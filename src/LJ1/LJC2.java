package LJ1;

public class LJC2 {

	public static void main(String[] args) {

		LJC2 cn = new LJC2();

		int a = 12;
		int b = 8;
		int c = 18;
		// Try 1
		if (a < b) {
			System.out.println("T");
		} else {
			System.out.println("F");
		}
		// Try 2

		if (a != b) {
			System.out.println(a - b);
		} else {
			System.out.println(b - a);
		}

		// Try 3

		String t = "Bangladesh ";

		if (t.length() == 10) {
			System.out.println("10");
		} else if (t.length() == 12) {
			System.out.println("more");
		} else if (t.length() == 8) {
			System.out.println("less");
		} else {
			System.out.println("Dont Know");
		}

		// Try 4
		// min

		int e = 8, f = 12, g = 20, h = 19;

		if ((e < f) && (e < g) && (e < h)) {
			System.out.println(e);
		} else if ((f < e) && (f < g) && (f < h)) {
			System.out.println(f);
		} else if ((g < e) && (g < f) && (g < h)) {
			System.out.println(g);
		} else {
			System.out.println(h);
		}

		// Try 5 Max

		if ((e > f) && (e > g) && (e > h)) {
			System.out.println(e);
		} else if ((f > e) && (f > g) && (f > h)) {
			System.out.println(f);
		} else if ((g > e) && (g > f) && (g > h)) {
			System.out.println(g);
		} else {
			System.out.println(h);
		}

		// Try 6 Max

		System.out.println(Math.max(e, (Math.max(f, (Math.max(g, h))))));
		System.out.println(Math.min(e, (Math.min(f, (Math.min(g, h))))));

// Try 7 for loop

		int sum = 0;
		for (int i = 1; i < 10; i++) {
			sum = sum + i;
		}
		{
			System.out.println("S" + sum);
		}

		String s = "Saaneel  ";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s + i);
		}

		// Try 8 for loop

		String o = "Bangladesh Khulna";
		for (int i = 0; i < 8; i++) {
			System.out.println(o.charAt(i));
		}
		System.out.println("-----");

		// Try 9 loop
		int va = 0;
		while (va < 10) {
			System.out.println("Adi " + va);
			va = va + 1;
		}
		System.out.println("-----");

// try 10 for loop
		for (int i = 0; i < 5; i++) {
			System.out.printf("value %d \n", i);
		}
// try 11 if loop
		int loop = 0;
		while (loop < 15) {
			System.out.println("T " + loop);
			loop++;

			if (loop == 5) {
				break;
			}
		}
// try 12 if loop	

	}

	public static int sumof(int a, int b, int c) {
		int s = 0;
		s = a + b + c;
		return s;

	}

	public static int t = 10;
	{
		System.out.println(t);
	}

}
