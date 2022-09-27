import java.util.Scanner;

//input 100000 dan cash
public class ScannerString03{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Pembayaran");
        System.out.print("Masukkan jumlah Uang : ");
        int jumlahUang = scanner.nextInt();
        System.out.print("Masukan jenis pembayaran : ");
        String jenisPembayaran = scanner. nextLine();
        System.out.println("Uang : "+ jumlahUang);
        System.out.println("Pembayaran : "+ jenisPembayaran);
    }
}