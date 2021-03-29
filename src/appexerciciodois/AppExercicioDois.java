/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexerciciodois;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class AppExercicioDois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     int numero;
      
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um numero do teclado: ");
          numero = teclado.nextInt();
        for (int i = 0; i <= 10; i++)      
            System.out.println(numero + "x" + i + " = " + (numero * i));
    
    
    
    
    
    
    
    
    }
    
}
