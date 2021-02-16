package Intermediate;

import java.util.ArrayList;

public class Assignment2Q2{

    public static void main(String[] args) {



        Manager mng1= new Manager(1000,"Employee 1", "Manager");
        System.out.println(mng1.getSalary());
        int a = mng1.getSalary();
        mng1.updateTotalSalary(a);
        System.out.println(mng1.getTotalSalary());



    }
}