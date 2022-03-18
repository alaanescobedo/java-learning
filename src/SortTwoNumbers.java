import java.util.Scanner;

public class SortTwoNumbers {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        userInput();
    }

    public static void userInput() {
        int numberA = 0, numberB = 0;
        String result;

        System.out.println("Enter number A: ");
        numberA = scanner.nextInt();
        System.out.println("Enter number B: ");
        numberB = scanner.nextInt();

        result = numberA > numberB ? numberA + " " + numberB : numberB + " " + numberA;

        System.out.println("Result: " + result);
    }
}

/*
El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
Podría ser utilizando operador ternario.
 */