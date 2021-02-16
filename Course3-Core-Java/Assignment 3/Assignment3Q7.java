
import java.util.HashMap;

class ParkingSlot {
    private String ownerName;
    private int carNumber;
    private int token;
    private int level;
    private int section;
    private int slot;

    public ParkingSlot(String ownerName, int carNumber, int token, int level, int section, int slot) {
        this.ownerName = ownerName;
        this.carNumber = carNumber;
        this.token = token;
        this.level = level;
        this.section = section;
        this.slot = slot;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public int getToken() {
        return token;
    }

    public int getLevel() {
        return level;
    }

    public int getSection() {
        return section;
    }

    public int getSlot() {
        return slot;
    }
}

class Parked_CarOwenerList {
    final int levels = 3;
    final int sections = 2;
    final int slots = 2;
    private static int curLevel = 1;
    private static int curSection = 1;
    private static int curSlot = 1;

    private HashMap<Integer, ParkingSlot> carMap = new HashMap<>();

    public void add_new_car(Assignment3Q7 obj){
        String location = "" + curLevel + curSection + curSlot;
        ParkingSlot parkingSlot = new ParkingSlot(obj.getName(), Integer.valueOf(location), obj.getCarNo(), curLevel, curSection, curSlot);
//        System.out.println(obj);
        carMap.put(Integer.valueOf(location), parkingSlot);
        if(curSlot < slots){
            curSlot++;
        }else{
            curSlot = 1;
            if(curSection < sections){
                curSlot++;
            }else{
                curSection = 1;
                curLevel++;
            }
        }
    }
    public void remove_car(String name,int carNo){
        String token = "";
        for(ParkingSlot slot : carMap.values()){
            if(slot.getCarNumber() == carNo && slot.getOwnerName().equals(name)){
                token +=  curLevel + curSection + curSlot;
                break;
            }
        }
        carMap.remove(Integer.valueOf(token));
    }
    public String get_parked_car_location(int token){
        ParkingSlot slot = carMap.get(token);
        String location = "level : " + slot.getLevel() + ",section : " + slot.getSection() + ",slot: " + slot.getSlot() + ".";
        return location;
    }
}

public class Assignment3Q7 {
    private String name;
    private String carModel;
    private int carNo;
    private int mobileNumber;
    private String address;

    public String getName() {
        return name;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarNo() {
        return carNo;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public Assignment3Q7(String name, String carModel, int carNo, int mobileNumber, String address) {
        this.name = name;
        this.carModel = carModel;
        this.carNo = carNo;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }


    public static void main(String[] args) {
    }
}