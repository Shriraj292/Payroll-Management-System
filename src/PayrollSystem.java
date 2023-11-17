/*
 * Copyright Disclaimer
 *
 * This script is the intellectual property of Shriraj Ghorpade. All rights reserved.
 * You may use this script for personal use only. You may not reproduce, distribute, or modify this script
 * for any commercial purposes without explicit written permission from Shriraj Ghorpade.
 * Any unauthorized use, reproduction, or distribution of this script may result in legal action.
 *
 * @created 17/11/2023 - 11:46 AM
 * @project Employee Payroll System
 * @author Shriraj Ghorpade
 */

import java.util.ArrayList;

public class PayrollSystem {

    private ArrayList<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    /**
     * This method adds employee to list.
     * @param employee
     */
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    /**
     * This method removes employee from the list whose employee ID is passed as parameter.
     * @param id
     */
    public void removeEmployee(int id){
        Employee employeeToRemove = null;

        for (Employee employee:
             employeeList) {
            if (employee.getEmployeeId() == id){
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployees(){
        for (Employee emp:
             employeeList) {
            System.out.println(emp);
        }
    }

    public void getEmployeeCount(){
        System.out.println("Employees head count: " + employeeList.size());
    }

    public static void main(String[] args) {
        PayrollSystem payroll = new PayrollSystem();
        Employee emp1 = new FullTimeEmployee("Shriraj", 1, 70_000);
        Employee emp2 = new PartTimeEmployee("Shubham", 2, 60, 750);
        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);
        System.out.println("Initial Employee Details: ");
        payroll.getEmployeeCount();
        payroll.displayEmployees();

        payroll.removeEmployee(2);
        System.out.println("Final Employee Details: ");
        payroll.getEmployeeCount();
        payroll.displayEmployees();
    }
}
