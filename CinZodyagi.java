import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int date, b = 12;
        String burc;
        System.out.print("\n\n4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. \nÇin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve\nyıldızlarla pek bir ilgisi yoktur.\n\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğum yılızı giriniz: ");
        date = input.nextInt();

        int kalan = Math.floorMod(date, b);

        switch (kalan) {
            case 0:
                burc = "Maymun";
                System.out.println("Çin zodyağı burcunuz: " + burc);
                break;
            case 1:
                burc = "Horoz";
                System.out.println("Çin zodyağı burcunuz: " + burc);
                break;
            case 2:
                burc = "Köpek";
                System.out.println("Çin zodyağı burcunuz: " + burc);
                break;
            case 3:
                burc = "Domuz";
                System.out.println("Çin zodyağı burcunuz: " + burc);
                break;
            case 4:
                burc = "Fare";
                System.out.println("Çin zodyağı burcunuz: " + burc);
                break;
            case 5:
                burc = "Öküz";
                System.out.println("Çin zodyağı burcunuz: " + burc);
                break;
            case 6:
                burc = "Kaplan";
                System.out.println("Çin zodyağı burcunuz: " + burc);
                break;
            case 7:
                burc = "Tavşan";
                System.out.println("Çin zodyağı burcunuz: " + burc);
                break;
            case 8:
                burc = "Ejderha";
                System.out.println("Çin zodyağı burcunuz: " + burc);
                break;
            case 9:
                burc = "Yılan";
                System.out.println("Çin zodyağı burcunuz: " + burc);
                break;
            case 10:
                burc = "At";
                System.out.println("Çin zodyağı burcunuz: " + burc);
                break;
            case 11:
                burc = "Koyun";
                System.out.println("Çin zodyağı burcunuz: " + burc);
                break;
            case 12:
                burc = "Maymun";
                System.out.println("Çin zodyağı burcunuz: " + burc);
                break;
        }System.exit(0);
    }
}
