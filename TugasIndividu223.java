import java.util.Scanner;
public class TugasIndividu223 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int username = 200;
        int password = 199;
        System.out.println("Masukkan Username dan Password");
        System.out.print("Username   : ");
        int user = input.nextInt();
        System.out.print("Password   : ");
        int pw = input.nextInt();
        if (user == username && pw == password){
            System.out.println("Selamat anda berhasil login");
        }else{
            System.out.println("Ada kesalahan, harap cek kembali username dan password anda! ");

        }
    }
}