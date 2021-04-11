#include <iostream>
using namespace std;
int Somar();
int ValorA, ValorB;

int main() {
    int Total;
    cout << "Digite o valor de A: ";
    cin >> ValorA;
    cout << "Digite o valor de B: ";
    cin >> ValorB;
    Total = Somar();
    cout << "Total = " << Total << endl;
    system("pause > null");
}

int Somar() {
    int ValorTotal;
    ValorTotal = ValorA + ValorB;
    return ValorTotal;
}