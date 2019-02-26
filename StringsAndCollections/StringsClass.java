package CPP.StringsAndCollections;

import java.util.*;

public class StringsClass {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> stringsKeeper = new ArrayList<>();
    private String content;

    public StringsClass() {
        content = "Один про Фому, другой про Ерёму.\n" +
                "1 рубит, а 2 в дудку трубит.\n" +
                "1сегодня лучше 2-х завтра.\n" +
                "Не узнавай друга в три дня, а узнавай в три года.\n" +
                "3 жены имел, от всех терпел.\n" +
                "3деньги в день, куда хочешь, туда и день.\n" +
                "Весна да осень – на дню погод8.\n" +
                "Не режь 8 овец – режь 1, но упитанную.";
    }

    public StringsClass(String content) {
        this.content = content;
    }

    public void createObjectWithDefaultText() {
        stringsKeeper.add(String.valueOf(new StringsClass()));
    }

    public void createObjectWithDifferentText() {
        stringsKeeper.add(String.valueOf(new StringsClass(scanner.nextLine())));
    }

    public void numericDeleter() {
        String pattern = "\\s+|,\\s*";
        String lastElement = stringsKeeper.get(stringsKeeper.size() - 1);
        // separating the text into words we bring in an array
        String[] separateTextToWords = lastElement.split(pattern);
        //System.out.println("Separated text: \n" + Arrays.toString(separateTextToWords));
        for (int i = 0; i < separateTextToWords.length; i++) {
            if (separateTextToWords[i].contains("1") ||
                    separateTextToWords[i].contains("2") ||
                    separateTextToWords[i].contains("3") ||
                    separateTextToWords[i].contains("4") ||
                    separateTextToWords[i].contains("5") ||
                    separateTextToWords[i].contains("6") ||
                    separateTextToWords[i].contains("7") ||
                    separateTextToWords[i].contains("8") ||
                    separateTextToWords[i].contains("9") ||
                    separateTextToWords[i].contains("0")) {
                System.out.println(separateTextToWords[i] + " : should be deleted");
                separateTextToWords[i] = null;
            }
        }
        // System.out.println(Arrays.toString(separateTextToWords));
        stringsKeeper.clear();
        // transfer the string data from Array, to Collection
        stringsKeeper.addAll(Arrays.asList(separateTextToWords));
        // deleting all null-elements from Collection
        stringsKeeper.removeAll(Collections.singleton(null));
        // output of result, text without numbers
        System.out.println("\nAll numbers and words with numbers was deleted from text, result is:");
        outputText();
    }

    public void outputText() {
        for (String s : stringsKeeper) {
            System.out.print(s + " ");
        }
    }

    @Override
    public String toString() {
        return content;
    }
}
