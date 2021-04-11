/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estacio.capitulo1;

/**
 *
 * @author bruno
 */
public class exercicio4 {

    public static void main(String[] args) {
        String original = "software";
        StringBuilder resultado = new StringBuilder("olá");
        int indice = original.indexOf('a');
        /*1*/ resultado.setCharAt(0, original.charAt(0));
        System.out.println(resultado);

        resultado = new StringBuilder("olá");
        /*2*/ resultado.setCharAt(1, original.charAt(original.length() - 1));
        System.out.println(resultado);
        resultado = new StringBuilder("olá");
        /*3*/ resultado.insert(1, original.charAt(4));
        System.out.println(resultado);
        resultado = new StringBuilder("olá");
        /*4*/ resultado.append(original.substring(1, 4));
        System.out.println(resultado);
        resultado = new StringBuilder("olá");
        /*5*/ resultado.insert(3, (original.substring(indice, indice + 2) + " "));
        System.out.println(resultado);
    }
}
