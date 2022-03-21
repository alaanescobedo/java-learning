/*
Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos,
pero sin usar el símbolo de multiplicación (*).

Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
 */

import java.util.Scanner;

public class Ex09_MultiplyTwoNumbersWithoutUsingOperator {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, absolutB;
        int result = 0;

        a = userInput("Enter number A (Multiplicand): ");
        b = userInput("Enter number B (Multiplier): ");

        absolutB = Math.abs(b);

        for (int i = 1; i <= absolutB; i++) {
            result += a;
        }

        result = (a > 0 && b < 0 || a < 0) ? -result : Math.abs(result);

        System.out.println("Result: " + a + " x " + b + " = " + result);

        Boolean tryAgain = checkIfTryAgain();

        if (tryAgain) main(args);

        System.exit(0);
    }

    private static int userInput(String message) {
        System.out.println(message);
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("You must enter a number");
            userInput(message);
        }
        return number;
    }

    private static Boolean checkIfTryAgain() {
        System.out.print("Try again?(Y/n): ");
        scanner.nextLine(); // consumes the input of '\n' entered in the previous scanner.nextInt()
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("Y") || answer.isEmpty();
    }
}
