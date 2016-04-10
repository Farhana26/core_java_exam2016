package datastructure;

import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<String> stack = new Stack<String>();
		stack.push("bangla");
		stack.push("english");
		stack.push("spanish");
		stack.remove(2);
		//System.out.println(stack.peek());
		System.out.println(stack.pop());
		for(String language : stack)
		{
			System.out.println(language);
		}

	}

}
