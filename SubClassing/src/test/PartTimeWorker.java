package test;

import java.util.Date;

public class PartTimeWorker extends Employee {
	
	PartTimeWorker(String name, double salary, Date birthday) {
		super(name, salary, birthday);
	}

	int workinghour;

}
