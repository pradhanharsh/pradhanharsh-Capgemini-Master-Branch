package Intermediate;

public class Assignment2Q4 {

    //Test the following principles of an abstract class:
    //
    //• If any class has any of its method abstract then you must declare entire class abstract.
    //
    //• Abstract class cannot be instantiated.
    //
    //• When we extend an abstract class, we must either override all the abstract methods in sub class or declare subclass as abstract.
    //
    //• Abstract class cannot be private.
    //
    //• Abstract class cannot be final.
    //
    //• You can declare a class abstract without having any abstract method.

    public static void main(String[] args) {

        A1 ob1 = new A1();
        ob1.a();

        A2 ob = new A2();
        System.out.println("Calling an A2 object which will instantiate the Abstract2 class");
        System.out.println("Will through an error as an Abstract Class cannot be instantiated ");

        System.out.println("The class AThree2 will not be able to be instantiated as it is an abstract class");

        A4 ob4 = new A4();
        System.out.println("Cannot have private functions in the Abstract Class or a private Abstract class");
        System.out.println("Exception thrown ");

        System.out.println("Final and abstract keywords with class is illegal in Java ");

        A6 ob6 = new A6();
        ob6.run();
    }
}
