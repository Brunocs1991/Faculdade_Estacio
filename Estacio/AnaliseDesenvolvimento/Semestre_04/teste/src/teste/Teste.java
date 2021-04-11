package teste;
public class Teste {
    static int f = 5;
    static int d =5;
    static int c = 5;
    static int l = 28;
    public static void main(String[] args) {
        for(int i = 2; i<=l ; i ++){
            if(i%2 ==0){
                f = f+2;
                d = d+2;
                c = c+1;
                
            }else{
                f = f+3;
                d = d+1;
                c = c+1;
            }
        }
        System.out.println("For = "+f+" /Dex = "+d+" /Con = "+c);
    }
}
