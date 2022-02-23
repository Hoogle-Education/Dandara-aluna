# Aula 01 - Conceitos fundamentais

## Motivação de programar

Automatizar processos que são repetitivos ou úteis.

## Ordem básica

`Linguagem` -> `Compilação/tradução` -> `Executável`

## Um introdução ao C++

```c++
#include <iostream> // entrada e saída

using namespace std;

int main(){
  // your code
}
```

## Tipos de Variáveis

| **Tipo** | **Objetivo** |
| :-----: | :-----: |
| `int` | guardar números inteiros |
| `double` | guardar números reais 8 casas de precisão |
| `float` | guardar números reais 4 casas de precisão |
| `char` | guarda um caracter da tabela ASCII |

## Entrada e saída

```cpp
#include <iostream>

using namespace std;

int main(){
    
    int n;

    cout << "coloque o valor de n ";

    cin >> n;
    
    cout << "voce digitou " << n ;
} 
```

### `cin` - Command In

faz as entradas

sintaxe:
```cpp
  int n;
  cin >> a
```

### `cout` - Command out

faz as saídas

### `printf` - print file

também faz saídas, mas da biblioteca pede a biblioteca `cstdio`.

```c++
#include <iostream>
#include <cstdio>

using namespace std;

int main(){

  int a;

  cin >> a;

  printf("%d\n", a);

}
```

**Associações do printf**

`%d`: números inteiros`

`%c`: char

`%f`: float

`%lf` : double (long float)


sintaxe:
```cpp
  cout << "Hello, World";
```


### `endl` ou `"\n"` - End Line

pula linha

sintaxe:
```cpp
  cout << "pulando linha do jeito 1\n";
  cout << "pulando linha do jeito 2" << endl;
```

## Estruturas Condicionais ( `if-else` )

>`if` - "Se"

> `else` - "Senão"

sintaxe:
```cpp
  if( /* condição */ ){
    // ação se for true
  }else{ // caso contrário
    // ação se for false
  }
```

exemplo:
```cpp
int a, b;
char operation;

if( operation == '+' ){
  cout << "Soma = " << a+b << "\n";
}else{
  cout << "Diferenca = " << a-b << "\n";
}
```

## Operadores lógicos 1

### 1. Operador igual

Para comparar duas coisas usamos o `==`.

> Por que não apenas um igual?

Para não ficar ambíguo com as atribuições.

> `=` atribui

> `==` compara

```cpp
  int a = 2; // atribua o valor 2 para a
  a == 3; // verifique se é igual a 3
  cout << a; // retorna o valor 2
```

### 2. Operador Diferente

Basicamente `!=`.

### 3. Outros operadores

`>=` maior ou igual
`<=` menor ou igual

## Operadores lógicos 2

> Basicamente: ***e*** e ***ou***

### Operador AND (`&&`)
jeito ruim:
```cpp
if( n > 10 ){
  if(n < 20){
    // faço algo
  }
}
```

melhorando:
```cpp
if( n>10 && n<20 ){
  // faça algo
}
```

### Operador OR (`||`)

jeito ruim:
```cpp
  if( n <= 10 ){
    // faço outra coisa
  }

  if(n >= 20){
    // faço outra coisa
  }
```

melhorando:
```cpp
  if(n<=10 || n>=20){ 
    // faço a outra coisa
  }
```

## Estruturas de repetição

### 1. `while()` - Enquanto

Como se fosse um `if` prolongado.

```cpp

  int estoque;

  cin >> estoque;

  cout << "Estoque inicial = " << estoque;
  
  while ( estoque != 0 )
    estoque--; // estoque  = estoque - 1
    cout << "Vendendo produtos ... || Novo Estoque = " << 
    estoque; 
  }

```