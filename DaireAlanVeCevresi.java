import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yaricap, alan, cevre, pi=3.14;

        System.out.print("Lütfen yarıçap giriniz: ");
        yaricap = input.nextDouble();

        alan = pi * (yaricap*yaricap);
        cevre = 2 * pi * yaricap;

        System.out.println("Bu dairenin alanı:" + alan);
        System.out.println("Bu dairenin çevresi: " + cevre);
    }
}
