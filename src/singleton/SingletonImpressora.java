/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package singleton;

import singleton.thread.Worker;

public class SingletonImpressora {

    public static void main(String[] args) {
        
        ImpressoraSingleton impressoraHP = ImpressoraSingleton.getInstance();
        System.out.println("" + impressoraHP);
        
        impressoraHP = ImpressoraSingleton.getInstance();
        System.out.println("" + impressoraHP);
        
        //impressoraHP.imprimir();
        
        Worker trabalhadorA1 = new Worker();
        trabalhadorA1.nome = "Jhon";
        
        Worker tabalhadorB1 = new Worker();
        tabalhadorB1.nome = "Mary";
        
        trabalhadorA1.start();
        tabalhadorB1.start();
        
    }
}
