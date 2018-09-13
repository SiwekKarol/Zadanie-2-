package com.company;

public class Main {

    public static void main(String[] args) {

                Furniture furniture1 = new Furniture("Biurko", "Mebel", 4.5, "Wrocław");

        System.out.printf(furniture1.nameFurniture);
        System.out.printf("%n");
        System.out.printf(furniture1.cityFurniture);
        System.out.printf("%n");
        System.out.println(furniture1.age);
        System.out.printf("%n");
        System.out.printf(furniture1.typeFurniture);
        System.out.printf("%n");

        Furniture furniture2 = new Furniture("Szafa","Mebel", 3, "Dobrzykowice");

        System.out.printf(furniture2.nameFurniture);
        System.out.printf("%n");
        System.out.printf(furniture2.cityFurniture);
        System.out.printf("%n");
        System.out.println(furniture2.age);
        System.out.printf("%n");
        System.out.printf(furniture2.typeFurniture);
        System.out.printf("%n");{
                }

    }
}
