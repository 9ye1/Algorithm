import java.util.Scanner;

public class Median {
	
	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("");
		System.out.print("");
		int a = scan.nextInt();
		System.out.print("");
		int b = scan.nextInt();
		System.out.print("");
		int c = scan.nextInt();
		
		System.out.printf("", med3(a,b,c));
		
		scan.close();

	}

}
