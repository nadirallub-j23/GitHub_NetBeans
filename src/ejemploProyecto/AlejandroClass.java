package ejemploProyecto;

import java.util.Scanner;

/**
 * Clase para añadir * para hacer un triángulo
 * @author aleja
 * @version primera, 13/01/26
 */
public class AlejandroClass {

    /**
     * Pide al usuario un número entre 3 y 9 para dibujar un triángulo
     */
    public void parteTriangulo() {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número entre 3 y 9: ");
            numero = teclado.nextInt();
        } while (numero < 3 || numero > 9);

        for (int fila = 1; fila <= numero; fila++) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
