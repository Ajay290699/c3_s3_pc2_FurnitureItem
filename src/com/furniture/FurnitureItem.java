package com.furniture;

public class FurnitureItem {

    final int Discount = 5;
    int furnitureCode;
    String furnitureType;
    String gradeOfFurniture;
    String color;
    String furnitureUsage;
    double price;

    FurnitureItem() {
        furnitureCode = 0;
        furnitureType = "";
        gradeOfFurniture = "";
        color = "";
        furnitureUsage = "";
        price = 0;
    }

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getGradeOfFurniture() {
        return gradeOfFurniture;
    }

    public void setGradeOfFurniture(String gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFurnitureUsage() {
        return furnitureUsage;
    }

    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateDiscount() {
        if (furnitureUsage.equals("outdoor")) {
            double discountedPrice = price - (price * Discount / 100);
            return discountedPrice;
        } else {
            return price;
        }

    }
}

