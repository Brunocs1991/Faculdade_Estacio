/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: bruno
 *
 * Created on 6 de Maio de 2019, 19:21
 */

#include <cstdlib>
#include <iostream>
#include <string.h>
#define MAX 5
using namespace std;
struct queue {
    char f[5][255];
    int lpos, rpos, qtdadl;
};
void entra(queue &fil);
void deleta(queue &fil);
void lista(queue &fil);
int main(int argc, char** argv) {
    char resp[40], s;
    queue fila;
    int x;
    //inicializa matriz
    fila.lpos = 0; //posicao de armazenamento livre
    fila.rpos = 0; //posicação de item a ser reciperado
    fila.qtdadl = 0; //total de elementos inseridos 
    for (;;) {
        system("cls");
        system("color 1f");
        cout << "\n   *****************************";
        cout << "\n *    I - Inserir Compromisso    *";
        cout << "\n*     L - Listar  Compromissos    *";
        cout << "\n*     R - Remover Compromisso     *";
        cout << "\n *            S - Sair           *";
        cout << "\n   *****************************\n";
        cin.getline(resp, 40);
        s = toupper(resp [0]);
        system("cls");
        switch (s) {
            case 'I': entra(fila);
                break;
            case 'L': lista(fila);
                break;
            case'R': deleta(fila);
                break;
            case 'S': system("pause");
                exit(0);
                break;
            default: cout << "OPCAO INVALIDA!!!";
        }
        cout << "\n\n";
        system("pause");
    }
}
// insere evendo na agenda
void entra(queue &fil) {
    char s[255];
    if (MAX == fil.qtdadl) {
        cout << "\nATENCAO. Agenda Cheia\n";
        return;
    }
    if (fil.lpos == MAX) {
        fil.lpos = 0;
    }
    cout << "\nEntre com o proximo evento\n";
    cin.getline(s, 255);
    if (strcmp(s, "\0") == 0)
        return; //nenhuma entrada
    strcpy(fil.f[fil.lpos], s);
    fil.lpos++;
    fil.qtdadl++;
}
// apaga um evento
void deleta(queue &fil) {
    if (fil.qtdadl == 0) {
        cout << "\nNenhum compromisso\n";
        return;
    }
    fil.qtdadl--;
    cout << "\n" << fil.f[fil.rpos] << ",cumprido";
    fil.rpos++;
    if (fil.rpos == MAX) {
        fil.rpos = 0; // reinicialização
    }
}
//exibe agenda
void lista(queue &fil) {
    if (fil.qtdadl == 0) {
        cout << "\nNenhum compromisso\n";
        return;
    }
    cout << "\nProximo compromisso --> " << fil.f[fil.rpos];
}

