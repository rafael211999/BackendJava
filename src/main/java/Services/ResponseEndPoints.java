package Services;

import com.sun.net.httpserver.HttpExchange;
import org.json.JSONObject;

import java.io.IOException;
import java.io.OutputStream;

public class ResponseEndPoints {
    public static void enviarResponse(HttpExchange exchange, String response) throws IOException {
        exchange.sendResponseHeaders(200, response.getBytes().length);
        exchange.getResponseHeaders().set("Content-Type", "text/plain");

        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }


    //Aqui eu estou criando a forma de aceitar o JSON.
    public static void enviarResponseJson(HttpExchange exchange, JSONObject response) throws IOException {
        //Aqui eu estou passando para o front que ele vai esperar receber um JSON.
        exchange.getResponseHeaders().set("Content-Type", "application/json");

        // Aqui eu estou criando uma variavel que vai receber um array com varios caracteres.
        // Despois estou transformando o valor da resposta que vem em JSON em uma unica String,
        // Depois vai esperar chegar todos os bytes, o sitema ele vai ler um por um e vai jogar cada caractere em uma posição do array
        // No final estou passando o tipo de caractere, fazendo assim ele reconhecer os acentes e etc... (UTF-8);
        byte[] responseBytes = response.toString().getBytes("UTF-8");
        exchange.sendResponseHeaders(200, responseBytes.length);

        OutputStream os = exchange.getResponseBody();
        os.write(responseBytes);
        os.close();
    }
}
