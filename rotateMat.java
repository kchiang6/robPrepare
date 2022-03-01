import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         int[][] mat = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22 ,23, 24, 25}};
         
         int k = 1;
         int n = mat.length;
         
        for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.print(mat[i][j] + " ");
             }
             System.out.println();
         }
         
         k %= 4;
        
        while (k > 0) { 
         for (int i = 0; i < mat.length/2; i++) {
             for (int j = i+1; j < mat.length-i-1; j++) {
                 int temp = mat[i][j];
                 mat[i][j] = mat[n-j-1][i];
                 mat[n-j-1][i] = mat[n-i-1][n-j-1];
                 mat[n-i-1][n-j-1] = mat[j][n-i-1];
                 mat[j][n-i-1] = temp;
             }
         }
         k--;
        }
         
         System.out.println("After rotate");
         
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.print(mat[i][j] + " ");
             }
             System.out.println();
         }
     }
}
