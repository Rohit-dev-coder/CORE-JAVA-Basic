/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprogrames;

/**
 *
 * @author my pc
 */
public class StringMethodExamples {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = new String ("I Love Java");
        char arr[] = {'N','E','T','B','E','A','N','S'};
        String s3 = new String(arr);
        
        //display
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        //length Strings
        System.out.println("Length of s1 String is :"+s1.length());  //15
       
        //Concatenate two String;
        System.out.println("s1 and s2 joined : "+s1.concat(s2)); //Welcome to JavaI Love Java
        
        
        boolean x = s1.startsWith("W");
        if (x)
            System.out.println("S1 start with \'W\'");
        else
            System.out.println("S1 not start with W");
        
        
        String suba = s2.substring(2,6);
        String subb = s3.substring(0,8);
        System.out.println(suba +"====="+ subb);
        
        System.out.println("\nUpper s1"+s1.toUpperCase());
        System.out.println("\nSplit Example java:");
        String temp [] = s2.split(" ");
        for(String t: temp)
            System.out.println(t);
        /*Split Example java:
          I
          Love
          Java 
        */
        
    }
}
