
import java.util.HashMap;

public class Assignment4Q7 {
    public static void main(String[] args) {}
    public String convertKeyValueToString(HashMap<String, Integer> map) {
        StringBuilder result = new StringBuilder();
        map.forEach((key,value) -> result.append(key).append(value));
        return result.toString();
    }
}