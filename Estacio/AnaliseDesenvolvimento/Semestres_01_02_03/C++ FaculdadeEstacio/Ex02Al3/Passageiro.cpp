#include <iostream>
using namespace std;

int main() {

    struct viagem {
        char nome[20], origem[15], destino[15], numPassagem[20], identidade[18], telefone[17];
    }
    passageiro1 = {"Sr Tiago, silva", "Brasil", "europa", "acb-1234", "MG-000.000.000-00", "(31)-987654-3210"},
    passageiro2 = {"Sr'a Silva, Maria", "Paraguai", "Japao", "cde-5678", "PR-11.1111.111-00", "(65)-012345-6789"},
    passageiro3 = {"Dr Costa, Felipe", "USA", "RUSSIA", "HIT-6666", "BR-22.222.222-00", "(55)-987654-3210"};


    cout << "\n\t**********************  VIAGENS CADASTRADAS  **********************\n";

    cout << "\n\tNome do passageiro: " << passageiro1.nome;
    cout << "\n\tIdentidade: " << passageiro1.identidade << "\tTelefone: " << passageiro1.telefone;
    cout << "\n\tPassagem: " << passageiro1.numPassagem << "\t|-> Origem: " << passageiro1.origem << "\t" << "|-> Destino: " << passageiro1.destino;
    cout << "\n\n\t*******************************************************************\n";

    cout << "\n\tNome do passageiro: " << passageiro2.nome;
    cout << "\n\tIdentidade: " << passageiro2.identidade << "\tTelefone: " << passageiro2.telefone;
    cout << "\n\tPassagem: " << passageiro2.numPassagem << "\t|-> Origem: " << passageiro2.origem << "\t" << "|-> Destino: " << passageiro2.destino;
    cout << "\n\n\t*******************************************************************\n";

    cout << "\n\tNome do passageiro: " << passageiro3.nome;
    cout << "\n\tIdentidade: " << passageiro3.identidade << "\tTelefone: " << passageiro3.telefone;
    cout << "\n\tPassagem: " << passageiro3.numPassagem << "\t|-> Origem: " << passageiro3.origem << "\t" << "|-> Destino: " << passageiro3.destino;
    cout << "\n\n\t*******************************************************************\n";

    system("pause");
    system("cls");
    cout << "finalizado com sucesso\n";
    return (EXIT_SUCCESS);
}