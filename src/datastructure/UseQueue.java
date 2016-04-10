package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.add("USA");
		queue.add("CANADA");
		queue.add("BANGLADESH");
		queue.add("INDIA");


		System.out.println(queue.remove("CANADA"));
		System.out.println(queue.peek());

		Iterator<String> it = queue.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}



	}

}
