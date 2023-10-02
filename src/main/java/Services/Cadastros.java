package senac.java.Services;

import senac.java.Domain.Products;
import senac.java.Domain.Salesperson;
import senac.java.Domain.Stores;
import senac.java.Domain.Users;
import senac.java.Views.Imprimir;

import java.util.Scanner;

public class Cadastros {
    static Salesperson salesperson = new Salesperson();
    static Users users = new Users();
    static Products products = new Products();
    static Scanner sc = new Scanner(System.in);

    public static void cadatroVendedor() {
        System.out.println(" ");
        System.out.println("Digite o nome do vendedor que deseja cadastrar: ");
        salesperson.name = sc.nextLine();
//
        System.out.println("Digite o sobrenome do vendedor: ");
        salesperson.lastName = sc.nextLine();

        System.out.println("Digite o telefone do vendedor: ");
        salesperson.phoneNamber = sc.nextLine();

        System.out.println("Digite o cpf do vendedor: ");
        salesperson.cpf = sc.nextLine();

        System.out.println("Digite o Email do vendedor: ");
        salesperson.email = sc.nextLine();

        System.out.println("Digite o endereço do vendedor: ");
        salesperson.address = sc.nextLine();

        Imprimir.telaCadastroVendedor();

    }

    public static void cadastroCliente() {
        System.out.println(" ");
        System.out.println("Digite o nome do cliente que deseja cadastrar: ");
        users.name = sc.nextLine();

        System.out.println("Digite o sobrenome do cliente que deseja cadastrar: ");
        users.lastName = sc.nextLine();

        System.out.println("Digite o Endereço do cliente que deseja cadastrar: ");
        users.address = sc.nextLine();

        System.out.println("Digite o Email do cliente que deseja cadastrar: ");
        users.email = sc.nextLine();

        System.out.println("Digite a senha do cliente que deseja cadastrar: ");
        users.password = sc.nextLine();

        System.out.println("Digite o CPF do cliente que deseja cadastrar: ");
        users.cpf = sc.nextLine();

        System.out.println("Digite a idade do cliente que deseja cadastrar: ");
        users.age = Integer.parseInt(sc.nextLine());

        Imprimir.telaCadastroCliente();
    }

    public static void cadastroProduto() {
        System.out.println(" ");
        System.out.println("Digite o nome do produto que deseja cadastrar: ");
        products.pName = sc.nextLine();

        System.out.println("Digite o preço do produto que deseja cadastrar: ");
        products.pPrice = sc.nextLine();

        System.out.println("Digite a cor do produto que deseja cadastrar: ");
        products.pColor = sc.nextLine();

        System.out.println("Digite uma descrição para o produto que deseja cadastrar: ");
        products.pDecription = sc.nextLine();

        System.out.println("Digite a quantidade do produto que deseja cadastrar: ");
        products.pQuantity = Integer.parseInt(sc.nextLine());

        Imprimir.telaCadastroProduto();
    }


}
