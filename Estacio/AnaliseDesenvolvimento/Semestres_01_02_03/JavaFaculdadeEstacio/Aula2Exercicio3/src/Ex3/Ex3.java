package Ex3;

/**
 * @author bruno
 */
public class Ex3 {

    public static void main(String[] args) {
        // for para contar de 1 a 500
        int quantNumeros = 0;
        for (int x = 1; x <= 500; x++) {
            if (x % 2 == 0) {

                quantNumeros++;
            }
        }
        System.out.println("Tdotal de numeros pares" + quantNumeros);
    }
}
