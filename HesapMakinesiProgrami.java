import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, select;
        double islem;

        System.out.print("Lütfen 1.Sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("Lütfen 2.Sayısı giriniz: ");
        n2 = input.nextInt();

        System.out.println(n1 + "-" + n2);

        System.out.println("1-Toplama\n2-Çıkarman\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminizi giriniz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                islem = (n1 + n2);
                System.out.println("Sonuç: " + islem);
                break;
            case 2:
                islem = (n1 - n2);
                System.out.println("Sonuç: " + islem);
                break;
            case 3:
                islem = (n1 * n2);
                System.out.println("Sonuç: " + islem);
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Bir sayı 0'a bölünemez !!!");
                } else {
                    islem = (n1 / n2);
                    System.out.println("Sonuç: " + islem);
                }
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız...!!");
        }
    }


}
