import java.util.Scanner;

// Input Abdul dan RPL
public class ScannerString01{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Nama dan Jurusan");
        System.out.print("Masukkan Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Masukan Jurusan Sekolah : ");
        String jurusan = scanner. nextLine();
        System.out.println("Nama "+nama);
        System.out.println("Jurusan "+jurusan);
    }
}