/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

import java.text.DecimalFormat;

/**
 *
 * @author bruno
 */
public class TestaClasseAbstrata {

    public static void main(String args[]) {
        Empregado e; //variave de referencia da superclasse
        String sai = "";
        DecimalFormat df = new DecimalFormat("0.00");
        Chefe c = new Chefe("Joao", "silva", 300.00);
        PorComissao pc = new PorComissao("Maria", "Souza", 400.00, 3.00, 150);
        PorItem pi = new PorItem("Pedro", "Cabral", 2.50, 200);
        PorHora ph = new PorHora("Marta", "Ferreira", 13.75, 40.50);
        e = c; //recupera as caracteristicas de chefe
        sai += e.toString() + " ganha $" + df.format(e.ganha()) + "\n";
        e = pc; //recupera as caracteristicas de por comissao
        sai += e.toString() + " ganha $" + df.format(e.ganha()) + "\n";
        e = pi; //recupera as caracteristicas de por item
        sai += e.toString() + " ganha $" + df.format(e.ganha()) + "\n";
        e = ph; //recupera as caracteristicas de por hora
        sai += e.toString() + " ganha $" + df.format(e.ganha()) + "\n";
        System.out.println(sai);
    }

}
