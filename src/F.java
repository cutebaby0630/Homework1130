import java.util.ArrayList;
import java.util.Random;

public class F {
	public static int[] list = new int[10];

	public static void main(String[] args) {
		F num = new F();
		System.out.print("排列前 : { ");
		for (int i = 0; i < 10; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println("}");
		num.shuffle();
		num.print();
	}

	public F() {
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}
	}

	public void shuffle() {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int j = r.nextInt(9);
			int tmp = list[i];
			list[i] = list[j];
			list[j] = tmp;
		}
	}

	public void print() {
		System.out.print("排列後 : { ");
		for (int i : list) {
			System.out.print(list[i] + " ");
		}
		System.out.println("}");
	}
}