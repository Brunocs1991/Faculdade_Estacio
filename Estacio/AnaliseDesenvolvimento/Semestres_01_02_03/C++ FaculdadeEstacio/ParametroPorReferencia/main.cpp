#include <iostream>
using namespace std;
void CalcularPreco(float VlrProdutoReal, float& VlrProdutoDolar, float& VlrProdutoEuro);

int main() {
    float VlrProdReal, VlrProdDolar, VlrProdEuro;
    cout << "Digite o valor do Produto: ";
    cin >> VlrProdReal;
    //Chamada da funcao
    CalcularPreco(VlrProdReal, VlrProdDolar, VlrProdEuro);
    cout << "Valor em Dorlar: " << VlrProdDolar << endl;
    cout << "valor em Euro: " << VlrProdEuro << endl;
    system("pause > null");
}

void CalcularPreco(float VlrProdutoReal, float& VlrProdutoDolar, float& VlrProdutoEuro) {
    VlrProdutoDolar = VlrProdutoReal / 2.621;
    VlrProdutoEuro = VlrProdutoReal / 3.084;
}