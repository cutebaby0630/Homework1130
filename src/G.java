import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class G {

	public static boolean exit = true;

//	輸入值讀取，收取最後結果並且印出
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeSet<String> set = new TreeSet();
		while (exit) {
			System.out.println("輸入一個數字(1-9)，輸入0為離開");
			String x = scanner.nextLine();
			switch (x) {
			case "1":
				set.add(x);
				break;
			case "2":
				set.add(x);
				break;
			case "3":
				set.add(x);
				break;
			case "4":
				set.add(x);
				break;
			case "5":
				set.add(x);
				break;
			case "6":
				set.add(x);
				break;
			case "7":
				set.add(x);
				break;
			case "8":
				set.add(x);
				break;
			case "9":
				set.add(x);
				break;
			case "0":
				exit = false;
				break;
			}
		}
		ArrayList<TreeSet<String>> subset = finalSubset(set);
		System.out.println("一共有" + subset.size() + "個子集合。");
		for (TreeSet<String> ts : subset) {
			System.out.print(ts.toString() + "\t");
		}
	}

	// 從0到子集合數目之間所有數的二進位，存放在result中
	public static String[] getBinary(TreeSet<String> set) {
		int setsize = set.size();
		int m = (int) Math.pow(2, setsize) - 1;
		String[] result = new String[m + 1];
		for (int i = m; i > -1; i--) {
			StringBuffer stringbuffer = new StringBuffer(Integer.toBinaryString(i));
			int length = stringbuffer.length();
			if (length < setsize) {
				for (int j = 0; j < setsize - length; j++) {
					stringbuffer.insert(0, "0");
				}
			}
//			輸出最後的字串
			result[i] = stringbuffer.toString();
		}
		return result;
	}

	// 根據二進為字串生成子集合
	public static ArrayList<TreeSet<String>> finalSubset(TreeSet<String> set) {
		ArrayList<TreeSet<String>> result = new ArrayList<TreeSet<String>>();

		// 把集合放數陣列中，方便存取
		String[] items = new String[set.size()];
		int i = 0;
		for (String item : set) {
			items[i++] = item;
		}
		// 用二進為字串生成
		String[] binaryValue = getBinary(set);
		// 根據二進位字串集合元素形成子集合
		for (int j = 0; j < binaryValue.length; j++) {
			String value = binaryValue[j];
			TreeSet<String> subset = new TreeSet<String>();
			for (int k = 0; k < value.length(); k++) {
				if (value.charAt(k) == '1')
					subset.add(items[k]);
			}
			result.add(subset);
		}

		return result;
	}

}
