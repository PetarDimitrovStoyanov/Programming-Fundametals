import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String delimiter = sc.nextLine();

        String result = String.format("%s%s%s", firstName, delimiter, lastName);
        System.out.println(result);
    }
}
