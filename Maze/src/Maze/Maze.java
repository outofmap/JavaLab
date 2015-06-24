package Maze;

public class Maze {

	Position position = new Position(0,0);
	
	private static int[][] maze = {

		{ 0, 1, 1, 1, 0, 1, 1, 1 }, // 0
		{ 0, 0, 0, 1, 0, 0, 0, 0 }, // 1
		{ 1, 1, 0, 0, 0, 1, 0, 1 }, // 2
		{ 1, 1, 0, 1, 1, 1, 0, 1 }, // 3
		{ 1, 0, 0, 1, 0, 0, 0, 0 }, // 4
		{ 0, 1, 1, 1, 0, 1, 1, 1 }, // 5
		{ 1, 0, 1, 1, 0, 0, 0, 0 }, // 6
		{ 0, 1, 1, 0, 1, 1, 1, 0 } // 7

	};

	

	public static int[][] getMaze() {
		return maze;
	}
	
	
//	public void test(){
//		Stack s = new Stack();
//		Position p = new Position(0, 0);
//		s.push(p);
//		
//		System.out.println();
//	}
	
	
	

}
