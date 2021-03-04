package userInterface;

import java.awt.Color;
import java.awt.Cursor;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import Algorithm.BresenhamCircle;
import Algorithm.CircleComponents;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

@SuppressWarnings("serial")
public class CircleDrawing extends JPanel implements ActionListener{
	private JTextField x;
	private JTextField y;
	private JTextField x1;
	private JTextField y1;
	private JTextField x2;
	private JTextField y2;
	private JTextField x3;
	private JTextField y3;
	private JTextField radius;
	private JButton submit;
	private JButton button;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton algo1;
	private JRadioButton algo2;
	
	
	
	public CircleDrawing(){
		setBackground(new Color(255, 235, 205));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(101, 309, 543, 464);
		add(panel);
		panel.setLayout(null);
			
		JLabel lblNewLabel = new JLabel("Center Co-ordinates :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		lblNewLabel.setBounds(26, 73, 251, 41);
		panel.add(lblNewLabel);
		
		x = new JTextField();
		x.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		x.setHorizontalAlignment(SwingConstants.CENTER);
		x.setBounds(306, 58, 78, 55);
		panel.add(x);
		x.setColumns(10);
		
		y = new JTextField();
		y.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		y.setHorizontalAlignment(SwingConstants.CENTER);
		y.setColumns(10);
		y.setBounds(410, 58, 78, 55);
		panel.add(y);
		
		JLabel lblX = new JLabel("x");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		lblX.setBounds(329, 30, 25, 25);
		panel.add(lblX);
		
		JLabel lblY = new JLabel("y");
		lblY.setHorizontalAlignment(SwingConstants.CENTER);
		lblY.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		lblY.setBounds(437, 30, 25, 25);
		panel.add(lblY);
		
		JLabel lblRadiusOfCircle = new JLabel("Radius of Circle :");
		lblRadiusOfCircle.setHorizontalAlignment(SwingConstants.CENTER);
		lblRadiusOfCircle.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		lblRadiusOfCircle.setBounds(26, 175, 221, 47);
		panel.add(lblRadiusOfCircle);
		
		submit = new JButton("Submit");
		submit.setForeground(new Color(0, 0, 0));
		submit.setBackground(new Color(255, 69, 0));
		submit.setFont(new Font("Century Schoolbook", Font.BOLD, 25));
		submit.setBounds(205, 375, 134, 55);
		submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(submit);
		submit.addActionListener(this);
		
		radius = new JTextField();
		radius.setHorizontalAlignment(SwingConstants.CENTER);
		radius.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		radius.setBounds(326, 175, 141, 55);
		panel.add(radius);
		radius.setColumns(10);
		
		JLabel heading = new JLabel("Circle Drawing Algorithm");
		heading.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 40));
		heading.setBounds(565, 68, 567, 50);
		add(heading);
		

		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(942, 309, 543, 465);
		add(panel1);
					
		JLabel point1 = new JLabel("First Point :");
		point1.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		point1.setBounds(26, 73, 148, 41);
		panel1.add(point1);
		
		x1 = new JTextField();
		x1.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		x1.setHorizontalAlignment(SwingConstants.CENTER);
		x1.setColumns(10);
		x1.setBounds(266, 58, 78, 55);
		panel1.add(x1);
		
		y1 = new JTextField();
		y1.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		y1.setHorizontalAlignment(SwingConstants.CENTER);
		y1.setColumns(10);
		y1.setBounds(412, 58, 78, 55);
		panel1.add(y1);
		
		JLabel label_1 = new JLabel("x");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		label_1.setBounds(287, 30, 25, 25);
		panel1.add(label_1);
		
		JLabel label_2 = new JLabel("y");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		label_2.setBounds(437, 30, 25, 25);
		panel1.add(label_2);
		
		JLabel point2 = new JLabel("Second Point :");
		point2.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		point2.setBounds(26, 149, 174, 41);
		panel1.add(point2);
		
		button = new JButton("Submit");
		button.setFont(new Font("Century Schoolbook", Font.BOLD, 25));
		button.setBackground(new Color(255, 69, 0));
		button.setBounds(210, 372, 134, 55);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel1.add(button);
		button.addActionListener(this);
		
		JLabel point3 = new JLabel("Third Point :");
		point3.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		point3.setBounds(26, 220, 174, 41);
		panel1.add(point3);
		
		x2 = new JTextField();
		x2.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		x2.setHorizontalAlignment(SwingConstants.CENTER);
		x2.setColumns(10);
		x2.setBounds(266, 137, 78, 55);
		panel1.add(x2);
		
