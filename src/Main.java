public class Main {

    //region Homework 1

    public static void task1() {
        for(int i = 1; i <= 10; i++)
            System.out.println(" " + i);
    }

    public static void task2() {
        for(int i = 10; i >= 1; i--)
            System.out.println(" " + i);
    }

    public static void task3() {
        for(int i = 0; i <= 17; i+=2)
            System.out.println(" " + i);
    }

    public static void task4() {
        for(int i = 10; i >= -10; i--)
            System.out.println(" " + i);
    }

    //endregion

    //region Homework 2

    public static void task5() {
        for (int i = 1904; i < 2096; i+=4)
            System.out.println(i + " год является високосным");
    }

    public static void task6() {
        for (int i = 7; i <= 98; i+=7)
            System.out.println(" " + i);
    }

    public static void task7() {
        for (int i = 1; i <= 512; i*=2)
            System.out.println(" " + i);
    }

    //endregion

    //region Homework 3

    public static void task8() {
        var savingMoney = 29000;
        for (int i = 1; i <= 12; i++){
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savingMoney + " рублей");
            savingMoney += 29000;
        }
    }

    public static void task9() {
        var savingMoney = 29000;
        var proc = 0.01;
        for (int i = 0; i <= 12; i++){
            if (i != 0)
                System.out.println("Месяц " + i + ", сумма накоплений равна " + savingMoney + " рублей");
            savingMoney += savingMoney * proc;
        }
    }

    //endregion

    public static void main(String[] args) {
        task9();
    }
}