public class CriadorPrograma {

    // Atributos do Criador desse programa em Java
    private String nome;
    private String profissao;

    // Construtor
    public CriadorPrograma(String nome, String profissao) {
        this.nome = nome;
        this.profissao = profissao;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }

    // Métodos - Ações do próprio Desenvolvedor do programa
    public void assinatura() {
        System.out.println("\nEsse programa em Java foi desenvolvido por " + getNome() + "\nSou " + getProfissao() + "\nEspero que tenha gostado e entendido todos os conceitos de Programação Orientada a Objetos...");
    }


}
