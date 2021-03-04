package Algorithm;

public class RegularFalsi {

	private int arr[],deg;   // normal function variable
    
	
	private double actualFunc(double x){
		double valueOfFunction=0.0;
		for(int i=0;i<deg;i++)
		valueOfFunction+=Math.pow(x,i)*arr[i];
		return valueOfFunction;
		//System.out.println(valueOfFunction);
	}
	
	private double formula(double x,double y){
		double xzero,xone,temp;int n=6;
		while(n!=0){
		xzero=actualFunc(x);
		xone = actualFunc(y);
		temp= (x*xone-y*xzero)/(xone-xzero);  //x - ((y-x)/(actualFunc(y)-xzero))*xzero;  
		x=y;
		y=temp;n--;
		}
		
        return y;
		
	}
	
	private double initialRoots(){
		int max=0,min=0;
		for(int i=20;i>-20;i--)
		{
			double res=actualFunc(i);
		    if(res>0)
			max=i;
		    if(res<0)
		    {
		    	min=i;break;
		    }
		    
		}
			
		return formula(min,max);

	}
	
	public double calculate(int a[]){
		deg=a.length;
		arr=new int[deg];
		for(int i=0;i<deg;i++)
			arr[i]=a[i];
		return initialRoots();    //finds the value of initial root in x0,x1
		
		
	}
	public static void main(String[] args) {
		new RegularFalsi();
		//System.out.println(ob.calculate(1, 1, 0, -1));

	}

}
