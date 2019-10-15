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
public class InputExample3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String ch = kb.next();
        System.out.println(ch);
        int i = kb.nextInt();
        System.out.println(i);
        kb.nextLine();
        String s = kb.nextLine();
        System.out.println(s);
    }
}
