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
	 * Manager() creates a Manager, who is paid $300.0 a month.
	 */
	public Manager() {
		expenses = 300.0;
	}
	
	/**
	 * Add() adds employees to a list.
	 * @param employee
	 */
	public void add(Employee employee) {
	 	employeeList.add(employee);
    }
	
	/**
	 * getTotalExpenses() adds the values in employeeList,
	 * calculating a departments total monthly expenses.
	 * @return the value of totalExpenses.
	 */
	public double getTotalExpenses() {
    	double totalExpenses = 0.00;

    	for(Employee employee : employeeList) {
    		totalExpenses += employee.getExpenses();
		}
		return totalExpenses;
    }
}



