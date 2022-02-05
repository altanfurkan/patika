import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ürün tutarını giriniz: ");
        double tutar = input.nextDouble();
        double kdv;
        kdv = tutar * 0.18 ;
        System.out.println("Bu ürünün KDV tutarı: " + kdv);
        double  kdvDahilTutar = tutar+kdv ;
        System.out.println("Bu ürünün KDV dahil tutarın: " + kdvDahilTutar);

    }
}
