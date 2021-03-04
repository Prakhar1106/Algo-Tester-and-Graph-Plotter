package Algorithm;

public class InterpolationAlgo {
	
		double ax[]=new double[20];
		double ay[]=new double[20];
		double diff[][]=new double[20][10];
		int n;double x;
		
		public void input(double ax[],double ay[],int n,double x)
		{
		
		this.n=n;
		this.x=x;
		
		
		for(int i=0;i<n;i++)
		{
			this.ax[i]=ax[i];
			this.ay[i]=ay[i];
		}
		
		for(int i=0;i<n-1;i++)
			diff[i][0]=ay[i+1]-ay[i];
		
		for(int j=1;j<n-1;j++)
			for(int i=0;i<n-j-1;i++)
				diff[i][j]=diff[i+1][j-1]-diff[i][j-1];	
		}//input close	
		

		public double algo()
		{   
			double nr=1.0,dr=1.0,yp=0.0,p;	
		    double h=ax[1]-ax[0];
			
			/*Forward Algorithm */
			if((n%2==0 && x<=ax[(n/2)-1])||(n%2!=0 && x<=ax[n/2]))
			{   System.out.println("Forward Algorithm"); 
				int i=0;
				while(!(ax[i]>x)) i++;
				if(i>0)
				i--;  
				else if(i==0)
				i=0;
				
				p=(x-ax[i])/h;
				yp=ay[i];
				double temp=0.0;
				for(int k=0;k<n-1;k++)
				{
					nr *=p-k; dr *=k+1;
					temp=(nr/dr)*diff[i][k];
					yp +=temp;
			
					if(k==n-2&&i!=0)
					{
						nr *=p-k; dr *=k+1;
						yp +=(nr/dr)*diff[0][n-2];
					}
				}
				yp=Math.round(yp*10000.0)/10000.0;
				System.out.println("y="+yp);
			    
			}
			
			/*Backward Algorithm */
			if((n%2==0 && x>ax[(n/2)-1])||(n%2!=0 && x>ax[(n/2)]))
			{
				System.out.println("Backward Algorithm");	
				int i=n-1;
				while(!(ax[i]<x)) i--;
				if(i<n-1)
				i++;  
				else if(i==n-1)
				i=n-1;
				p=(x-ax[i])/h;
				yp=ay[i];
				double temp=0.0; int j=0;
				for(int k=i-1;k>=0;k--)
				{
					nr *=p+j; dr *=j+1;
					temp=(nr/dr)*diff[k][j];
					yp +=temp;j++;
			
					if( k==0 && i!=n-1)
					{   
						nr*=p+j;dr*=j+1;
						yp+=(nr/dr)*diff[0][n-2];
						
						
					}
				}
		
		
				yp=Math.round(yp*10000.0)/10000.0;
				System.out.println("y="+yp);
              
			}
			return yp;
		}	
		
	
	//Test cases
	/*
	3
	4.8
	4
	8.4
	5
	14.5
	6
	23.6
	7
	36.2
	8
	52.8
	9
	73.9
	#########new 
	100
	10.63
	150
	13.03
	200
	15.04
	250
	16.81
	300
	18.42
	350
	19.90
	400
	21.27
	*/
}

