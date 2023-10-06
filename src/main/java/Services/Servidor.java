package Services;

import Domain.Products;
import Domain.Salesperson;
import Domain.Users;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;


import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;


public class Servidor {


    public void ApiServer() throws IOException {
        Users user = new Users();


        // Aqui eu estou criando o meu servidor. Istanciando o InetSocketAddress, passando a minha porta e o meu backlog
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);


        // Aqui é onde eu estou criando o meu EndPont, ou seja, o caminho para o meu servidor.
//        server.createContext("/api/teste", Servidor::chamar);
        server.createContext("/api/teste", new UserHandler());
        server.createContext("/api/vendedor", new SalesPersonHandler());
        server.createContext("/api/produtos", new ProductsHandler());


        server.setExecutor(null);
        server.start();
    }

    public static void chamar(HttpExchange exchenge) throws IOException {

        if ("GET".equals(exchenge.getRequestMethod())) {
            String response = Users.name + " Rafael alves " + Users.lastName;
            exchenge.sendResponseHeaders(200, response.getBytes().length);


            // Aqui é onde vai ser enviado.
            // Aqui estou criando uma variavel do tipo Output, que vai receber de exchange. O getResponseBytes, vai criar um corpo de resposta.
            OutputStream os = exchenge.getResponseBody();
            //Aqui ele vai recerber tudo de response e vai criar pegando todos os bytes um corpo de resposta. Isso evita erros.
            os.write(response.getBytes());
            // Aqui eu estou fechando minha porta que está aberta. SEMPRE TENHO QUE FECHAR AS PORTAS QUE ESTÃO ABERTAS...
            os.close();
        } else {
            // TRATAMENTO DE ERRO
            String response = "Método não implementado";
            // Aqui eu estou fazendo o tratramento, passando o status code e a minha resposta como parametro.
            exchenge.sendResponseHeaders(405, response.getBytes().length);
            OutputStream os = exchenge.getResponseBody(); // Criar um espaço para poder enviar e pegar os dados;
            os.write(response.getBytes()); // Escrever e enviar;
            os.close(); // Fechar;
        }

    }


    class UserHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Esse e a rota de usuario";
            enviarResponse(exchange, response);
        }
    }


    class SalesPersonHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Esse e a rota de vendedor";
            enviarResponse(exchange, response);
        }

    }

    class ProductsHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Esse e a rota de produto";
            enviarResponse(exchange, response);
        }

    }


    public static void enviarResponse(HttpExchange exchenge, String response) throws IOException {
        if ("GET".equals(exchenge.getRequestMethod())) {
            exchenge.sendResponseHeaders(200, response.getBytes().length);

            OutputStream os = exchenge.getResponseBody();
            os.write(response.getBytes());
            os.close();

        }


    }


}


// Quando eu quiser fazer a chamada de uma classe que tem como parametro uma classe abstrata, preciso fazer a chamada da sequinte forma:
// EX: Nome da minha classe :: nome do meu metodo - // - Servidor::chamar;

// @Override: Serve para poder pegar o método que eu criei. Obs: Criar um método que já existe gera erro, a não ser que seja de uma classe abstrata ou interface
// nesse caso eu tenho que passar o override para poder reescrever o método.