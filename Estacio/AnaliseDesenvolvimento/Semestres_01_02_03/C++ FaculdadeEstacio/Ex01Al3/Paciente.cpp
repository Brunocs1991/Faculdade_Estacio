#include <iostream>
using namespace std;

int main() {

    // minha estrutura

    struct cad {
        char nomePaciente[50], classificacao[30], telefone[15];
        float altura, peso, imc;
    };
    cad paciente1, paciente2;
    cout << "\t\tTela de cadastro\n";
    cout << "\n*************************************************";
    // paciente 1
    cout << "\nNome Paciente 1: ";
    cin.getline(paciente1.nomePaciente, 50);
    cout << "\nInforme Altura,Peso e Imc (informar valor e pressionar enter a cada dado): \n";
    cin >> paciente1.altura >> paciente1.peso >> paciente1.imc;
    cin.get(); //remover enter deixar variavel numerica
    cout << "\nInforme a classificacao: ";
    cin.getline(paciente1.classificacao, 30);
    cout << "\nInforme um telefone de contato: ";
    cin.getline(paciente1.telefone, 15);
    //paciente2
    cout << "\n*************************************************";
    cout << "\nNome Paciente 2: ";
    cin.getline(paciente2.nomePaciente, 50);
    cout << "\nInforme Altura,Peso e Imc (informar valor e pressionar enter a cada dado): \n";
    cin >> paciente2.altura >> paciente2.peso >> paciente2.imc;
    cin.get(); //remover enter deixar variavel numerica
    cout << "\nInforme a classificacao: ";
    cin.getline(paciente2.classificacao, 30);
    cout << "\nInforme um telefone de contato: ";
    cin.getline(paciente2.telefone, 15);
    //limpando a tela
    system("cls");
    cout << "\t\tPacientes Cadastrados\n\n";
    cout << "\n*************************************************";
    cout << "\nNome do primeiro Paciente: " << paciente1.nomePaciente << "\n";
    cout << "\nPeso\tAltura\tImc\tClassificacao";
    cout << "\n" << paciente1.peso << "\t" << paciente1.altura << "\t" << paciente1.imc << "\t" << paciente1.classificacao << "\n";
    cout << "\n*************************************************";
    cout << "\nNome do segundo Paciente: " << paciente2.nomePaciente << "\n";
    cout << "\nPeso\tAltura\tImc\tClassificacao";
    cout << "\n" << paciente2.peso << "\t" << paciente2.altura << "\t" << paciente2.imc << "\t" << paciente2.classificacao << "\n";
    cout << "\n";
    system("pause");
}