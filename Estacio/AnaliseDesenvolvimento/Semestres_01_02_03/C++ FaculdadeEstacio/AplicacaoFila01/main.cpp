/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: bruno
 *
 * Created on 6 de Maio de 2019, 08:44
 */
#include <iostream>
#include <cstdlib>
#define TAM 5

using namespace std;

/*
 * 
 */
// variavel global

struct queue {
    float f[TAM];
    int inicio, fim;
};
void enfileira(queue &fil);
void desenfileira(queue &fil);
void elemPrimeiro(queue &fil);
void situacaoFila(queue& fil);

int main(int argc, char** argv) {

    char resp [10];
    int op;
    queue fila;
    // inicializa a fila
    fila.inicio = 0;
    fila.fim = -1;

    do {
        system("cls");
        system("color 2f");
        cout << "\nFILA (FIFO - Frist In - Frist Out )\n\n";
        cout << "\n1 - Inserir um valor na fila";
        cout << "\n2 - Remover um valor na fila";
        cout << "\n3 - Mostrar o elemento do inicio da fila";
        cout << "\n4 - Mostrar situacao da fila";
        cout << "\n5 - Sai";
        cout << "\nOpcao: ";

        cin>> resp;
        op = atoi(resp);
        system("cls");

        switch (op) {
            case 1: enfileira(fila);
                break;
            case 2: desenfileira(fila);
                break;
            case 3: elemPrimeiro(fila);
                break;
            case 4: situacaoFila(fila);
                break;
            case 5:"\nPrograma basico da Fila\n";
                break;
            default: cout << "\nOPCAO INVALIDA\n";
        }
        cout << "\n\n";
        system("pause");

    } while (op != 5);

}

void enfileira(queue &fil) {
    float valor;
    if (fil.fim == TAM - 1) /*Testando se a fila esta cheia*/ {
        cout << "\nATENCAO. Fila Cheia \n";
    } else {
        cout << "Digite o Valor a ser enfileirado: ";
        cin >> valor;
        fil.fim++; //atualiza o valor final da fila
        fil.f[fil.fim] = valor; // guarda o valor no final da fila        
    }
}

void desenfileira(queue &fil) {
    if (fil.inicio > fil.fim) /*testando se a fila esta vazia*/ {
        cout << "\nATENCAO. Fila Vazia\n";
    } else {
        cout << "\nValor Removido: " << fil.f[fil.inicio]; //exibe o valor "removido"
        fil.inicio++; //Atualiza o inicio da fila
    }
}

void elemPrimeiro(queue &fil) {
    if (fil.inicio > fil.fim) /*Testando se a fila esta vazia*/ {
        cout << "\nATENCAO. Fila Vazia\n";
    } else {
        cout << "\nElemento do Inicio da fila: " << fil.f[fil.inicio];
    }
}

void situacaoFila(queue &fil) {
    if (fil.inicio > fil.fim) /*Testando se a fila esta vazia*/ {
        cout << "\nATENCAO. Fila Vazia\n";
    } else {
        cout << "\nTotal de elementos da fila: " << fil.fim - fil.inicio + 1 << "\n";
        cout << "\n\nEspaco disponivel na fila: " << TAM - (fil.fim + 1) << "\n";
        cout << "\n\nPosicao do primeiro elemento da fila: " << fil.inicio << "\n";
        cout << "\n\nPosicao do ultimo elemento da fila: " << fil.fim << "\n";
        cout << "\nPARA FINAIS DIDATICOS EXIBINDO A FILA\n";
        cout << "\nValor\t Posicao no Vetor\n";
        for (int x = fil.inicio; x <= fil.fim; x++) {
            cout << "\n" << fil.f[x] << "\t" << x;
        }
    }
}



