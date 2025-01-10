import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {

    public Convertidor obtenerResultado(String moneda, double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/f1c33ece2571cbd9a21df0b8/pair/" + moneda + "/USD/" +  cantidad);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            // Obtener la moneda a convertir y la cantidad convertida
            var monedaAConvertir = new Gson().fromJson(response.body(), JsonObject.class).get("base_code").getAsString();
            var cantidadConvertida = new Gson().fromJson(response.body(), JsonObject.class).get("conversion_result").getAsDouble();
            // Redondear a dos decimales
            String formatDouble = String.valueOf(cantidadConvertida);
            cantidadConvertida = Double.parseDouble(formatDouble.substring(0, formatDouble.indexOf(".") + 3));
            return new Convertidor(monedaAConvertir, cantidadConvertida);
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar la API", e);
        }
    }

}
