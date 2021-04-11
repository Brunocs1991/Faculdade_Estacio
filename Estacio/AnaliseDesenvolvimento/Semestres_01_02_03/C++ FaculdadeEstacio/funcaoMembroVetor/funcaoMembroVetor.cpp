#include<iostream>
#include <string.h>
using namespace std;

struct cad {
    char nome[31];
};
void maiuscula(char func[]);

int main() {
    cad funcionario;
    char lixo [100];
    cout << "\n\tNome do Funcionario ate 30 caracteres: ";
    cin.getline(lixo, 100);
    while (strlen(lixo) > 30) {
        cout << "\n\tNome muito extenso: \n";
        cout << "\n\tNome do Funcionario ate 30 caracteres: ";
        cin.getline(lixo, 100);
    }
    strcpy(funcionario.nome, lixo);
    maiuscula(funcionario.nome);

    system("cls");
    cout << "\n\tNome do Funcionario: " << funcionario.nome;
    cout << "\n\n";
    system("pause");
    return (0);
}

void maiuscula(char func[]) {
    int x;
    for (x = 0; func[x] != '\0'; x++)
        func[x] = toupper(func[x]);
    }