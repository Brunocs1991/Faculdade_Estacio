#include<iostream>
using namespace std;

struct data {
    int dia, mes, ano;
};

int main() {

    struct pagmento {
        int codigo;
        float valor;
        data venc;
    } promissorias[2];
    int x;
    for (x = 0; x < 2; x++) {
        cout << "\n\tCodigo: ";
        cin >> promissorias[x].codigo;
        cout << "\n\tValor a ser pago: ";
        cin >> promissorias[x].valor;
        cout << "\n\tDia: ";
        cin >> promissorias[x].venc.dia;
        cout << "\n\tMes: ";
        cin >> promissorias[x].venc.mes;
        cout << "\n\tAno: ";
        cin >> promissorias[x].venc.ano;
        cout << "\n\t-----------------";
    }
    system("cls");
    cout << "\n\tCodigo\tValor\t\tData de Vencimento\n";
    for (x = 0; x < 2; x++)
        cout << "\n\t" << promissorias[x].codigo << "\tR$ " << promissorias[x].valor
            << "\t\t" << promissorias[x].venc.dia << "/ " << promissorias[x].venc.mes
            << " /" << promissorias[x].venc.ano;
    cout << "\n\n";
    system("pause");
}