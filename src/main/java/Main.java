import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5){
            System.out.println("***********************************");
            System.out.println("=== Conversor de Monedas ===");
            System.out.println("1. USD a COP");
            System.out.println("2. COP a USD");
            System.out.println("3. EUR a COP");
            System.out.println("4. COP a EUR");
            System.out.println("5. Salir");
            System.out.println("***********************************");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Vas a convertir de USD a COP");
                    break;
                case 2:
                    System.out.println("Vas a convertir de COP a USD");
                    break;
                case 3:
                    System.out.println("Vas a convertir de EUR a COP");
                    break;
                case 4:
                    System.out.println("Vas a convertir de COP a EUR");
                    break;
                case 5:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        scanner.close();
    }
}

