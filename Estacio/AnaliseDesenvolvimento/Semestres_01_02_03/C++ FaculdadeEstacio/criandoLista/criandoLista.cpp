#include <iostream>
#include <cstdlib>

using namespace std;

struct nodo {
    int num;
    struct nodo* prox;
};

int main(int argc, char** argv) {
    // definindo cor da tela
    system("color 2f");
    // iniciando a lista vazia
    nodo *temp, *lista = NULL;

    // primeiro no;

    temp = new nodo;
    temp -> num = 23;
    temp -> prox = lista;
    lista = temp;

    // segundo no

    temp = new nodo;
    temp -> num = 13;
    temp -> prox = lista;
    lista = temp;

    // terceiro no
    temp = new nodo;
    temp ->num = 15;
    temp -> prox = lista;
    lista = temp;

    //quarto no
    temp = new nodo;
    temp -> num = 18;
    temp -> prox = lista;
    lista = temp;

    // listando

    cout << "\nInserindo No na Frente - Listando um a um";
    cout << "\n\nValor do 1o no: " << lista -> num;
    cout << "\nValor do 2o no: " << lista -> prox -> num;
    cout << "\nValor do 3o no: " << lista -> prox -> prox -> num;
    cout << "\nValor do 4o no: " << lista -> prox -> prox -> prox -> num;

    //liberando

    lista = 0;
    cout << "\n\n";
    system("pause");
}


