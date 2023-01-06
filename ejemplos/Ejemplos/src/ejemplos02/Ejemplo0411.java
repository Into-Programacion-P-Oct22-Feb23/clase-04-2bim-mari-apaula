/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo0411 {

    public static void main(String[] args) {
        // 
        int [] arrerglo1 ={100,200,300,500};
        int [] arrerglo2 ={1000,2000,3000,5000};

        for (int i =0; i<arrerglo1.length;i++){
            obtenerSuma(arrerglo1[i], arrerglo2[i]);  
        }
        /*for (int i =0; i<arrerglo1.length;i++){
            int primerValor = arrerglo1[i];
            int segundoValor = arrerglo2[i];
            obtenerSuma(primerValor, segundoValor);  
        }    */
    }
        
    public static void obtenerSuma(int a, int b){
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);
        
    }
    
    
}
