#include <iostream>
#include <cstdlib>
#include <stdlib.h>
using namespace std;
//struct

struct nodo {
    int info;
    struct nodo *prox;
};
//prototipo da função
nodo *insereFim(nodo *plista, int valor);
void exibePrimeiro(nodo *plista);
nodo *remove(nodo *plista);
void libera(nodo *plista);
void exibeLista(nodo *plista);
nodo *removeTudo(nodo *plista);
//main

int main(int argc, char** argv) {
    int c, op, valor;
    nodo *lista = NULL;
    do {
        system("cls");
        system("color f2");
        cout << "\n\n- - -  Alocacao Dinamica  - - -";
        cout << "\n-                             -";
        cout << "\n- 1- Insere na Fila           -";
        cout << "\n- 2- Remove da Fila           -";
        cout << "\n- 3- Exibe primeiro da Fila   -";
        cout << "\n- 4- Libera Fila              -";
        cout << "\n- 5- Lista Fila - educativo   -";
        cout << "\n- 6- Remove tudo da FILA      -";
        cout << "\n- 7- Sai                      -";
        cout << "\n- Opcao:                      -";
        cout << "\n-                             -";
        cout << "\n- - - - - - - - - - - - - - - -\n";
        cin>>op;
        system("cls");
        system("color 2F");
        switch (op) {
            case 1:cout << "\nDigite numero: ";
                cin>>valor;
                lista = insereFim(lista, valor);
                break;
            case 2:if (!lista)
                    cout << "\n\nNada a remover. Fila vazia\n";
                else {
                    lista = remove(lista);
                    cout << "\n\nPrimeiro elemento da Fila removido\n";
                }
                break;
            case 3:if (!lista)
                    cout << "\n\nFILA vazia\n";
                else
                    exibePrimeiro(lista);
                break;
            case 4: if (lista)
                    cout << "\nTem elementos na Fila\n";
                else if (!lista)
                    cout << "\n\nFILA vazia\n";
                else {
                    libera(lista);
                    cout << "\nLiberando Memoria";
                }
                break;
            case 5:if (!lista)
                    cout << "\nFila vazia\n";
                else
                    exibeLista(lista);
                break;
            case 6: lista = removeTudo(lista);
                break;
            case 7: cout << "Fechando FILA Dinamica\n";
                break;
            default:cout << "\nOpcao Invalida\n";
        }
        cout << "\n\n";
        system("pause");
    } while (op != 7);
    return 0;
}
// FUNÇÃO INSERE AO FINAL (OP1)

nodo *insereFim(nodo *plista, int valor) {
    nodo *novo, *aux;
    novo = new nodo;
    if (!novo) {
        cout << "\nNao foi possivel fazer a Alocacao\n";
        system("pause");
        exit(1);
    }
    novo->info = valor;
    novo->prox = NULL;
    if (plista == NULL)
        plista = novo;
    else {
        aux = plista;
        while (aux->prox)
            aux = aux->prox;
        aux->prox = novo;
    }
    return plista;
}
// FUNÇÃO REMOVE (OP2)

nodo *remove(nodo *plista) {
    nodo *aux;
    aux = plista;
    plista = plista->prox;
    delete aux;
    return plista;
}
// FUNÇÃO EXIBE PRIMEIRO (OP 3)

void exibePrimeiro(nodo *plista) {
    if (!plista)
        cout << "\n\nFila vazia\n";
    else {
        cout << "\nValor do primeiro elemento da Fila: " << plista->info;
    }
}
// FUNÇÃO LIBERA (OP 4)

void libera(nodo *plista) {
    delete plista;
    plista = 0;
}
// FUNÇÃO LISTAR (OP 5)

void exibeLista(nodo *plista) {
    cout << "\nListando\n";
    while (plista) {
        cout << "\n" << plista->info;
        plista = plista->prox;
    }
}
// FUNÇÃO REMOVER TUDO (OP 6)

nodo *removeTudo(nodo *plista) {
    if (!plista)
        cout << "\n\nFila vazia\n";
    else {
        while (plista) {
            nodo *aux;
            aux = plista;
            plista = plista->prox;
            delete aux;
        }
        cout << "\nLista Excluida";
    }
    return plista;
}