import java.util.Scanner;

public class PemilihanPercobaan123_1 {
    public static void main(String[] args) {
        Scanner input23 =new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur= input23.nextInt();

        if ( umur > 10)
        System.out.println("umur "+umur+" Minumlah obat kapsul");
        else
        System.out.println("umur "+umur+" Minumlah obat sirup");
    }
}