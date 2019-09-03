/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastián Sanchez
 */
public class Cine {
    
    
    ArrayList<Array> arraySalas=new ArrayList<Array>();
       
   
    public int pedirSalas(){
        System.out.println("Ingrese la cantidad de salas del cine");
        Scanner teclado= new Scanner(System.in);
        int salas= teclado.nextInt();
        return salas;
    }
    
}
