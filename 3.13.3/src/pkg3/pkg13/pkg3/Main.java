/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg13.pkg3;
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
         Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un valor para n: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            arreglo[i] = i + 1;
        }

        System.out.println("Contenido del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
    } 
}
}
