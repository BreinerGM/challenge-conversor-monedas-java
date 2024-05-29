package challenge.conversor.com;

import challenge.datos.com.ConversionER;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    public ConversionER conversorMon(String monedaBase, String monedaDestino, int cantidad){
        String direccion = "https://v6.exchangerate-api.com/v6/71b55560c03fd8e681737ed3/pair/"+monedaBase+"/"+monedaDestino+"/"+cantidad;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(),ConversionER.class);
            } catch (Exception e) {
                throw new RuntimeException("No pudo hacerse la conversion");
            }
    }
}
