//https://www.codeeval.com/open_challenges/9/submit/
package medium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StackImplementation {

	static BufferedReader br;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new FileReader("Practice\\stack.txt"));
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(printOutput(line));
		}
	}

	public static String printOutput(String line) {
		String[] lineArray = line.trim().split(" ");
		String output = "";
		for (int x = lineArray.length - 1; x >= 0; x -= 2) {
			 output += lineArray[x]+" ";
		}
		return output.trim();
	}

}
