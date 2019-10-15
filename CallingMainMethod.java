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
public class CallingMainMethod {
    public static void main(String[] args) {
        System.out.println("Length of Array is :"+args.length);
        for (String s: args)
            System.out.println(s);
    }
    
}
class MyClassCall{
    public static void main(String[] args) {
        String names[] = {"Raju","Akash","Nitin","Naman"};
        CallingMainMethod.main(names);
    }
}
/* 
output:
Length of Array is :4
Raju
Akash
Nitin
Naman
*/