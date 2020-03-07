package com.kodilla.good.patterns.food2door;

import java.util.LinkedList;
import java.util.List;

public class OrderService {

    public static void main(String[] args) {
        LinkedList<ProductClass> productClasses = new LinkedList<>();
        productClasses.add(new ProductClass("Wedka", "wedka", 250, 2));
        productClasses.add(new ProductClass("Wedka2", "wedka2", 450, 10));
        productClasses.add(new ProductClass("Wedka3", "wedka3", 750, 5));
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.addProducents();
        orderRequest.addProducts(0, productClasses);
        LinkedList<ProducentClass> producentClasses = orderRequest.getProducentClasses();
        int res = ResultPrompt.listProducents(producentClasses)-1;
        List<ProductClass> products = producentClasses.get(res).getStockMap();
        for(ProductClass p:products){
            if(p.getStock() > 0){
                System.out.println(products.indexOf(p)+1+". "+p.getName()+" "+p.getPrice()+"zł");
            }
        }
    }

}
