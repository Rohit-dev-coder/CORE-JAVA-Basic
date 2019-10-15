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
public class StringSearch {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("How many String? ");
        int n = kb.nextInt();
        kb.nextLine();
        String str[] = new String[n];
        System.out.println("Enter a Strings");
        for(int i=0; i<n; i++)
        {
            System.out.print(i+". ");
            str[i] = kb.nextLine();
        }
        System.out.println("Enter String to search: ");
        String search = kb.nextLine();
        
        boolean found = false;
        for(int i =0; i<str.length; i++)
        {
            if(search.equalsIgnoreCase(str[i]))
            {
                System.out.println("Found at position : "+(i+1));
                found = true;
            }
        }
        if (!found)
            System.out.println("Not found in the group");
    }
/*
output
How many String? 
5
Enter a Strings
0. Rohit
1. Rohan
2. ROHIT
3. ROhiT
4. Sana
Enter String to search: 
Rohit
Found at position : 1
Found at position : 3
Found at position : 4
    */
    
}
