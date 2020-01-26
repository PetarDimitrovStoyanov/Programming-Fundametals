import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();

        int parsedLetter = letter.charAt(0);

        if (parsedLetter >= 65 && parsedLetter <= 90){
            System.out.print("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
