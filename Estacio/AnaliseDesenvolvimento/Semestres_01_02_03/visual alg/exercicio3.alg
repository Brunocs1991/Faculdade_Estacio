Algoritmo "conversor"
// Disciplina  :  [Linguagem e L�gica de Programa��o] 
// Professor   :
// Descri��o   : conversor de medidas
// Autor(a)    : bruno costa e silva
// Data atual  : 19/08/2018
Var
// Se��o de Declara��es das vari�veis 
    toneladas,km,litros: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
   escreva ("#######################################################")
   escreval(" ")
   escreval(" ")
   escreval ("CONVERSOR DE MEDIDAS")
   escreval ("TODAS AS CONVERSOES SER�O FEITAS NESSA SEQUENCIA")
   escreval ("NENHUM CAMPO DEVERA FICAR VAZIO OU IRAR GERAR ERRO")
   escreval(" ")
   escreval ("1)     LITROS PARA MILILITROS")
   escreval ("2)     QUILOMETROS PARA METROS")
   escreval ("3)     TONELADAS PARA GRAMAS\n")
   escreval(" ")
   escreval ("#######################################################")
   escreval(" ")
   escreva ("INSERIR QUANTIDADE DE LITROS........:")
   leia (litros)
   escreva ("INSERIR QUANTIDADE DE QUILOMETROS...:")
   leia (km)
   escreva("INSERIR QUANTIDADE DE TONELADAS.....:" )
   leia (toneladas)
   escreval(" ")
   escreval ("#######################################################")
   escreval(" ")
   escreval ("                   CONVERS�O")
   escreval (" ")
   escreval (litros, " LITROS SERIA IGUAL A.........: ",litros*1000," MILILITROS")
   escreval (km, " QUILOMETROS SERIA IGUAL A....: ", km*1000," METROS")
   escreval (toneladas," TONELADAS SERIA IGUAL A......: ", toneladas*1000000," GRAMAS")
   escreval(" ")
   escreval(" ")
   
Fimalgoritmo