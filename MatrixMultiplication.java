import java.util.*;
class MatrixMultiplication
{	
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int r1,c1,r2,c2,k,i,j;
			System.out.println("enter row and column values of 1st matrix:");
			r1=sc.nextInt();
			c1=sc.nextInt();
			System.out.println("enter row and column values of 2nd matrix:");
			r2=sc.nextInt();
			c2=sc.nextInt();
			int a[][]=new int[r1][c1];
			int b[][]=new int[r2][c2];
			int c[][]=new int[c1][r2];
			System.out.println("enter 1st matrix elements:");
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a.length;j++)
					{
						a[i][j]=sc.nextInt();
					}
			}
			System.out.println("enter 2nd matrix elements:");
			for(i=0;i<b.length;i++)
			{
				for(j=0;j<b.length;j++)
					{
						b[i][j]=sc.nextInt();
					}
			}
			if(c1==r2)
			{
				for(i=0;i<a.length;i++)
					{
						for(j=0;j<b.length;j++)
							{
								c[i][j]=0;
								for(k=0;k<c1;k++)
								{
									c[i][j]=c[i][j]+a[i][k]*b[k][j];
								}
							}
					}		
			}
			System.out.println("Resultant matrix:");
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a.length;j++)
					{
						System.out.print(" " +c[i][j]);
					}
				System.out.println(" "); 
			}
				
		}
}