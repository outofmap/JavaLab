package Maze;

public class PrintMaze {

	public void print(int[][] maze) {

		int i, j;
		for (i = 0; i < maze.length; i++) {
			for (j = 0; j < maze.length; j++) {

				if (maze[i][j] == 0)
					System.out.print('бр');
				
				else if(maze[i][j] ==1)
					System.out.print('бс');
				
				else if(maze[i][j] ==2)
					System.out.print('*');
			}

			System.out.println('\n');
			
		}
	}

}
