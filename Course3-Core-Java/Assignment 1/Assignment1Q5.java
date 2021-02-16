import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment1Q5 {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String args[]){

        double result;
        double value;
        int value1;

        Scanner sc = new Scanner(System.in);

        TaxAmount ob = new TaxAmount();

        System.out.println("Enter the CTC received");
        value = sc.nextDouble();

        value1 = (int)value;

        result = ob.calculateTaxAmount(value1);

        System.out.println("The tax calculated for the ctc: " +df2.format(value) +"is: " +df2.format(result));
        double left = value - result;
        System.out.println("Money left after tax deduction is " + df2.format(left));
    }
}
