package Intermediate;

public class Manager extends Employee {

    public int incentive = 5000;

    public Manager(int salary, String name, String designation) {
        super(salary, name, designation);
    }

    @Override
    public int getSalary() {
        this.salary = salary + incentive;
        return super.getSalary();
    }

    @Override
    public void updateTotalSalary(int salary) {
        super.updateTotalSalary(this.salary);
    }
}