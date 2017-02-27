package easy;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
/**
 * Challenge Description: 
 * 
 * https://www.codeeval.com/open_challenges/29/
 * File containing a list of sorted integers,
 * comma delimited, one per line. E.g. 
  	Input: 
  	1,1,1,2,2,3,3,4,4
	2,3,4,5,5
	
	Output: 
	1,2,3,4
	2,3,4,5
 * @author Elexie Munyeneh
 * 
 * 	This puzzle can be solved using the Data Structures from
 * 	the Java Collections Framework or by using basic for-loops
 * 	and if Statements, but I'll solve it 
 * 	by implementing a LinkedList, in order to improve my
 * 	knowledge of Data Structures and Algorithms
 */
public class UniqueElements {
	public static void main(String[] args) throws FileNotFoundException

	{
		Scanner myScanner = new Scanner(new File("Practice\\UniqueElements.txt"));

		while (myScanner.hasNextLine()) {
			/**
			 * BE WARNED!: scanner.nextLine() reads new line characters (such as
			 * \n) as actual lines in the file, even though they are empty. EX:
			 * Given the following .txt file with 2 lines of numbers 1,2,3,4,5
			 * 4,5,62,1,3,4
			 * 
			 * scanner.hasNext() will count the number of lines as 3 because the
			 * second line is preceded by the "\n" character (this is true, even
			 * though "\n" is not explicitly stated in the file)
			 * 
			 * see[http://stackoverflow.com/questions/5918896/java-scanner-
			 * newline-recognition]. Hence, check the length and content of the
			 * line before converting it to an Integer. Failure to do so will
			 * generate a NumberFormatException
			 * 
			 */
			String line = myScanner.nextLine().trim();
			// remove all leading and trailing space

			// make sure the line is not empty
			if (line.length() > 1 && line.trim() != "") {

				// convert the line of digits to a String array of digits
				String lineArray[] = line.split(",");

				LinkedList myList = new LinkedList();

				// add the digits of lineArray to the LinkedList
				// provided that the list does not contain the digit
				for (int x = 0; x < lineArray.length; x++) {
					int digit = Integer.valueOf(lineArray[x]);
					// .valueOf vs parseInt:
					// http://stackoverflow.com/questions/7355024/integer-valueof-vs-integer-parseint
					if (!myList.contains(digit)) {
						myList.add(digit);
					}

				}
				System.out.println(myList);
			}

		}
		myScanner.close();
		// why do we have to close scanner :
		// http://stackoverflow.com/questions/12519335/resource-leak-in-is-never-closed
	}

	static class LinkedList {
		Node head;
		int size = 0;

		public LinkedList() {
			this.head = null;
			this.size = 0;
		}

		/**
		 * @param data
		 *            : the data contained in the node that will be added to
		 *            the list
		 */
		public void add(int data) {
			Node newNode = new Node(data);

			// check if list is empty
			if (this.size == 0) {
				this.head = newNode;
			} else {
				Node current = head; // begin traversing from the beginning of
										// the list
				while (current.next != null) {
					current = current.next;
				}
				current.next = newNode;// append the node to the end of the list

				// at this point, the preceding while-loop will have been
				// terminated
				// because a null pointer was found, meaning the end of the list
				// was
				// reached.
			}
			size += 1;
		}

		/**
		 * @param data
		 *            the data to search for
		 * @return whether the given integer appears in the list
		 */
		public boolean contains(int data) {
			Node current = this.head;
			// begin traversing from the first node in the list
			while (current != null) {
				if (current.data == data) {
					return true;
				}
				current = current.next;
			}
			return false;
		}

		/**
		 * toString method of this class
		 */
		public String toString() {
			Node current = head;
			String finalString = "";
			while (current != null) {
				finalString += (current.data) + ",";
				current = current.next;
			}
			return removeComma(finalString);
		}

		/**
		 * 
		 * @param s
		 *            the string to modify
		 * @return a string with trailing commas removed
		 */
		private String removeComma(String s) {
			return s.substring(0, s.length() - 1);
		}
	}

	static class Node {
		Node next; // the next node in the list
		int data;// digit stored in the node

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

}
