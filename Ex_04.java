/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_04;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int numeros[][] = new int [3][4];
        Scanner sc = new Scanner(System.in);
        //linhas
        for(int i=0; i < numeros.length; i++){
            //colunas
            for(int j = 0; j < numeros[0].length ;j++){
                numeros[i][j] = sc.nextInt();
            }
        }
        //mostrar a matriz
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[0].length;j++){
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println();
        }
        int contPares = 0, somaImpar = 0, soma = 0;
        //acabamos de preencher a matriz
        for(int i=0; i < numeros.length; i++){
            for(int j = 0; j < numeros[0].length ;j++){
                //verificar se Ã© par
                if(numeros[i][j] %2 == 0){
                    contPares++;
                }
                //somando Ã­mpares
                else{
                    somaImpar = somaImpar + numeros[i][j];
                }
                
                soma = soma + numeros[i][j];
            }
        }

        float media = soma  / (numeros.length * numeros[0].length);
        
        System.out.println("Pares = "+contPares);
        System.out.println("soma dos ímpares = "+somaImpar);
        System.out.println("Media = "+media);
           
        
    }
    
}
