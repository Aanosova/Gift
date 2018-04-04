import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;

import Gift.Box;
import Gift.Haribo;
import Gift.Kinder;
import Gift.KitKat;

public class Base {
    public static void main(String[] args) {
        Scanner Lesson4 = new Scanner(System.in);
        Haribo haribo = new Haribo("Харибо мишки", 56,400);
        Kinder kinder = new Kinder("Киндер", 55,250, "Большой");
        KitKat kitKat = new KitKat("Кит_Кат",49,200, "Манго");
        System.out.println("Добавьте в корзину сладости. Вам доступны:");

        Box [] box = {haribo,kinder,kitKat};
        for (Box someStuff : box) {
            System.out.println(someStuff.toString());
        }
        int price = 0;
        int weight = 0;

        for (Box someStuff : box) {
            price = price + someStuff.getPrice();
            weight = weight + someStuff.getWeight();
        }
        System.out.println("Общая стоимость подарка = " + price);
        System.out.println("Общий вес подарка = " + weight);
    }
}
