Algoritmo "consumo por litro"
// Disciplina  :  analise e deenvolvimento de sistemas
// Professor   :
// Descrição   : Aqui você descreve o que o programa faz! (calcular conumo gasolina \litro)
// Autor(a)    : bruno costa e silva
// Data atual  : 19/08/2018
Var
// Seção de Declarações das variáveis 

    kmpercorridos: real
    litrosabastecidos:  real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

    escreval ("informar apenas numeros com ponto no lugar da virgula exemplo: 1.0")
    escreva ("Informar quilometros percorridos: ")
    leia (kmpercorridos)
    escreva ("Informar quantidade abastecida: ")
    leia (litrosabastecidos)

    escreval ("CONSUMO FEITO............:", kmpercorridos/litrosabastecidos," km por litro")

Fimalgoritmo