#include <iostream>
using namespace std;

void bolha(int vet[], int tam);

int main() {
    int x, vet[] = {13, 23, 3, 8, 1};
    system("cls");
    cout << "\nAntes da chamada da Funcao - BOLHA\n\t\t";
    for (x = 0; x < 5; x++) {
        cout << vet[x] << "\t";
    }
    cout << "\n";
    bolha(vet, 5);
    cout << "\nDepois da chamada da Funcao - BOLHA\n\t\t";
    for (x = 0; x < 5; x++) {
        cout << vet[x] << "\t";
    }
    cout << "\n\n";
    system("pause");
}

void bolha(int vet[], int tam) {
    int j, i, aux, a;
    for (i = 0; i < tam - 1; i++) {
        cout << "\ni = " << i << "\tAntes\t";
        for (a = 0; a < 5; a++)
            cout << vet[a] << "\t";
        for (j = tam - 1; j > i; j--) {
            if (vet[j] < vet[j - 1]) {
                aux = vet[j];
                vet[j] = vet[j - 1];
                vet[j - 1] = aux;
            }
            cout << "\ni = " << i << "\tdepois\t";
            for (a = 0; a < 5; a++)
                cout << vet[a] << "\t";
        }
    }

}
