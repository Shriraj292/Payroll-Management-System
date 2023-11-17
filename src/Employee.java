/*
 * Copyright Disclaimer
 *
 * This script is the intellectual property of Shriraj Ghorpade. All rights reserved.
 * You may use this script for personal use only. You may not reproduce, distribute, or modify this script
 * for any commercial purposes without explicit written permission from Shriraj Ghorpade.
 * Any unauthorized use, reproduction, or distribution of this script may result in legal action.
 *
 * @created 17/11/2023 - 11:40 AM
 * @project Employee Payroll System
 * @author Shriraj Ghorpade
 */

abstract public class Employee {

    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getEmployeeName() {
        return name;
    }

    public void setEmployeeName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return id;
    }

    public void setEmployeeId(int id) {
        this.id = id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString(){
        return "Employee [Name:" + getEmployeeName() + " ID: " + getEmployeeId() +
                " Salary: " + calculateSalary() + "]";
    }
}
