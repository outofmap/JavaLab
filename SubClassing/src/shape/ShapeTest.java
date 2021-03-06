package shape;

class Shape{
	public void draw(){
		System.out.println("draw shope");
	}
	
	public void circle(){
		System.out.println("I'm Circle");
	}
}

class Circle extends Shape{
	public void draw(){
		System.out.println("draw circle");
	}
}

class Rectangle extends Shape{
	//오버라이
	public void draw(){
		System.out.println("draw rectangle");
	}
	public void rectangle(){
		System.out.println("I'm Rectangle");
	}
}

class Triangle extends Shape{
	//오버라이
	public void draw(){
		System.out.println("draw triangle");
	}
	
	public void triangle(){
		System.out.println("I'm triangle");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape s = new Circle();
		//s.draw();								//virtual fuction, overiding
		
		Circle cs = (Circle)s;
		//cs.circle();
		
		s = new Circle(); 					//상위 클래스로 upcasting 된다. 
		//s.draw();
		
		ShapeTest st = new ShapeTest();
		st.drawShope(new Circle());
		st.drawShope(new Rectangle());
		st.drawShope(new Triangle());
		
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		Shape[] sShapes = {c,r,t};
		st.shapeTest(sShapes);
	}
	
	// int i = 100;				100이 -> i로 assign되는 것.
	
	// s = c; 					c가 -> s로 assign되는 것.
	
	public void shapeTest(Shape[] sList){
		int i;
		//Shape s;
		
		for(i= 0; i<sList.length;i++){
			//
			sList[i].draw();
			
		}
		//s.draw();
		for(i= 0; i<sList.length;i++){
			if(sList[i] instanceof Circle){
				Circle c = (Circle)sList[i];
				c.circle();
			}
			else if(sList[i] instanceof Rectangle){
				Rectangle r = (Rectangle)sList[i];
				r.rectangle();
			}
			else if(sList[i] instanceof Triangle){
				Triangle t = (Triangle)sList[i];
				t.circle();
			}
		}
		
	
		
	}
	
	public void drawShope(Shape s){
		s.draw();
		
		// s = Circle? true -> circle로 변
		if(s instanceof Circle){
			Circle c = (Circle)s;
			c.circle();
		}
		else if(s instanceof Rectangle){
			Rectangle r = (Rectangle)s;
			r.rectangle();
		}
		else if( s instanceof Triangle){
			Triangle t = (Triangle)s;
			t.triangle();
		}
		
	}

}
