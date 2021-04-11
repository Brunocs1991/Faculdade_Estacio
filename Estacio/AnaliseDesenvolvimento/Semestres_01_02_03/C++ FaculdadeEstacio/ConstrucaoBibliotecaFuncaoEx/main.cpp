#include <iostream>
using namespace std;
int Somar();
int Subtrair();
int Multiplicar();
int Dividir();
int ValorA, ValorB;

int main() {
    int Total;
    cout << "Digite o valor de A: ";
    cin >> ValorA;
    cout << "Digite o valor de B: ";
    cin >> ValorB;
    Total = Somar();
    cout << "Soma = " << Total << endl;
    Total = Subtrair();
    cout << "Subtracao = " << Total << endl;
    Total = Multiplicar();
    cout << "Multiplicacao = " << Total << endl;
    Total = Dividir();
    cout << "Divisao = " << Total << endl;

    system("pause > null");
}

int Somar() {
    int ValorTotal;
    ValorTotal = ValorA + ValorB;
    return ValorTotal;
}

int Subtrair() {
    int ValorTotal;
    ValorTotal = ValorA - ValorB;
    return ValorTotal;
}

int Multiplicar() {
    int ValorTotal;
    ValorTotal = ValorA*ValorB;
    return ValorTotal;
}

int Dividir() {
    int ValorTotal;
    ValorTotal = ValorA / ValorB;
    return ValorTotal;
}
