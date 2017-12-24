package com.iteritory.itcrecyclerviewhorizontallist.model;

/**
 * Created by Sadruddin on 12/10/2017.
 */

public class Grocery {
    public int productImage;
    public String productName;

    public Grocery(String productName, int productImage) {
        this.productImage = productImage;
        this.productName = productName;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
