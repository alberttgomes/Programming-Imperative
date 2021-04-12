/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_05;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Ex_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         float numeros[] = new float[10];   //alocando espaÃ§o na memÃ³ria
        Scanner sc = new Scanner(System.in);
        int negativos = 0;
        float soma = 0;
        //preenchendo o vetor
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextFloat();
        }
        System.out.println("Vou começar a mostrar o vetor");
        //verificar negativos
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < 0){
                //negativos = negativos + 1; Ã© a mesma coisa que negativos++;
                negativos++;
            }
            else if(numeros[i] > 0){
                soma = soma + numeros[i];
                //soma+=numeros[i];
            }
        }

        System.out.println("Quantidade de negativos = "+negativos);
        System.out.println("Soma dos positivos = "+soma);

        
    }
    
}
