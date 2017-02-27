package easy;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * 
 * @author Elexie Munyeneh 
 * link: https://www.codeeval.com/open_challenges/21/submit/?lid=933603
 * 
 * The first argument will be a path to a filename 
 * containing positive integers, one per line.
 * Input: 23
 *		 496
 *
 * Output: 9
 * 		  19
 */
public class SumOfDigits {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner myScanner = new Scanner(new File("Practice\\sumOfDigits.txt"));
		while (myScanner.hasNextLine()) {
			String line = myScanner.nextLine().trim(); // remove leading and
														// trailing whitespaces
			int sumOfDigits = 0;
			if (line.length() > 0) {// avoid parsing empty lines
				String[] lineArray = line.split("");
				for (int x = 0; x < lineArray.length; x++) {
					sumOfDigits += Integer.valueOf(lineArray[x]);
				}
			}
			System.out.println(sumOfDigits);
		}
		myScanner.close();
	}

}
