package userInterface;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import Algorithm.GaussElimination;

@SuppressWarnings("serial")
public class LinearEquationUI extends JPanel implements ActionListener {

	private JTextField u[];
	private JButton ent;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	private JButton submit; 
	private JTextField a[][];
	int n=0;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public LinearEquationUI() {
		setBackground(new Color(255, 235, 205));
		this.setLayout(null);
		
		JLabel title=new JLabel("Solution to Simultaneous Linear Equation");
		title.setFont(new Font("Century Schoolbook", Font.BOLD, 40));
		title.setBounds(400, 42, 900, 70);
		this.add(title);
		
		JLabel lblEnterNumberOf = new JLabel("Enter Number of Equations");
		lblEnterNumberOf.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 28));
		lblEnterNumberOf.setBounds(40, 170, 400, 50);
		this.add(lblEnterNumberOf);
		
		ent = new JButton("OK");
		ent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ent.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		ent.setForeground(new Color(230, 230, 250));
		ent.setBackground(new Color(0, 0, 205));
		ent.setBounds(530, 170, 70, 50);
		this.add(ent);
		
		comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"3", "4"}));
		comboBox.setBounds(450, 170, 70, 50);
		this.add(comboBox);
		
		
		ent.addActionListener(this);
		
		
		setVisible(true);
	}

	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object src=arg0.getSource();
		
		if(src==ent){
			ent.setEnabled(false);
			String select =comboBox.getSelectedItem().toString();
			n=Integer.parseInt(select);
		    a=new JTextField[n][n+1];//for storing values
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<=n;j++)
				{
					a[i][j]=new JTextField();
					
					a[i][j].setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
					a[i][j].setHorizontalAlignment(SwingConstants.CENTER);
					a[i][j].setBounds(520+(j*80), 300+(i*70), 70, 50);
					a[i][j].setBackground(new Color(250, 240, 230));
					this.add(a[i][j]);
					
				}
				
			}
			submit = new JButton("Calculate");
			submit.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 22));
			submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			submit.setForeground(new Color(230, 230, 250));
			submit.setBackground(new Color(0, 0, 205));
			submit.setBounds(600, 320+(n*70), 154, 52);
			this.add(submit);
			submit.addActionListener(this);
			this.repaint();
			this.revalidate();
			
		}
			if(src==submit){
		
			u=new JTextField[n];
			JLabel uLabel[]=new JLabel[n];//for showing result
			double input[][]=new double[n][n+1];
			try {
				for(int i=0;i<n;i++)
					for(int j=0;j<=n;j++)
					input[i][j]=Double.parseDouble(a[i][j].getText());
			} catch (Exception e) {
				
				JOptionPane.showMessageDialog(this,"Numeric value Required");
				return;
			}
			
			GaussElimination obj=new GaussElimination(input,n,n+1); // calling this to convert it into upper triangular matrix
			double p[][]=obj.calc1();
			double w=0.0,y=0.0,z=0.0,x=0.0;
			if(n==4){ 
				w=Math.round((p[3][4]/p[3][3])*1000.0)/1000.0;
				z=Math.round(((p[2][4]-(p[2][3]*w))/p[2][2])*1000.0)/1000.0;
				y=Math.round(((p[1][4]-(p[1][3]*w+p[1][2]*z))/p[1][1])*1000.0)/1000.0;
				x=Math.round(((p[0][4]-(p[0][3]*w+p[0][2]*z+p[0][1]*y))/p[0][0])*1000.0)/1000.0;
			
				 }
				 else if(n==3){
				z=Math.round((p[2][3]/p[2][2])*1000.0)/1000.0;
				y=Math.round(((p[1][3]-p[1][2]*z)/p[1][1])*1000.0)/1000.0;
				x=Math.round(((p[0][3]-(p[0][2]*z+p[0][1]*y))/p[0][0])*1000.0)/1000.0;
				
				}
			
			
			for(int i=0;i<n;i++){
				
			uLabel[i]=new JLabel("X"+(i+1));
			uLabel[i].setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 26));
			uLabel[i].setBounds(470+(i*150), 425+(n*70), 40, 30);
			this.add(uLabel[i]);
			
			u[i] = new JTextField();
    		u[i].setHorizontalAlignment(SwingConstants.CENTER);
			u[i].setToolTipText("Numeric value only");
			u[i].setBorder(null);
			u[i].setEditable(false);
			u[i].setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
			u[i].setBackground(new Color(250, 240, 230));
			u[i].setBounds(530+(i*150), 425+(n*70), 65, 30);
			
			this.add(u[i]);
			}
			if(n==4){
				u[0].setText(String.valueOf(x));
				u[1].setText(String.valueOf(y));
				u[2].setText(String.valueOf(z));
				u[3].setText(String.valueOf(w));
			}
			if(n==3){
				u[0].setText(String.valueOf(x));
				u[1].setText(String.valueOf(y));
				u[2].setText(String.valueOf(z));
				
			}
			setVisible(true);
			this.repaint();
			this.revalidate();
		}
		
	}
}
