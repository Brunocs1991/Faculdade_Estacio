#include <iostream>
#include <cstdlib>
using namespace std;
int main(int argc, char** argv) {
    system("color f1");
    struct nodo {
        int num;
        struct nodo* prox;
    };
    // criando primeiro no;
    nodo* lista = new nodo;
    lista-> num = 23;
    lista -> prox = NULL;
    // criando segundo no;
    lista -> prox = new nodo;
    lista ->prox -> num = 13;
    lista -> prox -> prox= NULL;

    // exibindo
    cout << "\nValor do primeiro no: " << lista-> num;
    cout << "\nValor do segundo no: " << lista ->prox -> num;
    cout << "\n\nValor do endereco do primeiro no: " << lista;
    cout << "\n\nValor do endereco do segundo no: " << lista->prox;

    //liberando
    delete lista;
    cout << "\n\nEndereco da variavel lista, mesmo depois do delete:" << lista;
    lista = 0;
    cout << "\nEndereco da variavel lista depois da atribuicao  :" << lista;
    cout << "\n\n";
    system("pause");
    return 0;
}

