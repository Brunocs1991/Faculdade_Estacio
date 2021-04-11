#include <iostream>
	#using namespace std;
 
int main(int argc, char** argv) {
	
	float kmpercorridos;
	float litrosabastecidos;
	
	cout << "\ninformar apenas numeros com ponto no lugar da virgula exemplo: 1.0";
	cout << "\nInformar quilometros percorridos: ";
	cin >> kmpercorridos;
	cout << "Informar quantidade abastecida: ";
	cin >> litrosabastecidos;
	cout <<"\n";
	cout << "CONSUMO FEITO............:" <<kmpercorridos/litrosabastecidos <<" km por litro";
	cout <<"\n";
	system ("pause");
	return 0;
}
