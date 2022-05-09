import java.util.Scanner;

public class MatrixDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enete the no of Matrix::");
		n=s.nextInt();
		
		int matrix[][] = new int[n][n];
		System.out.println("Enete the Matrix Elements::");
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
			matrix[i][j]=s.nextInt();
			
			}
		}
		System.out.println("Matrix is::");
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
			System.out.print(matrix[i][j]+" ");
			
			}
			System.out.println();
		}
		
		System.out.println("Diagonal Matrix is::");
		int suma= 0, sumb= 0;
		
		for(i=0;i<n;i++)
		{
			suma = suma + matrix[i][i];
			sumb = sumb - matrix[i][n-i-1];
		} 
			System.out.println(suma);
			System.out.println(sumb);
			System.out.println(suma+sumb);
	}

}
