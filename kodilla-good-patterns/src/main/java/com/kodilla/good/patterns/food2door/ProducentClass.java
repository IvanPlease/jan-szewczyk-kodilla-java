package com.kodilla.good.patterns.food2door;

import java.util.*;

public class ProducentClass {

    private String name;
    private String address;
    private String ownerName;
    private List<ProductClass> stockMap;

    public ProducentClass(String name, String address, String ownerName) {
        this.name = name;
        this.address = address;
        this.ownerName = ownerName;
        stockMap = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public List<ProductClass> getStockMap() {
        return stockMap;
    }

    public void setStockMap(List<ProductClass> stockMap) {
        this.stockMap = stockMap;
    }
}
