import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLetter = sc.nextLine();
        String secondLetter = sc.nextLine();
        String thirdLetter = sc.nextLine();

        char firstChar = firstLetter.charAt(0);
        char secondChar = secondLetter.charAt(0);
        char thirdChar = thirdLetter.charAt(0);

        System.out.printf("%c %c %c", thirdChar, secondChar, firstChar);
    }
}
