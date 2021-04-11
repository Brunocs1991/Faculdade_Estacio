#include <iostream>
#include <cstdlib>
using namespace std;
struct listaDE {
    int info;
    listaDE* ant;
    listaDE* prox;
};
struct DE {
    int tam;
    listaDE* prim;
    listaDE* ult;
};
//Protótipos
DE *insereFim(DE *ptrDesc, int valor);
DE *insereInicio(DE *ptrDesc, int valor);
void exibeIpF(DE *ptrDesc);
void exibeTpF(DE *ptrDesc);
void libera(DE *ptrDesc);
void removerFim(DE *ptrDesc);
void removerInicio(DE *ptrDesc);
int main() {
    int op, valor;
    //inicializa a lista duplamente encadeada 
    DE *ptrDesc = new DE;
    ptrDesc->prim = NULL;
    ptrDesc->ult = NULL;
    ptrDesc->tam = 0;
    do {
        system("cls");
        system("color 2f");
        cout << "\n\n( () ) Alocacao Dinamica ( () )";
        cout << "\n(                             )";
        cout << "\n( 1- Insere no Inicio         )";
        cout << "\n( 2- Insere no Fim            )";
        cout << "\n( 3- Remove no Inicio         )";
        cout << "\n( 4- Remove no Fim            )";
        cout << "\n( 5- Exibe a   Lista DE IpF   )";
        cout << "\n( 6- Exibe a   Lista DE TpF   )";
        cout << "\n( 7- Libera a  Lista DE       )";
        cout << "\n( 8- Sai                      )";
        cout << "\n( Opcao:                      )";
        cout << "\n(                             )";
        cout << "\n( ( ) ) ( ( ) ) ( ( ) ) ( ( ) )\n";
        cin>>op;
        system("cls");
        system("color f2");
        switch (op) {
            case 1:cout << "\nDigite valor a ser inserido no Inicio: ";
                cin>>valor;
                ptrDesc = insereInicio(ptrDesc, valor);
                break;
            case 2:cout << "\nDigite valor a ser inserido no Fim: ";
                cin>>valor;
                ptrDesc = insereFim(ptrDesc, valor);
                break;
            case 3: if (ptrDesc->tam == 0)
                    cout << "\n\nLista vazia\n";
                else
                    removerInicio(ptrDesc);
                break;
            case 4: if (ptrDesc->tam == 0)
                    cout << "\n\nLista vazia\n";
                else
                    removerFim(ptrDesc);
                break;
            case 5: if (ptrDesc->tam == 0)
                    cout << "\n\nLista vazia\n";
                else
                    exibeIpF(ptrDesc);
                break;
            case 6: if (ptrDesc->tam == 0)
                    cout << "\n\nLista vazia\n";
                else
                    exibeTpF(ptrDesc);
                break;
            case 7: if (ptrDesc->tam != 0)
                    cout << "\nTem elementos na Lista\n";
                else {
                    libera(ptrDesc);
                    cout << "\nLiberando Memoria";
                }
                break;
            case 8: cout << "Fechando Lista Duplamente Encadedada\n";
                break;
            default: cout << "\nOpcao Invalida\n";
        }
        cout << "\n\n";
        system("pause");
    } while (op != 8);
    return 0;
}
//insere no inicio
DE *insereInicio(DE *ptrDesc, int valor) {
    listaDE *ptAux = new listaDE;
    if (ptAux != NULL) { //verifica se existe memória disponível
        ptAux->info = valor;
        ptAux->prox = ptrDesc->prim;
        ptAux->ant = NULL;
        ptrDesc->tam = ptrDesc->tam + 1;
        if (ptrDesc->prim != NULL) {
            ptrDesc->prim->ant = ptAux;
        }
        else {
            ptrDesc->ult = ptAux;
        } //ajusta ponteiro para fim 
        ptrDesc->prim = ptAux; //ajusta ponteiro início
        return ptrDesc;
    } else {
        cout << "\nSem memoria\n";
        exit(-1);
    }
}
//insere no fim
DE *insereFim(DE *ptrDesc, int valor) {
    listaDE *ptAux = new listaDE;
    listaDE *ptUlt;
    ptAux->info = valor;
    ptAux->prox = NULL;
    ptrDesc->tam = ptrDesc->tam + 1;
    if (ptrDesc->ult == NULL) {
        ptrDesc->ult = ptAux;
        ptrDesc->prim = ptrDesc->ult;
        ptAux->ant = NULL;
    } else {
        ptUlt = ptrDesc->ult;
        ptUlt->prox = ptAux;
        ptAux->ant = ptUlt;
        ptrDesc->ult = ptAux;
    }
    return ptrDesc;
}
//remove do inicio
void removerInicio(DE *ptrDesc) {
    listaDE *aux = new listaDE;

    if (ptrDesc->prim == ptrDesc->ult) { //lista com um elemento
        aux->info = ptrDesc->prim->info;
        ptrDesc->prim = NULL;
        ptrDesc->ult = NULL;
        ptrDesc->tam = ptrDesc->tam - 1;
    }
    else { //lista com mais de um elemento
        aux->info = ptrDesc->prim->info;
        ptrDesc->prim->prox->ant = NULL;
        ptrDesc->prim = ptrDesc->prim->prox;
        ptrDesc->tam = ptrDesc->tam - 1;
    }
    cout << "\nRemovido: " << aux->info;
}
//remove do fim
void removerFim(DE *ptrDesc) {
    listaDE *aux = new listaDE;

    if (ptrDesc->prim == ptrDesc->ult) { //lista com um elemento
        aux->info = ptrDesc->prim->info;
        ptrDesc->prim = NULL;
        ptrDesc->ult = NULL;
        ptrDesc->tam = ptrDesc->tam - 1;
    }
    else { //lista com mais de um elemento
        aux->info = ptrDesc->ult->info;
        ptrDesc->ult->ant->prox = NULL;
        ptrDesc->ult = ptrDesc->ult->ant;
        ptrDesc->tam = ptrDesc->tam - 1;
    }
    cout << "\nRemovido: " << aux->info;
}
// exibe lista IpF
void exibeIpF(DE *ptrDesc) {
    listaDE* ptr = ptrDesc->prim;
    cout << "\nExibe a lista do primeiro para o ultimo\n";
    for (int i = 1; i <= ptrDesc->tam; i++) {
        cout << "\n" << ptr->info;
        ptr = ptr->prox;
    }
}

// exibe lista TpF
void exibeTpF(DE *ptrDesc) {
    listaDE* ptr = ptrDesc->ult;
    cout << "\nExibe a lista do ultimo para o primeiro \n";
    for (int i = ptrDesc->tam; i >= 1; i--) {
        cout << "\n" << ptr->info;
        ptr = ptr->ant;
    }
}
//libera
void libera(DE *ptrDesc) {
    delete ptrDesc;
    ptrDesc = 0;
}