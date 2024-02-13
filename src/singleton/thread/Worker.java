/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.thread;

import singleton.ImpressoraSingleton;

/**
 *
 * @author aluno
 */
public class Worker extends Thread{
    public String nome;
    ImpressoraSingleton impressoraSingleton = null;
    
    @Override
    public void run(){
        while(true){
            impressoraSingleton = ImpressoraSingleton.getInstance();
            impressoraSingleton.imprimir(nome);
        }
    }
}
