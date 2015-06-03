package game;

public class Board {

	public static void main(String[] args) {
		Player player = new Player();
		player.attack();
		
		player.upgradeLevel(GameLevel2.getGamelevel2());
		player.attack();
		
		player.upgradeLevel(GameLevel3.getGamelevel3());
		player.attack();
		
	}

}
