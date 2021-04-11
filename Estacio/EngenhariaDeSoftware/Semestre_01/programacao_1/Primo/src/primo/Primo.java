package primo;

import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr, cont = 0;
        System.out.print("Número..; ");
        nr = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= nr; i++) {
            if (nr % i == 0) {
                cont++;
            }
        }
        if(cont == 2){
            System.out.println("--- O número é Primo ---");
        }else{
            System.out.println("--- O número não é Primo ---");
        }
    }
}
