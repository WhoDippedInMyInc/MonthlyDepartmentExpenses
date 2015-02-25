
package monDepExpensesApp.UnitTest;

import static org.junit.Assert.*;
import monDepExpensesApp.Developer;
import monDepExpensesApp.Manager;
import monDepExpensesApp.QATester;
import org.junit.Test;

/**
 * TestClass evaluates a departments actual total expenses,
 * by comparing them to a projected total.
 * 
 * @author Reed
 */
public class DepOneExpText {

	/**
	 * testOne() compares a departments actual total expenses with a projected total of $2100.00.
	 * This departments employees create the following hierarchy:
	 * managerA <-- managerB <-- tester1 &  dev1.
	 */
	@Test
	public void test() {
		QATester tester1 = new QATester(); 
		Developer dev1 = new Developer(); 
		
		Manager managerB = new Manager(); 
		managerB.add(tester1);
		managerB.add(dev1);

		Manager managerA = new Manager();
		managerA.add(managerB);
		
		assertEquals(2100.0, managerA.getExpenses(), 0.0);
	}

}
