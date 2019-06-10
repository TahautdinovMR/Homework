package ru.tahautdinov.task21;

public class SdvigMassiva {

    public static void main(String[] args) {
        int mass[] = new int[]{0,1,2,3,4,5,6,7,8,9,10,11};
            for (int i = 0; i < mass.length - 1; i++) {
                mass[i] = mass[i+1];
            }
            mass[mass.length - 1] = 0;
        for (int i = 0; i < mass.length; i++)
            System.out.print(mass[i] + " ");



        }



}
