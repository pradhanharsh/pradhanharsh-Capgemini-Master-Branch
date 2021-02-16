package com.company;
import java.util.ArrayList;

public class Assignment4Q2 {

    private int totalPrice;
    private String status;

    @Override
    public boolean equals(Object obj) {
        Assignment4Q2 o2 = (Assignment4Q2) obj;
        if(totalPrice == o2.totalPrice && status.equals(o2.status)){
            return true;
        }
        return false;
    }

    public Assignment4Q2(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {
        ArrayList<Assignment4Q2> acceptedOrders = new ArrayList<>();
        orders.forEach((item -> {
            if(item.totalPrice > 10000 && (item.status.equals("ACCEPTED") || item.status.equals("COMPLETED"))){
                acceptedOrders.add(item);
            }
        }));
        return acceptedOrders;
    }
    public static void main(String[] args) {}
}