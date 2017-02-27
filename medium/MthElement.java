package medium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * https://www.codeeval.com/open_challenges/10/
 * 
 * @author Elexie
 *
 */
public class MthElement {
	static String[] arr;
	static int len;
	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new FileReader("Practice\\mthElement.txt"));
		String line = "";
		int index = 0;
		while ((line = br.readLine()) != null) {
			arr = line.trim().split(" ");
			len = arr.length;
			index = Integer.parseInt(arr[arr.length - 1]);
			if (index < len & index > 0) {
				System.out.println(getFromBack(index));

			}
		}
	}

	static String getFromBack(int n) {
		return arr[(len - 1) - n];
	}
}
