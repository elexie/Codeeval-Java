package easy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LongestLines {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Practice\\LongestLines.txt"));
		LongestLines.LinkedList myList=new LongestLines().new LinkedList();

		String line = "";
		while ((line = br.readLine()) != null) {
			myList.add(line);
		}
		System.out.println(myList);
	}

	public class LinkedList {
		private Node head;
		private Node temp;
		private String output;
		public LinkedList(){
			this.head=null;
			
		}
		void add(String data) {
			if (this.head == null) {
			this.head=new Node(data);
			}
			else{
				temp=head;
				while(temp.getNext()!=null){
					temp=temp.getNext();
				}
				temp.setNext(new Node(data));
			}
		}
	
		public  String toString(){
			
			temp=head;
			while(temp.getNext()!=null){
				output+=temp.getData()+"\n";
				temp=temp.getNext();
			}
		return output.trim();
		}
	}

	public class Node {
		private Node next;
		private String data;
		private int index;
		private int length;

		public Node(String data){
			this.data=data;
			this.next=null;
		}
		public void setNext(Node next) {
			this.next = next;
		}

		public void setIndex(int index) {
			this.index = index;
		}
		public String getData(){
			return this.data;
		}
		public int getLength() {
			return this.length;
		}

		public Node getNext() {
			return this.next;
		}

		public int getIndex() {
			return this.index;
		}
	}
}
