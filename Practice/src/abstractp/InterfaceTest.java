package abstractp;

class A {
	public void methodA(I i){
		i.methodB();
	}
	//class B가 사용되지 않았다.
}
class B implements I{
	public void methodB(){
		System.out.println("methodB in B class");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.methodA(new B());
	}

}
