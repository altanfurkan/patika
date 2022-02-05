import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlıcan=5.0;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlıcanKilo, toplam;

        System.out.println("Lütfen alınan armut kilosunu giriniz: ");
        armutKilo = input.nextDouble();

        System.out.println("Lütfen alınan elma kilosunu giriniz: ");
        elmaKilo = input.nextDouble();

        System.out.println("Lütfen alınan domates kilosunu giriniz: ");
        domatesKilo = input.nextDouble();

        System.out.println("Lütfen alınan muz kilosunu giriniz: ");
        muzKilo = input.nextDouble();

        System.out.println("Lütfen alınan patlıcan kilosunu giriniz: ");
        patlıcanKilo = input.nextDouble();

        toplam = (armut*armutKilo) + (elma*elmaKilo) + (domatesKilo*domates) + (muz*muzKilo) + (patlıcan*patlıcanKilo);

        System.out.println("Toplam ödeyeceğiniz tutar: " + toplam);

    }
}
