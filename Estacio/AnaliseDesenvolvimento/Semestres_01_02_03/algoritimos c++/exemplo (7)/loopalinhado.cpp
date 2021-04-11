#include <iostream>
#include <locale.h>
using namespace std;

int main(int argc, char** argv)
	{
		setlocale(LC_ALL, "Portuguese");
		long limite=20;
		long fatorial=1;
		for(int i=1;i<=limite;i++)
		{
			fatorial=1;
			for(int j=2;j<=i;j++)
			fatorial*=j;
			cout<<i<<"! = "<<fatorial<<endl;
		}
		system ("pause");
		return 0;
	}
