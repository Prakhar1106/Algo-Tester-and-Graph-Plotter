/* Description-->
 * Name: Graph Plotter 
 * Author: Prakhar Gupta
 * Requirement: array of coefficients of algebraic equation (Starting from constant to highest power)
 * Create only object of class PlotGraph and pass above array  
 * Example: 
 * IntegerDatatype a[]={12,-8,-7,2,1};  here 12 is value of constant
 * new PlotGraph(a); */

package Algorithm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JDialog;

@SuppressWarnings("serial")
public class PlotGraph  extends JDialog {


	int unit=25,h=600,k=600;// (h,k)--> Origin 
	int arr[],degree;
	//static Graphics g;
	private int opt;
	
	
    public PlotGraph(int a[],int option){
    	degree=a.length-1;
    	arr= new int[degree+1];
    	for(int i=0;i<=degree;i++)
    		arr[i]=a[i];
    	opt=option;
    	this.setSize(1200,1200);
		this.setLocation(300,0);
		this.setVisible(true);
		
    }
    
         	
  
	public void paint(Graphics g){
		
		g.setColor(Color.BLACK);
		g.drawLine(600, 0, 600, 1200);// y-axis
		g.drawLine(0, 600, 1200, 600);// x-axis
		for(int i=-23;i<24;i++){
			
			//points on X-axis:
			g.drawLine(h + (i*unit), k-5, h + i*unit, k+5);
			g.drawString(""+i,h + i*unit, k+20);
			//points on Y-axis:
			g.drawLine(h-5 , k+ i*unit, h+5, k+ i*unit);
			g.drawString(""+(-i),h-20 , k+ i*unit);
		}
		
		try {
			this.graph(g);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void graph(Graphics g) throws InterruptedException{
		
		g.setColor(Color.BLUE);
		double y,temp=function(-23.1);
		for(double x=-23.0;x<=24.0;x=x+0.01){
			y=function(x);
			                 //previous point                   //Current point
			g.drawLine(h+(int)((x-0.01)*unit),k-(int)(temp*unit),h+(int)(x*unit),k-(int)(y*unit));
			if(opt==1){
			if(Math.round(y*1000)==0){
				Graphics2D gd=(Graphics2D)g;
				gd.setPaint(Color.RED);
				gd.fillOval(h+(int)(x*unit)-4,k-(int)(y*unit)-4,10,10);
				g.setColor(Color.BLUE);
			}}
			temp=y;
			
			Thread.sleep(2);
		}
	}
	
	double function(double x){
		switch(opt){
		case 1:double sum=0;
			       for(int i=degree;i>=0;i--)
			    	   sum+=arr[i]*Math.pow(x, i);
			       return sum;
		case 2:return arr[0]*Math.sin(arr[1]*x+arr[2]);
		case 3:return arr[0]*Math.cos(arr[1]*x+arr[2]);
		case 4:return arr[0]*Math.tan(arr[1]*x+arr[2]);
		case 5:return arr[0]*Math.log(arr[1]*x+arr[2]);
		case 6:return arr[0]*Math.exp(arr[1]*x+arr[2]);
		
		}
		return 0;
	}
	
	

	public static void main(String[] args){
		    //constant
		//int a[]={0,-2,1,1};
		//int a[]={12,-8,-7,2,1};
		//int a[]={2,-2,1,1};
		int arr[]={3,1,0};
		new PlotGraph(arr,2);
	
	}

}