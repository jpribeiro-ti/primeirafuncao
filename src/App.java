import java.util.Scanner;

import javax.xml.transform.Source;

public class App {
    String nome;
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        teclado.close();
        // 10% gorçom
        // 20% couvert
        // Pedro 50
        // Andre 50
        // Montanha 30
        // Amanda 100
        calcuclaImprimeConta(80, "Pedro");
        System.out.println("");
        calcuclaImprimeConta(50, "Andre");

    }
    //função
    public static void calcuclaImprimeConta(double conta, String nome){
        double gorjeta = conta * 0.1;
        double couvert = conta * 0.2;
        double total = conta + gorjeta + couvert;
        System.out.print("Discriminação conta do Pedro\n");
        System.out.println("Total consumido " + conta);
        System.out.println("Gorjeta R$ " + gorjeta);
        System.out.println("Couvert R$ " + couvert);
        System.out.println("Total Geral do " + nome + ": R$ " + total);
    }

}
