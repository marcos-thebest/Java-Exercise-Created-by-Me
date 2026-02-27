public class Main {
  public static void main(String[] args) {
    Pessoa pessoaFisica1 = new Pessoa("Marcos Antonio Moreira", 26, "Masculino", 1.77, "361.211.588-11", "contato.marcosantonio2@gmail.com", 115.70, "Ter uma carreira promissora em Engenharia Civil.");

    pessoaFisica1.informacoesPessoa();
    pessoaFisica1.maiorIdade();

    System.out.println("\n=========================================================");

    Pessoa pessoaFisica2 = new Pessoa("Evandro Pereira Almeida", 68, "Masculino", 1.64, "243.675.443-98", "evandrobi47@hotmail.com", 85.20, "Voltar a presença de Deus!");

    pessoaFisica2.informacoesPessoa();
    pessoaFisica2.maiorIdade();

    System.out.println("\n=========================================================");

    Pessoa pessoaFisica3 = new Pessoa("Claudia de Jesus Almeida", 58, "Feminino", 1.56, "354.867.980-23", "claudiap1967@gmail.com", 75.90, "Conhecer o mundo inteiro viajando com a sua família.");

    pessoaFisica3.informacoesPessoa();
    pessoaFisica2.maiorIdade();

    System.out.println("\n=========================================================");

    Pessoa pessoaFisica4 = new Pessoa("Russell M. Nelson", 102, "Masculino", 1.84, "256.731.678-76", "russellmnelson@churchofjesuschrist.org", 83.20, "Ter a vida eterna");

    pessoaFisica4.informacoesPessoa();
    pessoaFisica4.maiorIdade();

    System.out.println("\n=========================================================");

    Pessoa pessoaFisica5 = new Pessoa("Emily Vitória Souza", 15, "Feminino", 1.66, "334.658.211-86", "emilyvic2010@gmail.com", 56.80, "Ter uma família feliz e estruturada!");

    pessoaFisica5.informacoesPessoa();
    pessoaFisica5.maiorIdade();

    System.out.println("\n=========================================================");

    CriadorPrograma criador = new CriadorPrograma("Marcos Vinicius de Jesus Almeida", "Desenvolvedor de Sistemas!");

    criador.assinatura();
  }

}