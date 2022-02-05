import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        // değişkenleri oluşturuyoruz
        int matematik, fizik, kimya, biyoloji,müzik, tarih;
        Scanner input = new Scanner(System.in);

        // verileri gir

        System.out.print("Lütfen matematik notunuzu giriniz: ");
        matematik = input.nextInt();

        System.out.print("Lütfen fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Lütfen kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Lütfen biyoloji notunuzu giriniz: ");
        biyoloji = input.nextInt();
        System.out.print("Lütfen müzik notunuzu giriniz: ");
        müzik = input.nextInt();
        System.out.print("Lütfen tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        int sonuc = matematik + kimya + biyoloji + fizik + müzik + tarih ;

        double ortalama = sonuc / 6;
        System.out.println("Ortalama: " + ortalama);

        if (ortalama >= 60){
            System.out.println("Geçtiniz");
        }
        else if (ortalama < 50 ){
            System.out.println("Kaldınız");
        }
        else {
            System.out.println("Bütünlemeye girmelisin");
        }

    }
}
