package com.kodilla.good.patterns.food2door;

import java.util.LinkedList;

public class OrderRequest {

    private LinkedList<ProducentClass> producentClasses;

    public OrderRequest() {
        producentClasses = new LinkedList<>();
    }

    public void addProducents(){
        producentClasses.add(new ProducentClass("ExtraFoodShop", "ul Address 110", "Wlodek"));
        producentClasses.add(new ProducentClass("HealthyShop", "ul Address 110", "Wlodek"));
        producentClasses.add(new ProducentClass("GlutenFreeShop", "ul Address 110", "Wlodek"));
    }

    public void addProducts(int index, LinkedList<ProductClass> p){
        LinkedList<ProductClass> productClasses = new LinkedList<>();
        for(ProductClass pr:p){
            productClasses.add(pr);
        }
        producentClasses.get(index).setStockMap(productClasses);
    }

    public LinkedList<ProducentClass> getProducentClasses() {
        return producentClasses;
    }
}
