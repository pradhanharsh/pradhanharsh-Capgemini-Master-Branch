
import java.util.ArrayList;
import java.util.List;

public class Assignment1Q8 {

    public static void main(String[] args) {

        BubbleSort object  = new BubbleSort();

        int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int[] arr1 = new int[15];

        arr1 = object.bubbleSort(arr);

        System.out.println("The array after being sorted is:" );

        for(int i=0;i<15;i++){
            System.out.println(arr[i]);
        }
    }
}
