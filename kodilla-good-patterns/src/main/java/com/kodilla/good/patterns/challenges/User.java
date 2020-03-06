package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class User {
    private String userName;
    private boolean inGoodTerm;
    private int unPaidOrders;
    private ArrayList<ItemInformation> orders;

    public User(String userName) {
        this.userName = userName;
        this.inGoodTerm = true;
        this.orders = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public boolean isInGoodTerm() {
        return inGoodTerm;
    }

    public void setUnPaidOrder(int unPaidOrder){
        if(unPaidOrder >= 5)
            this.setInGoodTerm(false);
        else
            this.setInGoodTerm(true);
        this.unPaidOrders = unPaidOrder;
    }

    public void setInGoodTerm(boolean inGoodTerm) {
        this.inGoodTerm = inGoodTerm;
    }

    public void addOrders(ItemInformation i) {
        orders.add(i);
    }

    public ArrayList<ItemInformation> getOrders(){
        return orders;
    }

    public int getUnPaidOrders() {
        return unPaidOrders;
    }

}
