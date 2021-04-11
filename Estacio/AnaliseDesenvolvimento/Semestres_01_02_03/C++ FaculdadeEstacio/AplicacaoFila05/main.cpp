/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* 
 * File:   main.cpp
 * Author: bruno
 *
 * Created on 7 de Maio de 2019, 09:47
 */
#include <cstdlib>
#include <iostream>
#include <string.h>
#define TAM 5
using namespace std;
//estrutura

struct atende {
    char paciente[TAM][35], identificacao[TAM][20];
    int inicio, fim;
};
//prototipos da funcao
void agenda(atende &fil);
void consulta(atende &fil);
void elemPrimeiro(atende &fil);
void lista(atende &fil); // para fins didaticos

int main(int argc, char** argv) {
    char resp[10];
    int op;
    atende fila;
    //inicializando a fila
    fila.inicio = 0;
    fila.fim = -1;
    do {
        system("cls");
        cout << "\nFila(FIFO - Frist in - Frist out)\n\n";
        cout << "\n1 - Inserir paciente";
        cout << "\n2 - Atender paciente";
        cout << "\n3 - Exibe primeiro paciente a ser atendido";
        cout << "\n4 - lista - QUESTAO DIDATICA. remova apos testar";
        cout << "\n5 - Sai";
        cout << "\nOpcao: ";
        cin >> resp;
        op = atoi(resp);
        system("cls");
        switch (op) {
            case 1: agenda(fila);
                break;
            case 2: consulta(fila);
                break;
            case 3: elemPrimeiro(fila);
                break;
            case 4:lista(fila);
                break;
            case 5: cout << "\nPrograma com FILA.\n";
                break;
            default: cout << "\nOPCAO INVALIDA !!!";
        }
        cout << "\n\n";
        system("pause");
    } while (op != 5);
    return 0;
}

void agenda(atende &fil) {
    char n[35], id[20];
    if (fil.fim == TAM - 1) // testando se a fila esta cheia 
        cout << "\nATENCAO. Fila Cheia\n";
    else {
        cin.get();
        cout << "\nEntre com nome: ";
        cin.getline(n, 35);
        strupr(n); // Faça um trecho com for e Toupper
        cout << "Entre com a identificacao: ";
        cin.getline(id, 20);
        strupr(id);
        fil.fim++; //atualiza o final da fila;
        strcpy(fil.paciente[fil.fim], n);
        strcpy(fil.identificacao[fil.fim], id);
    }
}

void consulta(atende &fil) {
    if (fil.inicio > fil.fim)// testando se a fila esta vazia
        cout << "\nATENCAO. Fila Vazia\n";
    else {
        cout << "\nPaciente Atendido: " << fil.paciente[fil.inicio];
        cout << "\nIdentificacao> " << fil.identificacao[fil.inicio];
        fil.inicio++; //atualiza o inicio da fila
    }
}

void elemPrimeiro(atende &fil) {
    if (fil.inicio > fil.fim)
        cout << "ATENCAO. Fila Vazia\n";
    else {
        cout << "\nProximo paciente a ser atendido: ";
        cout << fil.paciente[fil.inicio]; //*
    }
}
//* MELHORAR O ENTENDIMENTO

void lista(atende &fil) {
    int ordem = 1;
    if (fil.inicio > fil.fim)
        cout << "\nATENCAO. Fila Vazia\n";
    else {
        cout << "\nOrdem de Atendimento\n";
        for (int x = fil.inicio; x <= fil.fim; x++) {
            cout << "\n\n" << ordem++ << "o paciente ";
            cout << "\nNome do paciente: " << fil.paciente[x];
            cout << "\nIdentificacao: " << fil.identificacao[x];
        }
    }
}