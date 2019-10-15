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
public class InputExample2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name,age,salary :");
        String str = br.readLine();
        /* 
        StringTokenizer is useful to break a String into small pieces called tokens. 
        ========> StringTokenizer(String,"Seperation")
        */
        StringTokenizer st = new StringTokenizer(str,",");
        String s1 = st.nextToken().trim();
        String s2 = st.nextToken().trim();
        String s3 = st.nextToken().trim();
        
        String name = s1;
        int age = Integer.parseInt(s2);
        double sal = Double.parseDouble(s3);
        System.out.println("Name = "+name);
        System.out.println("Salary = "+sal);
        System.out.println("Age = "+age);
        
    }
    
}
