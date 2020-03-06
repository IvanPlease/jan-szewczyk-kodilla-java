package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class RentService {

    private Map<String, ItemInformation> products;

    public RentService() {
        this.products = new HashMap<>();
    }

    public void createRentRequest(String itemName, User user){

        ItemInformation item = products.get(itemName);
        if (!RentalStatus.status(item)) {
            if(user.isInGoodTerm()){
                user.addOrders(item);
                int i = user.getUnPaidOrders();
                for(ItemInformation order:user.getOrders()){
                    if(!order.getBoughtState()){
                        i++;
                    }
                }
                item.setBought(true);
                user.setUnPaidOrder(i);
            }else{
                ResultPrompts.noInGoodTerms();
            }
        } else {
            ResultPrompts.productBought();
        }

    }

    public void addProduct(String name, ItemInformation information){
        products.put(name, information);
    }

    public void payForProduct(String name, User user){
        ItemInformation i = products.get(name);
        i.setPaid(true);
        user.setUnPaidOrder(user.getUnPaidOrders()-1);
    }

}
