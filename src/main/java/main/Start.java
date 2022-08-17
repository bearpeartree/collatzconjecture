package main;

import modus.Sequence;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {
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

                System.out.println(("-------------------------------"));
                onlyPrintValues(number);
                Sequence sq = new Sequence();
                sq.drawPunctualSequence(number);
            }
        } catch (InputMismatchException n) {
            System.out.println("Not a number, try again later");
        }

    }

    public void drawConjecture(String module) {
        if(module.equals("punctual")) {
        }
    }

    public static void onlyPrintValues(int start) {
        Sequence sq = new Sequence();
        sq.printTestSequence(start);
    }

}

