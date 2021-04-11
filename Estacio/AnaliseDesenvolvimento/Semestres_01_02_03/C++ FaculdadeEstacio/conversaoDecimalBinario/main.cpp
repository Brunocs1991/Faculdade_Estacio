#include <iostream>
#define TAM 40
using namespace std;
void empilha(int p[], int &t, int v);
int desempilha(int p[], int &t, int &v);

int main() {
    float n; //para possibilidar a entrada e numero maior que o inteiro permite
    int num, resto, pilha [TAM], sinal, topo = -1; // inicialização da pilha pelo topo = -1
    system("color 2f");
    cout << "\n##########################################################";
    cout << "\n###                                                    ###";
    cout << "\n### Converte Numero da base decimal para base binaria  ###";
    cout << "\n###                                                    ###";
    cout << "\n##########################################################\n";
    cout << "\nDigite numero positivo ate 2147483520. Qualquer outro sai: ";
    cin >>n;
    if (n > 2147483520 || n < -2147483520) {
        exit(0); // limite do intervalo do inteiro
    } else {
        num = (int) n; //converte real para inteiro
    }
    while (num >= 0) {
        do { // incio do trecho que empilha o restos que irão gerar o número binario
            resto = num % 2;
            empilha(pilha, topo, resto);
            num /= 2;
        } while (num > 0); // fim do trecho de empilhamento
        cout << "\nConvertido para binario: ";
        sinal = desempilha(pilha, topo, resto); //inicio do trecho que desempilha todos
        while (sinal == 1) {// os restos que irão exibir o numero binario
            cout << resto;
            sinal = desempilha(pilha, topo, resto);

        }// final do trecho que desempilha
        topo = -1;
        cout << "\nDigite numero positivo ate 2147483520. Qualquer outro sai: ";
        cin >>n;
        if (n > 2147483520 || n < -2147483520) {
            exit(0); // limite do intervalo do inteiro
        } else {
            num = (int) n; //converte real para inteiro
        }

    }
    cout << "\n\n";
    system("pause");
}

void empilha(int p[], int&t, int v) {
    if (t == TAM - 1) { //  não nescessario ja limitado tamanho da entrada
        cout << "\nATENCAO. Pilha Cheia\n"; // usado para usar usar o mesmo trecho
    } else {
        t++; //atualiza tamanho da pilha;
        p[t] = v; // pilha recebe valor;
    }
}

int desempilha(int p[], int &t, int &v) {
    if (t == -1) {
        return 0;
    } else {
        v = p[t]; // guarda valor do topo
        t--; // atualiza o topo
        return 1;
    }
}