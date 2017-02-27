package medium;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class TrailingString {

	static BufferedReader br;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new FileReader("Practice\\TrailingString.txt"));
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(tokenize(line.trim()));
		}
	}

	static int tokenize(String s) {
		String[] line = s.split(",");// the entire line
		String[] line2 = line[0].split(" "); // the string before the comma
		int output = line2[line2.length - 1].trim().equals(line[1].trim()) ? 1 : 0;
		return output;
	}

}
