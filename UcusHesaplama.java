import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double total = 0, distance;
        double amountPerDistance = 0.10;
        int yolculukType, age;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen gideceğiniz mesafeyi giriniz: ");
        distance = input.nextInt();

        System.out.print("Tek yön ise = 1\nGidiş-geliş ise = 2 \nLütfen uçuşunuz tipini seçin :  ");
        yolculukType = input.nextInt();

        System.out.print("Lütfen gideceğiniz yaşınız giriniz: ");
        age = input.nextInt();

        switch (yolculukType) {
            case 1:
                if ((age < 12) && (age >= 0) ) {
                    total = distance * amountPerDistance * 0.5;
                } else if ((age >= 12) && (age <= 24)) {
                    total = distance * amountPerDistance * 0.9;
                } else if (age > 65) {
                    total = distance * amountPerDistance * 0.7;
                } else {
                    total = distance * amountPerDistance ;
                }

                break;
            case 2:
                if ((age < 12) && (age >= 0)) {
                    total = distance * amountPerDistance * 0.5 * 0.8;
                } else if ((age >= 12) && (age <= 24)) {
                    total = distance * amountPerDistance * 0.9 * 0.8;
                } else if (age > 65) {
                    total = distance * amountPerDistance * 0.7 * 0.8;
                }else{
                    total = distance * amountPerDistance * 0.8;
                }
                break;
        }


        System.out.println("Ödeyeceğiniz tutar: " + total + "TL");

    }
}
