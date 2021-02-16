
import java.util.Comparator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    private String name;
    private int height;
    private double weight;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person o) {
        if(this.weight - o.weight == 0){
            return this.height-o.height;
        }
        return (int) (this.weight-o.weight);
    }
}

public class Assignment3Q1 {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person("Harsh", 183, 84));
        set.add(new Person("Pradhan", 173, 70));
        set.add(new Person("Akil", 158, 60));
        set.add(new Person("Ankur", 185, 84));
        for (Person p : set){
            System.out.println(p);
        }
    }
}
