#include <iostream>
#include <cstdlib>
using namespace std;

int main() {
    int p, *ptr1, *ptr2;
    ptr1 = &p;
    *ptr1 = 1918;
    ptr2 = new int;
    *ptr2 = 15;
    cout << "\nValores das tres variaveis - p: " << p << "\tptr1: " << *ptr1 << "\tptr2: " << *ptr2;
    ptr1 = new int;
    ptr2 = ptr1;
    *ptr1 = 1518;
    cout << "\nValores das tres variaveis - p: " << p << "\tptr1: " << *ptr1 << "\tptr2: " << *ptr2;
    delete ptr1;
    delete ptr2;
    cout << "\n\n";
    system("pause");
}