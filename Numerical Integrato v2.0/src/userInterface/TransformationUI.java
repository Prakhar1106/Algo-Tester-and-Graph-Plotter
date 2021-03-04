package userInterface;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JTextArea;






import Algorithm.Transformation;

import java.awt.SystemColor;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

@SuppressWarnings("serial")
public class TransformationUI extends JPanel implements ActionListener{
	private JButton numSide;
	private JTextField tx;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	private JTextField a[][];
	private JPanel panel;
	private JButton tSubmit;
	private JTextField ty;
	private JTextArea textArea;
	private int sides;
	private JPanel panel_1;
	private JTextField sx;
	private JTextField sy;
	private JButton ssbutton;
	private JTextArea scalingTArea;
	private JPanel panel_2;
	private JTextField s;
	private JButton shearSubmit;
	private JTextArea shearArea;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnShearY;
	private JRadioButton rdbtnShearX;
	private JTextField XPointOfRotation;
	private JTextField YPointOfRotation;
	private JTextField angleOfRotation;
	private JButton rotationButton;
	private JTextArea rArea;
	JButton useThisValue;
	

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public TransformationUI() {
		setBackground(new Color(255, 235, 205));
		setLayout(null);
		
		JLabel heading = new JLabel("Transformation");
		heading.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 40));
		heading.setBounds(682, 62, 338, 50);
		add(heading);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(20, 138, 492, 599);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblEnterNumberOf = new JLabel("Select Number of Sides");
		lblEnterNumberOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterNumberOf.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		lblEnterNumberOf.setBounds(21, 65, 270, 40);
		panel.add(lblEnterNumberOf);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setBounds(303, 52, 70, 53);
		panel.add(comboBox);
		
		numSide = new JButton("OK");
		numSide.setForeground(new Color(0, 0, 0));
		numSide.setBackground(new Color(255, 99, 71));
		numSide.setFont(new Font("Century Schoolbook", Font.BOLD, 25));
		numSide.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		numSide.setBounds(385, 52, 87, 50);
		panel.add(numSide);
		
		useThisValue = new JButton("Use Previous Value");
		useThisValue.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		useThisValue.setBounds(290, 500, 200, 50);
		useThisValue.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		useThisValue.setEnabled(false);
		panel.add(useThisValue);
		useThisValue.addActionListener(this);
		
		JPanel translation = new JPanel();
		translation.setBackground(Color.WHITE);
		translation.setBounds(511, 138, 526, 294);
		add(translation);
		translation.setLayout(null);
		
		JLabel lblTranslation = new JLabel("Translation");
		lblTranslation.setHorizontalAlignment(SwingConstants.CENTER);
		lblTranslation.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 24));
		lblTranslation.setBounds(164, 13, 162, 45);
		translation.add(lblTranslation);
		
		tx = new JTextField();
		tx.setHorizontalAlignment(SwingConstants.CENTER);
		tx.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		tx.setBounds(105, 71, 56, 51);
		translation.add(tx);
		tx.setColumns(10);
		
		ty = new JTextField();
		ty.setHorizontalAlignment(SwingConstants.CENTER);
		ty.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		ty.setColumns(10);
		ty.setBounds(302, 71, 56, 51);
		translation.add(ty);
		
		JLabel lblTx = new JLabel("Tx");
		lblTx.setHorizontalAlignment(SwingConstants.CENTER);
		lblTx.setFont(new Font("Century Schoolbook", Font.BOLD, 25));
		lblTx.setBounds(21, 71, 56, 51);
		translation.add(lblTx);
		
		JLabel lblTy = new JLabel("Ty");
		lblTy.setHorizontalAlignment(SwingConstants.CENTER);
		lblTy.setFont(new Font("Century Schoolbook", Font.BOLD, 25));
		lblTy.setBounds(205, 71, 56, 51);
		translation.add(lblTy);
		
		tSubmit = new JButton("Submit");
		tSubmit.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		tSubmit.setBounds(392, 71, 116, 51);
		translation.add(tSubmit);
		tSubmit.addActionListener(this);
		
		textArea = new JTextArea();
		textArea.setBackground(SystemColor.inactiveCaptionBorder);
		textArea.setFont(new Font("Century Schoolbook", Font.PLAIN, 22));
		textArea.setBounds(31, 166, 477, 101);
		translation.add(textArea);
		
		JLabel label = new JLabel("New Points :");
		label.setFont(new Font("Century Schoolbook", Font.ITALIC, 19));
		label.setBounds(31, 135, 116, 29);
		translation.add(label);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(511, 434, 526, 303);
		add(panel_1);
		
		JLabel lblScaling = new JLabel("Scaling");
		lblScaling.setHorizontalAlignment(SwingConstants.CENTER);
		lblScaling.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 24));
		lblScaling.setBounds(164, 13, 162, 45);
		panel_1.add(lblScaling);
		
		sx = new JTextField();
		sx.setHorizontalAlignment(SwingConstants.CENTER);
		sx.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		sx.setColumns(10);
		sx.setBounds(105, 71, 56, 51);
		panel_1.add(sx);
		
		sy = new JTextField();
		sy.setHorizontalAlignment(SwingConstants.CENTER);
		sy.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		sy.setColumns(10);
		sy.setBounds(302, 71, 56, 51);
		panel_1.add(sy);
		
		JLabel lblSx = new JLabel("Sx");
		lblSx.setHorizontalAlignment(SwingConstants.CENTER);
		lblSx.setFont(new Font("Century Schoolbook", Font.BOLD, 25));
		lblSx.setBounds(21, 71, 56, 51);
		panel_1.add(lblSx);
		
		JLabel lblSy = new JLabel("Sy");
		lblSy.setHorizontalAlignment(SwingConstants.CENTER);
		lblSy.setFont(new Font("Century Schoolbook", Font.BOLD, 25));
		lblSy.setBounds(205, 71, 56, 51);
		panel_1.add(lblSy);
		
		ssbutton = new JButton("Submit");
		ssbutton.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		ssbutton.setBounds(392, 71, 116, 51);
		panel_1.add(ssbutton);
		ssbutton.addActionListener(this);
		scalingTArea = new JTextArea();
		scalingTArea.setFont(new Font("Century Schoolbook", Font.PLAIN, 22));
		scalingTArea.setBackground(SystemColor.inactiveCaptionBorder);
		scalingTArea.setBounds(31, 168, 477, 101);
		panel_1.add(scalingTArea);
		
		JLabel lblNewPoints = new JLabel("New Points :");
		lblNewPoints.setFont(new Font("Century Schoolbook", Font.ITALIC, 19));
		lblNewPoints.setBounds(31, 139, 116, 29);
		panel_1.add(lblNewPoints);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(1038, 138, 524, 294);
		add(panel_2);
		
		JLabel lblShearing = new JLabel("Shearing");
		lblShearing.setHorizontalAlignment(SwingConstants.CENTER);
		lblShearing.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 24));
		lblShearing.setBounds(163, 13, 162, 45);
		panel_2.add(lblShearing);
		
		s = new JTextField();
		s.setHorizontalAlignment(SwingConstants.CENTER);
		s.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		s.setColumns(10);
		s.setBounds(105, 71, 56, 51);
		panel_2.add(s);
		
		JLabel lblS = new JLabel("S");
		lblS.setHorizontalAlignment(SwingConstants.CENTER);
		lblS.setFont(new Font("Century Schoolbook", Font.BOLD, 25));
		lblS.setBounds(21, 71, 56, 51);
		panel_2.add(lblS);
		
		shearSubmit = new JButton("Submit");
		shearSubmit.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		shearSubmit.setBounds(392, 71, 116, 51);
		panel_2.add(shearSubmit);
		shearSubmit.addActionListener(this);
		
		shearArea = new JTextArea();
		shearArea.setFont(new Font("Century Schoolbook", Font.PLAIN, 22));
		shearArea.setBackground(SystemColor.inactiveCaptionBorder);
		shearArea.setBounds(31, 166, 477, 101);
        panel_2.add(shearArea);
		
		JLabel label_3 = new JLabel("New Points :");
		label_3.setFont(new Font("Century Schoolbook", Font.ITALIC, 19));
		label_3.setBounds(31, 135, 116, 29);
		panel_2.add(label_3);
		
		rdbtnShearX = new JRadioButton("Shear along X-axis");
		rdbtnShearX.setBackground(Color.WHITE);
		buttonGroup.add(rdbtnShearX);
		rdbtnShearX.setFont(new Font("Century Schoolbook", Font.PLAIN, 13));
		rdbtnShearX.setBounds(193, 67, 152, 25);
		panel_2.add(rdbtnShearX);
		
		rdbtnShearY = new JRadioButton("Shear along Y-axis");
		rdbtnShearY.setBackground(Color.WHITE);
		buttonGroup.add(rdbtnShearY);
		rdbtnShearY.setFont(new Font("Century Schoolbook", Font.PLAIN, 13));
		rdbtnShearY.setBounds(193, 108, 152, 25);
		panel_2.add(rdbtnShearY);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(1038, 434, 526, 303);
		add(panel_3);
		
		JLabel lblRotation = new JLabel("Rotation");
		lblRotation.setHorizontalAlignment(SwingConstants.CENTER);
		lblRotation.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 24));
		lblRotation.setBounds(164, 13, 162, 45);
		panel_3.add(lblRotation);
		
		XPointOfRotation = new JTextField();
		XPointOfRotation.setHorizontalAlignment(SwingConstants.CENTER);
		XPointOfRotation.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		XPointOfRotation.setColumns(10);
		XPointOfRotation.setBounds(66, 71, 56, 51);
		panel_3.add(XPointOfRotation);
		
		YPointOfRotation = new JTextField();
		YPointOfRotation.setHorizontalAlignment(SwingConstants.CENTER);
		YPointOfRotation.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		YPointOfRotation.setColumns(10);
		YPointOfRotation.setBounds(184, 71, 56, 51);
		panel_3.add(YPointOfRotation);
		
		JLabel lblX = new JLabel("X");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Century Schoolbook", Font.BOLD, 25));
		lblX.setBounds(12, 70, 44, 51);
		panel_3.add(lblX);
		
		JLabel lblY = new JLabel("Y");
		lblY.setHorizontalAlignment(SwingConstants.CENTER);
		lblY.setFont(new Font("Century Schoolbook", Font.BOLD, 25));
		lblY.setBounds(131, 70, 44, 51);
		panel_3.add(lblY);
		
		rotationButton = new JButton("Submit");
		rotationButton.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		rotationButton.setBounds(392, 71, 116, 51);
		panel_3.add(rotationButton);
		rotationButton.addActionListener(this);
		
		rArea = new JTextArea();
		rArea.setFont(new Font("Century Schoolbook", Font.PLAIN, 22));
		rArea.setBackground(SystemColor.inactiveCaptionBorder);
		rArea.setBounds(31, 168, 477, 101);
		panel_3.add(rArea);
		
		JLabel label_5 = new JLabel("New Points :");
		label_5.setFont(new Font("Century Schoolbook", Font.ITALIC, 19));
		label_5.setBounds(31, 139, 116, 29);
		panel_3.add(label_5);
		
		angleOfRotation = new JTextField();
		angleOfRotation.setHorizontalAlignment(SwingConstants.CENTER);
		angleOfRotation.setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
		angleOfRotation.setColumns(10);
		angleOfRotation.setBounds(336, 71, 56, 51);
		panel_3.add(angleOfRotation);
		
		JLabel lblAngle = new JLabel("Angle");
		lblAngle.setHorizontalAlignment(SwingConstants.CENTER);
		lblAngle.setFont(new Font("Century Schoolbook", Font.BOLD, 25));
		lblAngle.setBounds(245, 69, 92, 51);
		panel_3.add(lblAngle);
		numSide.addActionListener(this);
		
	    
		setVisible(true);
	}

	public static void main(String[] args) {
		new TransformationUI();
	}
	int newValues[][]=new int[sides][2];
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object ob=arg0.getSource();
		
		if(ob==numSide){
			numSide.setEnabled(false);
			comboBox.setEnabled(false);
			String select =comboBox.getSelectedItem().toString();
			sides=Integer.parseInt(select);
			 a=new JTextField[sides][2];//for storing values
			for(int i=0;i<sides;i++){
				for(int j=0;j<2;j++)
				{
				a[i][j]=new JTextField();
				
				a[i][j].setFont(new Font("Century Schoolbook", Font.PLAIN, 24));
				a[i][j].setHorizontalAlignment(SwingConstants.CENTER);
				a[i][j].setBounds(((i/5)*220)+100+(j*80), 200+((i%5)*70), 70, 50);
				a[i][j].setBackground(new Color(250, 240, 230));
				panel.add(a[i][j]);
			}}
			panel.repaint();
			panel.revalidate();

		}
		
		if(ob==tSubmit){
			int arr[][]=initialize();
			if(arr!=null){
			int t1,t2;
			try {
				t1=Integer.parseInt(tx.getText());
				t2=Integer.parseInt(ty.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this,"Numeric value Required");
				return;}
			
			Transformation object=new Transformation(arr);
			arr=object.translate(t1, t2);
			for(int i=0;i<sides;i++){
						textArea.append("("+arr[i][0]+", "+arr[i][1]+"),  ");
						if(i%3==0)
							textArea.append("\n");
			}
			useThisValue.setEnabled(true);
			newValues=arr;
		     }
			else
				return;
		
		}
		
		if(ob==ssbutton){
			int arr[][]=initialize();
			if(arr!=null){
			int t1,t2;
			try {
				t1=Integer.parseInt(sx.getText());
				t2=Integer.parseInt(sy.getText());
				
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this,"Numeric value Required");
				return;}
			
			Transformation object=new Transformation(arr);
			arr=object.scaling(t1, t2);
			for(int i=0;i<sides;i++){
						scalingTArea.append("("+arr[i][0]+", "+arr[i][1]+"),  ");
						if(i%3==0)
							scalingTArea.append("\n");
			}useThisValue.setEnabled(true);
			newValues=arr;
		     }
			else
				return;
		
		}
		
		if(ob==shearSubmit){
			int arr[][]=initialize();
			if(arr!=null){
			int t;
			try {
				t=Integer.parseInt(s.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this,"Numeric value Required");
				return;}
			
			Transformation object;
			if(rdbtnShearX.isSelected()){
			object=new Transformation(arr);
			arr=object.xShear(t);}
			else if(rdbtnShearY.isSelected() ){
				object=new Transformation(arr);
				arr=object.yShear(t);}
			else{
				JOptionPane.showMessageDialog(this,"Please select shear type");
				return;
			}
				

			for(int i=0;i<sides;i++){
						shearArea.append("("+arr[i][0]+", "+arr[i][1]+"),  ");
						if(i%3==0)
							shearArea.append("\n");
			}useThisValue.setEnabled(true);
			newValues=arr;
		     }
			else
				return;
		
		}
		
		if(ob==rotationButton){
			int arr[][]=initialize();
			if(arr!=null){
			int t1,t2,angle;
			try {
				t1=Integer.parseInt(XPointOfRotation.getText());
				t2=Integer.parseInt(YPointOfRotation.getText());
				angle=Integer.parseInt(angleOfRotation.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this,"Numeric value Required");
				return;}
			
			Transformation object=new Transformation(arr);
			arr=object.rotate(t1, t2,angle);
			for(int i=0;i<sides;i++){
						rArea.append("("+arr[i][0]+", "+arr[i][1]+"),  ");
						if(i%3==0)
							rArea.append("\n");
			}useThisValue.setEnabled(true);
			newValues=arr;
		     }
			else
				return;
		
		}
		
		if(ob==useThisValue){
			for(int i=0;i<sides;i++){
				a[i][0].setText(""+newValues[i][0]);
				a[i][1].setText(""+newValues[i][1]);
			}
		}
	}

	private int[][] initialize() {
		
		int arr[][]=new int[sides][2];
		for(int i=0;i<sides;i++)
			for(int j=0;j<2;j++){
					try {
						arr[i][j]=Integer.parseInt(a[i][j].getText());
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(this,"Numeric value required at "+(i+1)+" row and "+(j+1)+" column");
						a[i][j].requestFocusInWindow();
						return null;
					}
			}
			
		return arr;
	}
}
