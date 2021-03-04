package Algorithm;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JDialog;

@SuppressWarnings("serial")
public class Transformation extends JDialog {
    private int arrOfPoints[][],output[][];
    final int h=600,k=600;
	public Transformation(int arr[][]){
		arrOfPoints=new int[arr.length][2];
		output=new int[arr.length][2];
		arrOfPoints=arr; 
		output=arr;
		
		this.setSize(1200,1200);
		this.setLocation(300,0);
		setVisible(true);
	}
	
	
	public void paint(Graphics g) {
		int unit=50;
		g.setColor(Color.BLACK);
		g.drawLine(600, 0, 600, 1200);// y-axis
		g.drawLine(0, 600, 1200, 600);// x-axis
		for(int i=-12;i<12;i++){
			//points on X-axis:
		g.drawLine(h + (i*unit), k-5, h + i*unit, k+5);
		g.drawString(""+(i*unit),h + i*unit, k+20);
		//points on Y-axis:
		g.drawLine(h-5 , k+ i*unit, h+5, k+ i*unit);
		g.drawString(""+(-i*unit),h-20 , k+ i*unit);
		}
	    try {
			drawFigure(g);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void drawFigure(Graphics g) throws InterruptedException {
		int x,y;int T=2;
		while(T>0){
		x=arrOfPoints[0][0]; y=arrOfPoints[0][1];
		for(int i=1;i<arrOfPoints.length;i++){
			g.drawLine(h+x,k- y,h+ arrOfPoints[i][0],k- arrOfPoints[i][1]);
			x=arrOfPoints[i][0]; y=arrOfPoints[i][1];
			if(T==2)Thread.sleep(200);
		}
		g.drawLine(h+x, k-y, h+arrOfPoints[0][0], k-arrOfPoints[0][1]); if(T==2)Thread.sleep(1000);
		g.setColor(Color.lightGray);T--;
		}
		g.setColor(Color.red);
		int len=output.length;
		for(int i=0;i<len;i++){
			g.drawLine(h+output[i][0],k- output[i][1],h+ output[(i+1)%len][0] ,k- output[(i+1)%len][1]);
			Thread.sleep(200);
		}
		
	}
	
	

	public int[][] translate(int tx,int ty){
		int result[][]=new int[output.length][2];
		for(int i=0;i<output.length;i++){
			result[i][0]=output[i][0]+tx;
			result[i][1]=output[i][1]+ty;
		}
		output=result;
		return result;		
	}
	
	public int[][] scaling(int sx,int sy) {
		
		int result[][]=new int[output.length][2];
		for(int i=0;i<output.length;i++){
			result[i][0]=output[i][0]*sx;
			result[i][1]=output[i][1]*sy;
		}
		output=result;
		return result;		
	}
	
	public int[][] xShear(int sx){
	    int result[][]=new int[output.length][2];
		for(int i=0;i<output.length;i++){
			result[i][0]=output[i][0]+sx*output[i][1] ;
			result[i][1]=output[i][1];
		}
		output=result;
		return result;
		}
		
		
	
	public int[][] yShear(int sx) {
		int result[][]=new int[output.length][2];
		for(int i=0;i<output.length;i++){
			result[i][0]=output[i][0];
			result[i][1]=output[i][1]+sx*output[i][0] ;
		}
		output=result;
		return result;
	}
	
	public int[][] rotate(int x_pivot,  int y_pivot, int angle) 
	{ 
		int result[][]=new int[arrOfPoints.length][2];
		int i = 0; 
		while (i < arrOfPoints.length) 
		{ 
			// Shifting the pivot point to the origin 
			// and the given points accordingly 
			int x_shifted = arrOfPoints[i][0] - x_pivot; 
			int y_shifted = arrOfPoints[i][1] - y_pivot; 

	// Calculating the rotated point co-ordinates 
	// and shifting it back 
	result[i][0] = x_pivot + (int)(x_shifted*cos(angle) - y_shifted*sin(angle)); 
	result[i][1] = y_pivot + (int)(x_shifted*sin(angle) + y_shifted*cos(angle)); 
	i++; 
		} 
		output=result;
		return result;
	} 
	
	public double sin(double x){
	 return Math.sin(x * 3.141592653589/180);}
	
	public double cos(double x){
	 return Math.cos(x * 3.141592653589/180);}
	

 

}
