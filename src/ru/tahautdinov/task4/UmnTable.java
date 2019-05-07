package ru.tahautdinov.task4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UmnTable {

    public static void main(String[] args) {


        int[] intArray = new int[10];

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                intArray[j] = ((i + 1) * (j + 1));
            }
            String intArrayString = Arrays.toString(intArray);
            System.out.println(intArrayString);

        }


    }

}

