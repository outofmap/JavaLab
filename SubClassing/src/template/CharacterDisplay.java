package template;

public class CharacterDisplay extends AbstractDisplay{
	char ch;
	public int i = 200;
	public CharacterDisplay(char ch) {
		this.ch = ch;
	}
	
	@Override
	public void begin() {
		System.out.print("<<");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(ch);
		
	}

	@Override
	public void end() {
		System.out.print(">>");
	}
	// �ʿ��Ҷ��� subclass���� overiding�Ѵ� ( Hook method )
	public void line(){
		System.out.println();
		System.out.println("==============");
	}
	
	

}
