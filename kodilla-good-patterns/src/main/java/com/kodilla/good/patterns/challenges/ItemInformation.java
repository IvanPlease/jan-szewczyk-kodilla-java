package com.kodilla.good.patterns.challenges;

public class ItemInformation {

    private String productCat;
    private String productName;
    private boolean isBought;
    private boolean isPaid;

    public ItemInformation(String productCat, String productName, boolean isBought, boolean isPaid) {
        this.productCat = productCat;
        this.productName = productName;
        this.isBought = isBought;
        this.isPaid = isPaid;
    }

    public String getProductCat() {
        return productCat;
    }

    public String getProductName() {
        return productName;
    }

    public boolean getBoughtState() {
        return isBought;
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

}
