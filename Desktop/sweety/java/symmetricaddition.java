import java.util.Scanner;
public class symmetricaddition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[][] mat1;
        int[][] mat2;
        int [][] mat3;
        System.out.println("enter the order");
        int x=sc.nextInt();
        mat1=new int[x][x];
        mat2=new int [x][x];
        mat3=new int[x][x];
        System.out.println("enter the first matrix");
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                System.out.println("enter the elements "+i+","+j);
              mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the second matrix");
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                System.out.println("enter the elements "+i+","+j);
                 mat2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                mat3[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }
    }  
}
