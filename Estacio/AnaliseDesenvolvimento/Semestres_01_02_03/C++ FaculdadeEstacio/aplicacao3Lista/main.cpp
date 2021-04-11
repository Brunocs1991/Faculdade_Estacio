#include<iostream>
#include <cstring>
using namespace std;

struct dado {
    char nome [31];
    float CR;
};
void entraNome(char nome[]);
float entraCR();
void insereOrdenado(dado AL[], char nome[], float CR, int &t, int tamanho);
void exibe(dado AL[], int t);
void alteraCR(dado AL[], int t);
void remove(dado AL[], int &t);

int main() {
    dado alunos[5];
    int tam, op, f3 = 0;
    float nt;
    char n[31];

    // inicialização
    tam = 0;
    do {
        system("cls");
        cout << "\nMenu 3 - lista \n";
        cout << "\n0 - Reiniciar a LISTA";
        cout << "\n1 - Inserir dados Ordenados pelo nome na LISTA";
        cout << "\n2 - Exibir LISTA";
        cout << "\n3 - Alterar CR";
        cout << "\n4 - Sair";
        cout << "\nOpcao: ";
        cin >> op;
        system("cls");
        switch (op) {
            case 0: // reinicializaçao
                tam = 0;
                break;
            case 1:
                entraNome(n);
                nt = entraCR();
                insereOrdenado(alunos, n, nt, tam, 5);
                break;
            case 2:
                exibe(alunos, tam);
                break;
            case 3:
                alteraCR(alunos, tam);
                break;
            case 4: cout << "\nFinalizando o programa da LISTA\n";
                break;
            default:cout<< "\nOpcao invalida\n";
        }
        cout << "\n\n";
        system("pause");
    } while (op != 4);
}

void entraNome(char nome[]) {
    int x;
    char lixo[100];
    cin.get();
    cout << "\nNome ate 30 caracteres: ";
    cin.getline(lixo, 100);
    while (strlen(lixo) > 30) {
        cout << "\nExcede numero de caracteres permitidos.";
        cout << "Nome ate 30 caracteres: ";
        cin.getline(lixo, 100);
    }
    strcpy(nome, lixo);
    for (x = 0; x < strlen(lixo); x++)
        nome[x] = toupper(nome[x]);
}

float entraCR() {
    float nt;
    cout << "\nCR: ";
    cin >> nt;
    while (nt < 0 || nt > 10) {
        cout << "\nCR invalido";
        cout << "\nCR: ";
        cin>>nt;
    }
    return nt;
}

void insereOrdenado(dado AL[], char nome[], float CR, int &t, int tamanho) {
    int i, c;
    if (tamanho == t)
        cout << "\nAtencao! Lista Cheia\n";
    else if (t > 0) {
        //Procura a posição de inserção
        c = 0;
        while (strcmp(nome, AL[c].nome) > 0 && c < t)
            c++;
        // desloca os structs para baixo
        for (i = t; i >= c + 1; i--)
            AL[i] = AL[i - 1];
        //Copia no struct
        AL[c].CR = CR;
        strcpy(AL[c].nome, nome);
        t++; //incrementa quantidade de nós na lista
    } else {
        AL[0].CR = CR;
        strcpy(AL[0].nome, nome);
        t++;
    }
}

void exibe(dado AL[], int t) {
    int x;
    if (t == 0)
        cout << "\nAtencao! Lista vazia\n";
    else
        cout << "\nCR\tNome\n";
    for (x = 0; x < t; x++)
        cout << "\n" << AL[x].CR << "\t" << AL[x].nome;
}
void alteraCR(dado AL[], int t){
    int fim, meio, inicio =0;
    char procura[31];
    float nt;
    entraNome(procura);
    fim = t-1;
    meio = (inicio+fim)/2;
    while(strcpy(procura,AL[meio].nome)!= 0 && inicio != fim){
        if(strcmp(procura, AL[meio].nome)>0)
            inicio = meio +1;
        else
            fim = meio;
        meio = (inicio+fim)/2;
    }
    if(strcmp(AL[meio].nome,procura)==0){
        cout<<"\nCR atual:" <<AL[meio].CR<< endl;
        nt=entraCR();
        AL[meio].CR=nt;
    }
    else
        cout<<"\nNome não encontrado\n";
}