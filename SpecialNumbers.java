import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());


        for (int loop = 1; loop <= number; loop++) {
            int currentNum = loop;
            int sum = 0;
            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            boolean isSpecial = sum == 5 || sum == 7 || sum == 11;
            if (isSpecial) {
                System.out.println(String.format("%d -> True", loop));
            } else {
                System.out.println(String.format("%d -> False", loop));
            }
        }

    }
}
