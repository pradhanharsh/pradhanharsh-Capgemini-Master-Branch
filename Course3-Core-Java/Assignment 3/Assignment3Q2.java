
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment3Q2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("1");
        linkedHashSet.add("2");
        linkedHashSet.add("3");
        linkedHashSet.add("4");
        linkedHashSet.add("5");
        linkedHashSet.add("6");
        ordered(linkedHashSet);
        unordered(set);
    }
    public static void ordered(LinkedHashSet<String> linkedHashSet){
        System.out.println("LinkedHashSet:");
        linkedHashSet.forEach(System.out::println);
    }
    public static void unordered(HashSet<String> hashSet){
        System.out.println("HashSet:");
        hashSet.forEach(System.out::println);
    }
}