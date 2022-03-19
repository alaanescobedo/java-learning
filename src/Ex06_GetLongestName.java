import javax.swing.*;

public class Ex06_GetLongestName {
    public static void main(String[] args) {
        userInput();
    }

    private static void userInput() {
        String fullName1 = JOptionPane.showInputDialog("Enter fullName1 (name lastname): ");
        String fullName2 = JOptionPane.showInputDialog("Enter fullName2 (name lastname): ");
        String fullName3 = JOptionPane.showInputDialog("Enter fullName3 (name lastname): ");

        String name1 = fullName1.split(" ")[0];
        String name2 = fullName2.split(" ")[0];
        String name3 = fullName3.split(" ")[0];

        String longestName = getLongestName(name1, name2, name3);

        JOptionPane.showMessageDialog(null, "The longest name is: " + longestName);
    }

    private static String getLongestName(String name1, String name2, String name3) {
        String longestName = name1.length() > name2.length() ? name1 : name2;
        longestName = longestName.length() > name3.length() ? longestName : name3;
        return longestName;
    }
}

/*
Obtener el nombre más largo de tres personas, según los siguientes requerimientos
- Mediante el teclado pedir tres nombres completos (nombre + apellido) usando la clase JOptionPane y método showInputDialog().
- Calcular e imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
- Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el índice cero accedemos al nombre de la persona.

-- Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."

** Restricción NO usar loops en el desarrollo de la tarea. **
 */
