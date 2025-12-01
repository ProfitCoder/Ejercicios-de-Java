import java.util.Scanner;

public class SolicitudDescuentos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ==== Inicio: Captura de datos personales ====
        System.out.println("=== Ingreso de datos personales ===");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido 1: ");
        String apellido1 = sc.nextLine();

        System.out.print("Apellido 2: ");
        String apellido2 = sc.nextLine();

        System.out.print("Dirección: ");
        String direccion = sc.nextLine();

        System.out.print("DNI: ");
        String dni = sc.nextLine();

        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        System.out.print("Tutor legal (si aplica): ");
        String tutor = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Precio base: ");
        double precio = sc.nextDouble();

        // ==== Fase de Descuentos ====

        // 1. Mayores de 65
        if (edad > 65) {
            precio = precio * 0.80;    // Descuento 20%
            System.out.println("Descuento aplicado: mayor de 65 años (20%).");
        } else {

            // 2. ¿Es estudiante universitario?
            System.out.print("¿Es estudiante universitario? (s/n): ");
            char estudiante = sc.next().toLowerCase().charAt(0);

            if (estudiante == 's') {
                precio = precio * 0.75;   // 25% descuento
                System.out.println("Descuento aplicado: estudiante universitario (25%).");
            } else {

                // 3. ¿Es familiar de un estudiante?
                System.out.print("¿Es familiar de un estudiante? (s/n): ");
                char familiar = sc.next().toLowerCase().charAt(0);

                if (familiar == 's') {
                    precio = precio * 0.95;  // 5% descuento
                    System.out.println("Descuento aplicado: familiar de estudiante (5%).");
                }
            }
        }

        // ==== Final ====
        System.out.println("\n=== Solicitud enviada ===");
        System.out.println("Precio final con descuentos: " + precio);

        sc.close();
    }
}
