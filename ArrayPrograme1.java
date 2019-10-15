/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprogrames;

import java.util.Scanner;

/**
 *
 * @author my pc
 */
public class ArrayPrograme1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);   
        System.out.println("How many subjects? ");
        int n = kb.nextInt();
        float [] marks = new float[n];
        float total = 0;
        for (int i=0; i<n; i++)
        {
            System.out.println("Enter Marks : ");
            marks[i] = kb.nextFloat();
            total += marks[i];
        }
        System.out.println("Total Marks : "+total);
        System.out.println("Percantage :"+ ((float)total/n));
    }
}
