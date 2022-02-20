/**
 *
 * @author Raka Mahardika maulana
 * soal 1
 */
package inputoutput;

import java.util.Scanner;

public class InputOutput {
  
    public static void main(String[] args) {
      String kata ;
      
      // scanner
      Scanner input = new Scanner(System.in);
       kata = input.nextLine();
       
       // deteksi token
      String[] kalimat = kata.split("[ _?!,.'@]");
        
        System.out.println(kalimat.length);
        
        for(String a : kalimat){
            System.out.println(a);
        }
         }

    }
          
        