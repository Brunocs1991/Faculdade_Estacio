#include<iostream>
using namespace std;
void selecao(int vet [], float h[], int tam);

int main() {
    int x, codigo[5];
    float alt [5];
    for (x = 0; x < 5; x++) {
        cout << "\nCodigo do Atleta: ";
        cin >> codigo[x];
        cout << "\nAltura: ";
        cin >> alt[x];
    }
    selecao(codigo, alt, 5);
    cout << "\nCodigo\tAltura\n";
    for (x = 0; x < 5; x++)
        cout << "\n" << codigo[x] << "\t" << alt[x];
    cout << "\n";
    system("pause");
}

void selecao(int vet[], float h[], int tam) {
    int j, i, aux;
    float auxf;
    for (i = 1; i < tam; i++) {
        aux = vet [i];
        auxf = h[i];
        for (j = i; j > 0 && aux < vet[j - 1]; j--) {
            vet[j] = vet[j - 1];
            h[j] = h[j - 1];
        }
        vet[j] = aux;
        h[j] = auxf;
    }
} 