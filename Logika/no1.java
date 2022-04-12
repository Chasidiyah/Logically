
package Logika;
import java.util.Scanner;
public class no1 {

    public static void main(String[] args) {
        float bil1, bil2, terbesar;
        System.out.println("Menentukan bilangan terbesar ");
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan bilangan 1= ");
        bil1= scan.nextFloat();
        System.out.print ("Masukkan bilangan 2= ");
        bil2= scan.nextFloat();
     
        terbesar= bil1;
     
        if (terbesar < bil2)
            terbesar=bil2;
        System.out.print("Bilangan terbesar adalah "+terbesar);
    }
 
}
    
