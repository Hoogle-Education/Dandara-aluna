#include <iostream>

using namespace std;

int main(){

  double a, b;
  char operation;

  cin >> a >> operation >> b;

  if(operation == '+'){
    cout << a+b;
  } else if (operation == '-') {
    cout << a-b;
  } else if(operation == '*'){
    cout << a*b;
  } else if(operation == '/'){
    cout << a/b;
  } else {
    cout << "operacao invalida!\n";
  }

}