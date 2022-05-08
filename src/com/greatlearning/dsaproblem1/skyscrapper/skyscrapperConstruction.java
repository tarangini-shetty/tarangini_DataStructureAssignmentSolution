package com.greatlearning.dsaproblem1.skyscrapper;

import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class skyscrapperConstruction {
	public void orderOfConstruction(int noOfFloors, Queue<Integer> floorSizeQueue)
	{
		
		//Initialization
		int noOfFloorsremaining = noOfFloors;
		Iterator<Integer> itr = floorSizeQueue.iterator();
		int day = 1;
		Stack<Integer> stack = new Stack<Integer>();
		
		//traverse through the queue
		while (itr.hasNext())
		{
			int element = itr.next();
			// if element in queue is equal to floors remaining, 
			// then print/remove the elements from stack until the difference in each element in stack is 1
            if ( element == noOfFloorsremaining)
            {
            	stack.add(element);
            	int elementPrinted = 0;
            	System.out.println("\nDay:" + day);
            	while (!stack.empty() && (elementPrinted == 0 || elementPrinted - stack.peek() == 1)) 
            	{
            		elementPrinted = stack.pop();
            		System.out.print(elementPrinted + " ");
            		noOfFloorsremaining = noOfFloorsremaining - 1;
            		
            	}
            	
            }
            // if element in queue not equal to floors, then keep adding the element to stack
            else 
            {
            	stack.add(element);
            	System.out.println("\nDay:" + day);
            }
            // keep incrementing the day
            day  = day + 1;   
        }
	}
}
