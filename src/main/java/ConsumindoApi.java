import Exceptions.caracteresExeption;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;



public class ConsumindoApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner cep = new Scanner(System.in);


        System.out.println("Insira um cep válido: ");
        String busca = cep.nextLine();
        String endereco = "https://viacep.com.br/ws/"+busca+"/json/";

        if (busca.length() < 8 | busca.length() > 8){
            throw new caracteresExeption("ERRO: Verifique se o cep há 8 caracteres");
        }


try {


    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();

    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    String json = response.body();
    System.out.println(json);
} catch (caracteresExeption e){
    System.out.println(e.getMessage());
}
    }
}
