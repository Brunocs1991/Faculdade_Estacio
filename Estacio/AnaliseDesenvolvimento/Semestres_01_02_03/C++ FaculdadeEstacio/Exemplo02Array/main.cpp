#include<iostream>
#include <cctype>
#include <string.h>
using namespace std;

int main() {

    struct cad {
        char pal[21];
    } palavra[2];
    int x, y;
    for (x = 0; x < 2; x++) {
        cout << "\n\tPalavra: ";
        cin.getline(palavra[x].pal, 21);
    }
    palavra[0].pal[0] = toupper(palavra[0].pal[0]);
    system("cls");
    for (x = 0; x < 2; x++) {
        for (y = 0; y < strlen(palavra[x].pal); y++)
            cout << "\n" << palavra[x].pal[y];
        cout << "\n\n";
    }
    //    for (x = 0; x < 2; x++) {
    //        for (y = 0; y < palavra[x].pal[y] != '\0'; y++)
    //            cout << "\n\t" << palavra[x].pal[y];
    //        cout << "\n\n";
    //      }
    cout << "\n\n";
    system("pause");
}