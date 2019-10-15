/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprogrames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author my pc
 */
public class InputExampleSum {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Two number  :");
        String str = br.readLine();
        
        //split String at comma
        StringTokenizer st = new StringTokenizer(str,",");
        String s1 = st.nextToken().trim();
        String s2 = st.nextToken().trim();
        
        double n1 = Double.parseDouble(s1);
        double n2 = Double.parseDouble(s2);
        
        System.out.println("Sum = "+(n1+n2));
        System.out.println("Subtration = "+(n1-n2));
        System.out.println("Multiplication = "+(n1*n2));
        System.out.println("Division = "+(n1/n2));
    }
}
