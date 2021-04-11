inicio
    inteiro quantia
    inteiro nota50
    inteiro nota20
    inteiro nota10
    inteiro nota5
    inteiro nota2
    inteiro moeda1
    
    escrever "favor informar valor saque: "
    ler quantia
    //#quantia <- 680; #troque o valor
    nota50 <- quantia / 50
    nota20 <- quantia % 50 / 20
    nota10 <- ( ( quantia % 50 ) % 20 ) / 10
    nota5 <- ( ( ( quantia % 50 ) % 20 ) % 10 ) / 5
    nota2 <- ( ( ( ( quantia % 50 ) % 20 ) % 10 ) % 5 ) / 2
    moeda1 <- ( ( ( ( ( quantia % 50 ) % 20 ) % 10 ) % 5 ) % 2 ) / 1
    
    escrever "\na quantia e: " , quantia , "
    escrever "\ntotal notas de 50 = " , nota50
    escrever "\ntotal notas de 20 = " , nota20
    escrever "\ntotal notas de 10 = " , nota10
    escrever "\ntotal notas de 5 = " , nota5
    escrever "\ntotal notas de 2 = " , nota2
    escrever "\ntotal moedas de 1 = " , moeda1
    escrever "\n#################################################";
    
fim

