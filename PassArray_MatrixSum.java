
package basicjavaprogrames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Matrix
{
    int mat[][];
    int r;
    int c;

    public Matrix(int r, int c) {
        this.r = r;
        this.c = c;
        mat = new int[r][c];
    }

    public Matrix() {
//        this.row = 3;
//        this.col = 3;
//        mat = new int[row][col];
          this(3,3);
    }
    
    int [][] getMatrix() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i =0; i<r; i++)
        {
            String s = br.readLine();
            st = new StringTokenizer(s," ");
            for(int j=0; j<c; j++)
                mat[i][j] = Integer.parseInt(st.nextToken());
        }
        return mat;
    }
    
    public void displayMatrix(int res[][])
    {
        for(int i =0; i<this.r ; i++)
        {
            for(int j=0; j<this.c; j++)
            {
                System.out.print(res[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    int[][] findSum(int a[][], int b[][])
    {
        int temp[][] = new int[r][c];
        for(int i =0; i<this.r ; i++)
        {
            for(int j=0; j<this.c; j++)
            {
                temp[i][j] = a[i][j] + b[i][j];
            }
        }
        return temp;
    }
        
}
public class PassArray_MatrixSum {
    public static void main(String[] args) throws IOException{
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix(3,3);
        int x[][],y[][],z[][];
        System.out.println("Enter Elements for first matrix: ");
        x = m1.getMatrix();
        System.out.println("Enter Elements for Second matrix: ");
        y = m2.getMatrix();
        z = m1.findSum(x, y);
        System.out.println("Sum of matrix");
        m1.displayMatrix(z);
    }
}
/*
Enter Elements for first matrix: 
1 2 3
4 5 6
7 8 9
Enter Elements for Second matrix: 
11 12 13
14 15 16
17 18 19
Sum of matrix
12	14	16	
18	20	22	
24	26	28	
*/