package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        String option = args[0];

        Scanner sc = new Scanner(System.in);

        System.out.println("Give me a positive number!");
        try {
            while(sc.hasNext()) {
                int number = sc.nextInt();
                if(number < 0) {
                    System.out.println("number should be positiv!");
                }
            }
        } catch (InputMismatchException n) {
            System.out.println("Not a number, try again later");
        }
    }

}

