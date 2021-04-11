#include <iostream>
#include <cstdlib>
using namespace std;
void insere(int codigo[], int &t, int tamanho);
void exibe(int codigo[], int t);
void elemento(int codigo[],int t);
void ordena(int codigo[],int t);
int buscaSequencial(int codigo[], int cod, int t);
int main()
{
   int tam, codigoProduto[5],op, cod, posicao;
   //Inicialização 
    tam = 0; 
 
do
 {
  system("cls");
  cout<<"\nMenu - LISTA \n";   
  cout<<"\n0- Reinicar a LISTA";  
  cout<<"\n1- Inserir codigo na LISTA";
  cout<<"\n2- Exibir LISTA";
  cout<<"\n3- Exibe tamanho da LISTA";
  cout<<"\n4- Exibe um elemento da lista";
  cout<<"\n5- Ordena lista";
  cout<<"\n6- Procura elemento na lista";    
  cout<<"\n7- Sair";
  cout<<"\nOpcao: ";
  cin>>op;
  system("cls");
 
 switch(op)
  {
   case 0:  //reinicialiação 
            tam = 0; break;    
   case 1: insere(codigoProduto,tam, 5); break;
   case 2: exibe(codigoProduto,tam); break;
   case 3: cout<<"\nTamanho da Lista: "<<tam;break;
   case 4: elemento(codigoProduto, tam);break;
   case 5: ordena(codigoProduto, tam); break;
   case 6: cout << "\nQual codigo a ser procurado? "; cin >> cod; 
             posicao = buscaSequencial(codigoProduto,cod,tam);
             if(posicao == -1) cout << "\nAtencao! Lista vazia\n";
             else if (posicao == -2)cout << "\nAtencao! Codigo nao encontrado\n";
                     else   cout << "\nCodigo encontrado na posicao: " << posicao+1<<"\n"; 
           break;        
   case 7: cout<<"\nFinalizando o programa da LISTA\n";break;
   default: cout<<"\nOpcao invalida\n";
  } 
 cout<<"\n\n"; system("pause");
 }while(op !=7);
} 
void insere(int codigo[], int &t, int tamanho) 
{
   int prod;
   if (tamanho == t)
    cout << "\nAtencao! Lista cheia\n";
   else
   {
     cout << "\nDigite codigo do produto a ser inserido: ";
     cin >> prod;   
     codigo[t] = prod;
     t++;
   }
}
void exibe(int codigo[], int t)
{
  int x;
  if (t == 0)
    cout << "\nAtencao! Lista vazia\n";
  else 
    cout<<"\nRelacao dos Codigos\n";
    for(x = 0; x < t; x++)
      cout << "\n" <<x+1<<" - " << codigo[x];
} 
void elemento(int codigo[], int t)
{
 int prod,posicao;
 if(t == 0)
 { cout << "\nAtencao! Lista vazia\n";return;}
 cout << "\nQual a posicao que deseja? ";  
 cin >> posicao;posicao=abs(posicao);
 posicao--;
 if (posicao >= t )
  cout << "\nAtencao! Nenhum codigo armazenado ou posicao inexistente\n";
 else
  cout << "\nCodigo na posicao: " << codigo[posicao]<<"\n"; 
}
void ordena(int codigo[], int t)
{
 int x,y, aux, temp;
 if(t == 0)
  cout << "\nAtencao! Lista vazia\n";
 else
 {     for(x=0; x<t-1; x++)
       {   aux=x;
           for(y=x+1; y<t; y++)
               if(codigo[aux]>codigo[y])    aux=y;
            temp=codigo[aux];
            codigo[aux]=codigo[x];  
            codigo[x]=temp; 
        }    cout<<"\nLista Ordenada\n";      
    } 
}
int buscaSequencial(int codigo[], int cod, int t)
{
  int x;
  if (t == 0)
    return -1; // testa lista vazia
  for (x = 0; x < t; x++)
    if( codigo[x] == cod) return x; 
        //retorna O deslocamento do endereco base
   return -2; //percorreu toda a lista e nÃo achou
}
