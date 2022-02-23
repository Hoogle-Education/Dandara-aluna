 # Introdução ao java

## Atenção ao *camel case*

> minhaVariavel : começa minusculo

> MinhaClasse: começa maiúsculo

> PI: variável constante, gritando

## Estrutura básica do código em java

```java
 public class Programa{

   public static void main(String[] args){
     // meu ponto de entrada
   }

 }
```

## Realizando saídas em Java

### println - *print line*

sintaxe básica:
```java
  System.out.println("Hello, world!");
```

**apelido:** *sysout*

aplicando:
```java
public class Programa{

  public static void main(String[] args){
    System.out.println("Hello, world!");
  }

}
```

### print - *print*

sintaxe básica:
```java
  System.out.print("Hello, world!");
```

### printf - *print file*

sintaxe básica:
```java
  int a = 2;
  System.out.printf("meu numero eh %d", a);
```

## Estruturas condicionais

Literalmente, a mesma coisa.

## Estruturas de repetição

Literalmente, a mesma coisa também, porém com mais recursos.

### Estrutura do `for`

sintaxe genérica:
```
for(<inicialização>; <condição de parada>; <incremento>){
  seu código aqui
}
```

sintaxe no java:
```java
for(int i=0; i<n; i++){
  // seu código aqui
}
```

## Tipo String

O tipo String em java leva S maiúsculo, porque é uma classe. Mais a frente aprofundaremos sobre isso.