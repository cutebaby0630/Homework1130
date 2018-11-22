import java.util.Scanner;

public class E {
	// Ackermann 函數
	// 要麼 m 遞減，要麼 m 保持不變而 n 遞減。每次 n 達到零，m 遞減，所以 m 最終可以達到零。在 m 遞減的時候， n 的增加沒有上界
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("輸入計算值a:");
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.println("輸入計算值b:");
		System.out.print("b = ");
		int b = scanner.nextInt();
		System.out.println("計算值為:" + num(a, b));
	}

	private static int num(int a, int b) {
		while (a != 0) {
			if (a > 0 && b == 0) {
				return num(a - 1, 1);
			} else {
				return num(a - 1, num(a, b - 1));
			}
		}
		return b + 1;
	}
}
