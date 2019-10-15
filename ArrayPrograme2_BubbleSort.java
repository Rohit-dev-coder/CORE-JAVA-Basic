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
public class ArrayPrograme2_BubbleSort {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How Many Elements? ");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        
        for (int i=0; i<n; i++){
            System.out.println("Enter Int: ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        //use bubble sort technique to sort the integers
        int limit = n-1;
        boolean flag = false;
        int temp;
        
        for (int i=0; i<limit ; i++)
        {
            for(int j=0 ; j<limit-i ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (flag == false)
                break;
        }
        System.out.println("The Sorted Array is :");
        for(int i=0; i<n ; i++)
            System.out.println(arr[i]);
    }
    
}
