package senac.java;

import Services.Servidor;
import Views.Imprimir;


import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        Servidor api = new Servidor();


        api.ApiServer();
        Imprimir.entradaOpcao();

    }
}