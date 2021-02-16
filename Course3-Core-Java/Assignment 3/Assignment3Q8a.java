
import java.util.Iterator;
import java.util.Map;

public class Assignment3Q8a {
    public static void failFast(Map<String, String> cityCode){
        Iterator iterator = cityCode.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
            cityCode.put("fail-fast", "fail-fast");
        }
    }
    public static void main(String[] args) {

    }
}
