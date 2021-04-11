#include <iostream>
#include<cstring>

using namespace std;

int main() {

    struct prod {
        char nomeProd[21];
        float valor;
    } produto1, produto2, aux;
    cout << "\nNome do prmeiro produto: ";
    cin.getline(produto1.nomeProd, 21);
    cout << "\nValor: ";
    cin >> produto1.valor;
    cin.get(); //retira o enter
    cout << "\nNome do segundo produto: ";
    cin.getline(produto2.nomeProd, 21);
    cout << "\nValor: ";
    cin >> produto2.valor;
    cin.get(); //retira o enter
    if (strcmp(produto1.nomeProd, produto2.nomeProd) > 0) {
        aux = produto1;
        produto1 = produto2;
        produto2 = aux;
    }
    cout << "\nNome do Produto 1: " << produto1.nomeProd << "\t" << produto1.valor;
    cout << "\nNome do Produto 2: " << produto2.nomeProd << "\t" << produto2.valor;
    cout << "\n\n";
    system("pause");
}
