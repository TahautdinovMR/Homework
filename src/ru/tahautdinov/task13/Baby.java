package ru.tahautdinov.task13;

public class Baby {
    void toEat (Eat a) throws MealNotLikeException{
        try{
            if (a == Eat.Apple || a == Eat.Carrot)
                System.out.println("Съел за обе щеки");
            else
                throw new MealNotLikeException();
        }
        finally {
            System.out.println("Спасибо, мама!");
        }
    }
}
