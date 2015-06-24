package Maze;

public class FindPath {

	public static void main(String[] args) {

		int[][] maze = Maze.getMaze();
		PrintMaze p = new PrintMaze();
		Search4dir find = new Search4dir();
		
		Position.setStartPosition();
		Position.getStartPosition().setVal(2); 
		
		
		find.searching();
		p.print(maze);

	}

}
