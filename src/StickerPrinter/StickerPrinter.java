package StickerPrinter;

import java.util.Scanner;

public class StickerPrinter {

    static void createSticker(String name, double price, double tax) {

        tax = 0.20;

        if (name.isEmpty()) {
            System.out.println("INVALID_PRODUCT_NAME");
        }
        if (price <= 0) {
            System.out.println("INVALID_PRICE");
        } else {
            double Result_price = price + (price * tax);
            System.out.println("Імя товару: " + name + " " + " ціна з ПДВ 0.20% становить:" + Result_price + " USD");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        createSticker(sc.nextLine(), sc.nextDouble(), 0.20);

    }
}


//    Опис завдання:
//        Є магазин з різноманітними товарами. Кожен товар повинен мати цінник.
//        На ціннику клієнти повинні бачити назву товару та його ціну.
//        Ціна продукту - це його початкова ціна плюс податок.
//        Розробіть додаток, який допоможе друкувати такі цінники.
//        Деталі завдання:
//        Створіть клас StickerPrinter із методом createSticker всередині.
//        Цей метод має приймати назву продукту, його початкову ціну та податок у відсотках.
//        Метод має повертати назву продукту та кінцеву ціну, розділені пробілами,
//        наприклад: Kattle 58.40. Замініть назву продукту на INVALID_PRODUCT_NAME,
//        якщо введено недійсну назву продукту, і ціну на INVALID_PRICE, якщо ціну неможливо обчислити.
//        Надайте код класу StickerPrinter як результат тестового завдання.
//        код повинен бути вказаний у текстовому документі.
//        Клас StickerPrinter має бути повністю функціональним сам по собі без залежності
//        від будь-яких інших класів із вашого рішення.