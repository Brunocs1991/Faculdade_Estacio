/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchdemofallthrough;

/**
 *
 * @author bruno
 */
public class SwitchDemoFallThrough {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.ArrayList<String> meses = new java.util.ArrayList<String>();
        int mes = 8;
        switch (mes) {
            case 1:
                meses.add("Janeiro");
            case 2:
                meses.add("Fevereiro");
            case 3:
                meses.add("Março");
            case 4:
                meses.add("Abril");
            case 5:
                meses.add("Maio");
            case 6:
                meses.add("Junho");
            case 7:
                meses.add("Julho");
            case 8:
                meses.add("Agosto");
            case 9:
                meses.add("Setembro");
            case 10:
                meses.add("Outubro");
            case 11:
                meses.add("Novembro");
            case 12:
                meses.add("Dezembro");
                break;
            default:
                break;
        }
        if (meses.isEmpty()) {
            System.out.println("Número de mês inválido");
        } else {
            for (String nomeMes : meses) {
                System.out.println(nomeMes);
            }
        }
    }
}
