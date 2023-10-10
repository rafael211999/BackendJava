package Controllers;

import Domain.Users;
import Services.ResponseEndPoints;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.json.JSONObject;

import java.io.IOException;


public class UserController {
    static ResponseEndPoints res = new ResponseEndPoints();

    static Users user = new Users();

    static JSONObject responseJason = new JSONObject();

    //Aqui é possivel colocar uma classe dentro da outra, porque eu estou utilizando a classe para poder modificar uma classe abstrata.
    public static class UserHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {



            responseJason.put("nome", user.name);
            responseJason.put("sobrenome", user.lastName);
            responseJason.put("endereço", user.address);
            responseJason.put("cpf", user.cpf);
            responseJason.put("email", user.email);
            responseJason.put("idade", user.age);

            if ("GET".equals(exchange.getRequestMethod())) {
//                response = "Esse e a rota de usuario - GET";
                res.enviarResponseJson(exchange, responseJason);
            } else if ("POST".equals(exchange.getRequestMethod())) {
//                response = "Esse e a rota de usuario - POST";
                res.enviarResponseJson(exchange, responseJason);
            } else if ("PUT".equals(exchange.getRequestMethod())) {
//                response = "Esse e a rota de usuario - PUT";
                res.enviarResponseJson(exchange, responseJason);
            } else if ("DELETE".equals(exchange.getRequestMethod())) {
//                response = "Esse e a rota de usuario - DELETE";
                res.enviarResponseJson(exchange, responseJason);
            } else {
//                responseJason = "Esse e a rota de usuario - MÉTODO NÃO ENCONTRADO\n" +
//                        "O método utilizado foi: " + exchange.getRequestMethod();
                res.enviarResponseJson(exchange, responseJason);
            }

            res.enviarResponseJson(exchange, responseJason);
        }
    }
}
