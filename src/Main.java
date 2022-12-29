import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание №1");
        int year = 2021;
        checkOnLeapYear(year);
    }

    public static void checkOnLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task2() {
        System.out.println("Задание №2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        String checking = checkTheApp(clientOS, clientDeviceYear);
        System.out.println(checking);

    }

    public static String checkTheApp(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && clientDeviceYear < currentYear) {
            return "Установите облегченную версию приложения для Android по ссылке";
        }
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        }
        if (clientOS == 1 && clientDeviceYear >= currentYear) {
            return "Установите версию приложения для Android по ссылке";
        } else {
            return "Установите версию приложения для iOS по ссылке";
        }
    }

    public static void task3() {
        System.out.println("Задание №3");
        int distanceForDelivery = 95;
        int daysOfDelivery = calculateOfdaysOfDelivery(distanceForDelivery);
        if (daysOfDelivery != 0) {
            System.out.println("Для доставки карты потребуется дней " + daysOfDelivery);
        } else {
            System.out.println("В данный район доставка не осуществляется");
        }
    }

    public static int calculateOfdaysOfDelivery(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }
}