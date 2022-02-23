class Aluno{

    public String nome;
    public int idade;
    public int ra;
    public String telefone;
  
    public void fazAniversario( ){
      idade++;
    }
  
}

public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno joao = new Aluno();

        joao.nome = "Joao da Silva";
        joao.idade = 12;

    }
}
