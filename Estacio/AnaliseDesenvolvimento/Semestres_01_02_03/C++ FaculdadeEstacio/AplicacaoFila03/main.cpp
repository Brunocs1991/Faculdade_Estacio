/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: bruno
 *
 * Created on 6 de Maio de 2019, 17:15
 */
// FILA CIRCULAR
#include <cstdlib>
#include <iostream>
#define MAX 5
using namespace std;

struct queue {
    float circular[MAX];
    int total, inicio, final;
};
void entra(queue &fil);
void deleta(queue &fil);
void lista(queue& fil);

int main(int argc, char** argv) {

    queue fila;
    int x;
    char resp[40], s;
    // inicializa matriz
    fila.inicio = 0; //posicao do item a ser recuperado
    fila.total = 0; // total de elementos inseridos
    fila.final = 0; // posicao do fim da fila
    for (;;) {
        system("cls");
        system("color fd");
        cout << "\n    ***************";
        cout << "\n  *   I - Inserir   *";
        cout << "\n *    L - Listar     *";
        cout << "\n *    R - Remover    *";
        cout << "\n  *   S - Sair      *";
        cout << "\n    ***************\n";
        cin.getline(resp, 40);
        s = toupper(resp[0]);
        system("cls");

        switch (s) {
            case 'I': entra(fila);
                cin.get();
                break;
            case 'L': lista(fila);
                break;
            case 'R': deleta(fila);
                break;
            case 'S': system("pause");
                exit(0);
                break;
            default:cout << "OPCAO INVALIDA!!";
        }
        cout << "\n\n";
        system("pause");
    }
}

void entra(queue &fil) {
    float valor;
    if (fil.total == MAX)
        cout << "\nATENCAO. Fila Cheia\n";
    else {
        cout << "\nDigite valor: ";
        cin>>valor;
        fil.circular[fil.final] = valor;
        fil.final++;
        if (fil.final == MAX)
            fil.final = 0;
        fil.total++;
    }
}

void deleta(queue &fil) {
    if (fil.total == 0)
        cout << "\nATENCAO.  Fila Vazia\n";
    else {
        cout << "\nRemovido: " << fil.circular[fil.inicio];
        fil.inicio++;
        fil.circular[fil.inicio - 1] = -999;
        if (fil.inicio == MAX)
            fil.inicio = 0;
        fil.total--;
    }
}

void lista(queue & fil) {
    if (fil.total == 0)
        cout << "\nATENCAO. Fila Vazia\n";
    else {
        cout << "\nProximo a ser removido na posicao: " << fil.inicio;
        cout << "\nValor\tPosicao\n";
        if (fil.inicio < fil.final) {
            for (int x = fil.inicio; x < fil.final; x++)
                cout << "\n" << fil.circular[x] << "\t" << x;
        } else {
            for (int x = 0; x < MAX; x++)
                if (fil.circular[x] != -999)
                    cout << "\n" << fil.circular[x] << "\t" << x;
        }
    }
}
