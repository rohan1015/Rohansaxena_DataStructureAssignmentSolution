package datastructureassignmentsolution1;

import java.util.Scanner;
import java.util.Stack;

public class ConstructionExaminer {
	public ConstructionExaminer() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building : ");
		int totalNoOfFloors = sc.nextInt();

		int[] floorSize = new int[totalNoOfFloors];
		for (int i = 0; i < totalNoOfFloors; i++) {
			System.out.println("enter the floor size given on day : " + (i + 1));
			floorSize[i] = sc.nextInt();
		}

		System.out.println("\nThe order of construction is as follows : \n");

		int largestFloor = totalNoOfFloors;
		Stack<Integer> floor = new Stack<>();
		for (int i = 0; i < totalNoOfFloors; i++) {
			floor.push(floorSize[i]);
			System.out.println("Day : " + (i + 1));
			while (!floor.empty()) {
				if (floor.peek() != largestFloor) {
					break;
				}
				System.out.print(floor.pop() + " ");
				largestFloor--;
			}
			System.out.println("");
		}
	}

}
