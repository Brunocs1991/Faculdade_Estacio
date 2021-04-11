#include <iostream>
using namespace std;
void Beep(int Tempo); //prototipo da fução

int main(void) {
    Beep(10); //chama a função a ser executada
    system("pause > null");
}

void Beep(int NroVezes) {
    int Ind;
    for (Ind = 0; Ind < NroVezes; Ind++) {
        cout << '\x07';

    }
}