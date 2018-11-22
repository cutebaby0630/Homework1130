import java.util.Random;

public class H {
	public static void main(String[] args) {
		int[] list = new int[10];
		int min = 0;
		int max = 0;
		Random random = new Random();
		for (int b = 0; b < 10; b++) {
			int a = random.nextInt((100) + 1);
			list[b] = a;
		}
		for (int c: list) {
			System.out.print(list[c] + " ");
		}
		System.out.println("}");
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
		System.out.println("最大數值 : " + list[max]);
		System.out.println("最小數值 : " + list[min]);

	}

}
