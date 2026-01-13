/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploProyecto;

import java.util.Scanner;

/**
 *
 * Ejemplo de clase (Nadir) para las practicas de entornos de desarrollo
 *
 * @author nadir.allub
 */
public class ClaseNadir {

    /**
     * Funcion main, donde se llamará al resto de funciones
     * @param args 
     */
    public static void main(String[] args) {
        ClaseNadir ej = new ClaseNadir();
        int num1 = ej.pideNum("Dime un numero: ");
        int num2 = ej.pideNum("Dime el otro numero: ");
        int res = ej.suma(num1, num2);
        System.out.println("El resultado de la suma es " + res);
    }
    
    /**
     * Funcion pideNum, simplemente para pedirle los datos al usuario
     * @param mensaje es el mensaje que le mostraremos al usuario
     * @return 
     */
    public int pideNum(String mensaje) {
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        return num;
    }
    /**
     * Esta funcion sirve para hacer la suma de los dos numeros que le pedimos al usuario
     * @param num1 primer numero
     * @param num2 segundo numero
     * @return 
     */
    public int suma(int num1, int num2){
        return num1 + num2;
    }
}
