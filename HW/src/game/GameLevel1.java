package game;

public class GameLevel1 extends GameLevel {

	private GameLevel1() {

	};

	private static GameLevel1 Gamelevel1 = new GameLevel1();

	public static GameLevel1 getGamelevel1() {
		return Gamelevel1;
	}

	@Override
	public void simpleattack() {
		System.out.println("�޷�~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("������");
	}

	@Override
	public void flyingAttack() {
		System.out.println("�̰͵� ��������~~");

	}

}
