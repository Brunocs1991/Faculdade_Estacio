/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: bruno
 *
 * Created on 6 de Maio de 2019, 16:05
 */

#include <cstdlib>
#include <iostream>
#include <string.h>
#define MAX 5
using namespace std;

struct queue {
    char f[5][255];
    int lpos, rpos;
};

void entra(queue& fil);
void deleta(queue& fil);
void lista(queue& fil);

int main(int argc, char** argv) {
    char resp[40], s;
    queue fila;
    int x;
    //  inicializa matriz
    fila.lpos = 0; //posicao de armazenamento livre
    fila.rpos = 0; //posicao do item a ser recuperado
    for (;;) {
        system("cls");
        system("color f1");
        cout << "\n************************************";
        cout << "\n*      I - Inserir compromisso     *";
        cout << "\n*      L - Listar compromisso      *";
        cout << "\n*      R - Remover compromisso     *";
        cout << "\n*      S - Sair                    *";
        cout << "\n************************************\n";
        cin.getline(resp, 40);
        s = toupper(resp[0]);
        system("cls");
        switch (s) {
            case 'I': entra(fila);
                break;
            case 'L': lista(fila);
                break;
            case 'R': deleta(fila);
                break;
            case 'S':system("pause");
                return 0;
                break;
            default: cout << "\nOpcaoInvalida";
        }
        cout << "\n\n";
        system("pause");
    }
}
//insere um evento na agenda

void entra(queue &fil) {
    char s[255];
    if (fil.lpos == MAX) {
        cout << "\nATENCAO. Agenda Cheia\n";
        return;
    }
    cout << "\nEntre com o " << fil.lpos + 1 << "o evento\n";
    cin.getline(s, 255);
    strcpy(fil.f[fil.lpos], s);
    fil.lpos++;
}
//Apaga um evendo da agenda

void deleta(queue &fil) {
    if (fil.rpos == fil.lpos) {
        cout << "\nNenhum compromisso\n";
    } else {
        cout << "\n" << fil.f[fil.rpos] << ", cumprido";
        fil.rpos++;
    }
}
//exibe agenda

void lista(queue & fil) {
    if (fil.rpos == fil.lpos) {
        cout << "\nNenhum compromisso\n";
    } else {
        cout << "\nRelacao dos compromissos\n";
        for (int t = fil.rpos; t < fil.lpos; ++t) {
            cout << "\n" << t + 1 << " - " << fil.f[t];
        }
    }
}
/*Este programa ?? uma adapta????o do c??digo da pagina 529 do livro
 C completo e Total de Hebert Shildt. o programa usava uma matriz
 de ponteiros e aloca????o din??mica. usei estrutura heterog??nea e fila
 sequencial com aloca????o est??tica de tamanho 5 para que voc?? possa
 testar, mas pode aumentar, se desejar, na diretiva que define. */