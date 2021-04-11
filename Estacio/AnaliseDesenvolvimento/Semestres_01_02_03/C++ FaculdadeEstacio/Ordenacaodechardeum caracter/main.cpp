#include <iostream>
using namespace std;

int main() {
    char vet [] = {'M','C'}, aux;
    cout << "\nAntes da Comparacao\n";
    cout << "\n" << vet[0] << "\t" << vet[1];
    if (vet[0] > vet[1]) {
        aux = vet[0];
        vet[0] = vet[1];
        vet[1] = aux;
    }
    cout << "\n\nApos a Comparacao\n";
    cout << "\n" << vet[0] << "\t" << vet[1];
    cout << "\n\n";
    system("pause");
}