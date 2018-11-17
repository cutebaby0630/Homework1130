import java.util.Scanner;

public class A {

	static int num(int n) {
		if (n == 0)
			return 1;
		else
			return n * num(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("請輸入要求階乘數:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.print(a+"!"+"=");
		for(int s=1;s<a;s++) {
			System.out.print(s+"x");
		}
		System.out.println(a);
		System.out.println(a + "!=" + num(a));
	}

}
