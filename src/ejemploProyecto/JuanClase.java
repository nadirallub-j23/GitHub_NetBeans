
package ejemploProyecto;

import java.util.Scanner;

/**
 *
 * Calcula el IMC
 */
public class JuanClase {
    public static void main(String[] args){
        double altura=0f;
        double peso=0f;
        double imc=0f;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una altura ");
        altura=teclado.nextDouble();
        System.out.println("Dime un peso ");
        peso=teclado.nextDouble();
        imc=peso/Math.pow(altura, 2);
        System.out.println(imc);
        if(imc<18.5){
            System.out.println("Bajo peso");
        }else if(imc>=18.5 && imc<24.9){
            System.out.println("Peso normal");
        }else if(imc>=25 && imc<29.9){
            System.out.println("Sobrepeso");
        }else{
            System.out.println("Obesidad");
        }
    }
    
}
