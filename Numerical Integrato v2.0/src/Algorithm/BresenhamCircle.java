package Algorithm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JDialog;


@SuppressWarnings("serial")
public class BresenhamCircle extends JDialog {
	int h=600,k=600;// (h,k)--> Origin 
	int xc,yc, r;String algoName;
	
	public BresenhamCircle(int x, int y, int radius,String option){
		xc=x;yc=y;r=radius;
        algoName=option;
		this.setSize(1200,1200);
		this.setLocation(300,0);
		this.setVisible(true);
	}
	
	void drawCircle(int xc, int yc, int x, int y, Graphics g) 
	{ 
		g.setColor(Color.red);
	    g.drawLine(h+xc+x, k-yc+y, h+xc+x, k-yc+y); 
	    g.drawLine(h+xc-x, k-yc+y, h+xc-x, k-yc+y); 
	    g.drawLine(h+xc+x, k-yc-y, h+xc+x, k-yc-y); 
	    g.drawLine(h+xc-x, k-yc-y, h+xc-x, k-yc-y); 
	    g.drawLine(h+xc+y, k-yc+x, h+xc+y, k-yc+x); 
	    g.drawLine(h+xc-y, k-yc+x, h+xc-y, k-yc+x); 
	    g.drawLine(h+xc+y, k-yc-x, h+xc+y, k-yc-x); 
	    g.drawLine(h+xc-y, k-yc-x, h+xc-y, k-yc-x); 
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
			if(algoName.equalsIgnoreCase("Bresenhams" ))
			this.circleBres(g);
			else
				this.midPointCircleDraw(g);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	// Function for circle-generation 
	// using Bresenham's algorithm 
	public void circleBres(Graphics g) throws InterruptedException 
	{ 
		g.setColor(Color.red);
	    int x = 0, y = r; 
	    int d = 3 - 2 * r; 
	    drawCircle(xc, yc, x, y,g); 
	    while (y >= x) 
	    { 
	        // for each pixel we will 
	        // draw all eight pixels 
	          
	        x++; 
	  
	        // check for decision parameter 
	        // and correspondingly  
	        // update d, x, y 
	        if (d > 0) 
	        { 
	            y--;  
	            d = d + 4 * (x - y) + 10; 
	        } 
	        else
	            d = d + 4 * x + 6; 
	        drawCircle(xc, yc, x, y,g); 
	       Thread.sleep(20);
	       //System.out.println(x+" "+y);
	    } 
	    
	    Graphics2D gd=(Graphics2D)g;
		gd.setPaint(Color.RED);
		gd.fillOval(h+(int)(xc)-5,k-(int)(yc)-5,10,10);
		g.drawString("(",h+(int)(xc),k-(int)(yc)+10);long t=200;
		Thread.sleep(t);   g.drawString(""+xc,h+(int)(xc)+5,k-(int)(yc)+10);  Thread.sleep(t);   g.drawString(",",h+(int)(xc)+30,k-(int)(yc)+10);  Thread.sleep(t);   g.drawString(""+yc,h+(int)(xc)+35,k-(int)(yc)+10);   Thread.sleep(t);   g.drawString(")",h+(int)(xc)+60,k-(int)(yc)+10);
		
		
		
	} 
	
	public void midPointCircleDraw(Graphics g) throws InterruptedException  { 

			int x = r, y = 0; 
			g.setColor(Color.blue);
			// Printing the initial point 
			// on the axes after translation 
			g.drawLine(h+ (x + xc) , k- (y + yc),h+ (x + xc) , k- (y + yc)); 

				// When radius is zero only a single 
			// point will be printed 
			if (r > 0) { 

				g.drawLine(h+ (x + xc),k- (-y + yc),h+ (x + xc),k- (-y + yc)); 
  
				g.drawLine(h+ (y + xc) , k- (x + yc),h+ (y + xc) , k- (x + yc)); 
   
				g.drawLine(h+ (-y + xc), k- (x + yc),h+ (-y + xc), k- (x + yc)); 
			} 

			// Initialising the value of P 
			int P = 1 - r; 
			while (x > y) { 

				y++; 

				// Mid-point is inside or on the perimeter 
				if (P <= 0) 
					P = P + 2 * y + 1; 

				// Mid-point is outside the perimeter 
				else { 
					x--; 
					P = P + 2 * y - 2 * x + 1; 
				} 

				// All the perimeter points have already  
				// been printed 
				if (x < y) 
					break; 

				// Printing the generated point and its  
				// reflection in the other octants after 
				// translation 
				g.drawLine(h+ (x + xc) , k- (y + yc) ,h+ (x + xc) , k- (y + yc)); 
      
				g.drawLine(h+ (-x + xc) , k- (y + yc) ,h+ (-x + xc) , k- (y + yc) ); 
      
				g.drawLine(h+ (x + xc) , k- (-y + yc) ,h+ (x + xc) , k- (-y + yc) ); 
      
				g.drawLine(h+ (-x + xc) , k- (-y + yc),h+ (-x + xc) , k- (-y + yc)); 

				// If the generated point is on the  
					// line x = y then the perimeter points 
				// have already been printed 
				if (x != y) { 
	
					g.drawLine(h+ (y + xc), k- (x + yc),h+ (y + xc), k- (x + yc)); 
        
					g.drawLine(h + (-y + xc)  , k-(x + yc),h + (-y + xc)  , k-(x + yc)); 
        
					g.drawLine(h + (y + xc)  ,k-(-x + yc) ,h + (y + xc)  ,k-(-x + yc)); 
        
					g.drawLine(h+ (-y + xc), k- (-x + yc) ,h+ (-y + xc), k- (-x + yc)); 
				} 
				Thread.sleep(20);
			} 
			Graphics2D gd=(Graphics2D)g;
			gd.setPaint(Color.RED);
			gd.fillOval(h+(int)(xc)-5,k-(int)(yc)-5,10,10);
			g.drawString("(",h+(int)(xc),k-(int)(yc)+10);long t=200;
			Thread.sleep(t);   g.drawString(""+xc,h+(int)(xc)+5,k-(int)(yc)+10);  Thread.sleep(t);   g.drawString(",",h+(int)(xc)+30,k-(int)(yc)+10);  Thread.sleep(t);   g.drawString(""+yc,h+(int)(xc)+35,k-(int)(yc)+10);   Thread.sleep(t);   g.drawString(")",h+(int)(xc)+60,k-(int)(yc)+10);
			
	} 


	public static void main(String[] args) {
		new BresenhamCircle(50,50,500,"Bresenha");
	}

}
