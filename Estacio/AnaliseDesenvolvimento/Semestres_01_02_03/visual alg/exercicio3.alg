Algoritmo "conversor"
// Disciplina  :  [Linguagem e Lógica de Programação] 
// Professor   :
// Descrição   : conversor de medidas
// Autor(a)    : bruno costa e silva
// Data atual  : 19/08/2018
Var
// Seção de Declarações das variáveis 
    toneladas,km,litros: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreva ("#######################################################")
   escreval(" ")
   escreval(" ")
   escreval ("CONVERSOR DE MEDIDAS")
   escreval ("TODAS AS CONVERSOES SERÃO FEITAS NESSA SEQUENCIA")
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
   escreval ("                   CONVERSÃO")
   escreval (" ")
   escreval (litros, " LITROS SERIA IGUAL A.........: ",litros*1000," MILILITROS")
   escreval (km, " QUILOMETROS SERIA IGUAL A....: ", km*1000," METROS")
   escreval (toneladas," TONELADAS SERIA IGUAL A......: ", toneladas*1000000," GRAMAS")
   escreval(" ")
   escreval(" ")
   
Fimalgoritmo