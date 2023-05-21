public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1 () {
        System.out.println("Task 1");

        for (int i = 0; i <= 10; i++) {
            System.out.println("Интерация цикла " + i);
        }
    }

    public static void task2 () {
        System.out.println("Task 2");

        for (int i = 10; i >= 0; i--) {
            System.out.println("Интерация цикла " + i);
        }
    }

    public static void task3 () {
        System.out.println("Task 3");

        for (int i = 0; i <= 17; i += 2) {
            System.out.println("Интерация цикла " + i);
        }
    }

    public static void task4 () {
        System.out.println("Task 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println("Интерация цикла " + i);
        }
    }

    public static void task5 () {
        System.out.println("Task 5");

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6 () {
        System.out.println("Task 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
    }

    public static void task7 () {
        System.out.println("Task 7");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task8 () {
        System.out.println("Task 8");

        int salary = 29_000;
        int total = 0;

        for (int i = 0; i <= 12; i ++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна "
                    + total + " рублей");
        }
        System.out.println("Итого " + total);
    }

    public static void task9 () {
        System.out.println("Task 9");

        float salary = 29_000;
        float total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна "
                    + total + " рублей");
        }
        System.out.println("Итого " + total);
    }
    public static void task10 () {
        System.out.println("Task 10");

        int z = 2;
        for (int i = 1; i <= 10; i += 1) {
            System.out.println(z + " * " + i + " = " + z * i);
        }
    }
}