/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_imperativa10;

/**
 *
 * @author alber
 */
public class Prova_imperativa10 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        
        int [] array = {2, 4, 6, -12, 6, 8, 5, 12, 9, 7};
        int aux = 0;
        int indiceMaior = 0;
        int indiceMenor = 0;
        
        for(int i=1; i < array.length; i++){
            if(array[i] > array[indiceMaior]){
            indiceMaior = i;
            }
        
            if(array[i] < array[indiceMenor]){
                indiceMenor = i;
            }
        }
     aux = array[indiceMaior];
     array[indiceMaior] = array[indiceMenor];
     array[indiceMenor] = aux;
     
     System.out.println("Trocando menor valor da array pelo maior valor:");
     for(int i = 0; i < array.length; i++){
         System.out.println("Array: " + array[i]);
     }
   }
    
}
