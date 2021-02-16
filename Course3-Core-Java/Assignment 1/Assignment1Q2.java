
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.sql.Types.NULL;

public class Assignment1Q2 {

    public static void main(String[] args) {

        ArmstrongNumBetweenRange A = new ArmstrongNumBetweenRange();
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[13];
        int min,max;
        System.out.println("Enter the Minimum limit:");
        min = sc.nextInt();
        System.out.println("Enter the Maximum Limit:");
        max = sc.nextInt();

        System.out.println("The armstrong Number between " +min +"and " +max +" is::");

        arr1 = A.armstrongNumberInRange(min,max);

        for(int i = 0; arr1[i] !=0 ;i++){
            System.out.print(arr1[i]+"\t");
        }
    }
}
