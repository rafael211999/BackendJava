package Views;

import Domain.Products;
import Domain.Salesperson;
import Domain.Users;
import senac.java.Util;

import java.util.Scanner;

public class Imprimir {
    static Scanner sc = new Scanner(System.in);
    static String opcao = " ";
    static String Cp = " ";
    static String myTela = " ";

    String salesperson = Salesperson.name;
    String user = Users.name;
    String product = Products.pName;

     static String valid =  " ";



    public static void entradaOpcao() {

        System.out.println("Bem vindo!!! ");
        System.out.println("Escolha uma das opções informando o número da opção: ");
        System.out.println(" 1 - Cadastrar vendedor.");
        System.out.println(" 2 - Cadastrar Cliente.");
        System.out.println(" 3 - Cadastrar Produto.");
        System.out.println(" 4 - Sair do sistema.");
        System.out.println(" ");
        opcao = sc.nextLine();

        Util.chamadaCadastro(opcao);
    }

    public static void telaCadastroVendedor() {
//

        System.out.println("_______ Cadastro do vendedor realizado _______");
        System.out.println(" ");
        System.out.println("Nome: " + Salesperson.name);
        System.out.println("Sobrenome: " + Salesperson.lastName);
        System.out.println("Telefone: " + Salesperson.phoneNamber);
        System.out.println("Cpf: " + Salesperson.cpf);
        System.out.println("Email: " + Salesperson.email);
        System.out.println("Endereço: " + Salesperson.address);
        System.out.println(" ");
        myTela = "1";
        valid = "vendedor" ;
        telaSairOuNao();
    }

    public static void telaCadastroCliente() {
//

        System.out.println("_______ Cadastro do cliente realizado _______");
        System.out.println(" ");
        System.out.println("Nome: " + Users.name);
        System.out.println("Sobrenome: " + Users.lastName);
        System.out.println("Idade: " + Users.age);
        System.out.println("Endereço: " + Users.address);
        System.out.println("Email: " + Users.email);
        System.out.println("Password: " + Users.password);
        System.out.println("Cpf: " + Users.cpf);
        System.out.println(" ");
        valid = "cliente";
        myTela = "2";
        telaSairOuNao();
    }

    public static void telaCadastroProduto() {
//

        System.out.println("_______ Cadastro do produto realizado _______");
        System.out.println(" ");
        System.out.println("Nome: " + Products.pName);
        System.out.println("Preço: " + Products.pPrice);
        System.out.println("Cor: " + Products.pColor);
        System.out.println("Descrição: " + Products.pDecription);
        System.out.println("Quantidade: " + Products.pQuantity);
        System.out.println("Imagem: " + Products.img);
        System.out.println(" ");
        myTela = "3";
        valid = "produto";
        telaSairOuNao();

    }

    public static void telaSairOuNao() {
        System.out.println(" ");
        System.out.println("Deseja fazer um novo cadastro de " + valid + " ?");
        System.out.println(" ");
        System.out.println("Digite sim para fazer um novo cadastro");
        System.out.println("Digite nao para voltar ao inicio");
        System.out.println(" ");
        System.out.println(" ");
        Cp = sc.nextLine();

        Util.finalizarOuContinuar(Cp, myTela);


    }

}
