package abstractp;

public abstract class Unit {
	int x,y;
	abstract void move(int x,int y);
	void stop(){ /*현재 위치에 정지*/}
}
