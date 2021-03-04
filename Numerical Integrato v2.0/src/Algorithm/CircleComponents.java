package Algorithm;

public class CircleComponents {
	private int coord[][]=new int[3][2];
	public CircleComponents(int a[][]){
		
		for(int i=0;i<3;i++)
			for(int j=0;j<2;j++)
			coord[i][j]=a[i][j];
	}
	
	public int[] calculate(){
		int result[]=new int[3];
		double input[][]=new double[3][4];
		for(int i=0;i<3;i++){
		
			input[i][0]=2*coord[i][0]; //g
			input[i][1]=2*coord[i][1]; //f
			input[i][2]=1; input[i][3]=-(coord[i][0]*coord[i][0]+coord[i][1]*coord[i][1]); //constant
		}
		GaussElimination obj=new GaussElimination(input,3,4); // calling this to convert it into upper triangular matrix
		double p[][]=obj.calc1();
				double g=0.0,f=0.0,c=0.0;

		c=Math.round((p[2][3]/p[2][2])*1000.0)/1000.0;
		f=Math.round(((p[1][3]-p[1][2]*c)/p[1][1])*1000.0)/1000.0;
		g=Math.round(((p[0][3]-(p[0][2]*c+p[0][1]*f))/p[0][0])*1000.0)/1000.0;
		System.out.println(g+","+f+","+c);
			result[0]=(int) -g; result[1]=(int) -f; result[2]=(int) Math.round(Math.sqrt(g*g+f*f-c));
		
		
		
		return result;
	}

}
