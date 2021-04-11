#include <iostream>
#include <cstdlib>
using namespace std;

struct nodo {
    int num;
    struct nodo *prox;
};
nodo * insereFrente(nodo* ptr, int valor);

int main(int argc, char** argv) {
    // cor
    system("color 5f");
    // variaveis
    nodo *temp, *aux, *ini, *lista = NULL;
    int c;
    // primeiro no
    temp = new nodo;
    temp -> num = 23;
    temp -> prox = lista;
    lista = temp;
    ini = lista; // guarda o inicio

    // segundo no
    temp = new nodo;
    temp -> num = 13;
    temp -> prox = lista;
    lista = temp;
    ini = lista; // guarda o inicio

    // terceiro no
    temp = new nodo;
    temp -> num = 15;
    temp -> prox = lista;
    lista = temp;
    ini = lista; // guarda o inicio

    // quarto no
    temp = new nodo;
    temp -> num = 18;
    temp -> prox = lista;
    lista = temp;
    ini = lista; // guarda o inicio    
    //listando
    c = 1;
    cout << "\nAntes da remocao\n";
    while (lista != NULL) {
        cout << "\nValor do " << c << "o no: " << lista -> num;
        lista = lista->prox;
        c++;
    }
    // retorna ao inicio
    lista = ini;
    //removendo primeiro no
    aux = lista;
    lista = lista->prox;
    delete aux;
    //listando 

    c = 1;
    cout << "\n\nApos da remocao\n";
    while (lista) {
        cout << "\nValor do " << c << "o no: " << lista -> num;
        lista = lista->prox;
        c++;
    }
    delete lista;
    lista = 0;
    cout << "\n\n";
    system("pause");
}