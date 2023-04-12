import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
        public static void task1 () {
            System.out.println("Задача 1:");
            int age = 10;
            var message1 = "он совершеннолетний";
            var message2 = "он не достиг совершеннолетия, нужно немного подождать";
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + ", то " + message1);
            } else {
                System.out.println("Если возраст человека равен " + age + ", то " + message2);
            }
        }

        public static void task2 () {
            System.out.println("Задача 2:");
            int temperature = 7;
            if (temperature <= 5) {
                System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
            } else
            {
                System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
            }
        }
    public static void task3 () {
        System.out.println("Задача 3:");
        int speed = 50;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4:");
        int human = 27;
        if (human >= 2 && human < 6) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в детский сад");
        }
        if (human >= 7 && human < 18) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в школу");
        }
        if (human >= 18 && human < 24) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5:");
        int child = 17;
        if (child < 5) {
            System.out.println("Если возраст ребенка равен " + child + ", то ему нельзя кататься на аттракционе");
        }
        if (child >= 5 && child < 14) {
            System.out.println("Если возраст ребенка равен " + child + ", то ему можно кататься на аттракционе в сопровождении");
        }
        else {
            System.out.println("Если возраст ребенка равен " + child + ", то ему можно без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6:");

        int passenger = 50;
        int vagon = 102;
        int seat = 60;

        if (passenger <= seat) {
            System.out.println("Еще есть сидячее место");
        } else {
        if (passenger > seat && passenger <= vagon ) {
            System.out.println("Еще есть стоячее место");
        }
        else {
            System.out.println("Мест в вагоне уже нет");
        }}


    }

}