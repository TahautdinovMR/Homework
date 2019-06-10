package ru.tahautdinov.task19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ShopTable {
    public static void main(String[] args) {

        float sum = 0;

        try (FileReader fr = new FileReader("product.txt");
             Scanner scanner = new Scanner(fr)) {
            scanner.useLocale(Locale.ENGLISH);

            System.out.printf("Наименование        Цена   Кол-во    Стоимость\n");
            System.out.printf("===============================================\n");



            while (scanner.hasNext()) {

                String name = scanner.nextLine();
                Float count = Float.parseFloat(scanner.nextLine());
                Float amount = Float.parseFloat(scanner.nextLine());
                Float cost = count * amount;
                sum = cost + sum;
                System.out.printf("%-15s %8.2f x%8.3f =%11.2f\n" , name, amount, count, cost);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("===============================================\n");
        System.out.printf("Итого: %40.2f", sum);
    }
}
