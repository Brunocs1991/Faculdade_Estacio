#include <iostream>
using namespace std;
int main ()
{
	int divisores;
	cout<<"numeros primos: ";
	cout<<"\n";
	for(int i=1; i<1000;i++)
	{
		divisores=0;
		for(int j=1;j<i;j++)
		{
			if(i%j==0)
				divisores++;
		}
				if(divisores==1)
			cout<<i <<", ";
	}
	cout<<"\n";
	system("pause");
}