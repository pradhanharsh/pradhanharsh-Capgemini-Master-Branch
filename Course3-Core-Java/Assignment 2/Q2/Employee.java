package Intermediate;

public class Employee {

    private static int totalMoney = 0;
    public int salary;
    public String name;
    public String Designation;


    //constructor
    public Employee(int salary, String name, String designation) {
        this.salary = salary;
        this.name = name;
        this.Designation = designation;
    }
    //getSalary function that will be overridden
    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getDesignation(){
        return Designation;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation){
        this.Designation = designation;
    }

    public void updateTotalSalary(int salary){
        totalMoney += salary;
     }

     public int getTotalSalary(){
        return totalMoney;
     }
}