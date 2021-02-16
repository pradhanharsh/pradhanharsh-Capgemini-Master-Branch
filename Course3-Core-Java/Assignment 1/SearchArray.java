public class SearchArray {

    public boolean searchArray(int[] arr, int toCheckValue) {

        for (int i = 0; i < 15; i++) {

            boolean a = false;

            if (arr[i] == toCheckValue) {

                return true;

            } else {
                a = false;
            }
        }
        return false;
    }
}
