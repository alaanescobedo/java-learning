/*
Pedir 20 notas finales de alumnos en una escala de 1 a 7
Manejar decimales en las notas (double).
- Mostrar el promedio de las notas mayores a 5
- Mostrar el promedio de notas inferiores a 4
- Mostrar la cantidad de notas 1,
- Mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas)
y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
 */

import java.util.Scanner;

public class Ex08_StudentGradeSystem {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfStudents = 20;
        int countGradeLowerThan4 = 0;
        int countGradeHigherThan5 = 0;
        int countGradeEquals1 = 0;
        double noteGrade;
        double gradePointAverage;
        double totalGrades = 0;
        double totalGradeLowerThan4 = 0;
        double totalGradeHigherThan5 = 0;

        for (int i = 1; i <= numberOfStudents; i++) {
            noteGrade = userInput("Enter the grade of the note of the student number " + (i));

            if (noteGrade == 1) countGradeEquals1++;
            else if (noteGrade < 4) {
                countGradeLowerThan4++;
                totalGradeLowerThan4 += noteGrade;
            } else if (noteGrade > 5) {
                countGradeHigherThan5++;
                totalGradeHigherThan5 += noteGrade;
            }

            totalGrades += noteGrade;
        }

        gradePointAverage = totalGrades / numberOfStudents;

        System.out.println("===========================================================");
        System.out.println("Total of students: " + numberOfStudents);

        System.out.println("= Count of grades equals to 1: " + countGradeEquals1);

        System.out.println("= Count of grades higher than 5: " + countGradeHigherThan5);
        System.out.println("The average of grades higher than 5 is: " + totalGradeHigherThan5 / countGradeHigherThan5);

        System.out.println("= Count of grades lower than 4: " + countGradeLowerThan4);
        System.out.println("The average of grades lower than 4 is: " + totalGradeLowerThan4 / countGradeLowerThan4);

        System.out.println("The total average is: " + gradePointAverage);
        System.out.println("===========================================================");

    }

    private static double userInput(String message) {
        System.out.println(message);
        double noteGrade = scanner.nextDouble();

        if (noteGrade == 0) {
            System.out.println("Error, the program will be terminated");
            System.exit(0);
        } else if (noteGrade < 1 || noteGrade > 7) {
            System.out.println("The grade must be between 1 and 7");
            userInput(message);
            //System.exit(0);
        }

        return noteGrade;
    }
}


