import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("輸入計算值a:");
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.println("輸入計算值b:");
		System.out.print("b = ");
		int b = scanner.nextInt();
		int ans = 1;
		while (a % b != 0) {
			ans = b;
			b = a % b;
			a = ans;
		}

		ans = b;
		System.out.println("最大公因數:"+ans);
	}
}
