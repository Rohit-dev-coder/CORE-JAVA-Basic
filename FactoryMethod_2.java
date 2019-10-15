/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprogrames;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author my pc
 */
public class FactoryMethod_2 {
    public static void main(String[] args) {
        final double PI = (double)22/7;
        double r = 15.5;
        double area = PI*r*r;
        System.out.println("Area = "+area);
        NumberFormat obj = NumberFormat.getNumberInstance();
        obj.setMinimumIntegerDigits(6);
        obj.setMaximumFractionDigits(7);
        String str = obj.format(area);
        System.out.println("Area = "+str);
        
        obj = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println(obj.format(area));//£755.07
        
        obj = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(obj.format(area)); //$755.07
        
        obj = NumberFormat.getNumberInstance(Locale.US);
        str = obj.format(area);
        System.out.println("Area = "+str);
        
    }
}
