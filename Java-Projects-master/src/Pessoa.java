public class Pessoa {

    // Atributo
    private String nome;
    private int idade;
    private String genero;
    private double altura;
    private String cpf;
    private String email;
    private double peso;
    private String sonho;

    // Construtor da minha classe Pessoa
    public Pessoa(String nome, int idade, String genero, double altura, String cpf, String email, double peso, String sonho) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.altura = altura;
        this.cpf = cpf;
        this.email = email;
        this.peso = peso;
        this.sonho = sonho;
    }

    // Getters and Sstters - Encapsulamento
    // Getter serve para pegar/ler o valor de um Atributo
    // Setter serve para definir/alterar o valor de um Atributo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSonho() {
        return sonho;
    }

    public void setSonho(String sonho) {
        this.sonho = sonho;
    }

    // Métodos - Ação ou comportamento que pertence a uma classe
    public void informacoesPessoa() {
        System.out.println("\nNOME: " + getNome() + "\nIDADE: " + getIdade() + " anos de idade." + "\nGÊNERO: " + getGenero() + "\nALTURA: " + getAltura() + " metros." + "\nCPF: " + getCpf() + "\nE-MAIL: " + getEmail() + "\nPESO: " + getPeso() + "kg" + "\nSONHO: " + getSonho());
    }

    public void maiorIdade() {
        if (getIdade() >= 18) {
            System.out.println(getNome() + " é maior de idade.");
        } else {
            System.out.println(getNome() + " é menor de idade.");
        }
    }
}
