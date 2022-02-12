import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int sayi;
       Scanner input= new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        sayi = input.nextInt();

        for (int i=0; i <= sayi; i++ ){
            if (i%2 ==0){
                System.out.println(i);
                continue;
            }
        }


        System.exit(0);
    }
}
