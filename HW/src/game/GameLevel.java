package game;

public abstract class GameLevel {
	
	public abstract void simpleattack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	public void play(){
		simpleattack();
		turnAttack();
		flyingAttack();
	};
}
