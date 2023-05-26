/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg13.pkg2;
import java.util.Scanner;
/**
 *
 * @author Ambiente 209-3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();
        
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = i + 1;
        }
        
        System.out.println("Los numeros en el arreglo son:");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
    