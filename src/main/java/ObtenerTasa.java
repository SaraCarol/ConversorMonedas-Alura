import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ObtenerTasa {
    private static final String API_KEY = "bcc463d48efee90e5911e510";
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Gson gson = new Gson();

    public static double obtenerTasaCambio(String base, String destino) {
        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + base;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url)).build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                TasaCambioRespuesta tasaRespuesta = gson.fromJson(response.body(), TasaCambioRespuesta.class);
                return tasaRespuesta.conversion_rates().get(destino);
            } else {
                System.out.println("Error en la consulta. Código HTTP: " + response.statusCode());
                return 0.0;
            }
        } catch (Exception e) {
            throw new RuntimeException("Ha ocurrido un error inesperado");
        }

    }
}
