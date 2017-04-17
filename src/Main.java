import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cont;
        do {
            System.out.print("Enter a sentence: ");
            String sentence = in.nextLine();
            System.out.println("Your sentence has " + countWords(sentence.trim()) + " words.");
            System.out.println("Would you like to continue? (y/n)");
            cont = in.nextLine();
        } while (cont.equalsIgnoreCase("y"));

    }

    public static int countWords(String str) {
        int count = 1;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }
}
