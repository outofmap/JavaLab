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
		System.out.println("�޷� �޷� �޷�~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("�ڵ������� �յ�������~~");
	}

	@Override
	public void flyingAttack() {
		System.out.println("�������� ��~");
	}


}
