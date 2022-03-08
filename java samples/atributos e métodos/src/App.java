class Aluno{

    public String nome;
    public int idade;
    public double media;

    public void fazAniversario( ){
      idade++;
    }

    public double calculateMedia(double nota1, double nota2){
        media = (nota1 + nota2)/2.0;
        return media;
    }

}

public class App {

    public static void main(String[] args) throws Exception {
        
        // criando um aluno (objeto)
        Aluno joao = new Aluno();

        joao.nome = "Joao da Silva";
        joao.idade = 12;

        System.out.println("Nome = " + joao.nome);
        System.out.println("Idade = " + joao.idade);

        joao.fazAniversario();

        System.out.println("---------------");
        System.out.println("Nome = " + joao.nome);
        System.out.println("Idade = " + joao.idade);

        System.out.println("---------------");
        System.out.println("Joao tira 7.0 na primeira prova");
        System.out.println("Joao tira 9.0 na primeira prova");


        System.out.println("A media de joao é " + joao.calculateMedia(7.0, 9.0));

    }
}
