#include<iostream>
using namespace std;

struct cad {
    int matricula;
    float CR;
};

cad Entrada();

int main() {
    cad aluno;
    aluno = Entrada();

    system("cls");
    cout << "\n\tMatricula do aluno: " << aluno.matricula << "\tCR: " << aluno.CR;
    cout << "\n\n";
    system("pause");
    return (0);

}

cad Entrada() {
    cad temp;
    cout << "\n\tMatricula do aluno: ";
    cin >> temp.matricula;
    cout << "\n\tCR: ";
    cin >> temp.CR;
    return (temp);
}