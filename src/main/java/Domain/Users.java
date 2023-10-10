package Domain;

public class Users {
    int id;
    public static String name = "";
    public static String lastName = "";
    public static String address = "";
    public static String email = "";
    public static String password = "";
    public static String cpf = "";
    public static int age = 0;

    //Aqui eu estou criando o meu construtor.
    // O construtor permite criar uma nova instancia, para não perder o meu espaço em memória que está sendo utilizado;
    public Users() {
    }

    public Users(String name, String lastName, String address, String email, String password, String cpf, int age) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.age = age;
    }


    // Aqui eu estou criando os meus Getters e Setters, que serve para poder gravar as informações em uma nova variavel;

    public String getName() {
        return name;
    }

    ;

    public void setName(String name) {
        // O this garante que ele vai pegar a instancia correta e atribuir o valor no local correto.
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    ;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getAddress() {
        return address;
    }

    ;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }


}
