package Services;

import Controllers.ProductController;
import Controllers.SalesPersonController;
import Controllers.UserController;
import Domain.Users;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;


public class Servidor {


    public void ApiServer() throws IOException {
        Users user = new Users();


        // Aqui eu estou criando o meu servidor. Istanciando o InetSocketAddress, passando a minha porta e o meu backlog
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);


        // Aqui é onde eu estou criando o meu EndPont, ou seja, o caminho para o meu servidor.
//        server.createContext("/api/teste", Servidor::chamar);
        server.createContext("/api/usuario", new UserController.UserHandler());
        server.createContext("/api/vendedor", new SalesPersonController.SalesPersonHandler());
        server.createContext("/api/produtos", new ProductController.ProductsHandler());


        server.setExecutor(null);
        server.start();
    }
    // Fim da criação do servidor!!

}


// Quando eu quiser fazer a chamada de uma classe que tem como parametro uma classe abstrata, preciso fazer a chamada da sequinte forma:
// EX: Nome da minha classe :: nome do meu metodo - // - Servidor::chamar;

// @Override: Serve para poder pegar o método que eu criei. Obs: Criar um método que já existe gera erro, a não ser que seja de uma classe abstrata ou interface
// nesse caso eu tenho que passar o override para poder reescrever o método.