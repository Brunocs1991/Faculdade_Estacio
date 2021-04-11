#include<iostream>
using namespace std;

struct manipulaNumeros {

    int contarAlgarismos(int num) {
        int cont = 0;
        while (num > 0) {
            cont++;
            num /= 10;
        }
        return cont;
    }

    void quocrestro(int a, int b) {
        int aux;
        if (a < b) {
            aux = a;
            a = b;
            b = aux;
        }

        cout << "\n\tQuociente: " << a / b;
        cout << "\n\tResto: " << a % b;
    }
};

int main() {
    int n1, n2;
    manipulaNumeros num;
    cout << "\n\tDigite um numero inteiro: ";
    cin>>n1;
    cout << "\n\tTotal de algarismos: " << num.contarAlgarismos(n1);
    cout << "\n\t-----------------------";
    cout << "\n\tDigite um numero inteiro: ";
    cin>> n1;
    cout << "\n\tDigite outro numero inteiro: ";
    cin>>n2;
    num.quocrestro(n1, n2);
    cout << "\n\n";
    system("pause");

}