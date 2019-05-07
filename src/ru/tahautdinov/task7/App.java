package ru.tahautdinov.task7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        VendingMachine menu[] = new VendingMachine[4];
        menu[0] = new VendingMachine(Drink.WATER, 20);
        menu[1] = new VendingMachine(Drink.TEA, 30);
        menu[2] = new VendingMachine(Drink.COFFEE, 40);
        menu[3] = new VendingMachine(Drink.JUICE, 45);

        for (int i = 0; i <= 3; i++) {
            System.out.println(menu[i] + "   Нажмите кнопку   " + (i + 1));
        }

        System.out.println("Внесите оплату");
        Scanner scan = new Scanner(System.in);

        int pay = scan.nextInt();
        int sum = pay;

        System.out.println("Выберите напиток");
        int button = scan.nextInt();

        while (button != 1 && button != 2 && button != 3 && button != 4){
            System.out.println("Вы ввели несуществующий напиток");
            button = scan.nextInt();
        }

        if (sum == 0)
            System.out.println("Вы не внесли денежные средства, внесите оплату");


        while (sum < menu[button - 1].getPrice()) {
            if (sum != 0)
                System.out.println("Недостаточно средств, внесите еще");
            pay = scan.nextInt();
            sum = sum + pay;
        }

        System.out.println("Ваш напиток готов");

        if (sum >= menu[button - 1].getPrice()){
            System.out.println("Ваша сдача составляет - " + (sum - menu[button - 1].getPrice()));
        }

    }
}














