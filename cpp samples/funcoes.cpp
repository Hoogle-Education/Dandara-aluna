#include <iostream>

using namespace std;

int operacao(int x, int y){
  int op = 2*x+5*y;
  return op;
}

// real f ( real x ) = x soma 2 
// reais -> inteiro
// f(5)
// mmc(12, 9, 3, 6) = 3
// pow(2, 3) = 8

int main(){

  int a, b;

  cin >> a >> b;

  cout << operacao(a, b) << "\n";

  cout << operacao(6, 7) << "\n";

  return 0;
}