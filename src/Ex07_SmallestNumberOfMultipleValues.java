import javax.swing.*;
import java.util.Scanner;

public class Ex07_SmallestNumberOfMultipleValues {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int totalNumbersToCompare = userInput("Enter the quantity of numbers you want to compare: ");

        if (totalNumbersToCompare < 10) {
            System.out.println("You need to compare at least 10 numbers");
            main(args);
            System.exit(0);
        }

        int min = findSmallest(totalNumbersToCompare);

        System.out.println("The smallest number is: " + min);

        if (min < 10) {
            System.out.println("The number " + min + " is smaller than 10");
        } else {
            System.out.println("The number " + min + " is equal or bigger than 10");
        }
    }

    private static int userInput(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    private static int findSmallest(int totalNumbersToCompare) {
        int min = Integer.MAX_VALUE;
        int number;

        for (int i = 0; i < totalNumbersToCompare; i++) {
            number = userInput("Enter the number " + (i + 1) + ": ");
            min = Math.min(number, min);
        }
        return min;
    }

}


/*
Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
- Usando la clase Scanner ingresar la cantidad de números a comparar
- Utilizando una sentencia for iterar el número de veces (ingresado) para pedir el número entero,
Se requiere:
- Calcular el menor número e imprimir el valor.
- Si el menor número es menor que 10, imprimir "El número menor es menor que 10!".
- Si no, imprimir "el número menor es igual o mayor que 10!".
 */