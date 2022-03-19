import java.util.Scanner;

public class FuelTankSystem {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        userInput();
    }

    public static void userInput() {
        int fuelTankCapacity = 70;
        int currentFuelLevel = 0;

        try {
            System.out.println("Enter the current fuel level: ");
            currentFuelLevel = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.next();
            userInput();
            System.exit(0);
        }

        if (currentFuelLevel == fuelTankCapacity) {
            System.out.println("Full tank");
        } else if (currentFuelLevel < fuelTankCapacity && currentFuelLevel >= 60) {
            System.out.println("Almost full");
        } else if (currentFuelLevel < 60 && currentFuelLevel >= 40) {
            System.out.println("Tank in 3/4");
        } else if (currentFuelLevel < 40 && currentFuelLevel >= 35) {
            System.out.println("Tank in 1/2");
        } else if (currentFuelLevel < 35 && currentFuelLevel >= 20) {
            System.out.println("Enough fuel");
        } else if (currentFuelLevel < 20 && currentFuelLevel >= 1) {
            System.out.println("Insufficient fuel");
        } else if (currentFuelLevel == 0) {
            System.out.println("Empty tank");
        }
    }
}

/*
Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero también puede ser del tipo int.

- Si la capacidad actual es 70 litros: imprimir Estanque lleno
- Si está entre 60 y menor a 70: imprimir Estanque casi lleno
- Si está entre 40 y menor a 60: imprimir Estanque 3/4
- Si está entre 35 y menor a 40: imprimir Medio Estanque
- Si está entre 20 y menor a 35: imprimir Suficiente
- Si está entre 1 y menor a 20: imprimir Insuficiente
 */