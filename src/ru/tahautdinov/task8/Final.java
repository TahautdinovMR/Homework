package ru.tahautdinov.task8;

import com.sun.xml.internal.ws.encoding.StringDataContentHandler;

public final class Final { //ненаследуемый класс
    public static final int NOMBER = 142857;
    public static void main(String[] args) {
        int nomber = NOMBER * 2;
        System.out.println(nom());
        System.out.println(nomber);

    }
    public static final int nom(){
        System.out.println(NOMBER * 3);
        return NOMBER;
    }
}
