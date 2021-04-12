/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_03;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int numeros[][] = new int [6][4];
        Scanner sc = new Scanner(System.in);
        //linhas
        for(int i=0; i < numeros.length; i++){
            //colunas
            for(int j = 0; j < numeros[0].length ;j++){
                numeros[i][j] = sc.nextInt();
            }
        }
        //mostrar a matri preenchida
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[0].length;j++){
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i < numeros.length; i++){
            //colunas
            int maiorNumero = 0;
            for(int j = 0; j < numeros[0].length ;j++){
                if(numeros[i][j] > maiorNumero){
                    maiorNumero = numeros[i][j];
                }
            }
            //aqui eu ja estou com o maior da linha numa variavel
            for(int j = 0; j < numeros[0].length ;j++){
                numeros[i][j] = numeros[i][j] * maiorNumero;
            }
        }
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[0].length;j++){
                System.out.print("Multiplicando valores: " + numeros[i][j]+" ");
            }
            System.out.println();
        }


    }
}
  
