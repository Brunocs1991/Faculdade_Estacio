#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int op, n, x, f1, f2, f3;
    f1 = f2 = f3 = 0;
    float *alunos, soma, media;
    do {
        system("cls");
        system("color fc");
        cout << "\n\n~ ~ ~   Alocacao Dinamica   ~ ~ ~";
        cout << "\n~                               ~";
        cout << "\n~  1 - Insere numero de alunos  ~";
        cout << "\n~  2 - Insere notas             ~";
        cout << "\n~  3 - Calcula media da turma   ~";
        cout << "\n~  4 - Exibe                    ~";
        cout << "\n~  5 - Sai                      ~";
        cout << "\n~  Opcao:                       ~";
        cout << "\n~                               ~";
        cout << "\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n";
        cin>> op;
        system("cls");
        system("color 0e");
        switch (op) {
            case 1: cout << "Digite a quantidade de alunos: ";
                cin>> n;
                alunos = new float [n];
                if (alunos == 0) {
                    cout << "Nao foi possivel fazer a alocacao";
                    return 1;
                }
                f1 = 1;
                break;
            case 2: if (f1 == 1) {
                    for (x = 0; x < n; x++) {
                        cout << "Digite nota: ";
                        cin >> alunos[x];
                    }
                    f2 = 1;
                } else
                    cout << "\nVoce nao determinou a quantidade \n";
                break;
            case 3: if (f2 == 1) {
                    for (soma = alunos [0], x = 1; x < n; x++)
                        soma += alunos[x];
                    media = soma / n;
                    cout << "\nMedia Calculada\n\n";
                    f3 = 1;
                } else cout << "\nVoce pulou alguma(s) etapa(s)\n";
                break;
            case 4: if (f3 == 1) {
                    cout << "\nRelacao das Notas: ";
                    for (x = 0; x < n; x++)
                        cout << "\n" << setw(3) << x + 1 << " - " << alunos[x];
                    cout << "\n\nMedia  da Turma: " << setprecision(4) << media;
                } else cout << "\nVoce pulou alguma(s) etapa(s)\n";
                break;
            case 5: cout << "\nFim da alocacao Dinamica";
                delete []alunos;
                alunos = 0;
                break;
            default:cout << "\nOpcao Invalida\n";
        }
        cout << "\n\n";
        system("pause");
    } while (op != 5);
    return 0;
}