package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(weatherTest(34, 33));
        System.out.println(weatherTest(20, -5));
        System.out.println(weatherTest(27, 20));
        System.out.println(weatherTest(43, 17));
        System.out.println(weatherTest(44, 30));
        System.out.println("age = " + generateRandomAge());
    }

    public static String weatherTest(int age, int temperature) {
        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30))
            return "Можно идти гулять";

        else if ((age < 20) && (temperature >= 0 && temperature < 28))
            return "Можно идти гулять";

        else if (age < 45 || (temperature > -10 && temperature < 25))
            return "Можно идти гулять";

        else
            return "Оставайтесь дома";


    }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(100);
        return age;
    }
}