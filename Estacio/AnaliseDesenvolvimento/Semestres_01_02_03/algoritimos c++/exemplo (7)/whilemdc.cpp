#include <iostream>
using namespace std;

int main (void)
{
	int num1, num2, resto;
	cout<<"Digite dois numeros em ordem crescente"<<endl;	
	cin >> num1;
	cin >> num2;
	
	do
	{
		resto = num2%num1;
		cout<< "Numero 2 ="<<num2<<" - Numero 1 = "<<num1<<" - Resto = " <<resto<<endl;
		num2 = num1;
		num1 = resto;
	}
	while(num1>0);
	cout<<"MDC = "<<num2;
	cout<<endl;
	system ("pause");
	return 0;
}