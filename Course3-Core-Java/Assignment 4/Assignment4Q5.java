
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q5 {
    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) {
    }

    public static String processWords(List<String> list) {
        StringBuilder result = new StringBuilder();
        Consumer<List<String>> consumer = words -> {
            words.forEach(word -> result.append(word.charAt(0)));
        };
        consumer.accept(list);
        return result.toString();
    }
}