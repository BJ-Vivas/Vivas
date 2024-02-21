/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2.vivas;

import java.util.Arrays;

/**
 *
 * @author Student
 */
public class Activity2Vivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int[] array = {20,30,40,50,60};
    
        System.out.println("Elemens of the Array");
        System.out.println("First Array Element:" + array[0]);
        System.out.println("Second Array Element:" + array[1]);
        System.out.println("Third Array Elemnt:" + array[2]);
        System.out.println("Fourth Array Element:" + array[3]);
        System.out.println("Fifth Array Element:" + array[4]);
        
        int sum =
                Arrays.stream(array).sum();
          
        System.out.println("Sum of the Array Elements:" + sum);
        
        int max =
                Arrays.stream(array).max().getAsInt();
        
        System.out.println("Maximum value in the Array:" + max);
         
    
    }
    
}
