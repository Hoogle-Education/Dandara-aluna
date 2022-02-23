# Introdução à POO

## O conceito de classe

A classe é como se fosse um molde.

## O conceito de objeto

É o que se produz através da classe.

## Consolidando nosso molde (classe)

Podemos dizer que todo tipo genérico de qualquer coisa que exista, ou tem algo como atributo ou pode realizar algo.

```
  Classe
      | - os atributos
      | - os métodos
```

Uma função é uma sequência bem definida de passos, com parâmetros ou não.

Todo método é uma função particular.

por exemplo:
```
  Aluno

    atributos
       | - nome
       | - idade
       | - ra
       | - telefone

    métodos
       | - fazAniversário()

```
`
no java:
```java
class Aluno{

  public String nome;
  public int idade;
  public int ra;
  public String telefone;

  public void fazAniversario( ){
    idade++;
  }

}
```