/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* 
 * File:   main.cpp
 * Author: bruno
 *
 * Created on 8 de Abril de 2019, 20:24
 */
#include <iostream>
#include <cstdlib>
#include <string.h>
#define TAM 5
using namespace std;

struct atende {
    char identificacao [TAM][60];
    long long notaFiscal[TAM];
    int codigoSaida[TAM], topo;
};
void empilha(atende &pilha);
void desempilha(atende &pilha);
void mostraTopo(atende &pilha);
void lista(atende &pilha);

int main(int argc, char** argv) {
    int op;
    atende carros;
    carros.topo = -1;
    do {
        system("cls");
        cout << "\nPILHA( LIFO- Last In - First Out )\n\n";
        cout << "\n1- Inserir carro";
        cout << "\n2- Remover carro";
        cout << "\n3- Mostrar o primeiro carro a sair";
        cout << "\n4- listar - QUESTAO DIDATICA. Remova depois que testar";
        cout << "\n5- Sai";
        cout << "\nOpcao: ";
        cin>>op;
        system("cls");
        switch (op) {
            case 1: cin.get();
                empilha(carros);
                break;
            case 2: desempilha(carros);
                break;
            case 3: mostraTopo(carros);
                break;
            case 4: lista(carros);
                break;
            case 5: cout << "\nAplicacao da PILHA\n";
                break;
            default: cout << "\nOPCAO INVALIDA\n";
        }
        cout << "\n\n";
        system("pause");
    } while (op != 5);
}

void empilha(atende &pilha) {
    char id[60];
    long long nf;
    int codS;
    if (pilha.topo == TAM - 1)
        cout << "\nATENCAO. Carreta  Cheia\n";
    else {
        cout << "\nProprietatio/ Tipo de carro/ Destino:";
        cin.getline(id, 60);
        cout << "\nNota Fiscal: ";
        cin>>nf;
        cout << "\nCodigo de saida: ";
        cin>>codS;
        pilha.topo++; //atualiza o topo
        // pilha recebe valor
        strcpy(pilha.identificacao[pilha.topo], id);
        pilha.notaFiscal[pilha.topo] = nf;
        pilha.codigoSaida[pilha.topo] = codS;
    }
}

void desempilha(atende &pilha) {
    if (pilha.topo == -1)
        cout << "\nATENCAO. Carreta Vazia \n";
    else {
        cout << "\nCodigo do carro entregue: "; //*
        cout << pilha.codigoSaida[pilha.topo];
        cout << "\nNota fiscal do carro entregue: "; //*
        cout << pilha.notaFiscal[pilha.topo];
        cout << "\nIdentificacao do carro entregue: "; //*
        cout << pilha.identificacao[pilha.topo];
        pilha.topo--; //atualiza o topo 
    }
}//* MELHORAR O ENTENDIMENTO. 

void mostraTopo(atende &pilha) {
    if (pilha.topo == -1)
        cout << "\nATENCAO. Carreta Vazia \n";
    else {
        cout << "\nCodigo do carro: "; //*
        cout << pilha.codigoSaida[pilha.topo];
        cout << "\nNota fiscal do carro: "; //*
        cout << pilha.notaFiscal[pilha.topo];
        cout << "\nIdentificacao do carro: "; //*
        cout << pilha.identificacao[pilha.topo];
    }
} //* MELHORAR O ENTENDIMENTO. 

void lista(atende &pilha) {
    if (pilha.topo == -1)
        cout << "\nATENCAO. Carreta Vazia \n";
    else {
        cout << "\nOrdem de Saida\n";
        for (int x = pilha.topo; x >= 0; x--) {
            cout << "\n\n" << x + 1 << "o carro";
            cout << "\nCodigo do carro: " << pilha.codigoSaida[x];
            cout << "\nNota fiscal do carro: " << pilha.notaFiscal[x];
            cout << "\nIdentificacao do carro: "; //*
            cout << pilha.identificacao[x];
        }
    }
} //* MELHORAR O ENTENDIMENTO. 



