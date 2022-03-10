package application;

class Pessoa {

    public String name;
    public int age;
    public long number;

    public Pessoa(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Pessoa(String name, int age, long number){
        this.name = name;
        this.age = age;
        this.number = number;
    }
  
    public void birthday(){
      age++;
    }
  
    public void call(long number){
      System.out.println("Calling... " + number);
    }
  
}

public class App {
    public static void main(String[] args) {

        Pessoa maria = new Pessoa("Maria da Silva", 15);
        Pessoa joao = new Pessoa("Joao", 20, 21120);
        
        System.out.println("nome = " + maria.name);
        System.out.println("idade = " + maria.age);
        System.out.println("number = " + maria.number);

        System.out.println("------------------");

        System.out.println("nome = " + joao.name);
        System.out.println("idade = " + joao.age);
        System.out.println("number = " + joao.number);
        
    }
}
