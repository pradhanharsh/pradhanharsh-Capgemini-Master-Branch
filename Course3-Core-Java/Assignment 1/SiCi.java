

import static java.lang.StrictMath.pow;

public class SiCi {

    public double simpleInterest(double principalAmount,int time,double interestRate){

        double result = ((principalAmount*interestRate*time)/100);
        return (result);
    }

    public double compoundInterest(double principalAmount,int time,double interestRate){

        double factor = (1+(interestRate/100));
        double result = ((principalAmount*(pow(factor,time))) - principalAmount);
        return result;
    }
}
