import java.util.Scanner;
public class LoginKasir{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int username = 61;
        int password = 12345;
        System.out.println("======Masukkan Username dan Password======");
        System.out.print("Username   : ");
        int user = input.nextInt();
        System.out.print("Password   : ");
        int pw = input.nextInt();
        if (user == username && pw == password){
            System.out.println("Anda Berhasil Login");
        }else{
            System.out.println("Silahkan check Username dan Password");
         }
        }
    }

