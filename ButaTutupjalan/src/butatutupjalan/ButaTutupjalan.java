package butatutupjalan;

import java.util.Scanner;

/**
 *
 * @author Raka Mahardika Maulana
 */
public class ButaTutupjalan {
    public static void main(String[] args) {
        int plat1;
        int plat2;
        int plat3;
        int plat4;
        //me,buat scanner
       Scanner input = new Scanner(System.in);
       //inputan user
        plat1 = input.nextInt();
        plat2 = input.nextInt();
        plat3 = input.nextInt();
        plat4 = input.nextInt();
        
        if((plat1 + plat2 + plat3 + plat4)%5 == 0){
            System.out.println("berhenti");
        }else {
            System.out.println("jalan");
        }
    }
    
}
