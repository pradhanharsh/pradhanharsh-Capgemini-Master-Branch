package Intermediate;

import practice.Assignment2Q2;
import practice.Employees;

public class Labour extends Employee {

    public int overtime =500;

    public Labour(int salary, String name, String designation) {
        super(salary, name, designation);
    }

    @Override
    public int getSalary() {
        this.salary = salary + overtime;
        return super.getSalary();
    }

    @Override
    public void updateTotalSalary(int salary) {
        super.updateTotalSalary(this.salary);
    }
}