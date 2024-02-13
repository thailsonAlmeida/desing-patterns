/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocalculadora;

import java.util.ArrayList;
import java.util.List;
import projetocalculadora.inversaodependencia.Operacao;

public class Calculadora {

    private double a, b;

    //private Operacao operacao = null;
    
    private final List<Operacao> operacaoList = new ArrayList();

    public void setOperacao(Operacao op) {
       operacaoList.add(op);
    }
    
    public double calcular(String nomeOperacao){
        for(Operacao n: operacaoList){
            if(n.nomeOperacao.equals(nomeOperacao)){
                return n.calcular(a, b);
            }
        }
        return 0;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

}
