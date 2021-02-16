
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment3Q3 {
    public static List<Integer> traverseReverse(ArrayList<Integer> aList){
        ArrayList<Integer> result = new ArrayList<>();
        ListIterator<Integer> iterator = aList.listIterator(aList.size());
        while (iterator.hasPrevious()){
            result.add(iterator.previous());
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
//        traverseReverse(list);
        for(Integer i : traverseReverse(list)){
            System.out.println(i + " ");
        }
    }
}