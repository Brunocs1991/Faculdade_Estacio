#include <iostream>
using namespace std;
#define TAM 5
int main(){
	char nome[TAM][20];
	float valores[TAM][2];
	cout << "----Entrada de dados----\n";
	for(int i=0;i<5;i++){
		cout << "nome do produto" <<i+1 <<": ";
		cin.getline(nome[i],20);
		cout <<"Valor de compra: ";
		cin >> valores[i][0];
		cout <<"valor de venda: ";
		cin >> valores [i][1];
		cin.ignore();
	}
	cout <<"----Saida de dados----\n";
	for(int i=0; i<5;i++){
		cout<<"\nProduto "<<i+1 <<": " <<nome[i];
		cout<<"\nValor de Compra: "<<valores[i][0];
		cout<<"\nValor de Venda: "<<valores[i][1];
		cout<<"\n-----------------------\n";
	}
}

