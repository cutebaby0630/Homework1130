import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		System.out.println("輸入計算值a:");
		Scanner numa = new Scanner(System.in);
		int a = numa.nextInt();
		System.out.println("輸入計算值b:");
		Scanner numb = new Scanner(System.in);
		int b = numb.nextInt();
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
