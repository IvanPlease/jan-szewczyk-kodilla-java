package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private static String cH = "Chasing Happiness";
    private static String a = "Avengers";
    private static String gF = "Good Fellas";
    private static String iM = "Iron Mand";
    private static String p = "PC";
    private static String r2 = "RDR2";
    private static String gV = "GTA V";
    private static String movieCat = "M";
    private static String hardwareCat = "H";
    private static String gameCat = "G";
    private static String userName = "IvanPlease";

    public static void main(String[] args) {
        User user1 = new User(userName);
        ShopService shopService = new ShopService();
        addProducts(shopService);
        shopService.createShopRequest(cH, user1);
        shopService.createShopRequest(a, user1);
        shopService.createShopRequest(gF, user1);
        shopService.createShopRequest(iM, user1);
        shopService.createShopRequest(p, user1);
        shopService.createShopRequest(r2, user1);
        shopService.createShopRequest(gV, user1);
        shopService.payForProduct(p, user1);
        shopService.payForProduct(gV, user1);
        shopService.createShopRequest(r2, user1);
        shopService.createShopRequest(gV, user1);
    }

    public static void addProducts(ShopService shopService){
        shopService.addProduct(cH, new ItemInformation(movieCat, cH, false, false));
        shopService.addProduct(a, new ItemInformation(movieCat, a, false, false));
        shopService.addProduct(gF, new ItemInformation(movieCat, iM, false, false));
        shopService.addProduct(p, new ItemInformation(hardwareCat, p, false, false));
        shopService.addProduct(r2, new ItemInformation(gameCat, r2, false, false));
        shopService.addProduct(gV, new ItemInformation(gameCat, gV, false, false));
    }

}
