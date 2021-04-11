#include <iostream>
 using namespace std;

 int main (void)
 {
	int num_termos,contador=1;
	double pi=0,i=1.0;

	cout<<"Quantos termos você deseja?"<<endl;
	cin>>num_termos;

	while (contador<=num_termos)
	{
		pi += 4/i;
		i+=2;
		pi -= 4/i;
		contador++;
		i+=2;
	}

	cout<<"O valor de PI com "<<num_termos<<" termos = "<<pi<<endl;
	cout<<endl;
	system("pause");
 return 0;
 }