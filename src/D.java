import java.util.Scanner;

public class D {
	// 組合公式(Combination)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入不同物數量 :");
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.println("請輸入取出數量:");
		System.out.print("b = ");
		int b = scanner.nextInt();

		System.out.println("運算答案為:" + num(a, b));
	}

	public static int tmp(int ans) {
		if (ans == 1) {
			return ans;
		} else {
			return ans * tmp(ans - 1);
		}
	}

	public static int num(int a, int b) {
		return tmp(a) / (tmp(b) * tmp(a - b));
	}

}
