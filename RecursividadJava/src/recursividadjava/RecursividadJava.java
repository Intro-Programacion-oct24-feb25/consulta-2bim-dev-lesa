/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadjava;

/**
 *
 * @author Luis
 */
public class RecursividadJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("El factorial de " + numero + " es: " + factorial(numero));

        for (int i = 0; i <= 7; i++) {
            System.out.println("Factorial de " + i + ": " + factorial(i));
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
