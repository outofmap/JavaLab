package game;

public class Player {
	//level¿∫ º”º∫ 
	public Player(){};
	private static GameLevel Level = GameLevel1.getGamelevel1();
			
	public void upgradeLevel(GameLevel level){
		this.Level = level;
	}
	
	public void attack(){
		getLevel().play();
	}

	public static GameLevel getLevel() {
		return Level;
	}



}
