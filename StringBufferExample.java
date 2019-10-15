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
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(20);
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter You FirstName");
        String fn = kb.next();
        System.out.println("Enter your MiddleName");
        String mn = kb.next();
        System.out.println("Enter Your LastName");
        String ln = kb.next();
        sb.append(fn);
        sb.append(" ");
        sb.append(ln);
        System.out.println("Your Name is : "+sb);
        int n = fn.length();
        sb.insert(n," "+mn);
        System.out.println("Full Name is :"+sb);
        System.out.println("your Reverse Name: "+sb.reverse());
        
    }
}
