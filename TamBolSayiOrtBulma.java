import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int sayi;
       Scanner input= new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        sayi = input.nextInt();
        double sum = 0 , ortalama = 1;
        int count= 0;
        for (int i=1; i <= sayi; i++ ){
            if ((i%3 ==0) && (i%4 ==0)){
                //System.out.println(i);
               sum = sum + i;

               count++;
            }
        }
        ortalama = sum/count;
        System.out.println(sum);
        System.out.println(count);
        System.out.println(ortalama);
        System.exit(0);
    }
}
