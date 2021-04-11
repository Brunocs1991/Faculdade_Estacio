#include <iostream>
#include <cstdlib>
using namespace std;

struct nodo {
    int num;
    struct nodo *prox;
};
nodo *insereFrente(nodo* ptr, int valor);
void exibe(nodo *lista);
nodo *remove(nodo *lista);

int main(int argc, char** argv) {
    // cor
    system("color 5f");
    // variaveis
    int c;
    nodo *lista = NULL;
    // primeiro no
    lista = insereFrente(lista, 23);
    // segundo no
    lista = insereFrente(lista, 13);
    // terceiro no
    lista = insereFrente(lista, 15);
    // quarto no
    lista = insereFrente(lista, 18);
    // listando
    exibe(lista);
    // removendo elemento lista
    lista = remove(lista);
    //listando
    exibe(lista);
    // inserindo novo elemento
    lista = insereFrente(lista, 50);
    //listando
    exibe(lista);
    // removendo 3 nodos
    lista = remove(lista);
    lista = remove(lista);
    lista = remove(lista);
    //listando
    exibe(lista);
    //liberando    
    delete lista;
    lista = 0;
    cout << "\n\n";
    system("pause");
}
//funcao insere

nodo* insereFrente(nodo *ptr, int valor) {
    nodo *temp = new nodo;
    temp->num = valor;
    temp->prox = ptr;
    return temp;
}
//funcao exibe

void exibe(nodo *lista) {
    int c = 1;
    cout << "\n\nListando\n";
    while (lista) {
        cout << "\nValor do " << c << "o no: " << lista->num;
        lista = lista->prox;
        c++;
    }
}
//funcao remove

nodo *remove(nodo *lista) {
    nodo *aux;
    aux = lista;
    lista = lista->prox;
    delete aux;
    return lista;
}