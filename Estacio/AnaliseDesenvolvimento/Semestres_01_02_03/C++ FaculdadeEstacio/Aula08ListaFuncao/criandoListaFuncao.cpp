#include <iostream>
#include <cstdlib>
using namespace std;
struct nodo {
    int num;
    struct nodo *prox;
};
nodo * insereFrente(nodo* ptr, int valor);
int main(int argc, char** argv) {
    // cor
    system("color 1f");
    int c;
    nodo *lista = NULL;
    //primeiro no;
    lista = insereFrente(lista, 23);
    //segundo no;
    lista = insereFrente(lista, 13);
    //terceiro no;
    lista = insereFrente(lista, 15);
    //quarto no;
    lista = insereFrente(lista, 18);
    // listando
    c = 1;
    cout<<"\n\nUsando estrutura de Repeticao\n";
    while(lista){
        cout<<"\nValor do "<<c<<"o no: "<< lista -> num;
        lista = lista->prox;
        c++;
    }
    // liberando
    delete lista;
    lista =0;
    cout<<"\n\n";
    system("pause");

}
nodo* insereFrente(nodo *ptr, int valor) {
    nodo *temp = new nodo;
    temp -> num = valor;
    temp -> prox = ptr;
    return temp;
}