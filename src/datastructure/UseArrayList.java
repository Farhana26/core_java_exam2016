package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		List<Integer> array = new ArrayList<>();
		//Scanner sc = new Scanner(System.in);
		array.add(12);
		array.add(14);
		array.add(25);
		array.add(50);

		Iterator<Integer> it = array.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		array.remove(2);

		for(int number : array) {
			System.out.println(number);
		}


	}

}
