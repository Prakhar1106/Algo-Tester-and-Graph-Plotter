package userInterface;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Algorithm.DDAalgo;

@SuppressWarnings("serial")
public class LineDrawing extends JPanel implements ActionListener{

	private JRadioButton algo1;
	private JRadioButton algo2;
	private JTextField x1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField y1;
	private JTextField x2;
	private JTextField y2;
	private JButton button;

	public LineDrawing() {
		setBackground(new Color(255, 235, 205));
		setLayout(null);
		
		JLabel heading = new JLabel("Line Drawing Algorithm");
		heading.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 40));
		heading.setBounds(565, 68, 567, 50);
		add(heading);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(389, 200, 861, 503);
		add(panel);
		panel.setLayout(null);
		
	
		JLabel lblx = new JLabel("X1 ");
		lblx.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		lblx.setHorizontalAlignment(SwingConstants.CENTER);
		lblx.setBounds(87, 132, 52, 42);
		panel.add(lblx);
		
		JLabel lblX = new JLabel("Y1");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		lblX.setBounds(87, 222, 41, 42);
		panel.add(lblX);
		
		JLabel label1 = new JLabel("X2");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		label1.setBounds(458, 132, 41, 42);
		panel.add(label1);
		
		JLabel lblY = new JLabel("Y2");
		lblY.setHorizontalAlignment(SwingConstants.CENTER);
		lblY.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		lblY.setBounds(458, 222, 41, 42);
		panel.add(lblY);
		
		x1 = new JTextField();
		x1.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		x1.setHorizontalAlignment(SwingConstants.CENTER);
		x1.setColumns(10);
		x1.setBounds(163, 126, 78, 55);
		panel.add(x1);
		
		JLabel lblFirstPointCoordinates = new JLabel("Initial point Coordinates");
		lblFirstPointCoordinates.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstPointCoordinates.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		lblFirstPointCoordinates.setBounds(74, 31, 299, 42);
		panel.add(lblFirstPointCoordinates);
		
		JLabel lblEndPointCoordinates = new JLabel("End point Coordinates");
		lblEndPointCoordinates.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndPointCoordinates.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		lblEndPointCoordinates.setBounds(436, 31, 299, 42);
		panel.add(lblEndPointCoordinates);
		
		y1 = new JTextField();
		y1.setHorizontalAlignment(SwingConstants.CENTER);
		y1.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		y1.setColumns(10);
		y1.setBounds(163, 209, 78, 55);
		panel.add(y1);
		
		x2 = new JTextField();
		x2.setHorizontalAlignment(SwingConstants.CENTER);
		x2.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		x2.setColumns(10);
		x2.setBounds(531, 119, 78, 55);
		panel.add(x2);
		
		y2 = new JTextField();
		y2.setHorizontalAlignment(SwingConstants.CENTER);
		y2.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		y2.setColumns(10);
		y2.setBounds(531, 209, 78, 55);
		panel.add(y2);
		
		algo1 = new JRadioButton("DDA Line Drawing Algorithm");
		algo1.setBounds(97, 311, 318, 41);
		panel.add(algo1);
		buttonGroup.add(algo1);
		algo1.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		algo1.setBackground(Color.WHITE);
		
		algo2 = new JRadioButton("Bresenham's Line Drawing Algorithm");
		algo2.setBounds(414, 311, 397, 41);
		panel.add(algo2);
		buttonGroup.add(algo2);
		algo2.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		algo2.setBackground(Color.WHITE);
		
		button = new JButton("Submit");
		button.setFont(new Font("Century Schoolbook", Font.BOLD, 25));
		button.setBackground(new Color(255, 69, 0));
		button.setBounds(365, 389, 134, 55);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(button);
		button.addActionListener(this);
		
	    //setSize(1670, 1000);
		//setLocation(200,0);
				
				setVisible(true);
	}

	public static void main(String[] args) {
		new LineDrawing();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String algoName;
		if(algo1.isSelected() || algo2.isSelected()){
		if(algo1.isSelected())
			algoName="dda";
		else
			algoName="bresenham";
		
			
			int h=0,k=0,x=0,y=0;
				try {h=Integer.parseInt(x1.getText());} catch (NumberFormatException e) {JOptionPane.showMessageDialog(this, "Enter valid value of X1, it must be numeric value"); x1.setText("");return; }
				try {k=Integer.parseInt(y1.getText());} catch (NumberFormatException e) {JOptionPane.showMessageDialog(this, "Enter valid value of Y1, it must be numeric value"); y1.setText("");return;}
				try {x=Integer.parseInt(x2.getText());} catch (NumberFormatException e) {JOptionPane.showMessageDialog(this, "Enter valid value of X2, it must be numeric value"); x2.setText("");return;}
				try {y=Integer.parseInt(y2.getText());} catch (NumberFormatException e) {JOptionPane.showMessageDialog(this, "Enter valid value of Y2, it must be numeric value"); y2.setText("");return;}

				new DDAalgo(h,k,x,y,algoName);
	}
		else
			{JOptionPane.showMessageDialog(this,	"Please Select Algorithm !!");return;}
			
			

		
	}
}
