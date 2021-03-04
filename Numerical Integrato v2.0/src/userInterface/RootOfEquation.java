package userInterface;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import Algorithm.NewtonRaphson;
import Algorithm.PlotGraph;
import Algorithm.RegularFalsi;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class RootOfEquation extends JPanel {
	private JTextField degree;
    private JTextField input[];
	private JLabel invalid;
	
	public RootOfEquation() {
		
		setBackground(new Color(255, 235, 205));
		//setSize(1670, 1000);
		//setLocation(200,0);
		setLayout(null);
		
		JLabel lbl = new JLabel("Root of Polynomial Equation");
		lbl.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 40));
		lbl.setBounds(500, 42, 650, 70);
		add(lbl);
		
		JLabel lblEnterDegreeOf = new JLabel("Enter Degree of Polynomial:");
		lblEnterDegreeOf.setFont(new Font("Century Schoolbook", Font.BOLD, 27));
		lblEnterDegreeOf.setBounds(20, 140, 450, 60);
		add(lblEnterDegreeOf);
		
			
		degree = new JTextField();
		degree.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				int keycode=arg0.getKeyCode();
				
				try{
					if(keycode==8)
						Integer.parseInt(degree.getText());
					else
					 Integer.parseInt(degree.getText());
					
					invalid.setText("");
				}
				catch(Exception e)
				{
					invalid.setText("invalid!!");
				}
			}
		});
		degree.setOpaque(false);
		degree.setHorizontalAlignment(SwingConstants.CENTER);
		degree.setToolTipText("Numeric value only");
		degree.setBorder(null);
		degree.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		degree.setBackground(new Color(250, 240, 230));
		degree.setName("");
		degree.setBounds(440, 140, 90, 40);
        add(degree);
		degree.setColumns(10);
		
		invalid = new JLabel("");
		invalid.setForeground(Color.RED);
		invalid.setFont(new Font("Century Schoolbook", Font.PLAIN, 19));
		invalid.setBounds(440, 188, 120, 24);
		add(invalid);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLUE);
		separator.setBackground(Color.BLACK);
		separator.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator.setBounds(440, 185, 98, 2);
		add(separator);
		
		
		
		
		JButton submitDegree = new JButton("OK");
		submitDegree.addActionListener(new ActionListener() {
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public void actionPerformed(ActionEvent arg0) {
				
				int deg;
				try {
					deg = Integer.parseInt(degree.getText());
				} catch (NumberFormatException e1) {
					degree.setText("");
					degree.requestFocusInWindow();
					error("Please enter valid degree");
					return;
				}
				submitDegree.setEnabled(false);
				input=new JTextField[deg+1];
				for(int i=0;i<=deg;i++){
					input[i]=new JTextField();
					input[i].setFont(new Font("Century Schoolbook", Font.BOLD, 23));
					input[i].setBounds(54+(i*70), 225, 70, 50);
					input[i].setHorizontalAlignment(SwingConstants.CENTER);
					input[i].setBackground(new Color(250, 240, 230));
					input[i].setText("x"+(deg-i));
					add(input[i]);
				
			}
				JButton submit = new JButton("Submit");
				
				submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				submit.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
				submit.setForeground(new Color(230, 230, 250));
				submit.setBackground(new Color(0, 0, 205));
				submit.setBounds(700, 330,150, 55);
				add(submit);
				
				
				JComboBox comboBox = new JComboBox();
				comboBox.setFont(new Font("Century Schoolbook", Font.ITALIC, 26));
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Select>", "Bisection Method", "Newton Raphson Method", "False Position Method"}));
				comboBox.setBounds(303, 330, 370, 55);
				add(comboBox);
				
				JTextField result = new JTextField();
				result.setEditable(false);
				result.setHorizontalAlignment(SwingConstants.CENTER);
				result.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
				result.setColumns(10);
				result.setBounds(360, 466, 250, 55);
				add(result);
				
				JLabel rootLabel = new JLabel("Root :");
				rootLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
				rootLabel.setBounds(250, 466, 357, 55);
				add(rootLabel);
				
				repaint();
				
				
				
				
				submit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String select =comboBox.getSelectedItem().toString();
						int arr[];
						
							arr = initialize();
						if (arr==null) {
							System.out.println("null");
							error("Please enter valid coefficients");
							return;
						}
						
						if(select.equals("<Select>"))
						{
							error("Please select Method");
							result.setText("");
							return;
						}
						new PlotGraph(arr,1);
						if(arr!=null && select.equals("Newton Raphson Method")){
							NewtonRaphson ob=new NewtonRaphson();
							
							double average=ob.calculate(arr);
							average=Math.round(average*1000000.0)/1000000.0;
							result.setText(""+average);
							
							}
						if(arr!=null && select.equals("False Position Method")){
							RegularFalsi ob=new RegularFalsi();
							
							double average=ob.calculate(arr);
							average=Math.round(average*1000000.0)/1000000.0;
							result.setText(""+average);
							
							}
						
											
			
					}

					private int[] initialize() {
						int arr[]=new int[deg+1];
						for(int i=0;i<=deg;i++)
							try {
								arr[i]=Integer.parseInt(input[deg-i].getText());
							} catch (NumberFormatException e) {
								
								return null;
							}
						
						return arr;
					}
				});
			}
		});
		submitDegree.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		submitDegree.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		submitDegree.setForeground(new Color(230, 230, 250));
		submitDegree.setBackground(new Color(0, 0, 205));
		submitDegree.setBounds(560, 140, 60, 40);
		add(submitDegree);
		setVisible(true);
		
	}
	
	void error(String s){
		
		JOptionPane.showMessageDialog(this,s);
	}
	

	
}
