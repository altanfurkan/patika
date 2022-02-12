import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year, kalan1, kalan2;

        System.out.print("Lütfen yıl giriniz: ");
        year = input.nextInt();

        kalan1 = Math.floorMod(year, 100);
        kalan2 = Math.floorMod(year, 4);
        if ( (kalan2 == 0)) {
            System.out.println(year + " bir artık yıldır !");
        } else {
            System.out.println(year + " bir artık yıl değildir !");
        }

        System.exit(0);
    }
}
