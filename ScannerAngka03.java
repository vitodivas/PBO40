import java.util.Scanner;

// Input 12345678 dan 87654322
public class ScannerAngka03{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Program Scanner");
        System.out.println("Masukan Angka pertama : ");
        int value = scanner.nextInt();
        System.out.println("Masukan Angka kedua : ");
        int anotherValue = scanner.nextInt(); 
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
        
    }
}