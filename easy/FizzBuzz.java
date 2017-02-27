package easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FizzBuzz {

	/**
	 * Each line of the file contains 3 numbers: first divisor, second divisor,
	 * and limit limit: loop from 1 to limit and find all numbers divisible by
	 * either first number, second number, both, or neither
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 *             https://www.codeeval.com/open_challenges/1/
	 * 
	 * 
	 */

	public static void main(String[] args) throws FileNotFoundException {
		/**
		 * Sample Space 
		 * F B 
		 * t f: fizz
		 * f t: buzz 
		 * f f: x 
		 * t t: fb
		 */
		int limit = 0;
		Scanner s = new Scanner(new File("Practice//fizzbuzz.txt"));
		while (s.hasNextLine()) {
			String line = s.nextLine().trim();
			String result = "";
			if (line.length() > 0) // prevents the function from reading empty
									// lines
			{
				String[] tokens = line.trim().split(" ");
				limit = Integer.valueOf(tokens[2]);

				boolean fizz, buzz;

				for (int x = 1; x <= limit; x++) {
					fizz = x % Integer.parseInt(tokens[0]) == 0;
					buzz = x % Integer.valueOf(tokens[1]) == 0;
					if (fizz && !buzz)
						result += "F ";
					if (buzz && !fizz)
						result += "B ";
					if (fizz && buzz)
						result += "FB ";
					if (!fizz && !buzz)
						result += "" + x+" ";
				}

				System.out.println(result.trim());

			}
		}
		s.close();

	}

}
