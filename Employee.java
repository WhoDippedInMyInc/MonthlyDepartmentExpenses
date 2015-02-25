package monDepExpensesApp;

/**
 * Employee declares expenses, & getExpenses().
 * 
 * Employee is the superclass of Manager, QATester, and Developer.
 * 
 * @author Reed
 */
public class Employee {
	protected double expenses;
	
	/**
	 * getExpenses() returns the monthly allocation amount of a Manager, Developer, or QATester object.
	 * @return a double values representing what the specified Employee is paid each month.
	 */
	public double getExpenses() {
		return expenses;
	}
	
//	@Override
//	public String toString() {
//	   //return something sensible like the Employee Name
//	    return getEmployeeTitle();
//	}
//
//	private String getEmployeeTitle() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
