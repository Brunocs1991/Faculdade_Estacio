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
        cout << "\n"<<codigo[x] << "\t" << alt[x];
    cout << "\n";
    system("pause");
}

void selecao(int vet[], float h[], int tam) {
    int j, i, aux, temp;
    float temp1;
    for (i = 0; i < tam - 1; i++) {
        aux = i;
        for (j = i + 1; j < tam; j++)
            if (vet[aux] > vet[j])
                aux = j;
        temp = vet[aux];
        vet[aux] = vet[i];
        vet[i] = temp;

        temp1 = h[aux];
        h[aux] = h[i];
        h[i] = temp1;
    }
}