package com.company;

public class Main {

    public static void main(String[] args) {

                Furniture furniture1 = new Furniture();

        furniture1.nameFurniture = "Biurko";
        furniture1.typeFurniture = "Mebel";
        furniture1.age = 4.5;
        furniture1.cityFurniture = "Wrocław";

        System.out.println(furniture1.nameFurniture);
        System.out.println(furniture1.cityFurniture);
        System.out.println(furniture1.age);
        System.out.println(furniture1.typeFurniture);

        Furniture furniture2 = new Furniture();

        furniture2.nameFurniture = "Szafa";
        furniture2.typeFurniture = "Mebel";
        furniture2.age = 3;
        furniture2.cityFurniture = "Dobrzykowice";

        System.out.println(furniture2.nameFurniture);
        System.out.println(furniture2.cityFurniture);
        System.out.println(furniture2.age);
        System.out.println(furniture2.typeFurniture);{
                }

    }
}
