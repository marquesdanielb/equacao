/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.equacao;

/**
 *
 * @author suporte
 */
public class Equacao {
    private double delta;
    private double a;
    private double b;
    private double c;
    
    //Método 
    public void calculaEquacao(){
        delta = Math.pow(b,2)-4*a*c;
        double x1 = (-b+Math.sqrt(delta))/2*a;
        double x2 = (-b-Math.sqrt(delta))/2*a;
        
        if(delta < 0){
            throw new RuntimeException("Não admite solução real");
        }else if(delta == 0){
            System.out.println("X1 = "+x1+" X2 = "+x2);
        }else{
            System.out.println("X1 = "+x1+" X2 = "+x2);
        }
    }
    
    //Setters
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    
    //Getters
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDelta(){
        return this.delta;
    }
}
/**if(delta == 0){
            System.out.println("X1 = "+x1+" X2 = "+x2);
        }else if(delta >= 0){
            System.out.println("X1 = "+x1+" X2 = "+x2);
        }else{
        System.out.println("Nenhuma raiz real: quando delta for "
                + "menor que zero");
        }
**/