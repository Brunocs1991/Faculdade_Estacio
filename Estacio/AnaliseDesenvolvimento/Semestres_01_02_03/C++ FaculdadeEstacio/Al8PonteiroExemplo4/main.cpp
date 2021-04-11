#include<iostream>
using namespace std;

int main(int argc, char** argv) {
    system("color F0");
    int a = 13, j = 23, *pa, *pj;
    pa = &a;
    pj = &j;
    cout << "\nConteudo de a: " << a;
    cout << "\nConteudo de j: " << j;
    cout << "\nConteudo de pa: " << pa;
    cout << "\nConteudo do endereco apontado por pa: " << *pa;
    cout << "\nConteudo de pj: " << pj;
    cout << "\nConteudo do endereco apontado por pj: " << *pj;
    cout << "\n\n";
    system("pause");
    exit;
}

