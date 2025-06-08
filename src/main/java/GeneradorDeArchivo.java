import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneradorDeArchivo {
    public static void guardarJson(List<HistorialConversiones> historial){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            FileWriter archivo = new FileWriter("historial_conversiones.txt");
            archivo.write(gson.toJson(historial));
            archivo.close();
        } catch (IOException e) {
            throw new RuntimeException("Error al crear el archivo");
        }


    }
}
