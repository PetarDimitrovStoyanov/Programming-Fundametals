import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstChar = sc.nextLine();
        String secondChar = sc.nextLine();
        String thirdChar = sc.nextLine();

        String result = firstChar + secondChar + thirdChar;
        System.out.println(result);
    }
}
