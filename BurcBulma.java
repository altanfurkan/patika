import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int ay;
        int gun;
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Lütfen doğdunuz ayı rakam olarak giriniz: ");
        ay = input.nextInt();

        System.out.println();

        System.out.print("Lütfen doğdunuz günü giriniz: ");
        gun = input.nextInt();
        System.out.println();

        if (ay == 1) {
            if ((gun <= 21)) {
                System.out.println("Oğlak burcunsunuz..");
            } else if (gun >= 22) {
                System.out.println(";Kova burcusunuz..");
            }
        } else if (ay == 2) {
            if ((gun <= 19)) {
                System.out.println("Kova burcunsunuz..");
            } else if (gun >= 20) {
                System.out.println(";Balık burcusunuz..");
            }
        } else if (ay == 3) {
            if ((gun <= 20)) {
                System.out.println("Balık burcusunuz..");
            } else if (gun >= 21) {
                System.out.println(";Koç burcusunuz..");
            }
        } else if (ay == 4) {
            if ((gun <= 20)) {
                System.out.println("Koç burcusunuz..");
            } else if (gun >= 21) {
                System.out.println(";Boğa burcusunuz..");
            }
        } else if (ay == 5) {
            if ((gun <= 21)) {
                System.out.println("Boğa burcusunuz..");
            } else if (gun >= 22) {
                System.out.println(";İkizler burcusunuz..");
            }
        } else if (ay == 6) {
            if ((gun <= 22)) {
                System.out.println("İkizler burcusunuz..");
            } else if (gun >= 23) {
                System.out.println(";Yengeç burcusunuz..");
            }
        } else if (ay == 7) {
            if ((gun <= 22)) {
                System.out.println("Yengeç burcusunuz..");
            } else if (gun >= 23) {
                System.out.println(";Aslan burcusunuz..");
            }
        } else if (ay == 8) {
            if ((gun <= 22)) {
                System.out.println("Aslan burcusunuz..");
            } else if (gun >= 23) {
                System.out.println(";Başak burcusunuz..");
            }
        } else if (ay == 9) {
            if ((gun <= 22)) {
                System.out.println("Başak burcusunuz..");
            } else if (gun >= 23) {
                System.out.println(";Terazi burcusunuz..");
            }
        } else if (ay == 10) {
            if ((gun <= 22)) {
                System.out.println("Terazi burcusunuz..");
            } else if (gun >= 23) {
                System.out.println(";Akrep burcusunuz..");
            }
        } else if (ay == 11) {
            if ((gun <= 21)) {
                System.out.println("Akrep burcusunuz..");
            } else if (gun >= 22) {
                System.out.println(";Yay burcusunuz..");
            }
        } else if (ay == 12) {
            if ((gun <= 21)) {
                System.out.println("Yay burcusunuz..");
            } else if (gun >= 22) {
                System.out.println(";Oğlak burcusunuz..");
            }
        }


    }
}
