import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ilkKenar, ikinciKenar, hesap;
        System.out.print("Lütfen üçgenin ilk kenar uzunluğunu giriniz: ");
       ilkKenar = input.nextDouble();

        System.out.print("Lütfen üçgenin ikinci kenar uzunluğunu giriniz: ");
        ikinciKenar = input.nextDouble();

        hesap = Math.sqrt((ilkKenar*ilkKenar)+(ikinciKenar*ikinciKenar));
        System.out.println("Hipotenüs uzunluğu: "+ hesap);
    }
}
