#include <iostream>
#include <cstring>
using namespace std;

int main() {
    char nomeProdt1[21] = "martelo", nomeProdt2[21] = "furadeira", auxC[21];
    float valor1 = 35.90, valor2 = 256.75, auxf;

    if (strcmp(nomeProdt1, nomeProdt2) > 0) {
            strcpy(auxC,nomeProdt1);
            strcpy(nomeProdt1,nomeProdt2);
            strcpy(nomeProdt2,auxC);
            auxf = valor1;
            valor1 = valor2;
            valor2 = auxf;
        }
    cout << "\nNome do produto 1: " << nomeProdt1 << "\t" << valor1;
    cout << "\nNome do produto 2: " << nomeProdt2 << "\t" << valor2;
    cout << "\n\n";
    system("pause");
}