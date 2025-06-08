import java.io.IOException;;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double cantidad = 0;
        String valorOrigen;
        String valorDestino;
        double tasa;
        double resultado;
        List<HistorialConversiones> historial = new ArrayList<>();


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
                    valorOrigen = "USD";
                    valorDestino = "COP";
                    System.out.println("Vas a convertir de " + valorOrigen + " a " + valorDestino);
                    Convertidor.convertirMoneda(valorOrigen, valorDestino, scanner, historial);
                    break;
                case 2:
                    valorOrigen = "COP";
                    valorDestino = "USD";
                    System.out.println("Vas a convertir de " + valorOrigen + " a " + valorDestino);
                    Convertidor.convertirMoneda(valorOrigen, valorDestino, scanner, historial);
                    break;
                case 3:
                    valorOrigen = "EUR";
                    valorDestino = "COP";
                    System.out.println("Vas a convertir de " + valorOrigen + " a " + valorDestino);
                    Convertidor.convertirMoneda(valorOrigen, valorDestino, scanner, historial);
                    break;
                case 4:
                    valorOrigen = "COP";
                    valorDestino = "EUR";
                    System.out.println("Vas a convertir de " + valorOrigen + " a " + valorDestino);
                    Convertidor.convertirMoneda(valorOrigen, valorDestino, scanner, historial);
                    break;
                case 5:
                    System.out.println(
                            "¿Deseas guardar el historial de conversiones en un archivo? (s/n)");
                    String respuesta = scanner.next();
                    if (respuesta.equalsIgnoreCase("s")) {
                        GeneradorDeArchivo.guardarJson(historial);
                        System.out.println(
                                "Historial guardado exitosamente en 'historial_conversiones.txt'");
                    } else {
                        System.out.println("No se guardó el historial.");
                    }
                    System.out.println("¡Adiós!");

                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        scanner.close();
    }
}

