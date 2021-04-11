#include <iostream>
using namespace std;

int main() {

    float *ptF = new float; // ponteiro de float inicialização sem valor
    int *ptI = new int (1989); // ponteiro de int inicializado e atribuido valor
    int *pt = new int [3]; // ponteiro de inteiro inicializado com vetor de 3 posições unidimensional 0,1,2
    *ptF = 34.5; //atribuindo valor para um ponteiro inicializado
    *(pt) = 34; // atrubuindo valor para primeira posição do vetor
    *(pt + 1) = 55; // atrubuindo valor para segunda posição do vetor
    *(pt + 2) = 90; // atrubuindo valor para terceira posição do vetor

    cout << "\n\nConteudo de pt: " << pt;
    cout << "\tConteudo do endereco apontado: " << *pt;
    cout << "\n\nConteudo de ptI: " << ptI;
    cout << "\tconteudo do endereco apontado: " << *ptI;
    cout << "\n\nConteudo de ptF: " << ptF;
    cout << "\tconteudo do endereco apontado: " << *ptF;
    cout << "\n\nConteudo do vetor\n";
    cout << "\n" << *pt << "\t" << *(pt + 1) << "\t" << *(pt + 2);
    delete ptF;
    delete ptI;
    delete pt;
    cout << "\n\n";
    system("pause");

    return 0;
}