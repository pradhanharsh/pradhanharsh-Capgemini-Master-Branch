

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumBetweenRange {

    public int[] armstrongNumberInRange(int min, int max) {

        int start = min;
        int end = max;
        int temp, sum, a;
        int counter = 0;
        int[] arr = new int[100];

        for (int i = start + 1; i < end; i++) {

            temp = i;
            sum = 0;
            while (temp != 0) {
                a = temp % 10;
                sum += a * a * a;
                temp /= 10;
            }

            if (i == sum) {

                arr[counter] = i;
                counter++;
              //  System.out.println(i);

            }
        }

        return arr;
    }
}
