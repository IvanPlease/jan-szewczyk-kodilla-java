package com.kodilla.good.patterns.challenges2;

import java.util.Map;

public class ProductsWarehouse implements OrderRepository {

    private Map<ProductsDTO, Integer> stock;

    @Override
    public void createOrder(UserDTO user, Map<ProductsDTO, Integer> products) {
        boolean isOrderReady = true;
        for(Map.Entry<ProductsDTO, Integer> product: products.entrySet()){
            ProductsDTO productsDTO = product.getKey();
            int orderSize = product.getValue();
            int stockSize = stock.get(productsDTO);
            if(!(stockSize>orderSize)){
                isOrderReady = false;
            }
        }
        if(isOrderReady){
            for(Map.Entry<ProductsDTO, Integer> product: products.entrySet()){
                ProductsDTO productsDTO = product.getKey();
                int orderSize = product.getValue();
                int stockSize = stock.get(productsDTO);
                stock.replace(productsDTO, stockSize - orderSize);
            }
        }
    }
}
