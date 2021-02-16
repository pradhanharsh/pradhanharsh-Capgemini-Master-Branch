
interface Operations{
    public double operation(int num1, int num2);
}

public class Assignment4Q1 {
    public double addition(int num1,int num2){
        Operations operations = (n1, n2) -> (n1+n2);
        return operations.operation(num1, num2);
    }
    public double subtraction(int num1,int num2){
        Operations operations = (n1, n2) -> (n1-n2);
        return operations.operation(num1, num2);
    }
    public double multiplication(int num1,int num2){
        Operations operations = (n1, n2) -> (n1*n2);
        return operations.operation(num1, num2);
    }
    public double division(int num1,int num2){
        Operations operations = (n1, n2) -> ((double) n1/n2);
        return operations.operation(num1, num2);
    }
    public static void main(String[] args) {}
}