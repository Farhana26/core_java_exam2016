package datastructure;

import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		List<Integer> list= new LinkedList<Integer>();
		list.add(12);
		list.add(18);
		list.add(14);
		list.add(15);
		list.add(11);

		list.remove(4);

		for(int listnew : list)
		{
			System.out.println(listnew);
		}

	}

}
