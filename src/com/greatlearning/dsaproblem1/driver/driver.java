package com.greatlearning.dsaproblem1.driver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import com.greatlearning.dsaproblem1.skyscrapper.skyscrapperConstruction;

public class driver {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		Queue<Integer> floorSizeQueue = new LinkedList<>();
		skyscrapperConstruction sk = new skyscrapperConstruction();
		
		//Get the input
		System.out.println("enter the total no of floors in the building");
		int noOfFloors = sc.nextInt();
		int floorSize;
		for (int i = 1; i <= noOfFloors; i++)
		{
			System.out.println("enter the floor size given on day : "+i);
			floorSize = sc.nextInt();
			// Add the floorsize to queue
			floorSizeQueue.add(floorSize);
			
		}
		// Find the order of construction
		sk.orderOfConstruction(noOfFloors, floorSizeQueue);	
	}
}
