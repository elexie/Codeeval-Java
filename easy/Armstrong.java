package easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codeeval.com/open_challenges/82/
 * 
 * An Armstrong number is an n-digit number that is equal to the sum of the n'th
 * powers of its digits. Determine if the input numbers are Armstrong numbers.
 * 
 * Input File 6 153 351
 * 
 * Output True True False
 * 
 * @author Elexie
 *
 */
public class Armstrong {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("Practice//Armstrong.txt");
		Scanner scan = new Scanner(f);
		Armstrong a = new Armstrong();
		String output="";
		boolean val=false;
		while (scan.hasNextLine()) {
			String str = scan.nextLine().trim();
			if (str.length() > 0) {
				int power = str.length();
				if (power > 0) {
					int digit_sum = a.digit_sum(str, power);
					val=digit_sum==(Integer.parseInt(str));
					output=val?"True":"False";
					System.out.println(output);
				}
			}
		}

		scan.close();
	}

	public int digit_sum(String integer, int power) {

		int sum = 0;
		String split[] = integer.split("");
		for (int x = 0; x < split.length; x++) {
			sum += Math.pow(Integer.valueOf(split[x]), power);
		}

		return sum;
	}

}
