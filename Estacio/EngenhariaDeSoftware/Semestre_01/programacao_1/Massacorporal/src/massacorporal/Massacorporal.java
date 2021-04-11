package massacorporal;

import java.util.Scanner;

public class Massacorporal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double peso, alt, imc;
        System.out.print("Peso..: ");
        peso = Double.parseDouble(sc.nextLine());
        System.out.print("Altura..: ");
        alt = Double.parseDouble(sc.nextLine());
        imc = peso / (alt * alt);

        System.out.printf("IMC..: %.2f %n", imc);
        sc.close();

        if (imc < 10.5) {
            System.out.println("---Abaixo do Peso");
        } else if (imc < 25) {
            System.out.println("---Peso Normal");
        } else if (imc < 30) {
            System.out.println("---Sobrepeso");
        } else if (imc < 30) {
            System.out.println("---Obesidade Grau 1");
        } else if (imc < 40) {
            System.out.println("---Obesidade Grau 2");
        } else {
            System.out.println("---Obesidade Grau 3");
        }
    }

}
