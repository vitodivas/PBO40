import java.util.Scanner;

// Input Mandiri dan 100000
public class ScannerString02{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Deposit Bank");
        System.out.print("Masukkan Nama Bank : ");
        String namaBank = scanner.nextLine();
        System.out.print("Masukan Jumlah Deposit : ");
        String jumlahUang = scanner. nextLine();
        System.out.println("Nama : "+ namaBank);
        System.out.println("Uang : "+ jumlahUang);
    }
}