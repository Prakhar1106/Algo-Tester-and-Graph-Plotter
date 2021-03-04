package Algorithm;



public class NewtonRaphson {

	
	private int arr[];   // contain normal function coefficients
	
	
	private int deg;
	
	
	
	private double differentiate(double x){
		double valueOfDFunction=0.0;
		for(int i=1;i<deg;i++)
		valueOfDFunction+=Math.pow(x,i-1)*i*arr[i];
		return valueOfDFunction;
	}
	
	private double actualFunc(double x){
		double valueOfFunction=0.0;
		for(int i=0;i<deg;i++)
		valueOfFunction+=Math.pow(x,i)*arr[i];System.out.println(valueOfFunction);
		return valueOfFunction;
		
	}
	
	private double formula(double x,double valueOfFunction,double valueOfDFunction){
		x=x - (valueOfFunction/valueOfDFunction);System.out.println(x);
		return x;
		
	}
	
	private double initialRoots(){
		int max=0,min=0;
		for(int i=4;i>-5;i--)
		{
			
		    double valueOfFunction= actualFunc(i);
		    if(valueOfFunction>0)
			max=i;
		    if(valueOfFunction<0)
		    {
		    	min=i;break;
		    }
		    
		}
		
		return (double)(max+min)/2;
	}
	
	public double calculate(int a[]){
		deg=a.length;
		arr=new int[deg];
		for(int i=0;i<deg;i++)
			arr[i]=a[i];
		double x=initialRoots();    //finds the value of initial root in x
		  
		int n=8;
		double p,q;
		while(n!=0){
			p=differentiate(x);
			q=actualFunc(x);
			x=formula(x,q,p);
			
			n--;
		}
		return x;
	}
	public static void main(String[] args) {
		NewtonRaphson ob=new NewtonRaphson();
		int a[]={-1,0,1,1};
		//int a[]={1,1,0,-1};
		System.out.println(ob.calculate(a));
	}

}

