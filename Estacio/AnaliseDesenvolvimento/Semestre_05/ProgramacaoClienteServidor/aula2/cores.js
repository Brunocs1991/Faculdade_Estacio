var letras = new Array("0","1","2","3","4","5","6","7","8","9",

"A","B","C","D","E","F");

function getHexa(inteiro){

      resto = inteiro % 16;

      quociente = (inteiro - resto) / 16;

      return letras[quociente] + letras[resto];

}

function getCor(r,g,b){

      return "#" + getHexa(r) + getHexa(g) + getHexa(b);

}