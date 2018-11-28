import java.util.Random;

public class H {
	// 計算陣列中元素的最大值及最小值
	public static int[] list = new int[10];
	public static int min = 0;
	public static int max = 0;
//	產生10個1~100的亂數
	public H() {
		Random random = new Random();
		for (int b = 0; b < 10; b++) {
			int a = random.nextInt((100) + 1);
			list[b] = a;
		}
	}

//		選擇排序法 利用    max儲存最大數值的位子  min儲存最小數值的位子
	public void comparison() {
		for (int i = 0; i < list.length; i++) {
			min = i;
			for (int j = i; j < list.length; j++) {
				if (list[j] < list[min]) {
					min = j;
				}
			}
			int temp = list[min];
			list[min] = list[i];
			list[i] = temp;
		}
	}
//	印出一開始的樣本數列
	public void print() {
		System.out.print("樣本數列: { ");
		for (int b = 0; b < list.length; b++) {
			System.out.print(list[b] + " ");
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		H num = new H();
		num.print();
		num.comparison();
		System.out.println("最大數值 : " + list[max]);
		System.out.println("最小數值 : " + list[min]);

	}

}
