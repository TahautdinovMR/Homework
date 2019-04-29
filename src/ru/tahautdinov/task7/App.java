package ru.tahautdinov.task7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        VendingMachine menu[] = new VendingMachine[4];
        menu[0] = new VendingMachine(Drink.WATER, 20);
        menu[1] = new VendingMachine(Drink.TEA, 30);
        menu[2] = new VendingMachine(Drink.COFFEE, 40);
        menu[3] = new VendingMachine(Drink.JUICE, 45);

        System.out.println("Выберите напиток");
        for (int i = 0; i <= 3; i++) {
            System.out.println(menu[i] + "   Нажмите кнопку   " + (i+1));
        }

        Scanner scan = new Scanner(System.in);
        int button = scan.nextInt();

        System.out.println("Внесите оплату");

        int pay = scan.nextInt();
        int sum = pay;
            while (sum < menu[button - 1].price) {
                pay = scan.nextInt();
                sum = sum + pay;
            }
            System.out.println("Ваш напиток готов");
            if (sum > menu[button - 1].price)
                System.out.println("Сдача составляет   " + (sum - menu[button - 1].price));

        }
    }














