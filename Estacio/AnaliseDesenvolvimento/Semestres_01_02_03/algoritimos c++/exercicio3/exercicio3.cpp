#include <iostream>

using namespace std;
int main(int argc, char** argv) {
	
	float toneladas,km,litros;
	int gramas;
	
	
	cout<< "\n#######################################################\n";
   	cout<< "\nCONVERSOR DE MEDIDAS";
   	cout<< "\nTODAS AS CONVERSOES SERÃO FEITAS NESSA SEQUENCIA";
   	cout<< "\nNENHUM CAMPO DEVERA FICAR VAZIO OU IRAR GERAR ERRO";
   	cout<< "\n";
   	cout<< "\n1)     LITROS PARA MILILITROS";
   	cout<< "\n2)     QUILOMETROS PARA METROS";
   	cout<< "\n3)     TONELADAS PARA GRAMAS";
   	cout<< "\n";
   	cout<< "\n#######################################################\n";
   	cout<< "\n";
   	cout<< "INSERIR QUANTIDADE DE LITROS........:";
   	cin >> litros;
   	cout<< "INSERIR QUANTIDADE DE QUILOMETROS...:";
   	cin >> km;
   	cout<< "INSERIR QUANTIDADE DE TONELADAS.....:";
   	cin >> toneladas;
   	gramas = toneladas*1000000;
   	cout<< "\n";
   	cout<< "\n#######################################################\n";
   	cout<< "\n";
   	cout<< "\nCONVERSÃO";
   	cout<< "\n";
   	cout<< litros<<" LITROS SERIA IGUAL A.........: "<<litros*1000 <<" MILILITROS\n";
   	cout<< km<<" QUILOMETROS SERIA IGUAL A....: "<<km*1000<<" METROS\n";
   	cout<< toneladas<<" TONELADAS SERIA IGUAL A......: "<<gramas<<" GRAMAS\n";
   	cout<<"\n";
    cout<<"\n";	
   	system("pause");
   	cout<<"\n";
   	
	return 0;
}
