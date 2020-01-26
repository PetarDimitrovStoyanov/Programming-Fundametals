import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BigDecimalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        BigDecimal number2 = new BigDecimal(a);
        BigDecimal number3 = new BigDecimal(4444444444.44);
        number3 = (number3.add(number2));
        System.out.printf("%s%n", number3);
        number3 = number3.multiply(number2);
        System.out.println(number3);
        number3 = number3.subtract(number2);
        System.out.println(number3);
        number3 = number3.divide(number2, RoundingMode.CEILING);
        System.out.println(number3);
    }
}
