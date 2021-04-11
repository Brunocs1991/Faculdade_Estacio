#include <cstdlib>
#include <iostream>
using namespace std;

int main(int argc, char** argv) {
    system("color 1f");

    struct nodo {
        int num;
        struct nodo* prox;
    };

    //primeiro nó
    nodo* lista = new nodo;
    lista -> num = 01;
    lista -> prox = NULL;

    //segundo nó
    lista -> prox = new nodo;
    lista ->prox->num = 02;
    lista ->prox->prox = NULL;

    //terceiro nó
    lista -> prox->prox = new nodo;
    lista ->prox->prox->num = 03;
    lista ->prox->prox->prox = NULL;

    //quarto nó    
    lista ->prox->prox->prox = new nodo;
    lista ->prox->prox->prox->num = 04;
    lista ->prox->prox->prox->prox = NULL;

    // listando
    cout << "\nValor do primeiro no: " << lista->num;
    cout << "\nValor do segundo  no: " << lista ->prox->num;
    cout << "\nValor do Terceiro no: " << lista ->prox->prox->num;
    cout << "\nValor do Quarto   no: " << lista ->prox->prox->prox->num;

    //exebindo valor das variaveis
    cout << "\n\n\nValor do endereco do primeiro no: " << lista;
    cout << "\n\nValor do endereco do segundo  no: " << lista->prox;
    cout << "\n\nValor do endereco do terceiro no: " << lista->prox-> prox;
    cout << "\n\nValor do endereco do quarto   no: " << lista->prox-> prox-> prox;

    delete lista;

    cout << "\n\nValor do endereco do primeiro no mesmo apos delete :" << lista;
    lista = 0;
    cout << "\nValor do endereco do primeiro no apos atrubiuicao  :" << lista;
    cout << "\n\n";
    system("pause");
}

