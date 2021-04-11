#include <iostream>
#include <string.h>
using namespace std;

struct dados {
    char nome [31];
    int codigo;
    float alt;
};
void maiuscula(char n[]);
void selecao(dados vet[], int tam);

int main() {
    int x;
    dados atleta [5];
    for (x = 0; x < 5; x++) {
        cout << "\nNome do Atleta: ";
        cin.getline(atleta[x].nome, 31);
        maiuscula(atleta[x].nome);
        while (strlen(atleta[x].nome) < 30)
            strcat(atleta[x].nome, " ");
        cout << "\nCodigo do Atleta: ";
        cin >> atleta[x].codigo;
        cout << "\nAltura do Atleta? ";
        cin >> atleta[x].alt;
        cin.get();
    }
    selecao(atleta, 5);
    cout << "\nCodigo\tNome\t\t\t\tAltura\n";
    for (x = 0; x < 5; x++)
        cout << "\n" << atleta[x].codigo << "\t" << atleta[x].nome << "\t" << atleta[x].alt;
    cout << "\n\n";
    system("pause");
}

void maiuscula(char n[]) {
    int x;
    for (x = 0; x < strlen(n); x++)
        n[x] = toupper(n[x]);
}

void selecao(dados vet[], int tam) {
    int j, i, aux;
    dados temp;
    for (i = 0; i < tam - 1; i++) {
        aux = i;
        for (j = i + 1; j < tam; j++)
            if (strcmp(vet[aux].nome, vet[j].nome) > 0)
                aux = j;
        temp = vet[aux];
        vet[aux] = vet [i];
        vet[i] = temp;
    }
}

