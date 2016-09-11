/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testar;

/**
 *
 * @author daniel
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // skapat en array för att hålla 12 st int värden för att använda den
        // till övertids tilllägg
        int array [] = new int[12];
        // skapa 3 variabler för att hålla värden i
        int y = 10, ty = 0, x;
        
        // x får värdet när man delar 60min med y i detta fallet med 6 då ska 
        // x få värdet 10
        x = 60 / y;
        
        //array[0] = y;
        
        for (int i = 0; i < x; i++){
            
            ty = ty + y;
            array[i] = ty;
            System.out.println(array[i]);
        }
        
        
        
    }
    
}