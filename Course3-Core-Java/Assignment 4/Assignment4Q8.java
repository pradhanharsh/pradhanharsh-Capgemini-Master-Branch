

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q8 {
    private static List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    public static void main(String[] args) {
        Consumer<List<Integer>> consumer = list -> {
            list.forEach(System.out::println);
        };
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                consumer.accept(integers);
            }
        });
        t1.start();
    }
}
