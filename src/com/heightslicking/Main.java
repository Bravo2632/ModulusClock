package com.heightslicking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ModulusClock();


    }


    public static void ModulusClock() {


        Scanner keyboard;
        int hour;
        int minutes;

        keyboard = new Scanner(System.in);
        System.out.println("Give me a amount of hours.");
        hour = keyboard.nextInt();
        System.out.println("Give me a amount of minutes.");
        minutes = keyboard.nextInt();



    }
}