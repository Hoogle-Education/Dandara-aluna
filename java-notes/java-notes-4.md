# Construtores

**Motivação:** Melhorar ou filtrar a criação dos meus objetos.

Exemplo: Na hora de criar um objeto do tipo Pessoa, não faz sentido que ela exista sem nome e sem sua idade. Para criaremos de modo personalizado nossos objetos, forçando um do tipo Pessoa a já ter nome e idade.

## Relembrando como criamos objetos sem construtores

```java
  Pessoa maria = new Pessoa();
```

## Criando construtores personalizados

Novo escopo de uma classe qualquer

```
  Classe
      | - os atributos
      | - os construtores
      | - os métodos
```

no código:

```java
class Pessoa {

  public String name;
  public int age;
  public long number;

  public Pessoa(String name, int age){
    this.name = name;
    this.age = age;
  }

  public void birthday(){
    age++;
  }

  public void call(long number){
    System.out.println("Calling... " + number);
  }

}
```

## Keyword `this`

Palavra chave que autoreferencia o próprio objeto dentro de sua classe.

exemplo:

```java
class Pessoa{
  public String name;

  public Pessoa(String name){
    this.name = name;
  }
}
```

leitura do construtor:
> faça o nome **deste objeto da vez** receber o nome passado por parâmetro

## Sobrecarga (*Overload*)

```java
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
```

# Getters and Setters

Essencialmente estamos continuando o processo de melhorar a segurança durante o uso dos objetos. No ponto atual, criamos os objetos de maneira segura, porém não garatimos um uso seguro deles.

Por exemplo, uma Pessoa é forçada a ser criada com nome e idade, porém ao longo do código essa idade pode ser alterada sem nenhum critério ou regra.

## Keyword `public`

Permito o acesso em qualquer ponto do código.

Para que isso faça mais sentido, vamos expandir para o conceito de pacotes. Pacotes são agrupamentos de classes em java, atualmente estamos criando/usando um pacote super comum chamado por boa prática de `entities`.

## Keyword `private`

Permite o acesso somente na classe em que o atributo foi criado. Desta forma, não deixaremos o uso deliberado de uma uma determinada propriedade da classe.

```java
  private String nome;
```

A classe não permite acesso ao nome

### Com getters and setters

```java
  private String nome;

  public String getNome(){
    return nome;
  }

  private void setNome(String nome){
    this.nome = nome;
  }
```