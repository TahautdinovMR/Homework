package ru.tahautdinov.task13;

import java.util.Scanner;

public class Mom {
    public static void main(String[] args) {
        Baby someBaby = new Baby();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите еду: Apple, Carrot, Kasha, Milk");

        Eat a = Eat.Apple;
        String eat;
        boolean b = false;
        while (!b)
        {
            try{
                eat = scan.nextLine();
                a = Eat.valueOf(eat);
                b = true;
            }
            catch (IllegalArgumentException e){
                System.out.println("Такой еды нет");
            }
        }
        try {
            someBaby.toEat(a);
        }
        catch (MealNotLikeException e){
            System.out.println("Попробуем другую пищу");
        }
    }
}
