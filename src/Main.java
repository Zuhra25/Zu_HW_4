// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
        //«Если скорость …, то (вывести в зависимости от результата)
        // придется заплатить штраф / можно ездить спокойно».

        int speed = 50;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else
        {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
}