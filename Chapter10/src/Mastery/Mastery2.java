package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Mastery2 {

	private JFrame frame;
	private JTextField firstN;
	private JTextField lastN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mastery2 window = new Mastery2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mastery2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon Crescent = new ImageIcon("../Chapter10/src/Mastery/Crescent.png");
		ImageIcon Aberhart = new ImageIcon("../Chapter10/src/Mastery/Aberhart.png");
		ImageIcon Nelson = new ImageIcon("../Chapter10/src/Mastery/Nelson.png");
		ImageIcon Pearson = new ImageIcon("../Chapter10/src/Mastery/Pearson.png");
		ImageIcon Western = new ImageIcon("../Chapter10/src/Mastery/Western.png");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Logo = new JLabel("Logo");
		Logo.setBounds(45, 147, 204, 114);
		frame.getContentPane().add(Logo);
		
		JComboBox EnterGR = new JComboBox();
		EnterGR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		EnterGR.setToolTipText("");
		EnterGR.setModel(new DefaultComboBoxModel(new String[] {"Enter Grade", "10", "11", "12"}));
		EnterGR.setBounds(34, 42, 103, 22);
		frame.getContentPane().add(EnterGR);
		
		JComboBox EnterSCH = new JComboBox();
		EnterSCH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
						
			}
			
			
		});
		EnterSCH.setModel(new DefaultComboBoxModel(new String[] {"Enter School", "Crescent", "Western", "Aberhart", "Pearson", "Nelson"}));
		EnterSCH.setBounds(147, 42, 125, 22);
		frame.getContentPane().add(EnterSCH);
		
		firstN = new JTextField();
		firstN.setText("first name: ");
		firstN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(firstN.getText().equals("first name: "))
				{
					firstN.setText(null);
				}
			}
		});
		firstN.setBounds(34, 11, 103, 20);
		frame.getContentPane().add(firstN);
		firstN.setColumns(10);
		
		JLabel Desc = new JLabel("New label");
		Desc.setBounds(10, 75, 287, 39);
		frame.getContentPane().add(Desc);
		
		lastN = new JTextField();
		lastN.setText("last name: ");
		lastN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(lastN.getText().equals("last name: "))
				{
					lastN.setText(null);
				}
			}
		});
		lastN.setBounds(147, 11, 125, 20);
		frame.getContentPane().add(lastN);
		lastN.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String FN = firstN.getText();
				String LN = lastN.getText();
				Object grade = EnterGR.getSelectedItem();
				Object school = EnterSCH.getSelectedItem();
				
				Desc.setText(FN + " " + LN + " is in grade " + grade + " and goes to " + school);
				
				if(school == "Crescent")
				{
					Logo.setIcon(Crescent);
				}
				if(school == "Aberhart")
				{
					Logo.setIcon(Aberhart);
				}
				if(school == "Nelson")
				{
					Logo.setIcon(Nelson);
				}
				if(school == "Pearson")
				{
					Logo.setIcon(Pearson);
				}
				if(school == "Western")
				{
					Logo.setIcon(Western);
				}
				
			}
		});
		btnNewButton.setBounds(307, 95, 89, 101);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
