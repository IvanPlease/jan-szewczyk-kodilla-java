package com.kodilla.good.patterns.food2door;

public class ProductClass {

    private String name;
    private String desc;
    private double price;
    private int stock;

    public ProductClass(String name, String desc, double price, int stock) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
