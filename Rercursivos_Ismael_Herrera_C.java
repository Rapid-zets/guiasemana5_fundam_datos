/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rapidzets.rercursivos_ismael_herrera_c;

/**
 *
 * @author mplab4.pc26
 */
public class Rercursivos_Ismael_Herrera_C {

   public static void main(String[] args) {
        int opcion;
        
         do{
        System.out.println("Menu");
        System.out.println("1.Contar digitos");
        System.out.println("2.Suma de digitos");
        System.out.println("3.Maximo comun divisor");
        System.out.println("4.invertir");
        System.out.println("5.salir");
        opcion = Funciones.datos_numero_menu();
        
        switch(opcion){
            
            case 1 -> {int num1 = Funciones.datos_numeros();
                System.out.println("El numero "+ num1 +" tiene "+Funciones.contar_d(num1)+" digitos");}
       
            case 2 -> {int num2 = Funciones.datos_numeros();
                System.out.println("La suma de los digitos de "+ num2+   " es: "+Funciones.sumar_d(num2));}
            
            case 3 ->{int [] numeros = Funciones.datos2numeros(); 
            int num3 = numeros[0];
            
            int num4 = numeros[1];     
            
            System.out.println("El maximo comun divisor de "+ num3 + " y "+ num4+  " es: "+Funciones.MCD(num3, num4));}

              
            case 4 -> {    String t= Funciones.cadena();
           System.out.println("La cadena invertida de "+ t +" es:"+Funciones.invertido(t));}
            
            case 5 -> {System.out.println("hasta luego");}}}
              
       
        while(opcion != 5);}}
    

