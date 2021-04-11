#include <iostream>
using namespace std;
void insere(int IDS[], int idade, int &t, int tamanho);
void exibe(int IDS[], int t);
void selecao(int IDS[], int t);
void frequencias(int IDS[], int t);

int main() {
    int tam, op, f3 = 0, idades[10], id;

    //Inicialização 
    tam = 0;
    do {
        system("cls");
        cout << "\nMenu 2 - LISTA \n";
        cout << "\n0- Reinicar a LISTA";
        cout << "\n1- Inserir idade na lista";
        cout << "\n2- Exibir lista";
        cout << "\n3- Ordenar lista";
        cout << "\n4- Exibe frequencia";
        cout << "\n5- Sair";
        cout << "\nOpcao: ";
        cin>>op;
        system("cls");
        switch (op) {
            case 0: //reinicialiação 
                tam = 0;
                break;
            case 1:
                cout << "\nDigite idade(10-19) a ser inserida na Lista: ";
                cin >> id;
                while (id < 10 || id > 19) {
                    cout << "\nAtencao para o intervalo.";
                    cout << "\nDigite idade(10-19) a ser inserida na Lista: ";
                    cin>>id;
                }
                insere(idades, id, tam, 10);
                break;
            case 2: exibe(idades, tam);
                break;
            case 3: //ordena Metodo selecao poderia ser insercao ou bolha
                selecao(idades, tam);
                f3 = 1;
                break;
            case 4:if (f3 == 1)
                    frequencias(idades, tam);
                else
                    cout << "\nOrdene primeiro o vetor\n";
                break;
            case 5: cout << "\nFinalizando o programa da LISTA\n";
                break;
            default: cout << "\nOpcao invalida\n";
        }
        cout << "\n\n";
        system("pause");
    } while (op != 5);
}

void insere(int IDS[], int idade, int &t, int tamanho) {
    if (tamanho == t)
        cout << "\nAtencao! Lista cheia\n";
    else {
        IDS[t] = idade;
        t++;
    }
}

void exibe(int IDS[], int t) {
    int x;
    if (t == 0)
        cout << "\nAtencao! Lista vazia\n";
    else
        for (x = 0; x < t; x++)
            cout << "\n" << IDS[x];
}

void selecao(int IDS[], int t) {
    int i, j, menor, temp;
    if (t == 0)
        cout << "\nAtencao! Lista vazia\n";
    else {
        for (i = 0; i < t - 1; i++) {
            menor = i;
            for (j = i + 1; j < t; j++)
                if (IDS[j] < IDS[menor])
                    menor = j;
            temp = IDS[i];
            IDS[i] = IDS[menor];
            IDS[menor] = temp;
        }
    }
    cout << "\nLista Ordenada\n";
}

void frequencias(int IDS[], int t) {
    int i, c, frequencia[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    if (t == 0)
        cout << "\nAtencao! Lista vazia\n";
    else {
        for (i = 0; i < t; i++) {
            frequencia[IDS[i] - 10]++;
            cout << "\n" << IDS[i] << "\t" << frequencia[IDS[i] - 10]; //SÓ PARA FINS DIDÁTICOS
        }
        // exibe frequência dos números sem repetição
        cout << "\n\nIdade\tFrequencia\n";
        cout << "\n" << IDS[0] << "\t" << frequencia[IDS[0] - 10];
        for (i = 1; i < t; i++)
            if (IDS[i] != IDS[i - 1])
                cout << "\n" << IDS[i] << "\t" << frequencia[IDS[i] - 10];
    }
}
