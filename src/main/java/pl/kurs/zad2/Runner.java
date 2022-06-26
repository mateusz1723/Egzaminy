package pl.kurs.zad2;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        Product cola = new Product("Cola", 3.50, "Juice");
        Product pepsi = new Product("Pepsi", 4.50, "Juice");
        Product sprite = new Product("Sprite", 4, "Juice");
        Product keyboard = new Product("Keyboard", 120, "AGD");
        Product mouse = new Product("Mouse", 90, "AGD");
        Product headphones = new Product("Headphones", 100, "AGD");
        Product pen_drive = new Product("Pen drive", 40, "AGD");

        Product[] products = {cola, pepsi, sprite, keyboard, mouse, headphones, pen_drive};


        System.out.println("Srednia cena produktów kategori AGD");

        double sum1 = 0;
        int counter1 = 0;
        for (int i = 0; i < products.length; i++) {

            if (!(products[i].getCategory().equals("AGD"))) {

            } else {

                sum1 = sum1 + products[i].getPrice();
                counter1 = counter1 + 1;
            }

        }

        System.out.println(sum1 / counter1);

        System.out.println("--------------------------------------");

        System.out.println("Najdrozszy produkt");
        int i = 0;
        int j = 0;
        while (i < products.length || j < products.length) {

            if (i == products.length || j == products.length) {
                break;
            } else {
                if (products[i].getPrice() >= products[j].getPrice()) {
                    j++;
                } else {
                    i++;
                }
            }
        }
        System.out.println(products[i].getName() + " kosztuje " + products[i].getPrice());

        System.out.println("--------------------------------------");
        System.out.println("Najtanszy produkt");

        int a = 0;
        int b = 0;
        while (a < products.length || b < products.length) {

            if (a == products.length || b == products.length) {
                break;
            } else {
                if (products[a].getPrice() <= products[b].getPrice()) {
                    b++;
                } else {
                    a++;
                }
            }
        }
        System.out.println(products[a].getName() + " kosztuje " + products[a].getPrice());

        System.out.println("--------------------------------------");

        System.out.println("Srednia cena wszystkich produktów");

        double sum2 = 0;
        int counter2 = 0;
        for (i = 0; i < products.length; i++) {

            sum2 = sum2 + products[i].getPrice();
            counter2 = counter2 + 1;
        }
        double wynik = sum2 / counter2;
        System.out.println(wynik);

        System.out.println("--------------------------------------");

        System.out.println("Ilość produktow drozszych niz srednia cena wszystkich produktow");
        int counter = 0;
        for (i = 0; i < products.length; i++) {
            if (!(products[i].getPrice() > wynik)) {

            } else {
                counter = counter + 1;
            }
        }
        System.out.println(counter);
        System.out.println();


    }
}
