import java.util.ArrayList;
import java.util.Random;

public class F {
	// N 項資料任意排列
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
//	產生0~9利用陣列儲存
	public F() {
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}
	}
//產生亂數為交換位子的編號，利用tmp做交換
	public void shuffle() {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int j = r.nextInt(9);
			int tmp = list[i];
			list[i] = list[j];
			list[j] = tmp;
		}
	}
//印出陣列中所有的值
	public void print() {
		System.out.print("排列後 : { ");
		for (int i : list) {
			System.out.print(list[i] + " ");
		}
		System.out.println("}");
	}
}