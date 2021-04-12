/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_imperativa7;

/**
 *
 * @author alber
 */
public class Prova_imperativa7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int [][] matriz = {{35, 5, 44, 7, 4},{11, 2, 13, 15, 22},{23, 1, 10, 8, 6, 50},{17, 14, 3, 8, 9}};
    int [][] matriz1 ={{77,6},{12, 21},{4, 5},{3, 4}, {55,6}};
    int i, j = 0;
    int [][] matriz2 = new int[matriz.length][matriz1[0].length];
    int resultado = 0;    
        for(i = 0; i < matriz.length;i++){
           for(j = 0; j < matriz1[0].length; j++){
               resultado = 0;
             for(int k = 0; k <matriz[i].length; k++){
               resultado += matriz[i][j]* matriz1[i][j];
               matriz2[i][j] = resultado;
             }   
           }
        }
        for(int lin = 0; lin < matriz2.length; lin++){
           for(int col = 0; col < matriz2[0].length; col++){
               System.out.println("Matriz resultante: ");
               System.out.println(matriz[lin][col]);
           }
        }
    }
}
