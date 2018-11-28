import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {
	// 費氏級數(Fibonacci numbers)
	public static void main(String[] args) {
		int first = 0;
		int sec = 1;
		int a, b;
//		輸入產生項數
		System.out.println("注意 : n > 1");
		System.out.println("請輸入項數: ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int e = Integer.parseInt(s);
//		先印出前2項
		System.out.print(first + " " + sec);
//		每一項均為前兩項相加
		for (b = 2; b < e; b++) {
			a = first + sec;
			System.out.print(" " + a);
			first = sec;
			sec = a;
		}
	}
}
