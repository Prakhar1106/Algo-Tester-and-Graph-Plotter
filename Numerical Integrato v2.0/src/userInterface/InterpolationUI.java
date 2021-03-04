package userInterface;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Algorithm.InterpolationAlgo ;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class InterpolationUI extends JPanel implements ActionListener{
	
	private JTextField u;
	private JButton ent;
	JTextField p[];
	JTextField q[];
	private JTextField x;
	private JTextField y;
	private JButton submit;
	int a=0;
	private int flag;
	private JLabel invalid;
	private JLabel methodname;
	public InterpolationUI() {
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Interpolation.class.getResource("/image/newHNM.jpg")));
		//setResizable(false);
		//setSize(1670, 1000);
		//setLocation(200,0);
        setLayout(null);
        setBackground(new Color(255, 235, 205));
		
		JLabel lblInterpolation = new JLabel("Interpolation and Extrapolation");
		lblInterpolation.setFont(new Font("Century Schoolbook", Font.BOLD,40));
		lblInterpolation.setHorizontalAlignment(SwingConstants.CENTER);
		lblInterpolation.setBounds(480, 42, 670, 70);
		add(lblInterpolation);
		
		u = new JTextField();
		u.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				int keycode=arg0.getKeyCode();
				
				try{
					if(keycode==8)
						Integer.parseInt(u.getText());
					else
					 Integer.parseInt(u.getText());
					
					invalid.setText("");
				}
				catch(Exception e)
				{
					invalid.setText("invalid!!");
				}
			}
		});
		u.setOpaque(false);
		u.setHorizontalAlignment(SwingConstants.CENTER);
		u.setToolTipText("Numeric value only");
		u.setBorder(null);
		u.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		u.setBackground(new Color(250, 240, 230));
		u.setName("");
		u.setBounds(375, 186, 120, 40);
        add(u);
		u.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLUE);
		separator.setBackground(Color.BLACK);
		separator.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator.setBounds(375, 226, 120, 2);
		add(separator);
		
		JLabel lblEnterNumberOf = new JLabel("Enter number of elements");
		lblEnterNumberOf.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 25));
		lblEnterNumberOf.setBounds(27, 185, 328, 45);
		add(lblEnterNumberOf);
		
		ent = new JButton("OK");
		ent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ent.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		ent.setForeground(new Color(230, 230, 250));
		ent.setBackground(new Color(0, 0, 205));
		ent.setBounds(511, 186, 70, 40);
		add(ent);
		
		JLabel lblEnterValueOf = new JLabel("Enter value of X for which value of Y required:");
		lblEnterValueOf.setFont(new Font("Century Schoolbook", Font.BOLD, 22));
		lblEnterValueOf.setBounds(27, 309, 486, 52);
		add(lblEnterValueOf);
		
		x = new JTextField();
		x.setOpaque(false);
		x.setToolTipText("Numeric value only");
		x.setName("");
		x.setHorizontalAlignment(SwingConstants.CENTER);
		x.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		x.setColumns(10);
		x.setBorder(null);
		x.setBackground(new Color(250, 240, 230));
		x.setBounds(530, 309, 70, 40);
		add(x);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLUE);
		separator_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(530, 353, 70, 2);
		add(separator_1);
		
		JLabel lblValueOfY = new JLabel("Value of Y :");
		lblValueOfY.setHorizontalAlignment(SwingConstants.CENTER);
		lblValueOfY.setFont(new Font("Century Schoolbook", Font.BOLD, 21));
		lblValueOfY.setBounds(27, 437, 127, 52);
		add(lblValueOfY);
		
		JLabel X = new JLabel("X");
		X.setFont(new Font("Century Schoolbook", Font.PLAIN, 22));
		X.setHorizontalAlignment(SwingConstants.CENTER);
		X.setBounds(680, 172, 70, 50);
		add(X);
		
		JLabel Y = new JLabel("Y");
		Y.setFont(new Font("Century Schoolbook", Font.PLAIN, 22));
		Y.setHorizontalAlignment(SwingConstants.CENTER);
		Y.setBounds(792, 172, 70, 50);
		add(Y);
		
		y = new JTextField();
		y.setOpaque(false);
		y.setEditable(false);
		y.setToolTipText("Numeric value only");
		y.setName("");
		y.setHorizontalAlignment(SwingConstants.CENTER);
		y.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		y.setColumns(10);
		y.setBorder(null);
		y.setBackground(new Color(250, 240, 230));
		y.setBounds(166, 437, 100, 40);
		add(y);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLUE);
		separator_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(166, 478, 100, 2);
		add(separator_2);
		
		submit = new JButton("Calculate");
		submit.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 22));
		submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		submit.setForeground(new Color(230, 230, 250));
		submit.setBackground(new Color(0, 0, 205));
		submit.setBounds(316, 437, 154, 52);
		add(submit);
		
		/*JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Interpolation.class.getResource("/image/wall.jpg")));
		lblNewLabel.setBounds(0, 0, 1152, 733);
		this.add(lblNewLabel);*/
		submit.addActionListener(this);
		ent.addActionListener(this);
		
		invalid = new JLabel("");
		invalid.setForeground(Color.RED);
		invalid.setFont(new Font("Century Schoolbook", Font.PLAIN, 19));
		invalid.setBounds(375, 232, 120, 24);
		add(invalid);
		
		methodname=new JLabel();
		methodname.setForeground(Color.RED);
		methodname.setBounds(27,387,550,40);
		methodname.setBorder(null);
		methodname.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		methodname.setBackground(new Color(250, 240, 230));
		add(methodname);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
    Object ob=ae.getSource();
		

		
		if(ob==ent){
			
			if(u.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"Required: Please Enter Number of Elements");
				u.requestFocusInWindow();
				return;
			}
			if(u.getText().equals("1"))
			{
				JOptionPane.showMessageDialog(this,"Required: Number of Elements should be greater than 2");
				u.requestFocusInWindow();
				return;
			}
			if(u.getText().equals("2"))
			{
				JOptionPane.showMessageDialog(this,"Required: Number of Elements should be greater than 2");
				u.requestFocusInWindow();
				return;
			}
		
			try {
				a=Integer.parseInt(u.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this,"Enter Number only");
				u.setText("");
				u.requestFocusInWindow();
				return;
			}
			ent.setEnabled(false);
			u.setEditable(false);
			p=new JTextField[10];
			q=new JTextField[10];
			
			p=new JTextField[a];
			q=new JTextField[a];
			
			
			for(int i=0;i<a;i++){
				if(i<10){
				p[i] = new JTextField();
				p[i].setHorizontalAlignment(SwingConstants.CENTER);
				p[i].setBounds(680, 227+(i*50), 70, 50);
				p[i].setBackground(new Color(250, 240, 230));
				p[i].setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
				add(p[i]);
				p[i].setColumns(10);

				q[i] = new JTextField();
				q[i].setHorizontalAlignment(SwingConstants.CENTER);
				q[i].setBackground(new Color(250, 240, 230));
				q[i].setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
				q[i].setBounds(792, 227+(i*50), 70, 50);
				q[i].setColumns(10);
				add(q[i]);
				
				}
				else if(i<20)
				{   flag = 1;
					p[i] = new JTextField();
					p[i].setHorizontalAlignment(SwingConstants.CENTER);
					p[i].setBackground(new Color(250, 240, 230));
					p[i].setBounds(930, 227+((i%10)*50), 70, 50);
					p[i].setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
					p[i].setColumns(10);
					add(p[i]);
					

					q[i] = new JTextField();
					q[i].setHorizontalAlignment(SwingConstants.CENTER);
					q[i].setBackground(new Color(250, 240, 230));
					q[i].setBounds(1042, 227+((i%10)*50), 70, 50);
					q[i].setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
					q[i].setColumns(10);
					add(q[i]);
					
				}
				setVisible(true);
				this.repaint();
				this.revalidate();
			}
			if(flag==1){
				JLabel X = new JLabel("X");
				X.setFont(new Font("Century Schoolbook", Font.PLAIN, 22));
				X.setHorizontalAlignment(SwingConstants.CENTER);
				X.setBounds(930, 172, 70, 50);
				add(X);
				
				JLabel Y = new JLabel("Y");
				Y.setFont(new Font("Century Schoolbook", Font.PLAIN, 22));
				Y.setHorizontalAlignment(SwingConstants.CENTER);
				Y.setBounds(1042, 172, 70, 50);
				add(Y);
			}
		}
		
		if(ob==submit)
		{   
			//Checking method for valid input
			//boolean b=check(a);
			//If method returns true then code inside if execute 
			if(true)
			{
				double ax[]=new double[a];
				double ay[]=new double[a];
				
				double x;
				try {
					x = Double.parseDouble(this.x.getText());
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(this,"Enter Number only");
					this.x.setText("");
					this.x.requestFocusInWindow();
					return;
				}
				
				//Conversion of String in text boxes into double type array
				
				/*Array of values of X*/
				int i=0;
				try {
					
					for(i=0;i<a;i++)
					{
						ax[i]=Double.parseDouble(p[i].getText());
						
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(this,"Invalid input at X"+(i+1));
					this.p[i].setText("");
					this.p[i].requestFocusInWindow();
					return;
				}
				
				/*Array of values of Y*/
				try {

					for(i=0;i<a;i++)
					{
						ay[i]=Double.parseDouble(q[i].getText());
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(this,"Invalid input at Y"+(i+1));
					this.q[i].setText("");
					this.q[i].requestFocusInWindow();
					return;
				}
				
				//Calling Interpolation Algorithm where actual calculation will done
				InterpolationAlgo object=new InterpolationAlgo();
				object.input(ax,ay,a,x);
				String temp=String.valueOf(object.algo());
				y.setText(temp);
				
				if((a%2==0 && x<=ax[(a/2)-1])||(a%2!=0 && x<=ax[a/2]))
					methodname.setText("Here, Forward Interpolation Formula is used");
				if((a%2==0 && x>ax[(a/2)-1])||(a%2!=0 && x>ax[(a/2)]))
					methodname.setText("Here, Backward Interpolation Formula is used");
			}
			
		}
	}
	/*Main Method*/
	public static void main(String[] args) {
		new InterpolationUI();

	}
	
	/*Method to validate input*/
	boolean check(int n)
	{   boolean flag=true;
	
		for(int i=0;i<n;i++)
		{    
			if(p[i].getText().equals("")){
				JOptionPane.showMessageDialog(this,"Required X"+(i+1));
				p[i].requestFocusInWindow();
				flag=false;break;
				
			}
			if(q[i].getText().equals("")){
				JOptionPane.showMessageDialog(this,"Required Y"+(i+1));
				q[i].requestFocusInWindow();
				flag=false;break;
				
			}
		}
		if(x.getText().equals("")){
			JOptionPane.showMessageDialog(this,"Enter value of X for which value of Y required:");
			x.requestFocusInWindow();
			flag=false;
		}
		return flag;
	}
	
	
}
