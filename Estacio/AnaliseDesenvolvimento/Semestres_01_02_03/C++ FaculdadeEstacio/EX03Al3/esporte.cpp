/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: bruno
 *
 * Created on 22 de Fevereiro de 2019, 09:02
 */

#include <iostream>
#include <string.h>
#include <stdlib.h>

using namespace std;

/*
 * 
 */
int main() {

    struct cadastro {
        char nome[30], esporte [15], categoria [15], telefone[17];
        float ajudCusto;
        int anoNasc;
    };

    cadastro atleta;
    strcpy(atleta.nome, "Danilo Cavalcanti Araujo");
    strcpy(atleta.esporte, "Volei");
    strcpy(atleta.categoria, "Adulto");
    strcpy(atleta.telefone, "(12) 9268-9106");
    atleta.ajudCusto = 2500.00;
    atleta.anoNasc = 1957;

    cout << "\n\t*********************** Cadrasto ************************\n";
    cout << "\n\t|-> Nome atetla: " << atleta.nome;
    cout << "\n\t|-> Esporte: " << atleta.esporte << "\tCategoria: " << atleta.categoria;
    cout << "\n\t|-> Ano Nascimento: " << atleta.anoNasc << "\tTelefone: " << atleta.telefone;
    cout << "\n\t|-> Ajuda de Custo: " << atleta.ajudCusto;
    cout << "\n\n\t*********************************************************";
    cout << "\n\n";
    system("pause");
}

