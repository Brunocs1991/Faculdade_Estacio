#include <iostream>
#include <cstdlib>
using namespace std;

int main(int argc, char** argv) {
    system("color 0a");
    int *pt = new int (1024);
    cout << "\nValor que foi inicializado: " << *pt << "\n\n";
    system("pause");
    exit;
}

