/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_02;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class E_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int numeros[] = new int[5];
        int primos[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int i, indicePrimo = 0;
        boolean ehPrimo = true;
        //preenchendo o vetor
        for(i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
        }
        //verificando cada casa se Ã© primo ou nÃ£o 
        for(i = 0; i < numeros.length; i++){
            ehPrimo = true;
            //dividindo por todos anteriores
            for(int j = 2; j < numeros[i] - 1; j++ ){
                //ver se nÃ£o Ã© primo
                if(numeros[i] % j == 0 ){
                    ehPrimo = false;
                    break;
                    //j = numeros[i];
                }
            }
            if(ehPrimo){
                primos[indicePrimo] = numeros[i];
                indicePrimo++;
            }
        }
        for(i = 0; i < indicePrimo ; i++){
            System.out.println(primos[i]);
        }
    }
}
   