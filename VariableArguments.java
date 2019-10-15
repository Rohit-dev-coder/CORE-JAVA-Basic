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
public class VariableArguments {
    static int max (int ... x)
    {
        int max = x[0];
        for(int i = 1; i<x.length; i++)
            if ( max < x[i] )
                max = x[i];
        return max;
    }
    public static void main(String[] args) {
        int arr1[] = {20,10,5,24,60};
        int result = max(arr1);
        System.out.println("Maximum = "+ result);
        int arr2[] = {1,2,3};
        int result2 = max(arr2);
        System.out.println("Maximum = "+ result2);
    }
}
