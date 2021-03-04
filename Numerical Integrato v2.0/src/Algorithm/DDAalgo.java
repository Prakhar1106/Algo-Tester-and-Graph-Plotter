/*DDA Line Drawing Algorithm*/
package Algorithm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class DDAalgo extends JFrame {
     
	int X0, Y0, X1, Y1; String algoName;
     int unit=50,h=600,k=600;// (h,k)--> Origin 
     
	public DDAalgo(int X0, int Y0, int X1, int Y1,String str){
		this.X0=X0; this.X1=X1; this.Y0=Y0;this.Y1=Y1;
		algoName=str;
		this.setSize(1200,1200);
		this.setLocation(300,0);
		this.setVisible(true);
	}
	
public void paint(Graphics g) {
		
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
			if(algoName.equalsIgnoreCase("DDA" ))
				this.DDA(g);
			else
				this.bresenham(g);
			} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void DDA(Graphics g) throws InterruptedException 
	{  
	    // calculate dx & dy 
	    int dx = X1 - X0; 
	    int dy = Y1 - Y0; 
	  
	    // calculate steps required for generating pixels 
	    int steps = Math.abs(dx) > Math.abs(dy) ? Math.abs(dx) : Math.abs(dy); 
	  
	    // calculate increment in x & y for each steps 
	    float Xinc = dx / (float) steps; 
	    float Yinc = dy / (float) steps; 
	  
	    // Put pixel for each step 
	    float X = X0; 
	    float Y = Y0; 
	    g.setColor(Color.BLUE);
	    for (int i = 0; i <= steps; i++) 
	    {  
	    	
	    	
	       g.drawLine(h+(int)(X),k-(int)(Y),h+(int)(X),k-(int)(Y));  // put pixel at (X,Y) 
	        X += Xinc;           // increment in x at each step 
	        Y += Yinc;           // increment in y at each step 
	        Thread.sleep(5);          // for visualization of line- 
	                             // generation step by step 
	    } 
	    this.points(g);
	} 
	
  	  public void bresenham(Graphics g)  throws InterruptedException { 
  		int m_new = 2 * (Y1 - Y0); 
  		  int slope_error_new = m_new - (X1 - X0); 
  		 g.setColor(Color.BLUE);
  		  for (int x = X0, y = Y0; x <= X1; x++) 
  		  { 
  			 g.drawLine(h+(int)x,k-(int)y,h+(int)(x),k-(int)(y));

  			  // Add slope to increment angle formed 
  			  slope_error_new += m_new; 

  			  // Slope error reached limit, time to 
  			  // increment y and update slope error. 
  			  if (slope_error_new >= 0) 
  			  { 
  				  y++; 
  				  slope_error_new -= 2 * (X1 - X0); 
  			  } 
  			  Thread.sleep(5);  
  		  } 
  		this.points(g);
  		
  		
  		/* int dx, dy, p, x, y;  
  	    dx=X1-X0;  
  	    dy=Y1-Y0;  
  	    x=X0;  
  	    y=Y0;  
  	    p=2*dy-dx;  
  	  g.setColor(Color.BLUE);
  	    while(x<X1)  
  	    {  
  	        if(p>=0)  
  	        {  
  	        	 g.drawLine(h+(int)x,k-(int)y,h+(int)(x),k-(int)(y)); System.out.println(x+","+y);
  	            y=y+1;  
  	            p=p+2*dy-2*dx;  
  	        }  
  	        else  
  	        {  
  	        	 g.drawLine(h+(int)x,k-(int)y,h+(int)(x),k-(int)(y));System.out.println(x+","+y);y--;
  	            p=p+2*dy;
  	        }  
  	            x=x+1;
  	          Thread.sleep(5);  
  	        }  
  	  this.points(g);*/
  	  }          
	
	public void points(Graphics g)  throws InterruptedException {
		int t=200;
		Graphics2D gd=(Graphics2D)g;
		gd.setPaint(Color.RED);
		gd.fillOval(h+(int)(X0)-5,k-(int)(Y0)-5,10,10);
		gd.fillOval(h+(int)(X1)-5,k-(int)(Y1)-5,10,10);
		g.drawString("(",h+(int)(X0),k-(int)(Y0)+10);Thread.sleep(t);   g.drawString(""+X0,h+(int)(X0)+5,k-(int)(Y0)+10);  Thread.sleep(t);   g.drawString(",",h+(int)(X0)+30,k-(int)(Y0)+10);  Thread.sleep(t);   g.drawString(""+Y0,h+(int)(X0)+35,k-(int)(Y0)+10);   Thread.sleep(t);   g.drawString(")",h+(int)(X0)+60,k-(int)(Y0)+10);
		g.drawString("(",h+(int)(X1),k-(int)(Y1)+10);Thread.sleep(t);   g.drawString(""+X1,h+(int)(X1)+5,k-(int)(Y1)+10);  Thread.sleep(t);   g.drawString(",",h+(int)(X1)+30,k-(int)(Y1)+10);  Thread.sleep(t);   g.drawString(""+Y1,h+(int)(X1)+35,k-(int)(Y1)+10);   Thread.sleep(t);   g.drawString(")",h+(int)(X1)+60,k-(int)(Y1)+10);
	}
	
	public static void main(String []args){
		new DDAalgo(-400,100,150,50,"dda");
		
	}
}
