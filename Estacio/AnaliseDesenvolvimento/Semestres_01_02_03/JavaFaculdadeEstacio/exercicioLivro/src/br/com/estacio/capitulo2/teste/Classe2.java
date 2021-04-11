/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estacio.capitulo2.teste;

/**
 *
 * @author bruno
 */
public class Classe2 extends Classe1{
    public void opClasse2(int f){
        System.out.println(x+y);
    }
    public Classe2 (int f){
        y*=f;
        x+=f;
    }
    public Classe2 (){
        y*=2;
        x+=3;
    }
}
