package Intermediate;

public class A4 extends Abstract4{

        public A4(){

            System.out.println("calling out the private function will throw a void");
            try{
                System.out.println("Calling void function will return in illegal start of expression error");
               // void AFour();
                System.out.println("This is in A4 class");
            }catch(Exception e){
                System.out.println(e.fillInStackTrace());
            }
        }
}
