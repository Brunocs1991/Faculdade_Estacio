#include <iostream>
#include <cstdlib>

using namespace std;

int main(int argc, char** argv) {
    int p, *ptr1, *ptr2;
    ptr1 = &p;
    *ptr1 = 1918;
    cout << "\nEnderecos - p: " << &p << "\t\tptr1: " << &ptr1 << "\t\tptr2: " << &ptr2;
    ptr2 = new int;
    *ptr2 = 15;
    cout << "\n\nConteudo de ptr2: " << ptr2 << "\tconteudo do endereco apontado: " << *ptr2;
    cout << "\n\nConteudo de p: " << p;
    cout << "\nconteudo do endereco apontado por ptr1: " << *ptr1;
    cout << "\nconteudo do endereco apontado por ptr2: " << *ptr2;
    ptr1 = new int;
    ptr2 = ptr1;
    *ptr1 = 1518;
    cout << "\n\nConteudo de ptr1: " << ptr1 << "\tconteudo de ptr2: " << ptr2;
    cout << "\n\nConteudo de p: " << p;
    cout << "\nconteudo do endereco apontado por ptr1: " << *ptr1;
    cout << "\nconteudo do endereco apontado por ptr2: " << *ptr2;
    delete ptr1;
    delete ptr2;
    cout << "\n\n";
    system("pause");

}

