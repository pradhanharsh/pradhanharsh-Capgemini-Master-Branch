

import java.util.Scanner;

public class Assignment1Q4 {

    public static void main(String[] args) {

        double a,b,c;
        Scanner sc = new Scanner(System.in);
        ResultDeclaration object = new ResultDeclaration();

        System.out.println("Enter the marks of the first subject:");
        a = sc.nextDouble();
        System.out.println("Enter the marks of the second subject:");
        b = sc.nextDouble();
        System.out.println("Enter the marks of the third subject:");
        c = sc.nextDouble();

        String result = object.declareResults(a,b,c);

        System.out.println(result);
    }
}
