package ru.tahautdinov.task11;

import java.util.Scanner;

public class Raplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String text2 = text.replaceAll("бяка", "вырезано цензурой");
        System.out.println(text2);
    }
}
