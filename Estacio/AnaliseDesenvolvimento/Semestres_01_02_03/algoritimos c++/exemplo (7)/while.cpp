#include <iostream>
using namespace std;

int main(void)
{
	int num_funcionarios, i=1;
	float salario, valor_folha=0;
	
	cout <<"Digite o número de funcionários da empresa"<<endl;
	cin >> num_funcionarios;
	
	while (i<=num_funcionarios)
	{
		cout <<"Funcionário"<<i<<"qual o salário deste funcionario?"<<endl;
		cin >>salario;
		valor_folha+=salario;
		i++;
	}
	
	cout <<"Valor da folha de pagamento: R$ "<<valor_folha;
	system ("pause");
	return 0;
}
