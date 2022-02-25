/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.Scanner;

/**
 *
 * @author taysa
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int v[] = new int[10];
        int v2[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um número");
            v[i] = sc.nextInt();
        }
        for (int j = 9; j >= 0; j--) {
            v2[j] = v[9 - j];
        }
        System.out.println("  Vetor  ");
        for (int i = 0; i < 10; i++) {
            System.out.print(v[i] + "\t");
        }
        System.out.println("");
        System.out.println("  Vetor invertido  ");
        for (int i = 0; i < 10; i++) {
            System.out.print(v2[i] + "\t");
        }

    }
}
