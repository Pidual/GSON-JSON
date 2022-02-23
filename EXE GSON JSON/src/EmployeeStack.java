
package src;

import java.util.ArrayList;

/**
 * EmployeeStack
 */
public class EmployeeStack extends Employee{

    private  ArrayList<Employee> employeeList ;

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}