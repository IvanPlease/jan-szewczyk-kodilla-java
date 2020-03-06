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
        RentService rentService = new RentService();
        addProducts(rentService);
        rentService.createRentRequest(cH, user1);
        rentService.createRentRequest(a, user1);
        rentService.createRentRequest(gF, user1);
        rentService.createRentRequest(iM, user1);
        rentService.createRentRequest(p, user1);
        rentService.createRentRequest(r2, user1);
        rentService.createRentRequest(gV, user1);
        rentService.payForProduct(p, user1);
        rentService.payForProduct(gV, user1);
        rentService.createRentRequest(r2, user1);
        rentService.createRentRequest(gV, user1);
    }

    public static void addProducts(RentService rentService){
        rentService.addProduct(cH, new ItemInformation(movieCat, cH, false, false));
        rentService.addProduct(a, new ItemInformation(movieCat, a, false, false));
        rentService.addProduct(gF, new ItemInformation(movieCat, iM, false, false));
        rentService.addProduct(p, new ItemInformation(hardwareCat, p, false, false));
        rentService.addProduct(r2, new ItemInformation(gameCat, r2, false, false));
        rentService.addProduct(gV, new ItemInformation(gameCat, gV, false, false));
    }

}
