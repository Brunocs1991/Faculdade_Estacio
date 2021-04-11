#include<iostream>
using namespace std;

struct cad {
    int matricula;
    float cr;
};

void Exibe(cad AL);

int main() {

    cad aluno;
    cout << "\n\tMatricula do aluno: ";
    cin >> aluno.matricula;
    cout << "\n\tDigite o CR: ";
    cin >> aluno.cr;
    Exibe(aluno);
    return (0);
}

void Exibe(cad AL) {
    system("cls");
    cout << "\n\tMatricula do aluno: " << AL.matricula << "\tCR: " << AL.cr;
    cout << "\n\n";
    system("pause");
}