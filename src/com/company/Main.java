package com.company;

public class Main {

    public static void main(String[] args) {

                Furniture furniture1 = new Furniture("Biurko", "Mebel", 4.5, "Wrocław");

        System.out.println(furniture1.nameFurniture);
        System.out.println(furniture1.cityFurniture);
        System.out.println(furniture1.age);
        System.out.println(furniture1.typeFurniture);

        Furniture furniture2 = new Furniture("Szafa","Mebel", 3, "Dobrzykowice");
        
        System.out.println(furniture2.nameFurniture);
        System.out.println(furniture2.cityFurniture);
        System.out.println(furniture2.age);
        System.out.println(furniture2.typeFurniture);{
                }

    }
}
