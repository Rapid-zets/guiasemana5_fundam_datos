/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rapidzets.rercursivos_ismael_herrera_c;
import java.util.Scanner;
/**
 *
 * @author mplab4.pc26
 */
public class Funciones {

    public static int contar_d(int number) {
        if (number == 0) {
        return 0;}
     
    return 1+contar_d(number/10);}
        

    public static int MCD(int num1, int num2){
    if( num1==num2){
        return num1;}
    else if(num1 < num2){ 
    return MCD(num1,num2-num1);}
    else {
    return MCD(num1-num2,num2);}}
    

    public static int sumar_d(int number){
        if (number == 0) {
        return 0;}
     
    return number%10 + sumar_d(number/10);}

    public static String invertido(String texto){
     if (texto.isEmpty()){
    return texto;}
    return invertido(texto.substring(1))+texto.charAt(0);}

    public static int datos_numeros() {
       Scanner num = new Scanner(System.in);
        int number;
        do {
            System.out.println("Ingrese un numero positivo: ");
            while (!num.hasNextInt()) {
                System.out.println("Debe ingresar un numero entero.");
                System.out.print("Ingresar nuevamente: ");
                num.next();
            }
            number = num.nextInt();
            if (number <= 0) {
                System.out.println("Debe ingresar un numero positivo.");
            }
        } while (number <= 0);
        
        return number;}
    
    public static int[] datos2numeros() {
    Scanner num = new Scanner(System.in);
    int[] numbers = new int[2];

    for (int i = 0; i < 2; i++) {
        do {
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            while (!num.hasNextInt()) {
                System.out.println("Debe ingresar un numero entero.");
                System.out.print("Ingresar nuevamente: ");
                num.next();
            }
            numbers[i] = num.nextInt();
            if (numbers[i] <= 0) {
                System.out.println("Debe ingresar un número positivo.");
            }
        } while (numbers[i] <= 0);}

    return numbers;}

    
     public static String cadena(){
         Scanner cadena = new Scanner(System.in);
         String texto;
        do {
            System.out.println("Ingrese una cadena: ");
            texto = cadena.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("Debe ingresar una cadena no vacía.");
            }
        } while (texto.isEmpty());

        return texto;}

   public static int datos_numero_menu(){
        Scanner op;
        op = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Ingrese una de las opciones");
            while (!op.hasNextInt()) {
                System.out.println("Debe ingresar una opcion numerica de entre 1 y 5");
                System.out.print("Ingresar nuevamente: ");
                op.next();
            }
            opcion =op.nextInt();
            if (opcion > 0||opcion <=5) {
            } else {
                System.out.println("Debe ingresar una opcion dentro del rango");
            }
        } while (opcion <= 0||opcion >5);
        
        return opcion;
     }}
     
    
    