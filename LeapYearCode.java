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
public class LeapYearCode {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        //century year and divisible by 400
        if ( year%100 == 0 && year%400 == 0 )
            System.out.println("It is LeapYear");
        else if(year%100 != 0 && year%400 == 0)
            System.out.println("It is LeapYear");
        else
            System.out.println("It is Not LeapYear");
        
    }
    
}
