/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocalculadora.inversaodependencia;

/**
 *
 * @author aluno
 */
public class Somar extends Operacao {

    @Override
    public double calcular(double a, double b) {
        return a + b;
    }

    public Somar(String nomeOperacao) {
        this.nomeOperacao = nomeOperacao;
    }

}
