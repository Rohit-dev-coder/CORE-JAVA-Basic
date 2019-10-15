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
public class FibonacciCode {
    public static void main(String[] args) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(br.readLine());
         long f1=0,f2=1;
         System.out.println(f1);
         System.out.println(f2);
         long f =f1+f2;
         System.out.println(f);
         int count = 3;
         while (count < n)
         {
             f1 = f2;
             f2 = f;
             f = f1+f2;
             System.out.println(f);
             count++;
         }
    }
}
