/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atbasunlock;

import java.util.Scanner;

/**
 *
 * @author Saul Osalde
 */
public class ATBASUnlock {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        
       Scanner scan = new Scanner (System.in);
      
      
       
       while (true){
       System.out.println("Presiona 1 para desifrar un codigo y 5 para salir");
       int  n = scan.nextInt();
        
        if (n ==1){
            ATBAS();
            
        }
         if (n ==5){
            System.out.println("Gracias, hasta la proxima");
            break;
        }
        
        else{
            System.out.println("Elige una opcion valida");
             }
         
     
        }
               
     }

    private static void ATBAS() {
        Scanner scan = new Scanner (System.in);
        
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String reverso = "ZYXWVUTSRQPOÑNMLKJIHGFEDCBA";

         
         System.out.println("Ingrese el codigo que quiere decifrar");
            String   codigo = scan.nextLine(); 
              
              codigo = codigo.toUpperCase();
            
               String frase ="";
              for(int i =0; i < codigo.length(); i++)
              {
              
              if(codigo.charAt(i) == (char)32)
              {
              frase += " ";
              }else {
                         
                        for (int j =0; j < letras.length(); j++)
                        {
                                if(codigo.charAt(i) == letras.charAt(j))
                                {

                                   frase += reverso.charAt(j);
                                   break;

                                }


                        }
                         
                   }
              }
              
              
              System.out.println("Su palabra cifrada es:  "  + frase);
    }
}
