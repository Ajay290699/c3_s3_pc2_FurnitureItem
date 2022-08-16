package com.furniture;

public class FurnitureItemImpl {

    public static void main(String[] args) {
        FurnitureItem object = new FurnitureItem();
        object.setFurnitureCode(101);
        System.out.println("Furniture Code = " + object.getFurnitureCode());
        object.setFurnitureType("table");
        System.out.println("Furniture Type = " + object.getFurnitureType());
        object.setGradeOfFurniture("grade1");
        System.out.println("gradeOfFurniture = " + object.getGradeOfFurniture());
        object.setFurnitureUsage("outdoor");
        System.out.println("getFurnitureUsage = " + object.getFurnitureUsage());
        object.setPrice(10);
        System.out.println("price = $" + object.getPrice());

        System.out.println("Discounted Price is = $" + object.calculateDiscount());

    }
}
