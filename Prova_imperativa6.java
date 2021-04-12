/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_imperativa6;

/**
 *
 * @author alber
 */
public class Prova_imperativa6 {

    /**
     * @param args the command line arguments
     */
    public static int [] ordenaVetor (int vet[]){
    int i, j;
    int key = 0;
    int end = vet.length -1;
    
     for( i = 1; i <= end; i++){
       key = vet[i];
       j = i -1;
      while(j >= 0 && vet[j] < key){
        vet[j+1] = vet[j];
        j = j -1;
      }
        vet[j+1] = key;
     }
     return vet;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    int v [] = {10,5,8,1,6,15,4,11,9,2};    
    int vetor [] = new int[10];
    vetor = ordenaVetor(v); 
       for(int i = 0; i < vetor.length; i++){ 
        System.out.println("Vetor decrescente: " +vetor[i]);
        }
    }
}