#include <cstdlib>
#include<iostream>
using namespace std;

int main(int argc, char** argv) {
    system("color f1");

    struct nodo {
        int num;
        struct nodo* prox;
    };
    nodo* no1 = new nodo;
    //criando primeiro no
    no1 -> num = 23;
    no1 -> prox = NULL;
    //criando segundo no
    nodo* no2 = new nodo;
    no1 -> prox = no2;
    no2 -> num = 13;
    no2 -> prox = NULL;
    //exibindo 
    cout << "\nValor do no1: " << no1->num;
    cout << "\nValor do no3: " << no2->num;
    cout << "\n\nEndereco do no1: " << no1;
    cout << "\nEndereco do no2: " << no2;
    cout << "\n\nEndereco apontado por n1: " << no1->prox;
    cout << "\nEndereco apontado por n2: " << no2->prox;
    delete no1;
    no1 = 0;
    delete no2;
    no2 = 0;
    cout << "\n\n";
    system("pause");
    return 0;
}

