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
public class ScannerExample {
    public static void main(String[] args) {
        System.out.println("Enter id,name,sal: ");
        Scanner kb = new Scanner(System.in); //When Scanner class receives input, it breaks it into several pieces, called tokens.
        int id = kb.nextInt();
        String name = kb.next();
        float sal = kb.nextFloat();
        System.out.println("Name = "+name);
        System.out.println("Salary = "+sal);
        System.out.println("ID = "+id);
    }
}
