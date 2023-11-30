import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeraArquivoJson {
    public void salvaJson (String endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter("cep.json");
        escrita.write(gson.toJson(endereco));
        escrita.close();
    }
}
