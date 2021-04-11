#include <iostream>
using namespace std;

int main(int argc, char** argv) {

	int quantia;
	int nota50;
   	int nota20;
   	int nota10;
   	int nota5;
   	int nota2;
   	int moeda1;
   	
   	cout<< "Favor informar Valor Saque: ";
	cin>>quantia;
	
	nota50 =quantia / 50;
   	nota20 =(quantia % 50) / 20;
   	nota10 =((quantia % 50) %20) / 10;
   	nota5  =(((quantia % 50) %20)%10) / 5;
   	nota2  =((((quantia % 50) %20)%10)%5)/ 2;
   	moeda1 =(((((quantia % 50) %20)%10)%5)%2) / 1;
   	
   	cout<<"Quantia de saque: "<<quantia<< endl;
	cout<<"Total notas de 50 = "<<nota50<< endl;
   	cout<<"Total notas de 20 = "<<nota20<< endl;
   	cout<<"Total notas de 10 = "<<nota10<< endl;
   	cout<<"Total notas de 5 = "<<nota5<< endl;
   	cout<<"Total notas de 2 = "<<nota2<< endl;
   	cout<<"Total moedas de 1 = "<<moeda1<< endl;
   	
   	system("pause");
   
		
	return 0;
}
