/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprogrames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author my pc
 */
public class InputExample  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter id: ");
        int id = Integer.parseInt(br.readLine());
        System.out.println("Enter sex (M/F): ");
        char sex = (char)br.read();
        /*
        When we type M for sex and press Enter, then it releases a \n code.So at sex column, we are gving two characters
         M and \n. But read() method takes only the first character and rejects the next character.
        So, name is not accepted by readLine() method as it already contains \n\
        Solution 1 ==> char sex = br.readLine.charAt(0);
        Solution 2 ==> We can use skip() method of BufferedReader, which helps in skipping a specified number of characters.
                        suppose we take \n as 2 charactters; now to skip them  we can write br.skip(2)
        */
        br.skip(2);
        System.out.println("Enter Name: ");
        String name = br.readLine();
        System.out.println("Id = "+id);
        System.out.println("Sex = "+sex);
        System.out.println("Name = "+name);
        
    }
}


