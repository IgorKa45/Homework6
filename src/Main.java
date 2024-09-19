public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte a;
        for ( a = 1; a <= 10; a++ ) {
            System.out.println(a);
        }

        System.out.println("Задание 2");

        for ( a = 10; a >= 1; a--) {
            System.out.println(a);
        }

        System.out.println("Задание 3");

        for ( a = 0; a < 17; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }

        System.out.println("Задание 4");

        for (a = 10; a >= -10 ; a--) {
            System.out.println(a);
        }

        System.out.println("Задание 5");

        short year;
        for (year = 1904; year < 2096; year++) {
            if (year % 4 == 0) {
                System.out.println(year + " год является високосным.");
            }
        }

        System.out.println("Задание 6");

        byte number;
        for (number = 0; number < 100; number = (byte)(number + 7) ) {
            System.out.println(number);
        }

        System.out.println("Задание 7");
        for (short c = 1; c <= 512; c =(short)(c * 2)) {
            System.out.println(c);
        }

        System.out.println("Задание 8");
        byte month;
        int savings;
        for (month = 0, savings = 0; month < 13; month++, savings = savings + 29000) {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей.");
        }

        System.out.println("Задание 9");
        for (month = 0, savings = 0; month < 13; month++, savings = (int)((savings + 29000) + (savings * 0.01f))) {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей.");
        }

        System.out.println("Задание 10");
        byte b;

        for (b = 1; b <= 10; b++) {
            System.out.println("2 * " + b + " = " + 2*b);
        }
    }
}