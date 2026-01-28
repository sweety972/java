import java.util.Scanner;

public class symmetricmatrix {
    public static void main(String arg[])
    {
        Scanner sweety = new Scanner(System.in);
        int [][] mat1;
        int [][] mat2;

        System.out.println("Enter the order of the square matrix : ");
        int x = sweety.nextInt();

        mat1 = new int[x][x];
        mat2 = new int[x][x];

        System.out.println("Ente the matrix : \n");
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < x; j++)
            {
                System.out.println("Enter element (" + i + ", " + j + ") : ");
                mat1[i][j] = sweety.nextInt();
            }
        }

        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < x; j++)
            {
                mat2[i][j] = mat1[j][i];
            }
        }

        boolean flag = true;

        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < x; j++)
            {
                if (mat1[i][j] == mat2[i][j])
                {
                    flag = true;
                }
                else
                {
                    flag = false;
                    break;
                }
            }
        }

        if (flag == true)
        {
            System.out.println("The matrix is symmetric...\n");
        }
        else
        {
            System.out.println("The matrix is not symmetric...\n");
        }
    }
}
