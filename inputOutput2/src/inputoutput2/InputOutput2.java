
package inputoutput2;

import java.util.Scanner;

/**
 *
 *Raka mahardika Maulana
 */
public class InputOutput2 {

    public static void main(String[] args) {
       int angka1;
       int angka2;
       int angka3;
       String kode1;
       String kode2 ;
       String kode3;
       
       Scanner input = new Scanner(System.in);
        
        kode1= input.next();
        angka1 = input.nextInt();
        kode2= input.next();
        angka2 = input.nextInt();
        kode3= input.next();
        angka3 = input.nextInt();
        
        System.out.println("================================");
        System.out.printf("%-15s %03d\n",kode1,angka1);
        System.out.printf("%-15s %03d\n",kode2,angka2);
        System.out.printf("%-15s %03d\n",kode3,angka3);
        System.out.println("================================");
       
   
   }
}