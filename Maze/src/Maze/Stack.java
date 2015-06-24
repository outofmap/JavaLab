package Maze;

import java.util.ArrayList;

public class Stack {
	
	private ArrayList<Position> stackPosition = new ArrayList<Position>();

	public void push(Position p) {
		stackPosition.add(p);

	}

	public Position pop() {

		while (!stackPosition.isEmpty()) {

			Position tmp;
			tmp = stackPosition.get(stackPosition.size() - 1);
			stackPosition.remove(stackPosition.size() - 1);

			return tmp;

		}

		return null;
	}

	public Position pick() {

		while (!stackPosition.isEmpty()) {
			Position last;
			last = stackPosition.get(stackPosition.size());

			return last;

		}

		System.out.println("Stack is empty!");

		return null;

	}

	public void marked(Position p) {

		stackPosition.add(p);

	}

}
