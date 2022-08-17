package main;

import modus.Sequence;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        String option = args[0];

        Scanner stdIn = new Scanner(System.in);

        System.out.println("Give me a positive number!");
        try {
            while(stdIn.hasNext()) {
                int number = stdIn.nextInt();

                if(number < 0) {
                    do{
                        System.out.println("number should be positiv!");
                        number = stdIn.nextInt();
                    }while(number < 0);
                }

                if(number >= 300) {
                    do {
                        System.out.println("number too large!");
                        number = stdIn.nextInt();
                    }while(number > 300);
                }

                if(option.equals("print Sequence"))  {
                    onlyPrintValues(number);
                    return;
                }
                drawConjecture(option, number);
            }
        } catch (InputMismatchException n) {
            System.out.println("Not a number, try again later");
        }

    }

    private static void drawConjecture(String module, int input) {
        Sequence sq = new Sequence();
        if(module.equals("punctual")) {
            sq.drawPunctualSequence(input);
        }
    }

    private static void onlyPrintValues(int start) {
        Sequence sq = new Sequence();
        sq.printTestSequence(start);
    }

}

