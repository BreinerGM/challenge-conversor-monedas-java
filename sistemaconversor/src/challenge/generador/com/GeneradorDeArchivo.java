package challenge.generador.com;

import challenge.datos.com.Conversion;
import challenge.datos.com.ConversionER;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneradorDeArchivo {
    public void guardarJson(List<Conversion> conversiones) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter("conversiones.json");
        escritura.write(gson.toJson(conversiones));
        escritura.close();
    }
}
