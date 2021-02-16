
import java.util.HashMap;

class DateClass {
    private int date;
    private int month;
    private int year;


    public DateClass(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}

public class Assignment3Q4 {

    public String getEmployee(HashMap<DateClass, String> dob, String employeeName){
        DateClass dateKey = null;
        for(DateClass d : dob.keySet()){
            if(dob.get(d).equals(employeeName)){
                dateKey = d;
                break;
            }
        }
        for(DateClass d : dob.keySet()){
            if(d.getDate() == dateKey.getDate() && d.getMonth() == dateKey.getMonth() && d.getYear() != dateKey.getYear()){
                return "get method fails";
            }
        }
        return employeeName;
    }
    public static void main(String[] args) {
    }
}
