package ru.tahautdinov.task8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Act {
    private int num;
    private String date;
    private String product[];

    public Act(int num, String date, String[] product) {
        this.num = num;
        this.date = date;
        this.product = product;
    }

    public int getNum() {
        return num;
    }

    public String getDate() {
        return date;
    }

    public String[] getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Act{" +
                "num=" + num +
                ", date='" + date + '\'' +
                ", product=" + Arrays.toString(product) +
                '}';
    }
}

