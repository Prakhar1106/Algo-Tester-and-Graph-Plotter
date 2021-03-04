package userInterface;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;




import java.awt.Color;
import java.awt.CardLayout;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class HOME extends JFrame implements ActionListener{
	
	
	
	private JPanel main;
	private JButton but[]=new JButton[7];

	public HOME() {
		getContentPane().setLayout(null);
		setTitle("Algo Tester and Graph Plotter");
		JPanel sidebar = new JPanel();
		sidebar.setBackground(new Color(210, 105, 30));
		sidebar.setBounds(0, 0, 350, 1000);
		getContentPane().add(sidebar);
		
		String slideName[]={"Interpolations","Root of Equation","Simultaneos Linear Equation","Circle Drawing Algorithm",
				"Line Drawing Algorithm","Transformation","Plot Graph"};
				
		main = new JPanel();
		main.setBackground(new Color(255, 235, 205));
		main.setBounds(350, 0, 1670, 1000);
		getContentPane().add(main);
		main.setLayout(new CardLayout(0, 0));
		
		for(int i=0;i<7;i++){
			but[i] = new JButton(slideName[i]);
			but[i].setForeground(Color.WHITE);
			but[i].setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
			but[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			but[i].setBorder(null);
			but[i].setBackground(new Color(210, 105, 30)); //chocolate
			but[i].addActionListener(this);
			sidebar.setLayout(null);
			if(i<3)
			but[i].setBounds(0, 204+(i*83), 350, 80);
			else
				but[i].setBounds(0, 540+((i-3)*83), 350, 80);
			sidebar.add(but[i]);
		}
		/*    but[0] = new JButton("Interpolations");
		but[0].setForeground(Color.WHITE);
		but[0].setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		but[0].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		but[0].setBorder(null);
		but[0].setBackground(new Color(210, 105, 30)); //chocolate
		but[0].addActionListener(this);
		sidebar.setLayout(null);
		but[0].setBounds(0, 204, 350, 80);
		sidebar.add(but[0]);
		
		but[1] = new JButton("Root of Equation");
		but[1].setForeground(Color.WHITE);
		but[1].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		but[1].setBorder(null);
		but[1].setBackground(new Color(210, 105, 30));
		but[1].setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		but[1].addActionListener(this);
		but[1].setBounds(new Rectangle(34, 204, 210, 83));
		but[1].setBounds(0, 286, 350, 80);
		sidebar.add(but[1]);	
		
		but[2] = new JButton("Simultaneos Linear Equation");
		but[2] .setForeground(Color.WHITE);
		but[2] .setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		but[2] .setBorder(null);
		but[2] .setBackground(new Color(210, 105, 30));
		but[2] .setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		but[2] .addActionListener(this);
		but[2] .setBounds(new Rectangle(34, 204, 210, 83));
		but[2] .setBounds(0, 370, 350, 80);
		sidebar.add(but[2] );	
		
		but[3]  = new JButton("Circle Drawing Algorithm");
		but[3].setForeground(Color.WHITE);
		but[3].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		but[3].setBorder(null);
		but[3].setBackground(new Color(210, 105, 30));
		but[3].setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		but[3].addActionListener(this);
		but[3].setBounds(new Rectangle(34, 204, 210, 83));
		but[3].setBounds(0, 540, 350, 80);
		sidebar.add(but[3]);	
		
		but[4] = new JButton("Line Drawing Algorithm");
		but[4].setForeground(Color.WHITE);
		but[4].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		but[4].setBorder(null);
		but[4].setBackground(new Color(210, 105, 30));
		but[4].setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		but[4].addActionListener(this);
		but[4].setBounds(new Rectangle(34, 204, 210, 83));
		but[4].setBounds(0, 625, 350, 80);
		sidebar.add(but[4]);	
		
		but[5] = new JButton("Transformation");
		but[5].setForeground(Color.WHITE);
		but[5].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		but[5].setBorder(null);
		but[5].setBackground(new Color(210, 105, 30));
		but[5].setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		but[5].addActionListener(this);
		but[5].setBounds(new Rectangle(34, 204, 210, 83));
		but[5].setBounds(0, 710, 350, 80);
		sidebar.add(but[5]);
		
		but[6] = new JButton("Plot Graph");
		but[6].setForeground(Color.WHITE);
		but[6].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		but[6].setBorder(null);
		but[6].setBackground(new Color(210, 105, 30));
		but[6].setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		but[6].addActionListener(this);
		but[6].setBounds(new Rectangle(34, 204, 210, 83));
		but[6].setBounds(0, 795, 350, 80);
		sidebar.add(but[6]);	 */
		
		JLabel lblCompiterGraphicsAlgo = new JLabel("Computer Graphics Algo");
		lblCompiterGraphicsAlgo.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblCompiterGraphicsAlgo.setForeground(new Color(0, 0, 0));
		lblCompiterGraphicsAlgo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompiterGraphicsAlgo.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
		lblCompiterGraphicsAlgo.setBounds(0, 463, 350, 64);
		sidebar.add(lblCompiterGraphicsAlgo);
		
		JLabel lblNumericalMethod = new JLabel("Numerical Methods");
		lblNumericalMethod.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblNumericalMethod.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumericalMethod.setForeground(new Color(0, 0, 0));
		lblNumericalMethod.setFont(new Font("Century Schoolbook", Font.BOLD, 27));
		lblNumericalMethod.setBounds(0, 138, 350, 53);
		sidebar.add(lblNumericalMethod);
		
		setLocation(0,0);
		setSize(1960,1050);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new HOME();
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object ob=arg0.getSource();
		main.removeAll();
		if(ob==but[0])
			main.add(new InterpolationUI());
		else if(ob==but[1])
			main.add(new RootOfEquation());
				else if(ob==but[2])
					main.add(new LinearEquationUI());
					else if(ob==but[3])
						main.add(new CircleDrawing());
						else if(ob==but[4])
							main.add(new LineDrawing());
					    	else if(ob==but[5])
					    		main.add(new TransformationUI());
					    		else if(ob==but[6])
					    			main.add(new GraphPlotter());
		for(int i=0;i<7;i++){
			if(but[i]!=ob){
		but[i].setBackground(new Color(210, 105, 30));
		but[i].setForeground(Color.WHITE);
		}}
		((JComponent) ob).setForeground(Color.BLACK);
		((JComponent) ob).setBackground(new Color(255, 235, 205));
		main.repaint();
		main.revalidate();
		
	}
	
}
