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
    int [][] matriz = {{20,6,7,2},{7,1,9,21},{4,8,50,6},{30,5,8,4}};
    int menor = 999999999;
    int maxmin = 0;
    int j = 0;
    int i = 0;
    int linha = 0;
    int coluna = 0;
     
     for(i = 0; i < matriz.length; i++){
        for( j = 0; j < matriz[i].length; j++){
            if(matriz[i][j] < menor){
            menor = matriz[i][j];
            linha = i;
            }
        }
        //maxmin = matriz[linha][0];
          for(j = 0; j < matriz[linha].length; j++){
                if(matriz[linha][j] > menor){
                maxmin = matriz[linha][j];
                coluna = j;
                }
          }
              
     }
       System.out.println("Resultante: " + maxmin+ " Linha: " + linha + " Coluna: " +coluna);
       //System.out.println(maxmin+ " " + linha + " " + coluna);
    }
    
}
