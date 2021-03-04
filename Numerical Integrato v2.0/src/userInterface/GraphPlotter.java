package userInterface;

import java.awt.Color;


import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import Algorithm.PlotGraph;

@SuppressWarnings("serial")
public class GraphPlotter extends JPanel implements ActionListener{
	private JTextField s2,s3,s1,c1,c2, t1, t2, c3,t3, l1, l2,l3;
	private JTextField e1,e2,e3;
	private JTextField x3;
	private JTextField x2;
	private JTextField x0;
	private JButton sinPlot, cosPlot, tanPlot, logPlot, expPlot;
	private JTextField x1;
	private JButton polyPlot;

	public GraphPlotter() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 235, 205));
		panel.setBounds(312, 172, 1112, 645);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblPolynomialEquationOf = new JLabel("Polynomial Equation");
		lblPolynomialEquationOf.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		lblPolynomialEquationOf.setBounds(49, 23, 275, 37);
		panel.add(lblPolynomialEquationOf);
		
		JLabel lblGraphOfSine = new JLabel("Graph of Sine");
		lblGraphOfSine.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		lblGraphOfSine.setBounds(49, 161, 218, 37);
		panel.add(lblGraphOfSine);
		
		JLabel lblSin = new JLabel("Sin");
		lblSin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSin.setForeground(Color.RED);
		lblSin.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		lblSin.setBounds(116, 209, 56, 44);
		panel.add(lblSin);
		
		s2 = new JTextField();
		s2.setBackground(new Color(255, 235, 205));
		s2.setHorizontalAlignment(SwingConstants.CENTER);
		s2.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		s2.setBounds(196, 211, 41, 40);
		panel.add(s2);
		s2.setColumns(10);
		
		JLabel label = new JLabel("(");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Century Schoolbook", Font.BOLD, 35));
		label.setBounds(171, 205, 21, 44);
		panel.add(label);
		
		JLabel label_1 = new JLabel(")");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Century Schoolbook", Font.BOLD, 35));
		label_1.setBounds(365, 207, 21, 44);
		panel.add(label_1);
		
		JLabel lblX = new JLabel("x +");
		lblX.setVerticalAlignment(SwingConstants.BOTTOM);
		lblX.setHorizontalAlignment(SwingConstants.LEFT);
		lblX.setForeground(Color.RED);
		lblX.setFont(new Font("Century Schoolbook", Font.BOLD, 37));
		lblX.setBounds(249, 211, 63, 37);
		panel.add(lblX);
		
		s3 = new JTextField();
		s3.setHorizontalAlignment(SwingConstants.CENTER);
		s3.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		s3.setColumns(10);
		s3.setBackground(new Color(255, 235, 205));
		s3.setBounds(318, 211, 41, 40);
		panel.add(s3);
		
		s1 = new JTextField();
		s1.setHorizontalAlignment(SwingConstants.CENTER);
		s1.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		s1.setColumns(10);
		s1.setBackground(new Color(255, 235, 205));
		s1.setBounds(80, 211, 41, 40);
		panel.add(s1);
		
		JLabel lblGraphOfCosine = new JLabel("Graph of Cosine");
		lblGraphOfCosine.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		lblGraphOfCosine.setBounds(49, 295, 218, 37);
		panel.add(lblGraphOfCosine);
		
		c1 = new JTextField();
		c1.setHorizontalAlignment(SwingConstants.CENTER);
		c1.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		c1.setColumns(10);
		c1.setBackground(new Color(255, 235, 205));
		c1.setBounds(80, 345, 41, 40);
		panel.add(c1);
		
		JLabel lblCos = new JLabel("Cos");
		lblCos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCos.setForeground(Color.RED);
		lblCos.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		lblCos.setBounds(116, 343, 56, 44);
		panel.add(lblCos);
		
		JLabel label_4 = new JLabel("(");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Century Schoolbook", Font.BOLD, 35));
		label_4.setBounds(171, 339, 21, 44);
		panel.add(label_4);
		
		c2 = new JTextField();
		c2.setHorizontalAlignment(SwingConstants.CENTER);
		c2.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		c2.setColumns(10);
		c2.setBackground(new Color(255, 235, 205));
		c2.setBounds(196, 345, 41, 40);
		panel.add(c2);
		
		JLabel lblX_2 = new JLabel("x +");
		lblX_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblX_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblX_2.setForeground(Color.RED);
		lblX_2.setFont(new Font("Century Schoolbook", Font.BOLD, 37));
		lblX_2.setBounds(249, 345, 63, 37);
		panel.add(lblX_2);
		
		JLabel label_6 = new JLabel(")");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Century Schoolbook", Font.BOLD, 35));
		label_6.setBounds(365, 341, 21, 44);
		panel.add(label_6);
		
		JLabel lblGraphOfTangent = new JLabel("Graph of Tangent");
		lblGraphOfTangent.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		lblGraphOfTangent.setBounds(49, 423, 232, 37);
		panel.add(lblGraphOfTangent);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		t1.setColumns(10);
		t1.setBackground(new Color(255, 235, 205));
		t1.setBounds(80, 473, 41, 40);
		panel.add(t1);
		
		JLabel lblTan = new JLabel("Tan");
		lblTan.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTan.setForeground(Color.RED);
		lblTan.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		lblTan.setBounds(124, 471, 48, 44);
		panel.add(lblTan);
		
		JLabel label_7 = new JLabel("(");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("Century Schoolbook", Font.BOLD, 35));
		label_7.setBounds(171, 467, 21, 44);
		panel.add(label_7);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		t2.setColumns(10);
		t2.setBackground(new Color(255, 235, 205));
		t2.setBounds(196, 473, 41, 40);
		panel.add(t2);
		
		JLabel lblX_1 = new JLabel("x +");
		lblX_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblX_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblX_1.setForeground(Color.RED);
		lblX_1.setFont(new Font("Century Schoolbook", Font.BOLD, 37));
		lblX_1.setBounds(249, 473, 63, 37);
		panel.add(lblX_1);
		
		JLabel label_9 = new JLabel(")");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("Century Schoolbook", Font.BOLD, 35));
		label_9.setBounds(365, 469, 21, 44);
		panel.add(label_9);
		
		c3 = new JTextField();
		c3.setHorizontalAlignment(SwingConstants.CENTER);
		c3.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		c3.setColumns(10);
		c3.setBackground(new Color(255, 235, 205));
		c3.setBounds(318, 345, 41, 40);
		panel.add(c3);
		
		t3 = new JTextField();
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		t3.setColumns(10);
		t3.setBackground(new Color(255, 235, 205));
		t3.setBounds(318, 473, 41, 40);
		panel.add(t3);
		
		sinPlot = new JButton("PLOT");
		sinPlot.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		sinPlot.setBounds(416, 209, 89, 44);
		panel.add(sinPlot);
		
		cosPlot = new JButton("PLOT");
		cosPlot.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		cosPlot.setBounds(416, 345, 89, 44);
		panel.add(cosPlot);
		
		tanPlot = new JButton("PLOT");
		tanPlot.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		tanPlot.setBounds(416, 469, 89, 44);
		panel.add(tanPlot);
		
		logPlot = new JButton("PLOT");
		logPlot.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		logPlot.setBounds(943, 209, 89, 44);
		panel.add(logPlot);
		
		l1 = new JTextField();
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		l1.setColumns(10);
		l1.setBackground(new Color(255, 235, 205));
		l1.setBounds(607, 211, 41, 40);
		panel.add(l1);
		
		JLabel lblLog = new JLabel("Log");
		lblLog.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLog.setForeground(Color.RED);
		lblLog.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		lblLog.setBounds(643, 209, 56, 44);
		panel.add(lblLog);
		
		JLabel label_3 = new JLabel("(");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Century Schoolbook", Font.BOLD, 35));
		label_3.setBounds(698, 205, 21, 44);
		panel.add(label_3);
		
		l2 = new JTextField();
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		l2.setColumns(10);
		l2.setBackground(new Color(255, 235, 205));
		l2.setBounds(723, 211, 41, 40);
		panel.add(l2);
		
		JLabel label_5 = new JLabel("x +");
		label_5.setVerticalAlignment(SwingConstants.BOTTOM);
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Century Schoolbook", Font.BOLD, 37));
		label_5.setBounds(776, 211, 63, 37);
		panel.add(label_5);
		
		l3 = new JTextField();
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		l3.setColumns(10);
		l3.setBackground(new Color(255, 235, 205));
		l3.setBounds(845, 211, 41, 40);
		panel.add(l3);
		
		JLabel label_8 = new JLabel(")");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Century Schoolbook", Font.BOLD, 35));
		label_8.setBounds(892, 207, 21, 44);
		panel.add(label_8);
		
		JLabel lblGraphOfLogarithm = new JLabel("Graph of Logarithm");
		lblGraphOfLogarithm.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		lblGraphOfLogarithm.setBounds(576, 161, 265, 37);
		panel.add(lblGraphOfLogarithm);
		
		expPlot = new JButton("PLOT");
		expPlot.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		expPlot.setBounds(943, 386, 89, 44);
		panel.add(expPlot);
		
		e1 = new JTextField();
		e1.setHorizontalAlignment(SwingConstants.CENTER);
		e1.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		e1.setColumns(10);
		e1.setBackground(new Color(255, 235, 205));
		e1.setBounds(607, 386, 41, 40);
		panel.add(e1);
		
		JLabel lblExp = new JLabel("Exp");
		lblExp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblExp.setForeground(Color.RED);
		lblExp.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		lblExp.setBounds(643, 387, 56, 44);
		panel.add(lblExp);
		
		JLabel label_12 = new JLabel("(");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setForeground(Color.BLACK);
		label_12.setFont(new Font("Century Schoolbook", Font.BOLD, 35));
		label_12.setBounds(698, 356, 21, 44);
		panel.add(label_12);
		
		e2 = new JTextField();
		e2.setHorizontalAlignment(SwingConstants.CENTER);
		e2.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		e2.setColumns(10);
		e2.setBackground(new Color(255, 235, 205));
		e2.setBounds(723, 362, 41, 40);
		panel.add(e2);
		
		JLabel label_13 = new JLabel("x +");
		label_13.setVerticalAlignment(SwingConstants.BOTTOM);
		label_13.setHorizontalAlignment(SwingConstants.LEFT);
		label_13.setForeground(Color.RED);
		label_13.setFont(new Font("Century Schoolbook", Font.BOLD, 37));
		label_13.setBounds(776, 362, 63, 37);
		panel.add(label_13);
		
		e3 = new JTextField();
		e3.setHorizontalAlignment(SwingConstants.CENTER);
		e3.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		e3.setColumns(10);
		e3.setBackground(new Color(255, 235, 205));
		e3.setBounds(845, 362, 41, 40);
		panel.add(e3);
		
		JLabel label_14 = new JLabel(")");
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setForeground(Color.BLACK);
		label_14.setFont(new Font("Century Schoolbook", Font.BOLD, 35));
		label_14.setBounds(892, 358, 21, 44);
		panel.add(label_14);
		
		JLabel lblGraphOfExponential = new JLabel("Graph of Exponential");
		lblGraphOfExponential.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		lblGraphOfExponential.setBounds(576, 312, 284, 37);
		panel.add(lblGraphOfExponential);
		
		x3 = new JTextField();
		x3.setHorizontalAlignment(SwingConstants.CENTER);
		x3.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		x3.setColumns(10);
		x3.setBackground(new Color(255, 235, 205));
		x3.setBounds(106, 87, 41, 40);
		panel.add(x3);
		
		x2 = new JTextField();
		x2.setHorizontalAlignment(SwingConstants.CENTER);
		x2.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		x2.setColumns(10);
		x2.setBackground(new Color(255, 235, 205));
		x2.setBounds(221, 87, 41, 40);
		panel.add(x2);
		
		x1 = new JTextField();
		x1.setHorizontalAlignment(SwingConstants.CENTER);
		x1.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		x1.setColumns(10);
		x1.setBackground(new Color(255, 235, 205));
		x1.setBounds(330, 87, 41, 40);
		panel.add(x1);
		
		x0 = new JTextField();
		x0.setHorizontalAlignment(SwingConstants.CENTER);
		x0.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		x0.setColumns(10);
		x0.setBackground(new Color(255, 235, 205));
		x0.setBounds(444, 87, 41, 40);
		panel.add(x0);
		
		polyPlot = new JButton("PLOT");
		polyPlot.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		polyPlot.setBounds(531, 83, 94, 44);
		panel.add(polyPlot);
		
		JLabel lblNewLabel = new JLabel("Plot Graph");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 44));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(621, 60, 389, 51);
		add(lblNewLabel);
		
		polyPlot.addActionListener(this);
		sinPlot.addActionListener(this);
		cosPlot.addActionListener(this);
		tanPlot.addActionListener(this);
		logPlot.addActionListener(this);
		expPlot.addActionListener(this);
		setBackground(new Color(255, 235, 205));
		setSize(1670, 1000);
		setLocation(200,0);
				
		
	    setVisible(true);
	}

	public static void main(String[] args) {
		new GraphPlotter();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object ob=arg0.getSource();
		int arr[]=new int[3];
		if(ob==polyPlot){
			int[] a=new int[4];
			try {
				a[0]=Integer.parseInt(x0.getText());
				a[1]=Integer.parseInt(x1.getText());
				a[2]=Integer.parseInt(x2.getText());
				a[3]=Integer.parseInt(x3.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Please enter number");return;
				}
			new PlotGraph(a,1);
		}
		else if(ob==sinPlot){
			try {
				arr[0]=Integer.parseInt(s1.getText());
				arr[1]=Integer.parseInt(s2.getText());
				arr[2]=Integer.parseInt(s3.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Please enter number");return;
			}
			new PlotGraph(arr,2);
		}
		else if(ob==cosPlot){
			try {
				arr[0]=Integer.parseInt(c1.getText());
				arr[1]=Integer.parseInt(c2.getText());
				arr[2]=Integer.parseInt(c3.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Please enter number");return;
			}
			new PlotGraph(arr,3);
		}
		else if(ob==tanPlot){
			try {
				arr[0]=Integer.parseInt(t1.getText());
				arr[1]=Integer.parseInt(t2.getText());
				arr[2]=Integer.parseInt(t3.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Please enter number");return;
			}
			new PlotGraph(arr,4);
		}
		else if(ob==logPlot){
			try {
				arr[0]=Integer.parseInt(l1.getText());
				arr[1]=Integer.parseInt(l2.getText());
				arr[2]=Integer.parseInt(l3.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Please enter number");return;
			}
			new PlotGraph(arr,5);
		}
		else if(ob==expPlot){
			try {
				arr[0]=Integer.parseInt(e1.getText());
				arr[1]=Integer.parseInt(e2.getText());
				arr[2]=Integer.parseInt(e3.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Please enter number");return;
			}
			new PlotGraph(arr,6);
		}
	}
}
