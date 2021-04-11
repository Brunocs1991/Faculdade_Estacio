#include <iostream>
#define TAM 3
using namespace std;

int main() {

    struct prodCad {
        int codigo;
        float precoCompra, precoVenda;
    };
    prodCad produtos[TAM];
    int x, num;
    for (x = 0; x < TAM; x++) {
        cout << "\nCodigo do Produto 0 - 10000: ";
        cin >> num;
        while (num < 0 || num > 10000) {
            cout << "\nCodigo Invalido !!!";
            cout << "\nCodigo do produto 0-10000: ";
            cin >> num;
        }
        produtos[x].codigo = num;
        cout << "\nPreco de compra: ";
        cin >> produtos[x].precoCompra;
        produtos[x].precoVenda = produtos[x].precoCompra * 1.6;
    }
    system("cls");
    cout << "\n\n\tCodigo\tCompra\tVenda\n";
    for (x = 0; x < TAM; x++) {
        cout << "\n\t" << produtos[x].codigo << "\t" << produtos[x].precoCompra << "\t" << produtos[x].precoVenda;
    }
    cout << "\n\n";
    system("pause");
}