		y2 = new JTextField();
		y2.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		y2.setHorizontalAlignment(SwingConstants.CENTER);
		y2.setColumns(10);
		y2.setBounds(412, 137, 78, 55);
		panel1.add(y2);
		
		x3 = new JTextField();
		x3.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		x3.setHorizontalAlignment(SwingConstants.CENTER);
		x3.setColumns(10);
		x3.setBounds(266, 216, 78, 55);
		panel1.add(x3);
		
		y3 = new JTextField();
		y3.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		y3.setHorizontalAlignment(SwingConstants.CENTER);
		y3.setColumns(10);
		y3.setBounds(412, 216, 78, 55);
		panel1.add(y3);
		
		JLabel lblNewLabel_1 = new JLabel("Based on Center and Radius");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.ITALIC, 28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(153, 253, 424, 43);
		add(lblNewLabel_1);
		
		JLabel lblBasedOnConcyclic = new JLabel("Based on Concyclic Points");
		lblBasedOnConcyclic.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasedOnConcyclic.setFont(new Font("Century Schoolbook", Font.ITALIC, 28));
		lblBasedOnConcyclic.setBounds(989, 253, 424, 43);
		add(lblBasedOnConcyclic);
		
	
		
		
		//setSize(1670, 1000);
		
		algo1 = new JRadioButton("MidPoint Algorithm");
		buttonGroup.add(algo1);
		algo1.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		algo1.setBackground(Color.WHITE);
		algo1.setBounds(593, 159, 221, 41);
		add(algo1);
		
		algo2 = new JRadioButton("Bresenham's Algorithm");
		buttonGroup.add(algo2);
		algo2.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		algo2.setBackground(Color.WHITE);
		algo2.setBounds(814, 159, 247, 41);
		add(algo2);
		//setLocation(200,0);
		
		setVisible(true);
	}
	
	public static void main(String[] args){
		new CircleDrawing();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String algoName;
		Object s=arg0.getSource();
		if(algo1.isSelected() || algo2.isSelected()){
		if(algo1.isSelected())
			algoName="midpoint";
		else
			algoName="Bresenhams";
		if(s==submit){
			
			int h=0,k=0,r=0;
				try {h=Integer.parseInt(x.getText());} catch (NumberFormatException e) {JOptionPane.showMessageDialog(this, "Enter valid value of X, it must be numeric value"); x.setText("");return; }
				try {k=Integer.parseInt(y.getText());} catch (NumberFormatException e) {JOptionPane.showMessageDialog(this, "Enter valid value of Y, it must be numeric value"); y.setText("");return;}
				try {r=Integer.parseInt(radius.getText());} catch (NumberFormatException e) {JOptionPane.showMessageDialog(this, "Enter valid value of Radius, it must be numeric value"); radius.setText("");return;}
				new BresenhamCircle(h,k,Math.abs(r),algoName);
		}
		else
			{
			int cord[][]=new int [3][2]; int res[]=new int[3];
			try{cord[0][0]=Integer.parseInt(x1.getText());} catch (NumberFormatException e) {JOptionPane.showMessageDialog(this, "Enter valid value of X1, it must be numeric value"); x1.setText("");return; }
			try{cord[0][1]=Integer.parseInt(y1.getText());} catch (NumberFormatException e) {JOptionPane.showMessageDialog(this, "Enter valid value of Y1, it must be numeric value"); y1.setText("");return; }
			try{cord[1][0]=Integer.parseInt(x2.getText());} catch (NumberFormatException e) {JOptionPane.showMessageDialog(this, "Enter valid value of X2, it must be numeric value"); x2.setText("");return; }
			try{cord[1][1]=Integer.parseInt(y2.getText());} catch (NumberFormatException e) {JOptionPane.showMessageDialog(this, "Enter valid value of Y2, it must be numeric value"); y2.setText("");return; }
			try{cord[2][0]=Integer.parseInt(x3.getText());} catch (NumberFormatException e) {JOptionPane.showMessageDialog(this, "Enter valid value of X3, it must be numeric value"); x3.setText("");return; }
			try{cord[2][1]=Integer.parseInt(y3.getText());} catch (NumberFormatException e) {JOptionPane.showMessageDialog(this, "Enter valid value of Y3, it must be numeric value"); y3.setText("");return; }
		
			CircleComponents ob=new CircleComponents(cord);
			res=ob.calculate();
			if(res[0]<700 && res[1]<700&&res[0]>-700 && res[1]>-700)
			new BresenhamCircle(res[0],res[1],res[2],algoName);
			else
				JOptionPane.showMessageDialog(this,	"Not Possible");
			
			}
		
	}
		else
			{JOptionPane.showMessageDialog(this,	"Please Select Algorithm !!");return;}
			
	}		
}
