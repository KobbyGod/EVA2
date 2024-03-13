/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_volado2;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class EVA2_9_VOLADO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double moni;
        moni = Math.random();
        Scanner captu = new Scanner(System.in);
        System.out.println("Adivina, ¿Cara? o ¿Cruz?");
        captu.nextLine();
        
        if(moni > 0.5)
            System.out.println("Cayo CARA!!");
        else
            System.out.println("Cayo CRUZ!!");
        

            
        
        
    }
    
}
