import java.util.Scanner;

// Input 12345 dan 010101
public class ScannerAngka02{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Scanner");
        int value = scanner.nextInt();
        System.out.print("Masukan Angka pertama : ");
        int anotherValue = scanner.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}