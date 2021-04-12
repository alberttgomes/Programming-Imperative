/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_imperativa8;

/**
 *
 * @author alber
 */
public class Prova_imperativa8 {

    /**
     * @param args the command line arguments
     */
    
   
    
    public static void main(String[] args) {
        // TODO code application logic here
    double [][] matriz = {{8,6,12,1,7,5,14},{25,20,6,2,8,12,9},{55,2,11,30,21,6,9},{3,5,15,4,66,10,18}};
    
    double maior = matriz.length;
    double menor = matriz.length;
    int linha = 0;
    int coluna = 0;
    int linha1 =0;
    int coluna1 = 0; 
    
    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz[i].length; j++){
       if (matriz[i][j] > maior){
        maior = matriz[i][j];
        linha = i+1;
        coluna = j+1;
       }   
      }
    }
     
    for(int i = 0; i < matriz.length; i++){
       for(int j = 0; j < matriz[i].length; j++){
          if(matriz[i][j] < menor){
            menor = matriz[i][j];
            linha1 = i+1;
            coluna1 = j+1;
          }
       } 
    } 
    
        System.out.println("Maior valor: " + maior + "\n" + "Linha: " + linha + "\n" + "Coluna: " + coluna);
        System.out.println("");
        System.out.println("Menor valor: " + menor + "\n" + "Linha: " + linha1 + "\n" + "Coluna: " + coluna1);  
        
    }
}
