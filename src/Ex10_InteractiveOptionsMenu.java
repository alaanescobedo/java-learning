import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/*
Para la tarea se requiere un menú para administrar a los productos con las opciones: actualizar, eliminar, crear, listar y salir.
Para la clase con el método main vamos a contar con un menú para poder seleccionar el tipo de operación,
Puede ser con la clase Scanner indicando una lista con las opciones, cada opción asociada a un número.
¡O bien! Otra forma mucho mejor seria usando la clase JOptionPane para un menú con interfaces gráficas.

- Según el número ingresado usar un if o switch para implementar cada una de las operaciones y salir.
- Dentro de cada sentencia o switch imprimir un texto relacionado con la opción, por ejemplo para actualizar:
    JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
- Usar un do while para iterar hasta que la opción sea salir, cada vez que se selecciona una operación distinta a salir.
- Al finalizar con dicha operación debe volver al menú para continuar con otra,
- al finalizar con la opción "salir" se debe mostrar el mensaje "Haz salido con éxito!", y finalizar el programa.
 */
public class Ex10_InteractiveOptionsMenu {
    public static void main(String[] args) {
        int optionIndex = 0;
        Map<String, Integer> options = new HashMap<>();

        options.put("Update", 1);
        options.put("Delete", 2);
        options.put("Create", 3);
        options.put("List", 4);
        options.put("Exit", 5);

        Object[] optionsArray = options.keySet().toArray();

        do {
            Object option = askOptions(optionsArray);

            if (option == null) {
                JOptionPane.showMessageDialog(null, "You must select an option");
            } else {
                optionIndex = options.get(option.toString());

                performSwitchOperation(optionIndex);
            }
        } while (optionIndex != 5);
    }

    private static Object askOptions(Object[] optionsArray) {
        return JOptionPane.showInputDialog(
                null,
                "Select an option",
                "Options",
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionsArray,
                optionsArray[0]
        );
    }

    private static void performSwitchOperation(int optionIndex) {
        switch (optionIndex) {
            case 1 -> JOptionPane.showMessageDialog(null, "User updated correctly");
            case 2 -> JOptionPane.showMessageDialog(null, "User deleted correctly");
            case 3 -> JOptionPane.showMessageDialog(null, "User created correctly");
            case 4 -> JOptionPane.showMessageDialog(null, "User listed correctly");
            case 5 -> {
                JOptionPane.showMessageDialog(null, "You have exited correctly");
                System.exit(0);
            }
            default -> JOptionPane.showMessageDialog(null, "You must select an option");
        }
    }
}
