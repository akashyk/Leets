package com.aki;

import medium.ClonedTreeTargetReference;
import medium.ReverseLinkedList;
import medium.TeamsCount;

public class Begin {

	private static ClonedTreeTargetReference clonedTreeRef;
	private static TeamsCount teamsCount;
	private static ReverseLinkedList reverseLL;

	private static void initialize() {
		clonedTreeRef = new ClonedTreeTargetReference();
		teamsCount = new TeamsCount();
		reverseLL = new ReverseLinkedList();
	}

	public static void main(String[] args) {
		initialize();
		clonedTreeRef.demo();
		teamsCount.demo();
		reverseLL.demo();
	}

}
