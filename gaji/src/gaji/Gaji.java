
package gaji;

import java.util.Scanner;

/**
 *
 * Raka mahardika Maulana
 */
public class Gaji {
    public static void main(String[] args) {
        int penjualan;
        int gajiTotal = 500000;
        int hargaItem = 50000;
        
       // membuat scanner baru
        Scanner input = new Scanner(System.in); 
        
        //inputan user
        penjualan = input.nextInt();
        //menghitung bonus
        
        if (penjualan > 80 ){
            gajiTotal= gajiTotal + (hargaItem*penjualan* 35/100);
        }else if (penjualan >= 40 && penjualan <= 80){
            gajiTotal= gajiTotal + (hargaItem*penjualan* 25/100);
        } else if (penjualan >= 15 && penjualan < 40){
            gajiTotal= gajiTotal + (hargaItem*penjualan* 10/100);
        }else if (penjualan < 15){
            gajiTotal= gajiTotal - (hargaItem * (15-penjualan)* 15/100);
        }        
        System.out.println(gajiTotal);
    }
    
}

