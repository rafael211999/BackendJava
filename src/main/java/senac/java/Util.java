package senac.java;

import Services.Cadastros;
import Views.Imprimir;


public class Util {

    public static void chamadaCadastro(String opcao) {
        switch (opcao) {
            case "1":
                Cadastros.cadastroVendedor();
                break;
            case "2":
                Cadastros.cadastroCliente();
                break;
            case "3":
                Cadastros.cadastroProduto();
                break;
            case "4":
                break;
            default:
                System.out.println("Escolha uma das opções apresentadas");

        }
    }


    public static void finalizarOuContinuar(String cp, String myTela) {

        if (cp.equals("sim")) {
            System.out.println(" ");

            switch (myTela) {
                case "1":
                    Cadastros.cadastroVendedor();
                    break;
                case "2":
                    Cadastros.cadastroCliente();
                    break;
                case "3":
                    Cadastros.cadastroProduto();
                    break;
            }

        } else if (cp.equals("nao")){
            Imprimir.entradaOpcao();
        }

    }

}
