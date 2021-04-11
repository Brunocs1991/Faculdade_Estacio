#include <iostream>
using namespace std;

void selecao(int vet[], int tam);

int main() {
    int x, vet[] = {13, 23, 3, 8, 1};
    system("cls");
    cout << "\nAntes da chamada da Funcao - SELECAO\n\t\t";
    for (x = 0; x < 5; x++) {
        cout << vet[x] << "\t";
    }
    cout << "\n";
    selecao(vet, 5);
    cout << "\nDepois da chamada da Funcao - SELECAO\n\t\t";
    for (x = 0; x < 5; x++) {
        cout << vet[x] << "\t";
    }
    cout << "\n\n";
    system("pause");
}

void selecao(int vet[], int tam) {
    int j, i, aux, a, temp;
    for (i = 0; i < tam - 1; i++) {
        cout << "\ni= " << i << "\tantes\t";

        for (a = 0; a < 5; a++)
            cout << vet[a] << "\t";
        aux = i;


        for (j = i + 1; j < tam; j++)
            if (vet[aux] > vet[j])
                aux = j;
        temp = vet[aux];
        vet[aux] = vet[i];
        vet[i] = temp;

        cout << "\ni= " << i << "\tdepois\t";
        for (a = 0; a < 5; a++)
            cout << vet[a] << "\t";

    }
}
