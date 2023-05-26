/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg13.pkg5;
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
    System.out.print("Introduce el valor de n: ");
    int n = sc.nextInt();
    
    int[] vector = new int[n];
    
    for (int i = 0; i < n; i++) {
      vector[i] = i+1;
    }
    
    for (int i = 0; i < n; i++) {
      if (vector[i] < 500) {
        System.out.println(vector[i]);
      }
    }
    
    }
    
}
