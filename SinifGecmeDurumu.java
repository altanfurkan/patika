import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       int mat, fizik, kimya, biyoloji, müzik;

       Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Biyoloji notunuzu giriniz: ");
        biyoloji = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        müzik = input.nextInt();
        System.out.println("\n\n");


        double avarage = ( mat + fizik + kimya + biyoloji + müzik ) / 5;
        System.out.println("Not ortalmanız: " + avarage);

        if (avarage >= 55){
            System.out.println("Tebrikler sınıfı geçtiniz...");
        }else{
            System.out.println("Seneye görüşürüz... :( ");
        }

    }
}
