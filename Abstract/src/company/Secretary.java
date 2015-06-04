package company;

public class Secretary extends Employee{
	public String boss;
	
	public Secretary(String name,String boss){
		super(name);
		this.boss = boss;
	}
	
	public String getInfo(){
		return "name:" + name+" "+"boss:"+boss;
	}

}
