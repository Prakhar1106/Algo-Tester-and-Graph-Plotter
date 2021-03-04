package Algorithm;

public class GaussElimination {


	double p[][];
	int m,n;
	
	public GaussElimination(double[][] b,int m,int n)
	{
		p=new double[m][n];
		this.m=m;this.n=n;
		p=b;
		
	}
	
	
	public double[][] calc1(){
		double dumm[]=new double[n];
		for(int k=0;k<m-1;k++)
			for(int i=k+1;i<m;i++){
				for(int j=k;j<n;j++){
					/*Actual working to make upper triangular matrix*/
					dumm[j]=p[i][j]-(p[i][k]*p[k][j])/p[k][k]; 
					}
					/*change ith row of matrix with calculated value*/
					for(int t=0;t<n;t++)
					p[i][t]=dumm[t];
					
			}
			
				return p;
			  
    }
}

