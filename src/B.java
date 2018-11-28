import java.util.Scanner;

public class B {
	// 最大公因數(GCD)
	public static void main(String[] args) {
		// 先輸入需計算數字
		Scanner scanner = new Scanner(System.in);
		System.out.println("輸入計算值a:");
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.println("輸入計算值b:");
		System.out.print("b = ");
		int b = scanner.nextInt();

		int ans = 1;
		// 相除後於數不等於進入迴圈
		while (a % b != 0) {
			ans = b;
			b = a % b;
			a = ans;
		}
		// b為最後答案
		ans = b;
		System.out.println("最大公因數:" + ans);
	}
}
