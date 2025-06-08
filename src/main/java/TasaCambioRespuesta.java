import java.util.Map;

public record TasaCambioRespuesta(String base_code, Map<String, Double> conversion_rates) {
}
