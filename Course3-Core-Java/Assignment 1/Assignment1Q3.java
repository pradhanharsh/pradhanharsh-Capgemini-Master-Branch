

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment1Q3 {

    private static DecimalFormat  df2 =new DecimalFormat("#.##");

    public static void main(String[] args) {

        double a,b;
        SiCi object = new SiCi();
        Scanner sc = new Scanner(System.in);

        double interestRate;
        int time;
        double principalAmount;

        System.out.print("Enter the Interest Rate:");
        interestRate = sc.nextDouble();
        System.out.println("Enter the Principal Amount:");
        principalAmount = sc.nextDouble();
        System.out.println("Enter the time duration:");
        time = sc.nextInt();

        a = object.simpleInterest(principalAmount,time, interestRate);
        b = object.compoundInterest(principalAmount,time, interestRate);

        System.out.println("The Simple interest calculate is:" +a +"\n");
        System.out.println("The Compound interest calculate is:" +df2.format(b) +"\n");


    }
}
