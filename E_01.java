/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_01;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class E_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         float notas[][] = new float [3][3];
        String nomeSituacao[][] = new String [6][2];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < notas.length; i++){   
            System.out.println("Digite o nome do aluno: ");
            nomeSituacao[i][0] = sc.nextLine();
            
            System.out.println("Digite a nota 1: ");
            notas[i][0] = sc.nextFloat();

            System.out.println("Digite a nota 2: ");
            notas[i][1] = sc.nextFloat();

            sc.nextLine();
            
            float media = (notas[i][0] + notas[i][1]) / 2 ;
            notas[i][2] = media;

            if(notas[i][2] >= 7.0){
                nomeSituacao[i][1] = "Aprovado";
            }
            else if(notas[i][2] >= 5.0){
                nomeSituacao[i][1] = "Exame";
            }
            else{
                nomeSituacao[i][1] = "Reprovado";
            }
        }
        DecimalFormat fmt = new DecimalFormat("0.00");
        for(int i = 0; i<notas.length; i++){
            System.out.print("  "+nomeSituacao[i][0] + "   ");
            for(int j = 0; j<3; j++){
                System.out.print(fmt.format(notas[i][j]) + "   ");
            }
            System.out.print(nomeSituacao[i][1] + "   ");
            System.out.println("");
        }
        float somaMedia = 0;
        float contAprovado = 0, contReprovado = 0, contExame = 0;
        for(int i = 0; i<notas.length; i++){
            somaMedia = somaMedia + notas[i][2];
            if(nomeSituacao[i][1] == "Aprovado"){
                contAprovado++;
            }
            if(nomeSituacao[i][1] == "Reprovado"){
                contReprovado++;
            }
            if(nomeSituacao[i][1] == "Exame"){
                contExame++;
            }

        }
        float mediaTotal = somaMedia / notas.length;

        float percAprovados = (contAprovado / notas.length) * 100;
        float percReprovados = (contReprovado / notas.length) * 100;
        float percExame = (contExame / notas.length) * 100;


        System.out.println("MÃ©dia Total = "+mediaTotal);
        System.out.println("Percentual Aprovados = "+percAprovados);
        System.out.println("Percentual Reprovados = "+percReprovados);
        System.out.println("Percentual Exame = "+percExame);
    }
}
   
