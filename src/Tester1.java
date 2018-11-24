import java.util.ArrayList;

public class Tester1 {
	public static String binarytemp;
	public static String finaltemp;
	public static int[] collection = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {

		ArrayList<String> binarysubcollection = new ArrayList<>();
		ArrayList<String> finalsubcollection = new ArrayList<>();
		// 用transaction binary的function將子集合轉換為2進位法
		for (int i = 0; i < Math.pow(2, collection.length); i++) {
			binarysubcollection.add(transactionbinary(collection.length, i));
		}
		// 用transaction final的function將2進位法轉換為原本數字
		for (int i = 0; i < Math.pow(2, collection.length); i++) {
			finalsubcollection.add(transactionfinal(binarysubcollection.get(i)));
		}
		// 印出S集合
		System.out.print("集合S：{ ");
		for (int i = 0; i < collection.length; i++) {
			System.out.print(collection[i] + " ");
		}
		System.out.println("}");
		// 印出S的子集合
		System.out.print("集合S的子集合：{ ");
		for (int i = 0; i < Math.pow(2, collection.length); i++) {
			// System.out.println((binarysubcollection.get(i)));
			System.out.print("[" + finalsubcollection.get(i) + "] ");
		}
		System.out.println("}");
	}

	// 10進位轉2進位
	public static String transactionbinary(int collectionLength, int transactionNumber) {
		ArrayList<String> binarytrans = new ArrayList<>();
		binarytemp = "";
		binarytrans.clear();
		for (int i = 0; i < collectionLength; i++) {
			binarytrans.add(String.valueOf(transactionNumber % 2));
			transactionNumber = transactionNumber / 2;
			binarytemp = binarytemp + binarytrans.get(i);
		}
		return binarytemp;
	}

	// 2進位轉回原本的數字
	public static String transactionfinal(String binaryNumber) {
		finaltemp = "";
		String[] finaltrans = binaryNumber.split("");
		for (int i = 0; i < finaltrans.length; i++) {
			if (finaltrans[i].equals("1")) {
				finaltemp = finaltemp + collection[i];
			}
		}
		if (finaltemp.equals(null)) {
			return finaltemp = " ";
		} else {
			return finaltemp;
		}
	}
}
