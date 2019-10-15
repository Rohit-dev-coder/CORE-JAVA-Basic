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
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String str = kb.next();
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        String temp = sb.toString();
        if(str.equalsIgnoreCase(temp))
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is not a Palindrome");     
        
    }
}
