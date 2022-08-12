package main;

import modus.Sequence;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {

    static int startNumber;
    public static void main(String[] args) {
        //We'll be using it in the near future
        String option = args[0];

        Scanner stdIn = new Scanner(System.in);

        System.out.println("Give me a positive number!");
        try {
            while(stdIn.hasNext()) {
                int number = stdIn.nextInt();
                if(number < 0) {
                    System.out.println("number should be positiv!");
                }
                startNumber = number;

                System.out.println(("-------------------------------"));
                onlyPrintValues(startNumber);
            }
        } catch (InputMismatchException n) {
            System.out.println("Not a number, try again later");
        }

    }

    public void drawConjecture(String module) {
        if(module.equals("punctual")) {
            //Call mehthod punctual, single or multiple =>2 sequence
        }
    }

    public static void onlyPrintValues(int start) {
        Sequence sq = new Sequence();
        sq.printTestSequence(start);
    }

}

