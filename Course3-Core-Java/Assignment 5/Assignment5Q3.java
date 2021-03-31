import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*1. What are all the unique cities where the traders work?


2. Find all traders from Pune and sort them by name.

3. Return a string of all traders’ names sorted alphabetically.


4. Are any traders based in Indore?*/

class Trader
{
	private String name;
	private String city;
	
	public Trader(String name,String city)
	{
		super();
		this.name=name;
		this.city=city;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString()
	{
		return "Trader1{name=" + "'"+name+"'" + ", city=" + "'"+city +"'"+ "}";
	}
	
}

public class Assignment5Q3 
{
	public static List<String> printUniqueCities(List<Trader> traders)
	{
		List<String> uniqueCity=new ArrayList<>();
		List<String> allCity=new ArrayList<>();
		
		traders.stream().forEach(i->allCity.add(i.getCity()));
		uniqueCity=allCity.stream().distinct().collect(Collectors.toList());
		return uniqueCity;
		
	}
	
	public static List<String> tradersFromPuneSortByName(List<Trader> traders)
	{
		List<String> puneTrader= new ArrayList<>();
		traders.stream().filter(i->i.getCity().equalsIgnoreCase("Pune")).forEach(i->puneTrader.add(i.getName()));
		puneTrader.stream().sorted((t1,t2)->t1.compareTo(t2));
		return puneTrader;
	}
	
	public static String allTradersNames(List<Trader> traders)
	{
		List<String> allTraders=new ArrayList<>();
		traders.stream().forEach(i->allTraders.add(i.getName()));
    	allTraders.stream().sorted((t1,t2)->t1.compareTo(t2));
    	
    	String list="";
    	for(String s:allTraders)
    	{
    		list=list+s;
    	}
		
    	return list;
	}
	
	public static ArrayList<Trader> areAnyTrader4sFromIndore(ArrayList<Trader> traders) {
    	ArrayList<Trader> indoreTraders = new ArrayList<>();
    	indoreTraders = (ArrayList<Trader>) traders.stream().filter(i->i.getCity().equalsIgnoreCase("Indore")).collect(Collectors.toList());
    	return indoreTraders;
    }
	
	public static void main(String args[])
	{
		
	}
	
	
}
