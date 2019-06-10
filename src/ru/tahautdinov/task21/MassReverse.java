package ru.tahautdinov.task21;

public class MassReverse {
    public static void main(String[] args) {
        int mass[] = new int[]{0,1,2,3,4,5,6,7,8,9,10,11};
        int b = 0;

        while (b < (mass.length/2 ))
        {

        int a = mass[b];
        mass[b] = mass[mass.length - (b + 1)];
        mass[mass.length - (b + 1)] = a;
        b++;
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");

        }


    }
}
