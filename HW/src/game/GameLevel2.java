package game;

public class GameLevel2 extends GameLevel{
	private GameLevel2() {

	};
	
	private static GameLevel2 Gamelevel2 = new GameLevel2();
	
	public static GameLevel2 getGamelevel2(){
		return Gamelevel2;
	}

	@Override
	public void simpleattack() {
		System.out.println("�޷ո޷�~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("�������� ��~");
	}

	@Override
	public void flyingAttack() {
		System.out.println("�̰� ��������~~");
	}

	

}
