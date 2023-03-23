import java.util.Scanner;

public class Factors {

    public static void factors(int numberForFactors) {

        for (int factor = 1; factor <= numberForFactors; factor++) {
            if (numberForFactors % factor == 0) {
                System.out.println(factor);
            }
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number please: ");

        int numberForFactors = input.nextInt();
        factors(numberForFactors);
    }
}
