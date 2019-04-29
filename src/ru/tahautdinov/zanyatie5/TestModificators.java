package ru.tahautdinov.zanyatie5;

class TestModificators {

    public static void main(String args[]) {
        A obj = new A(); // создание объекта класса A
// получить значение переменных
        int kk = obj.k;
        System.out.println("k=" + kk);
        int nn = obj.getN();
        System.out.println("n=" + nn);
// установить значения переменных и
// вызвать метод, использующий
//закрытую и открытую переменные
        obj.k = 10;
        obj.setN(15);
        int s = obj.summa();
        System.out.println("summa=" + s);
    }
}

