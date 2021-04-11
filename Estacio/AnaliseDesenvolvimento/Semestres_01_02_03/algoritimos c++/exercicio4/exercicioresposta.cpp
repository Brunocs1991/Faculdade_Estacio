#include <iostream>
#include <locale.h>
using namespace std;
int main (void)
{
	setlocale(LC_ALL, "Portuguese");
	int num_linhas;
	do 
	{
		system("cls");
		cout<<"Informe a quantidade de linhas (de 6 a 12): "<<endl;
		cin>>num_linhas;
	}
	while (num_linhas<6 || num_linhas>12);

	// este laço externo controla as linhas
	cout<<"\n";
	for(int linha = 1; linha <= num_linhas; linha++)
		{
		// este laço gera os espaços antes de cada número nas linhas do triângulo
		for (int coluna = 1; coluna <= (num_linhas - linha); coluna++)
			{
				cout<<"   "; // três espaços aqui
			}
		// aqui nós exibimos os números de cada linha do lado esquerdo da pirâmide, até o centro
		for(int i = linha; i >= 1; i--)
			{
			// o número da linha é maior ou igual a 10? se for colocamos um espaço antes do número
			if(i >= 10)
				{
					cout<<" "<<i;
				}
			else{ // o número da linha é menor que 10? vamos colocar dois espaços antes do número
			cout<<"  "<<i;
			}
		}
		 // e finalmente exibimos os números de cada linha no lado direito do triângulo
		 for (int i = 2; i <= linha; i++)
		{
			// o número da linha é maior ou igual a 10? se for colocamos um espaço antes do número
			if(i >= 10)
			{
				cout<<" "<<i;
			}
		else
			{ // o número da linha é menor que 10? vamos colocar dois espaços antes do número
				cout<<"  "<<i; 
			}
		}
		// cria uma nova linha
		cout<<"\n";
	 }
	 cout<<"\n";
	 system("pause");
	 return 0;
}