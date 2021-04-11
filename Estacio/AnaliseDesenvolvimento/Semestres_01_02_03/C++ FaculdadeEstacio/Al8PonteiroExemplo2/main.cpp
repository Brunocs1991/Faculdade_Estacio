#include <iostream>
using namespace std;

int main(int argc, char** argv) {
    system("color 3E");
    float a = 8, *ptr = &a;
    cout << "\nConteudo do endereco apontado por prt: " << *ptr;
    cout<<"\n\n";
    system("pause");
    return 0;
}

