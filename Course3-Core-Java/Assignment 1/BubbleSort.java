public class BubbleSort {

    public int[] bubbleSort(int arr[]){

        int size = arr.length;
        int temp = 0;
        for(int i=0;i<size;i++){
            for(int j=1;j<(size-1);j++){
                if(arr[j-1] > arr[j]){

                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
