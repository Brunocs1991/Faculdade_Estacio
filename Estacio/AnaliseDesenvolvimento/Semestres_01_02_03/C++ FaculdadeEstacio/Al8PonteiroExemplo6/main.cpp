#include<iostream>
#include <string.h>
using namespace std;
struct CADASTRO{
    char nome[30];
    float nota;
};
void exibe (CADASTRO *m);
int main(int argc, char** argv) {
    system("color 0E");    
    CADASTRO aluno, *p;
    cout<<"\nNome do aluno: ";
    cin.getline(aluno.nome,30);
    cout<<"\nNota: ";
    cin>> aluno.nota;
    p=&aluno; //aponta para a estrutura
    exibe(p);
    cout<<"\n\n";
    system("pause");
    exit;
}
void exibe(CADASTRO *m){
    int c;
    for (c= 0; c<strlen(m->nome);c++)
        m->nome[c]=toupper(m->nome[c]);
    cout<<"\nDados do Aluno\n";
    cout<<"\n\nNome: "<<m->nome;// usei as duas formas para voces verem
    cout<<"\n\nNota: "<<(*m).nota;
}