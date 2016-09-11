/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testar;

import java.util.Arrays;

/**
 *
 * @author danie
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y = 6, x = 0, tY = 0;
        int[] array = {y};
        
        
        x = 60 / y;
        
        for(int i = 8; i <= x;  i++){
            
            
            tY = tY + y; 
            array = addElement(array , tY);
              
           
        }


        
        
        for (int i : array){
            System.out.println(i);
        }
    }
    
    static int[] addElement(int[] a, int e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
    
}
