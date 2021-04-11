Algoritmo "segundo programa"
// Disciplina  :  analise e desenvilvimento de sistemas
// Professor   : ead estacio
// Descrição   : calcular media entre 4 numeros
// Autor(a)    : Bruno Costa e Silva
// Data atual  : 14/08/2018
Var
// Seção de Declarações das variáveis 
   quantia: inteiro
   nota50: inteiro
   nota20: inteiro
   nota10: inteiro
   nota5: inteiro
   nota2: inteiro
   moeda1: inteiro
   
   
 Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

   escreva ("Favor informar Valor Saque: ")
   leia (quantia)
   nota50 <-quantia div 50
   nota20 <-(quantia % 50) div 20
   nota10 <-((quantia % 50) %20) div 10
   nota5 <-(((quantia % 50) %20)%10) div 5
   nota2 <-((((quantia % 50) %20)%10)%5)div 2
   moeda1 <-(((((quantia % 50) %20)%10)%5)%2) div 1
   
   escreval ("Quantia de saque: ", quantia)
   escreval ("Total notas de 50 = ", nota50)
   escreval ("Total notas de 20 = ", nota20)
   escreval ("Total notas de 10 = ", nota10)
   escreval ("Total notas de 5 = ", nota5)
   escreval ("Total notas de 2 = ", nota2)
   escreval ("Total moedas de 1 = ", moeda1)
   


   

Fimalgoritmo