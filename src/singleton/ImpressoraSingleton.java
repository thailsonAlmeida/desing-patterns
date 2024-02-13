/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

public class ImpressoraSingleton {
    private static int contador = 0, contadorInterno = 0;
    private static ImpressoraSingleton impressoraSingleton = null;

    private ImpressoraSingleton() {
    }

    public static synchronized ImpressoraSingleton getInstance() {
        contador++;
        if (impressoraSingleton == null) {
            contadorInterno++;
            impressoraSingleton = new ImpressoraSingleton();
        }
        return impressoraSingleton;
    }

    //FUNCIONALIDADE PROPIAS DA IMPRESSORA
    public void imprimir(String nome){
        System.out.println("Imprimindo... " + nome + " " + contador  + " " + contadorInterno);
    }
}
