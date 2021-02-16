package Intermediate;

public class Assignment2Q1 {

    public static void main(String[] args) {

        SingletonInheritanceCheck ob1 = SingletonInheritanceCheck.getA();
        System.out.println("The SingletonInheritanceCheck class is not inheritable due to the constructor being private");
        System.out.println("The object of the class can only be made in the SingletonInheritanceCheck class");
    }
}
