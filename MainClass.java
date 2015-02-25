package main;

import monDepExpensesApp.Developer;
import monDepExpensesApp.Manager;
import monDepExpensesApp.QATester;

public class MainClass {

	public static void main(String[] args) {
		QATester tester1 = new QATester();
		System.out.println(tester1);
		
		Developer dev1 = new Developer(); 
		System.out.println(dev1);
		
		Manager managerB = new Manager();
		System.out.println(managerB);
		
		
		managerB.add(tester1);
		managerB.add(dev1);
		System.out.println(managerB);
		
		Manager managerA = new Manager();
		System.out.println(managerA);
		
		managerA.add(managerB);
		System.out.println(managerA);
	}
}
