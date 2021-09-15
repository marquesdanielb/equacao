/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.equacao;
import java.util.Scanner;

/**
 *
 * @author suporte
 */
public class CalculadoraDaEquação {
    public static void main(String[] args){
        Equacao equacao = new Equacao();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        equacao.setA(leitor.nextDouble());
        System.out.println("Digite o valor de B: ");
        equacao.setB(leitor.nextDouble());
        System.out.println("Digite o valor de C: ");
        equacao.setC(leitor.nextDouble());
        
        try{
            equacao.calculaEquacao();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
