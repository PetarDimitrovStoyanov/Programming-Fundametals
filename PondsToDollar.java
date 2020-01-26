import java.util.Scanner;

public class PondsToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pounds = Double.parseDouble(sc.nextLine());

        double usd = pounds * 1.31;
        System.out.printf("%.3f", usd);
    }
}
