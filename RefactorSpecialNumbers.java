import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
       // int counter = 0;

        for (int loop = 1; loop <= number; loop++) {
             int counter = loop;
            while (loop > 0) {
                sum += loop % 10;
                loop = loop / 10;
            }
            boolean isSpecial = false;
            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial){
                System.out.printf("%d -> True%n", counter);
            } else {
                System.out.printf("%d -> False%n", counter);
            }
           // System.out.printf("%d -> %b%n", counter, isSpecial);
            sum = 0;
            loop = counter;
        }


    }
}
