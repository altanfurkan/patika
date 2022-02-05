import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo;
        double hesap, vucutKitleEndeks;

        System.out.print("Lütfen boyununzu giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        hesap = (boy * boy) ;
        vucutKitleEndeks = (kilo / hesap);
        System.out.println("Vücut kitle endeksiniz: "+ vucutKitleEndeks);
    }
}
