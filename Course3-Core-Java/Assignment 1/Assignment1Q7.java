public class Assignment1Q7 {

    public static void main(String[] args) {

        SearchArray ob = new SearchArray();

        int[] arr = { 5,12,14,6,78,20,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;

        boolean check = false;
        check = ob.searchArray(arr,valueToCheck);

        if(check ==false){System.out.println("Element not found");}else {
            System.out.println("Element exists in Array");
        }

    }
}
