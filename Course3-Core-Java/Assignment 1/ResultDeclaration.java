

public class ResultDeclaration {

    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks){

        double a = subject1Marks;
        double b = subject2Marks;
        double c = subject3Marks;


        if(a<60 && b<60 && c<60){
            return "Failed";
        }else if((a>=60 && b>=60 && c<60) || (a>=60 && b<60 && c>=60) || (a<60 && b>=60 && c>=60)){
            if((a>=60 && b>=60 && c>=60)){
                return "Passed & Promoted";
            }else{
                return "Promoted";
            }
        }else if((a>=60 && b>=60 && c>=60)) {
            return "Passed";
        }
        return null;
    }
}
