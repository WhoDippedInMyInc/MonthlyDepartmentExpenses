package monDepExpensesApp;

import java.util.ArrayList;

/**
 * Managers warrant a monthly allocation of $300.00, per Manager.
 * 
 * A manager is at the top of a hierarchical relationship,
 * in which one manager oversees employees such as developers,
 * QA testers, & other managers. A hierarchy is constituted of all the 
 * employees of a department. An employee's title is associated with
 * an amount paid monthly. A departments monthly expenses can be determined 
 * by adding the amounts paid to the employees in a hierarchy.
 * 
 * Manager extends Employee.
 * 
 * @author Reed
 */
public class Manager extends Employee {
	private ArrayList<Employee> employeeList = new ArrayList<>();
	
	/**
	 * Ceates a Manager, who is paid $300.0 a month.
	 */
	public Manager() {
		super(300.0);
	}
	
	/**
	 * Adds an employees to a list of employees being supervised.
	 * @param employee
	 */
	public void supervise(Employee employee) {
	 	employeeList.add(employee);
        }
	
	/**
	 * Calculates the expenses of this employee as well as the expenses of anyone reporting to him/her.
	 * 
	 * @return the expenses of this employee's.
	 */
	@Override
	public double getExpenses() {
		int expenses = super.getExpenses();
		
		for(Employee employee : employeeList)
		       expenses += employee.getExpenses();
		       
		return expenses;
	}
}



