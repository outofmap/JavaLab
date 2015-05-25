package StaticTest;
// public이나 private을 쓰지 않으면, default값으로, 같은 패키지에서만 사용할 수 있음!
//변수는 local변수(stack), instance 변수 (Heap), static 변수(data)
class MyStatic{
	int iNum;										//instance variable
	static int sNum;								//class variable
	
	public static void getMyNum(){
		//System.out.println(iNum);	//static method안에서는  instance variable을 쓸 수 없어요.
		System.out.println(sNum);
		
	}
}

public class StaticTest {
	
	public static void main(String[] args) {
		
		//MyStatic ms1 = new MyStatic();
		//ms1.iNum = 10;
		MyStatic.sNum = 100;
		MyStatic.getMyNum();
		//System.out.println(ms1.iNum);
		//System.out.println(MyStatic.sNum);
		
		//MyStatic ms2 = new MyStatic();
		//System.out.println(ms2.iNum);
		//System.out.println(MyStatic.sNum);
		
	}

}
