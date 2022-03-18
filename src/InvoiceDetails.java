import java.util.Scanner;

public class InvoiceDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, details;
        float tax = 0.19f;
        double product1, product2;
        double subtotal, subtotalTax, total;

        name = details = "";
        product1 = product2 = 0.0;

        try {
            System.out.println("Enter the name of the invoice: ");
            name = scanner.nextLine();

            if (name.isBlank()) {
                scanner.close();
                throw new Exception();
            }

            System.out.println("Enter the price of the first product: ");
            product1 = scanner.nextDouble();
            System.out.println("Enter the price of the second product: ");
            product2 = scanner.nextDouble();

            scanner.close();
        } catch (Exception e) {
            System.out.println("Invalid input");
            main(args);
            System.exit(0);
        }

        subtotal = product1 + product2;
        subtotalTax = subtotal * tax;
        total = subtotal + subtotalTax;

        details = "The invoice \"" + name + "\" has a gross total of $" + String.format("%.2f", subtotal)
                + ", with a tax of $" + String.format("%.2f", subtotalTax) + ", and the total after tax is $"
                + String.format("%.2f", total) + ".";

        System.out.println(details);
    }

}

/*
 * La tarea consiste en crear una nueva clase con el método main llamada
 * DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la
 * factura utilizando la clase Scanner de la siguiente manera:
 * 
 * - Reciba el nombre de la factura o descripción, utilizar método nextLine()
 * para obtener el nombre de la factura con espacios.
 * - Reciba 2 precios de productos de tipo double, utilizar método nextDouble()
 * para obtener precios con decimales (,).
 * - Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
 * - Se pide mostrar en un solo String el nombre de la factura, el monto total
 * bruto (antes de impuesto), el impuesto y el monto total neto incluyendo
 * impuesto. Por ejemplo, el resultado podría ser algo así:
 * -- La factura producto de oficina tiene un total bruto de 134.78, con un
 * impuesto de 25.6082 y el monto después de impuesto es de 160.3882 --
 * 
 */