class Aluno {

    private String nome;
    private int matricula;
    private double nota1, nota2;

    public Aluno(String nome, int matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        nota1 = 0.0;
        nota2 = 0.0;
    }
    
    public String getNome(){
        return nome;
    }

    public int getRa() {
        return matricula;
    }

    public double calculaMedia(){
        return (nota1 + nota2)/2.0;
    }

    @Override
    public String toString(){
        return "Nome: " 
                + nome
                +"\nMatricula: "
                + matricula
                +"\nMedia = "
                + calculaMedia();
    }
}

public class Dandara {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Pedro da Silva", 10297, 9.0, 7.0);
        Aluno aluno2 = new Aluno("Pedero da Silva", 10497);
        Aluno aluno3 = new Aluno("Peqdro da Silva", 10297);
        Aluno aluno4 = new Aluno("Peretdro da Silva", 103297);


        System.out.println( aluno1 );
        System.out.println( aluno2 );
        System.out.println( aluno3 );
        System.out.println( aluno4 );
    }
}
