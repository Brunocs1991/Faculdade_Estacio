#include <iostream>
using namespace std;
void GerarValores(float PagtoM[], float VlrPagto);

int main() {
    int Ind;
    float PagtoMes[12];
    GerarValores(PagtoMes, 150.80);
    for (Ind = 0; Ind < 12; Ind++) {
        cout << "Pagamento Mes " << Ind << ": " << PagtoMes[Ind] << endl;
    }
    system("pause > null");
}

void GerarValores(float PagtoM[], float VlrPagto) {
    int Ind;
    for (Ind = 0; Ind < 12; Ind++) {
        PagtoM[Ind] = VlrPagto;
    }
}