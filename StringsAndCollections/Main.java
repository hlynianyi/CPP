package CPP.StringsAndCollections;

import java.util.Scanner;

/*
Цель работы: Видалити з тексту слова, які містять числа.
*/

public class Main {
    static Scanner console = new Scanner(System.in);
    static StringsClass str = new StringsClass();

    public static void main(String[] args) {
        menu(console);
    }

    private static void menu(Scanner console) {
        boolean wantToContinue = true;
        while (wantToContinue) {
            System.out.println("\n1. Press 1 for the default text. " +
                    "\n2. Press 2 to enter your own text." +
                    "\n3. To close the program.");
            if (console.hasNextInt()) { //
                int selector = console.nextInt(); //
                switch (selector) {
                    case 1: // use default text
                        System.out.println("Default version of text, enjoy.");
                        str.createObjectWithDefaultText();
                        str.outputText();
                        str.numericDeleter();
                        break;
                    case 2: // or use your own text
                        System.out.println("Input your version of text.");
                        str.createObjectWithDifferentText();
                        str.numericDeleter();
                        break;
                    case 3:
                        System.out.println("Program was closed.");
                        return;
//                    default:
//                        System.out.println("This variant is not exist, yet..");
                }
            } else {
                System.out.println("Unpredictable number or type..");
            }
        }
    }
}
