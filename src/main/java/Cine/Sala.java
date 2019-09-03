/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

/**
 *
 * @author Sebastián Sanchez
 */
public class Sala {

    int butacas[][]= new int[aleatorioLetras()][aleatorioNumeros()];
    

    public int aleatorioNumeros() {
        int aleatorio = (int) Math.random() * 99 + 1;
        return aleatorio;
    }
    
    public int aleatorioLetras(){
        int aleatorio= (int)Math.random()*26+1;
        return aleatorio;
    }
    
    public void mostrarButacas(){
        for(int i=0;i<butacas.length;i++){
            for(int j=0;j<butacas.length;j++){
                System.out.println("["+butacas[i][j]+"]");
                
            }
        }
    }
}
