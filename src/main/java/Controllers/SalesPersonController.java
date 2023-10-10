package Controllers;

import Domain.Salesperson;
import Domain.Users;
import Services.ResponseEndPoints;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.json.JSONObject;

import java.io.IOException;


public class SalesPersonController {
    static ResponseEndPoints res = new ResponseEndPoints();
    static Salesperson salesperson = new Salesperson();
    static JSONObject responseJason = new JSONObject();

    public static class SalesPersonHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {





            responseJason.put("nome", salesperson.name);
            responseJason.put("sobrenome", salesperson.lastName);
            responseJason.put("telefone", salesperson.phoneNamber);
            responseJason.put("cpf", salesperson.cpf);
            responseJason.put("email", salesperson.email);
            responseJason.put("endereço", salesperson.address);




            if ("GET".equals(exchange.getRequestMethod())) {
//                response = "Esse e a rota de vendedor - GET";
                res.enviarResponseJson(exchange, responseJason);
            } else if ("POST".equals(exchange.getRequestMethod())) {
//                response = "Esse e a rota de vendedor - POST";
                res.enviarResponseJson(exchange, responseJason);
            } else if ("PUT".equals(exchange.getRequestMethod())) {
//                response = "Esse e a rota de vendedor - PUT";
                res.enviarResponseJson(exchange, responseJason);
            } else if ("DELETE".equals(exchange.getRequestMethod())) {
//                response = "Esse e a rota de vendedor - DELETE";
                res.enviarResponseJson(exchange, responseJason);
            } else {
//                response = "Esse e a rota de vendedor - MÉTODO NÃO ENCONTRADO\n" +
//                        "O método utilizado foi: " + exchange.getRequestMethod();
                res.enviarResponseJson(exchange,responseJason);
            }



        }

    }

}
