import java.util.Scanner;

public class NameHandlingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1, name2, name3;
        char separator = '_';

        name1 = name2 = name3 = "";

        try {
            System.out.print("Enter first name: ");
            name1 = transformName(scanner.nextLine());
            System.out.print("Enter second name: ");
            name2 = transformName(scanner.nextLine());
            System.out.print("Enter third name: ");
            name3 = transformName(scanner.nextLine());

            scanner.close();
        } catch (Exception e) {
            System.out.println("Invalid input!");
            main(args);
            System.exit(0);
        }

        System.out.println("\n" + name1 + separator + name2 + separator + name3);
    }

    private static String transformName(String str) {
        return str.toUpperCase().charAt(1) + "." + str.toLowerCase().substring(str.length() - 2);
    }
}

/*
 * La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la
 * siguiente manera:
 * 
 * - Se requiere desarrollar un programa que reciba 3 nombres como argumentos de
 * línea de comandos.
 * - Se pide por cada nombre de la persona una nueva variable del tipo String al
 * tomar el segundo carácter, pero convertido en mayúscula y se le concatena un
 * punto y los dos últimos caracteres de la persona.
 * -- Por ejemplo para Andres debe quedar como: N.es
 * - Debe imprimir como resultado los tres nuevos nombres separado con guion
 * bajo (como una única variable).
 * -- Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe
 * podría ser: N.es_A.ia_E.pe
 */