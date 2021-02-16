public class TaxAmount {

    public double calculateTaxAmount(int ctc){

        double cost;

        if (ctc>0 && ctc<=180000) {

            cost = ctc * 0;
            return cost;

        }else if((ctc>180000 && ctc<=300000)){

            cost = ctc * 0.10;
            return cost;

        }else if(ctc>3000000 && ctc<=500000){

            cost = ctc * 0.20;
            return cost;

        }else if(ctc>500000 && ctc<=1000000){

            cost = ctc * 0.30;
            return cost;
        }else{

            System.out.println("Incorrect Input!! Enter value in range");
        }
        return 0.00;
    }
}
