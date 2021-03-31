import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

/*
Create the following classes:
class Fruit { String name; int calories; int price; String color; }
Display the following:
1. Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.
2. Display color wise list of fruit names.
3. Display only RED color fruits sorted as per their price in ascending order.*/

class Fruit{
	private String name;
	private int calories;
	private int price;
	private String color;
	Fruit(){
		
	}
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Fruit{name=" + "'"+name + "'"+", calories=" + calories + ", price=" + price + ", color=" +  "'"+color +"'"+ "}";
	}
	
}
class MySort implements Comparator <Fruit> {

    @Override
    public int compare(Fruit f1, Fruit f2) {
        if(f1.getPrice()<f2.getPrice()) {
        	return 1;
        }else
        	return -1;
    }
}

public class Assignment5Q1 {

    public static List<String> reverseSort(ArrayList<Fruit> fruits) {
    
    	ArrayList<Fruit> alist = new ArrayList<>();
    	alist = (ArrayList<Fruit>)fruits.stream().filter(i->i.getCalories()<100)
    			.sorted((f1,f2)->f2.getCalories()-f1.getCalories())
    			.collect(Collectors.toList());
    	alist.stream().sorted();
    	List<String> rList = new ArrayList<String>();
    	alist.stream().forEach(i->{rList.add(i.getName());});
    	return rList;
    }
    public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits) {
    
        List<Fruit> colorFruit = new ArrayList<>();
    	
    	colorFruit = fruits.stream().sorted((f1,f2)->f1.getColor().compareTo(f2.getColor())).collect(Collectors.toList());
    	
    	return (ArrayList<Fruit>)colorFruit;
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
    	ArrayList<Fruit> redColor;
    
    	List<Fruit> rc = fruits.stream().filter(i->i.getColor().equalsIgnoreCase("Red"))
    	.sorted((f1,f2)->f1.getPrice()-f2.getPrice()).collect(Collectors.toList());
    	redColor = new ArrayList<>(rc);
    
    	return redColor;
    }
    public static ArrayList<Fruit> lowCaloryFruits(ArrayList<Fruit> fruits){
    	ArrayList<Fruit> alist = new ArrayList<>();
    	alist = (ArrayList<Fruit>)fruits.stream().filter(i->i.getCalories()<100)
    			.sorted((f1,f2)->f2.getCalories()-f1.getCalories())
    			.collect(Collectors.toList());
    	alist.stream().sorted();
    	return alist;
    }
    
    public static void main(String[] args) {
    Fruit f1=new Fruit("Banana",80,8,"Yellow");
		Fruit f2=new Fruit("Apple",200,15,"Red");
		Fruit f3=new Fruit("Orange",120,12,"Orange");
		Fruit f4=new Fruit("Mango",70,9,"Green");
		Fruit f5=new Fruit("Straw Berry",150,17,"Red");
		
		ArrayList<Fruit> fruits =new ArrayList<>();
		
		fruits.add(f1);
		fruits.add(f2);
		fruits.add(f3);
		fruits.add(f4);
		fruits.add(f5);
		
		System.out.println("LowCaloryFruits in descending order of their Calories");
		ArrayList<Fruit> alist=lowCaloryFruits(fruits);
		alist.stream().forEach(i->System.out.println(i));
		System.out.println();
		
		System.out.println("Sorted Based on Color");
    	ArrayList<Fruit> alist1 = sort(fruits);
    	alist1.stream().forEach(i->System.out.println(i));
    	System.out.println();
    	
    	System.out.println(" Red Color Fruits sorted on price");
    	ArrayList<Fruit> alists2 = filterRedSortPrice(fruits);
    	alists2.stream().forEach(i->System.out.println(i));
    	System.out.println();
    	
    	System.out.println("Reverse Sort");
    	List<String> alist3 = reverseSort(fruits);
    	alist3.stream().forEach(i->System.out.println(i));
		
    }

}