import java.util.Scanner;

public class PemilihanPercobaan123 {
    public static void main(String[] args) {
        Scanner input23 =new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka= input23.nextInt();

        if ( angka % 2 == 0)
        System.out.println("angka "+angka+" bilangan genap");
        else
        System.out.println("angka "+angka+" bilangan ganjil");
    }
}