import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Lütfen şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("Java") && password.equals("Patika")){
            System.out.println("Login oldunuz !!!");
        }else{
            System.out.println("Hatalı kullanıcı adı veya şifre");
        }
    }
}
