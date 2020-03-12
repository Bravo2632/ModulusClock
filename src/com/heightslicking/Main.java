package com.heightslicking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ModulusClock();

    }

    public static void ModulusClock() {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Give me a amount of hours in the day.");
        int hour = keyboard.nextInt();
        System.out.println("Give me a amount of minutes.");
        int minutes = keyboard.nextInt();

        hour = minutes >= 60 ? hour + (minutes % 60) : hour;


    }
}