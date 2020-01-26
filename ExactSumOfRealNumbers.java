import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        double sum = 0.00;
        BigDecimal result = new BigDecimal(0);

        for (int loop = 1; loop <= number; loop++) {
            BigDecimal digit = new BigDecimal(sc.nextLine());
            result = result.add(digit);
        }

        System.out.print(result);

    }
}
