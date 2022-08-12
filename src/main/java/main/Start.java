package main;

import modus.Sequence;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {

    static int startNumber;
    public static void main(String[] args) {
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
                Sequence s = new Sequence();
                s.printTestSequence(startNumber);
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

}

