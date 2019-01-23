package ru.neooffline.hwl1;

public class Main {

    public static void main(String[] args) {
        byte byteValue = -120;
        int integerValue = 10;
        long longValue = 232343243;
        double doubleValue = 10.5;
        char charValue = 'b';
        String stringValue = "я Строка";
        boolean booleanValue = true;
        System.out.println("Число типа byte = " + byteValue + "; Целое число = " + integerValue);
        System.out.println("Число типа long = "+longValue+"; Число с плавающей точкой = " + doubleValue);
        System.out.println("Тип char - "+charValue+"; Строка = " + stringValue + "; Булева переменная - это " + booleanValue);
        System.out.println(mathSame(5,2,3,4));
        System.out.println("Это " + isInInterval(10,5) + " ,что сумма чисел \'10\' и \'5\' лежит в интервале от 10 до 20");
        System.out.println("Это " + isInInterval(5.6,15.5) + " ,что сумма чисел \'5.6\' и \'15.5\' лежит в интервале от 10 до 20");
        testPositive(10);
        testPositive(-10);
        testPositive(0);
        System.out.println("Число -10 отрицательное, и это - " + testNegative(-10));
        System.out.println("Число 10 отрицательное, и это - " + testNegative(10));
        printMessage("Anonimous");
        isLeapYear(1996);
        isLeapYear(2000);
        isLeapYear(2100);
        isLeapYear(2016);
        isLeapYear(2015);
        isLeapYear(1900);

    }
    //Задание 3
    static double mathSame(double a, double b, double c, double d){
        return a * (b + (c/d));
    }
    //Задание 4
    static boolean isInInterval(double firstValue, double secondValue){
        double sum = firstValue + secondValue;
        return sum>=10 && sum <=20;
        }
    //Задание 5
    static void testPositive(int value) {
        if (value < 0) {
            System.out.println("Число " + value + " отрицательное!!!");
        } else {
            System.out.println("Число " + value + " положительное!!!");
        }
    }
    //Задание 6
    static boolean testNegative(int value){
        boolean result = false;
        if (value < 0) {
             result= true;
        }
        return result;
    }
    //Задание 7
    static void printMessage(String name){
        System.out.println("\"Привет "+ name +"!\"");
    }
    //Задание 8*
    static void isLeapYear(int year){
        if ((year%4==0 && year%100!=0) || year%400==0){
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }

}
