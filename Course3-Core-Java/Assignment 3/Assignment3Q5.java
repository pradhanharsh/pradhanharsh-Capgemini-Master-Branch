
import java.util.HashMap;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class Assignment3Q5 {
    public static void main(String[] args) {
        HashMap<Employee, String> map = new HashMap<>();
        map.put(new Employee("Akash", 12), "one");
        map.put(new Employee("Vikas", 13), "two");
        for(Employee e : map.keySet()){
            System.out.println(map.get(e));
        }
    }
}