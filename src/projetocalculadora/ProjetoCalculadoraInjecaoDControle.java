/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetocalculadora;

import projetocalculadora.inversaodependencia.Somar;
import projetocalculadora.inversaodependencia.Subtrair;

public class ProjetoCalculadoraInjecaoDControle {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        calculadora.setOperacao(new Somar("+"));
        calculadora.setOperacao(new Subtrair("-"));
        calculadora.setA(15.0);
        calculadora.setB(10.0);
        
        System.out.println(" " + calculadora.calcular("+"));
        
    }
    
}
