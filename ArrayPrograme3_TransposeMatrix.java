/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprogrames;

import java.util.Scanner;

/**
 *
 * @author my pc
 */
public class ArrayPrograme3_TransposeMatrix {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter rows, columns? ");
        int r = kb.nextInt();
        int c = kb.nextInt();
        int arr[][] = new int[r][c];
        
        System.out.println("Enter Elements of Matrix: ");
        for(int i =0; i<r; i++)
            for(int j =0; j<c; j++)
                arr[i][j] = kb.nextInt();
        System.out.println("Original Matrix is: ");
        for(int i =0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("The Transpose Matrix is: ");
        for(int i =0; i<c; i++)
        {
            for(int j=0; j<r; j++)
            {
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println("");
        }
    }
    
}
/* output
69
78
98
3
8
Original Matrix is: 
45 65 1 
2 69 78 
98 3 8 
The Transpose Matrix is: 
45 2 98 
65 69 3 
1 78 8 
*/
