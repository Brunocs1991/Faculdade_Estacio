#include <iostream>
#include <cstdlib>
#include <algorithm>
using namespace std;

struct dados {
    int matric;
    float sal;
};

int main(int argc, char** argv) {
    system("color 4f");
    int x, nfunc;
    cout << "\nQuantos Funcionarios: ";
    cin>> nfunc;
    dados *ptr = new dados[nfunc];

    cout << "\nEndereco da primeira struct da matriz : " << &ptr[0];
    cout << "\nEndereco da primeira struct da matriz : " << &ptr[1];
   // count << &quot;
   // \nEndereco da segunda struct da matriz : &quot;
  //  << &ptr[0];
    for (x = 0; x < nfunc; x++) {
        cout << "\nDigite matricula do funcionario: ";
        cin >> ptr[x].matric;
        cout << "\nDigite salario do funcionario: ";
        cin >> ptr[x].sal;
    }
    system("cls");
    cout << "\nMatric\tSalario\n";
    for (x = 0; x < nfunc; x++)
        cout << "\n" << (ptr + x)->matric << "\t" << (ptr + x)->sal;
    cout << "\n\n";
    system("pause");

}

