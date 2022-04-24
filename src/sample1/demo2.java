package sample1;

import java.util.Collections;
import java.util.LinkedList;

public class demo2 
{

	public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> ls)
	{
		System.out.println(ls.size());
		for (int i = 0; i < ls.size() / 2; i++) 
		{
			Integer temp = ls.get(i);
			ls.set(i, ls.get(ls.size() - i - 1));
			ls.set(ls.size() - i - 1, temp);
		}
		// Return the reversed arraylist
		return ls;
	}
	public static void main(String[] args) 
	{
	
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		
		System.out.println("The elements of the linked list before reversing: " + ls);
		// Calling user defined function for reversing
		ls = reverseLinkedList(ls);
		System.out.println("The elements of the linked list after reversing: " + ls);
		
		Collections.reverse(ls);
		System.out.println(ls);
		
		
	}
	
	
}
