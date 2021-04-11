#include <iostream>
#include <cstring>
using namespace std;

int main() {
    char vet [][13] = {"Joao Renato", "Anita Maciel"}, aux[13];
    cout << "\nAntes da Comparacao\n";
    cout << "\n" << vet[0] << "\t" << vet[1];
    if (strcmp(vet[0], vet[1]) > 0) {
        strcpy(aux, vet[0]);
        strcpy(vet[0], vet[1]);
        strcpy(vet[1], aux);
    }
    cout << "\n\nApos a Comparacao\n";
    cout << "\n" << vet[0] << "\t" << vet[1];
    cout << "\n\n";
    system("pause");
}