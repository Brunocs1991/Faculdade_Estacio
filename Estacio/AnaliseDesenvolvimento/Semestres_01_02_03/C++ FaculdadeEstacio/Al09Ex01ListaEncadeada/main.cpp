#include <cstdlib>
#include <iostream>
#include <stdlib.h>
using namespace std;
struct nodo {
    int info;
    struct nodo *prox;
};
nodo *insereFrente(nodo *ptr, int valor);
nodo *insereFim(nodo *ptr, int valor);
void exibe(nodo *ptr);
nodo *removeFrente(nodo *ptr);
nodo *removeFim(nodo *ptr);
void substituiNo(nodo *ptr, int posicao, int novoValor);
int buscaSequencial(nodo *ptr, int valor);
void libera(nodo *ptr);
int contaNos(nodo *ptr);
int main(int argc, char** argv) {
    int c, op, valor, pos, nvalor, resp;
    nodo *lista = NULL;
    do {
        system("cls");
        system("color f1");
        cout << "\n\n< < < Alocacao Dinamica < < <";
        cout << "\n<                           <";
        cout << "\n< 1- Insere Frente - Lista  <";
        cout << "\n< 2- Insere Fim - Lista     <";
        cout << "\n< 3- Remove Frente - Lista  <";
        cout << "\n< 4- Remove Fim - Lista     <";
        cout << "\n< 5- Exibe Lista            <";
        cout << "\n< 6- Substitui No na Lista  <";
        cout << "\n< 7- Conta Nos da Lista     <";
        cout << "\n< 8- Busca na Lista         <";
        cout << "\n< 9- Libera Lista           <";
        cout << "\n< 10- Sai                   <";
        cout << "\n< Opcao:                    <";
        cout << "\n<                           <";
        cout << "\n< < < < < < < < < < < < < < <\n";
        cin>>op;
        system("cls");
        system("color 1f");
        switch (op) {
            case 1: cout << "\nInsere na frete: ";
                cin >> valor;
                lista = insereFrente(lista, valor);
                break;
            case 2: cout << "\nInsere no final: ";
                cin >> valor;
                lista = insereFim(lista, valor);
                break;
            case 3:if (!lista)
                    cout << "\n\nNada a remover. Fila vazia";
                else {
                    lista = removeFrente(lista);
                    cout << "\n\nPrimeiro elemento da Fila removido\n";
                }
                break;
            case 4: if (!lista)
                    cout << "\n\nNada a remover. Fila vazia";
                else {
                    lista = removeFim(lista);
                    cout << "\n\nUltimo elemento da Fila removido\n";
                }
                break;
            case 5:if (!lista) {
                    cout << "\n\nFila Vazia\n";
                } else {
                    exibe(lista);
                }
                break;
            case 6:if (!lista)
                    cout << "\n\nFILA Vazia\n";
                else {
                    cout << "\nQual a posicao do No? ";
                    cin>>pos;
                    while (pos > contaNos(lista)) {
                        cout << "\nPosicao Invalida\n";
                        cout << "\nQual a posicao do No? ";
                        cin>>pos;
                    }
                    cout << "Qual o novo Valor? ";
                    cin>>nvalor;
                    substituiNo(lista, pos, nvalor);
                    cout << "\nValor substituido\n";
                }
                break;
            case 7:if (!lista)
                    cout << "\n\nFILA vazia\n";
                else
                    cout << "\nTotal de nos: " << contaNos(lista);
                break;
            case 8: if (!lista)
                    cout << "\n\n FILA vazia\n";
                else {
                    cout << "\nQual o valor de procura? ";
                    cin>> valor;
                    resp = buscaSequencial(lista, valor);
                    if (resp == 1)
                        cout << "\nEncontrei";
                    else
                        cout << "\nNao Encontrei";
                }
                break;
            case 9: if (lista) {
                    cout << "\nTem elementos na lista";
                } else {
                    libera(lista);
                    cout << "\nLiberando Memoria";
                }
                break;
            case 10: cout << "Fechando Lista Encadeada\n";
                break;
            default:cout << "\nOpcao Invalida\n";
        }
        cout << "\n\n";
        system("pause");
    } while (op != 10);
    return 0;
}
//Função insere na frente op 1
nodo * insereFrente(nodo *ptr, int valor) {
    nodo *temp = new nodo;
    if (!temp) {
        cout << "\nNão foi possivel fazer a Alocacao\n";
        system("pause");
        exit(1);
    }
    temp->info = valor;
    temp-> prox = ptr;
    return temp;
}
//funcao insere no final op 2
nodo *insereFim(nodo *ptr, int valor) {
    nodo *novo, *aux;
    novo = new nodo;
    if (!novo) {
        cout << "\nNao foi possivel fazer Alocacao";
        system("pause");
        exit(1);
    }
    novo ->info = valor;
    novo -> prox = NULL;
    if (!ptr) {
        ptr = novo;
    } else {
        aux = ptr;
        while (aux->prox)
            aux = aux->prox;
        aux->prox = novo;
    }
    return ptr;
}
//funcao remove frete op 3
nodo *removeFrente(nodo* ptr) {
    nodo *aux;
    aux = ptr;
    ptr = ptr->prox;
    delete aux;
    return ptr;
}
//funcao remove fim op 4
nodo *removeFim(nodo* ptr) {
    nodo *aux, *ultimo;
    if (!ptr->prox) {
        delete ptr;
        ptr = NULL;
        return ptr;
    } else {
        aux = ptr;
        while (aux->prox->prox)//aux encaminha ate chegar no penultimo nó
            aux = aux->prox;
        ultimo = aux->prox;
        delete ultimo;
        aux->prox = NULL;
        return ptr;
    }
}
// funcao exibe op 5
void exibe(nodo *ptr) {
    cout << "\nListando\n";
    while (ptr) {
        cout << "\n" << ptr->info;
        ptr = ptr->prox;
    }
}
// funcao substitui no op 6
void substituiNo(nodo *ptr, int posicao, int novoValor) {
    int conta = 1;
    while (conta != posicao) {
        ptr = ptr->prox;
        conta++;
    }
    ptr->info = novoValor;
}
//funcao contaNos op 7
int contaNos(nodo* ptr) {
    int conta = 0;
    while (ptr) {
        conta++;
        ptr = ptr->prox;
    }
    return conta;
}
// funcao busca sequencial op 08
int buscaSequencial(nodo *ptr, int valor) {
    while (ptr) {
        if (ptr->info == valor)
            return 1;
        ptr = ptr->prox;
    }
    return 0;
}
// funcao libera op 9
void libera(nodo *ptr) {
    delete ptr;
    ptr = 0;
}