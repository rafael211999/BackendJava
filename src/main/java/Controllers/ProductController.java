package Controllers;

import Domain.Products;
import Services.ResponseEndPoints;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.json.JSONObject;

import java.io.IOException;


public class ProductController {
    static ResponseEndPoints res = new ResponseEndPoints();
    static JSONObject responseJson = new JSONObject();

    static Products products = new Products();

    public static class ProductsHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {

            responseJson.put("nome", products.pName);
            responseJson.put("sobrenome", products.pPrice);
            responseJson.put("telefone", products.pColor );
            responseJson.put("cpf", products.pDecription);
            responseJson.put("email", products.pQuantity);



            if ("GET".equals(exchange.getRequestMethod())) {
//                response = "Esse e a rota de produtos - GET";
                res.enviarResponseJson(exchange, responseJson);
            } else if ("POST".equals(exchange.getRequestMethod())) {
//                response = "Esse e a rota de produtos - POST";
                res.enviarResponseJson(exchange, responseJson);
            } else if ("PUT".equals(exchange.getRequestMethod())) {
//                response = "Esse e a rota de produtos - PUT";
                res.enviarResponseJson(exchange, responseJson);
            } else if ("DELETE".equals(exchange.getRequestMethod())) {
//                response = "Esse e a rota de produtos - DELETE";
                res.enviarResponseJson(exchange, responseJson);
            } else {
//                response = "Esse e a rota de produtos - MÉTODO NÃO ENCONTRADO.\n" +
//                        " O método utilizado foi: " + exchange.getRequestMethod();
                res.enviarResponseJson(exchange, responseJson);
            }


        }

    }
}
