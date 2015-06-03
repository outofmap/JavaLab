package game;

public class GameLevel3 extends GameLevel{

	private GameLevel3() {

	};
	
	private static GameLevel3 Gamelevel3 = new GameLevel3();
	
	public static GameLevel3 getGamelevel3(){
		return Gamelevel3;
	}
	@Override
	public void simpleattack() {
		System.out.println("메롱 메롱 메롱~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("뒤돌려차기 앞돌려차기~~");
	}

	@Override
	public void flyingAttack() {
		System.out.println("날라차기 휙~");
	}


}
