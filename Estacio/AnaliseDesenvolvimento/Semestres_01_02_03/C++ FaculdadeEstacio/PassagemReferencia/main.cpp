#include <iostream>
using namespace std;

struct cad {
    char nome[31];
    int idade;
};

void idade2020(int&id);

int main() {
    cad atleta = {"Joao Renato", 21};
    cout << "\n\tAntes da Chamada da Funcao";
    cout << "\n\tNome do Atetla: " << atleta.nome << "\tIdade em 2010: " << atleta.idade;
    idade2020(atleta.idade);
    cout << "\n\n\tDepois da Chamada da Funcao";
    cout << "\n\tNome do Atetla: " << atleta.nome << "\tIdade em 2010: " << atleta.idade;
    cout << "\n\n\n";
    system("pause");
    return (0);
}

void idade2020(int &id) {
    id = id + 10;
}