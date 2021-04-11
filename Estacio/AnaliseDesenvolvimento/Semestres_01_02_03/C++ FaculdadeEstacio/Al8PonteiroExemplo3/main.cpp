#include<iostream>
using namespace std;

int main(int argc, char** argv) {
    system("color 1e");
    int ano = 1989, *ptrAno;
    ptrAno = &ano; // o endereço da variavel foi atribuida ao ponteiro ptrAno
    cout << "\nConteudo da variavel ano: " << ano;
    cout << "\n\nEndereço da variavel ano: " << &ano;
    cout << "\n\nConteudo da variavel ptrAno: " << ptrAno;
    cout << "\n\nConteudo do endereco apontado pela variavel ptrAno: "<<*ptrAno;
    cout<<"\n\n";
    system("pause");
    exit;
}

