import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class Convertidor {
    static DecimalFormat formato = new DecimalFormat("#,##0.00");
    public static void convertirMoneda(
        String valorOrigen,
        String valorDestino,
        Scanner scanner,
        List<HistorialConversiones> historial
    ) {
            System.out.println("Ingresa la cantidad a convertir:");
            double cantidad = scanner.nextDouble();

            double tasa =ObtenerTasa.obtenerTasaCambio(valorOrigen,valorDestino);
            double resultado = cantidad * tasa;

            System.out.println(cantidad + " " + valorOrigen
                    + " es igual a " + formato.format(resultado) + " " + valorDestino);

        historial.add(new HistorialConversiones(
                valorOrigen, valorDestino, cantidad, tasa, resultado));
    }

}
