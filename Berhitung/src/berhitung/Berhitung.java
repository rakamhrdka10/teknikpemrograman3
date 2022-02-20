package berhitung;

import java.util.Scanner;

/**
 *
 * Raka mahardika Maulana
 */
public class Berhitung {
    public static void main(String[] args) {
        int num1;
        int num2;
        char kabataku;
        int result = 0;
        
       // membuat scanner baru
        Scanner input = new Scanner(System.in); 
        
        //inputan user
        num1 = input.nextInt();
         kabataku = input.next().charAt(0);
        num2 = input.nextInt();
      
        
        //mengoperasikan angka 1 dan 2
        if (kabataku == '+'){
        result = num1 + num2;
        }else if (kabataku == '-'){
            result = num1 - num2;
        }else if (kabataku == '/'){
            result = num1/num2;
        }else if (kabataku == '*'){
            result = num1 * num2;
        }else if(kabataku == '%')
            result = num1%num2;
        
        System.out.println(result);
    }
    
}
