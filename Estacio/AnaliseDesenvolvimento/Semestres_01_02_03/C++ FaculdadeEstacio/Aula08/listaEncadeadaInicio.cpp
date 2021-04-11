#include <cstdlib>
#include <iostream>
using namespace std;

int main(int argc, char** argv) {
    system("color f1");
    // criando a struct   

    struct nodo {
        int num;
        struct nodo* prox;
    };
    // criando no
    nodo* no1 = new nodo;
    // atribuindo valor ao elemento
    no1-> num = 23;
    // atribuindo 0 ou null ao campo da proxima celula;
    no1->prox = NULL;
    //exibindo
    cout << "\nValor do no1: " << no1-> num;
    //liberando
    delete no1;
    no1 = 0;
    cout << "\n\n";
    system("pause");
    return 0;
}

