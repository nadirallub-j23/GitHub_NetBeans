package ejemploProyecto;

import java.util.Scanner;

/**
 * Clase principal en la que llamamos a las clases de cada colaborador
 *
 * @author Nadir
 * @version ultima, 19/01/2026
 */
public class EjemploProyecto {

    /**
     * Funcion Main que contiene un menu para elegir la clase de cada
     * colaborador y se ejecuten sus metodos
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.println("Dime una opcion del 1 al 4: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    ClaseNadir a = new ClaseNadir();
                    a.principal();
                    break;
                case 2:
                    JorgeClass jorge = new JorgeClass();
                    float n1,
                     n2,
                     n3;
                    System.out.println("Introduce la primera nota: ");
                    n1 = teclado.nextFloat();
                    System.out.println("Introduce la segunda nota: ");
                    n2 = teclado.nextFloat();
                    System.out.println("Introduce la tercera nota: ");
                    n3 = teclado.nextFloat();

                    float promedio = jorge.promedioNota(n1, n2, n3);
                    String mensaje = jorge.conclusionFinal(promedio);

                    System.out.println("Promedio obtenido: " + promedio);
                    System.out.println("Conclusion final: " + mensaje);
                    break;
                case 3:
                    JuanClase juan = new JuanClase();
                    juan.calculoImc();
                    break;
                case 4:
                    AlejandroClass alejandro = new AlejandroClass();
                    alejandro.parteTriangulo();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (opcion != 0);
    }

}
