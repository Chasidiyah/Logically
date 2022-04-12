
package Logika;
import java.util.Scanner;
public class no2 {

    public static void main(String[] args) {
        float bil1, hasil;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("program ganjil genap");
        System.out.println("Masukkan bilangan=");
        bil1= scan.nextFloat();
        
        if (bil1%2==0)
            System.out.println("Ini adalah bilangan genap");
        else if (bil1%2!=0)
            System.out.println ("Ini adalah bilangan ganjil");
    }

}
