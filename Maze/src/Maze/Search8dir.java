package Maze;

public class Search8dir implements SearchDirection{

	@Override
	public void searching() {
		public Position currentPos = new Position(0, 0);
		Stack pathStack = new Stack();

		// int[][] maze = Maze.getMaze();

		// public void checking() {
		//
		// if (copyMaze[currentPos.i][currentPos.j] == 0)
		// pathStack.push(currentPos);
		//
		// else
		// return;
		// }

		public void searching() {
			
			Position.setEndPosition();
			if (currentPos.equals(Position.getEndPosition()))
				return;
			// S
			else if (currentPos.isMovableSouth()
					&& currentPos.South().getVal(currentPos.South()) == 0) {
				pathStack.push(currentPos.South());
				currentPos = currentPos.South();
				marking(currentPos);
				searching();

			}

			// E
			else if (currentPos.isMovableEast()
					&& currentPos.East().getVal(currentPos.East()) == 0) {
				pathStack.push(currentPos.East());
				currentPos = currentPos.East();
				marking(currentPos);
				searching();

			}

			// N
			else if (currentPos.isMovableNorth()
					&& currentPos.North().getVal(currentPos.North()) == 0) {
				pathStack.push(currentPos.North());
				currentPos = currentPos.North();
				marking(currentPos);
				searching();

			}
			// W
			else if (currentPos.isMovableWest()
					&& currentPos.West().getVal(currentPos.West()) == 0) {
				pathStack.push(currentPos.West());
				currentPos = currentPos.West();
				marking(currentPos);
				searching();

			}

			else {

				currentPos = pathStack.pop();
				searching();

			}

		}

		public void marking(Position p) {
			p.setVal(2);

		}
	}


	

}
