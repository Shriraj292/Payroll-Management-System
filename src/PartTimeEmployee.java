/*
 * Copyright Disclaimer
 *
 * This script is the intellectual property of Shriraj Ghorpade. All rights reserved.
 * You may use this script for personal use only. You may not reproduce, distribute, or modify this script
 * for any commercial purposes without explicit written permission from Shriraj Ghorpade.
 * Any unauthorized use, reproduction, or distribution of this script may result in legal action.
 *
 * @created 17/11/2023 - 11:44 AM
 * @project Employee Payroll System
 * @author Shriraj Ghorpade
 */

public class PartTimeEmployee extends Employee{

    private int hoursWorked;
    private double hourlySalary;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlySalary) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlySalary = hourlySalary;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked*hourlySalary;
    }
}
