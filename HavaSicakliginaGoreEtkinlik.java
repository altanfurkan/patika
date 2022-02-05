import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;

        System.out.print("Lütfen hava sıcaklığını giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Kayak yapabilirsiniz..");
        } else if (heat > 5 && heat < 25) {
            if (heat > 5 && heat < 15) {
                System.out.print("Sineya gidebilirisiniz..");
            } else {
                System.out.print("Piknik yapabilirsiniz..");
            }
        } else if (heat >= 25) {
            System.out.print("Yüzmeye gidebilirsiniz..");
        } else {
            System.out.print("Valla ben de bilemedim ne yapsan :(");
        }
    }
}
