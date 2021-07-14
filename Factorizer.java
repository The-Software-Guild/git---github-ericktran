import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("ALL")

public class Factorizer {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        String numberInput;
        ArrayList<Integer> factors;

        System.out.print("What number would you like to factor: ");
        numberInput = inputReader.nextLine();
        int number = Integer.parseInt(numberInput);
        factors = getFactors(number);

        System.out.println("Factors of " + numberInput + " are: ");
        factors.forEach((n) -> System.out.print(n + " "));
        System.out.println();
        System.out.println(numberInput + " has " + factors.size() + " factors.");

        System.out.print(numberInput + " is");
        if (!checkPerfectNumber(factors))
            System.out.print(" NOT");
        System.out.println(" a perfect number.");

        System.out.print(numberInput + " is");
        if (!(factors.size() == 2))
            System.out.print(" NOT");
        System.out.println(" a prime number.");
    }

    public static ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factors = new ArrayList();
        for (int i = 1; i <= number; i++){
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    public static boolean checkPerfectNumber(ArrayList<Integer> factors) {
        int sum = 0;
        for (int i = 0; i < factors.size() - 1; i++) {
            sum += factors.get(i);
        }
        if (sum == factors.get(factors.size() - 1))
            return true;
        else
            return false;
    }
}