/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocalculadora.inversaodependencia;

/**
 *
 * @author aluno
 */
public abstract class Operacao {
    public String nomeOperacao = "";
    public abstract double calcular(double a, double b);
}
