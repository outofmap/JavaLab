package Maze;

public class Position {

	int i;
	int j;

	int[][] m = Maze.getMaze();

	Position(int i, int j) {
		this.i = i;
		this.j = j;

	}

	private static Position startPosition;

	private static Position EndPosition;

	public static Position getEndPosition() {
		return EndPosition;
	}
	
	public static void setEndPosition() {
		EndPosition = new Position(7, 7);
	}

	public static Position getStartPosition() {
		return startPosition;
	}

	public static void setStartPosition() {

		startPosition = new Position(0, 0);

	}
	
	public boolean isMovableSouth(){
		return (i >= 7) ? false : true;
	}
	
	public boolean isMovableEast(){
		return (j >= 7) ? false : true;
	}
	
	public boolean isMovableWest(){
		return (j <= 0) ? false : true;
	}
	
	public boolean isMovableNorth(){
		return (i <= 0) ? false : true;
	}

	public Position East() {
		return new Position(i, j + 1);
	}

	public Position South() {
		return new Position(i + 1, j);
	}

	public Position West() {
		return new Position(i, j - 1);
	}

	public Position North() {
		return new Position(i - 1, j);
	}

	public int getVal(Position p) {
		return m[p.i][p.j];

	}

	public void setVal(int val) {
		m[i][j] = val;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + j;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (i != other.i)
			return false;
		if (j != other.j)
			return false;
		return true;
	}
	
	
}
