/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* 
 * File:   main.cpp
 * Author: bruno
 *
 * Created on 7 de Maio de 2019, 13:47
 */
#include <iostream>
#include <cstring>
#include <cctype>
#define MAX 5
using namespace std;
// Fila Circular
struct queue {
    float circular [MAX];
    int total, inicio, final;
};
void entra(queue &fil);
void deleta(queue &fil);
void elementoPrimeiro(queue &fil);
int main(int argc, char** argv) {
    int x;
    char s;
    queue fila;
    //inicializando variaveis da fila
    fila.inicio = 0;
    fila.total = 0;
    fila.final = 0;
    for (;;) {
        system("cls");
        system("color f1");
        cout << "\n    ****************";
        cout << "\n  *  I - Inserir     *";
        cout << "\n *   L - Listar       *";
        cout << "\n *   R - Remover      *";
        cout << "\n  *  S - Sair        *";
        cout << "\n    ****************\n";
        cin >>s;
        cin.get();
        s = toupper(s);
        system("cls");
        switch (s) {
            case 'I': entra(fila);
                break;
            case 'L': elementoPrimeiro(fila);
                break;
            case 'R': deleta(fila);
                break;
            case 'S': system("pause");
                exit(0);
        }
        cout << "\n\n";
        system("pause");
    }
}
void entra(queue &fil) {
    float valor;
    if (fil.total == MAX)
        cout << "\nATENCAO. Fila Cheia \n";
    else {
        cout << "\nDigite valor: ";
        cin>> valor;
        fil.circular[fil.final] = valor;
        fil.final++;
        if (fil.final == MAX)
            fil.final = 0;
        fil.total++;
    }
}
void deleta(queue &fil) {
    if (fil.total == 0)
        cout << "\nATENCAO. Fila Vazia \n";
    else {
        cout << "\nRemovido: " << fil.circular[fil.inicio];
        fil.inicio++;
       // fil.circular[fil.inicio - 1] = -999; // comentar esta linha 
        if (fil.inicio == MAX)
            fil.inicio = 0;
        fil.total--;
    }
}
void elementoPrimeiro(queue &fil) {// lista
    if (fil.total == 0)
        cout << "\nATENCAO. Fila Vazia\n";
    else {
       /* cout << "\nProximo a ser removido na posiacao" << fil.inicio;
        cout << "\nValor\tPosicao\n";
        if (fil.inicio < fil.final) {
            for (int x = fil.inicio; x < fil.final; x++)
                cout << "\n" << fil.circular[x] << "\t" << x;
        } else {
            for (int x = 0; x < MAX; x++)
                if (fil.circular[x]!= -999)
                    cout << "\n" << fil.circular[x] << "\t" << x;
        }*/
        cout << "\nProximo a ser removido na posicao: ";
        cout << fil.inicio << "\n" << fil.circular[fil.inicio];
    }
}


