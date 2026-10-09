package SKILLBUILDERS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class SemesterAVG 
{

	private JFrame frame;
	private JTextField Gr1;
	private JTextField Gr2;
	private JTextField Gr3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					SemesterAVG window = new SemesterAVG();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SemesterAVG() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Gr1 = new JTextField();
		Gr1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(Gr1.getText().equals("Enter first grade: ")) 
				{
					Gr1.setText("");
				}
			}
		
		});
		Gr1.setText("Enter first grade: ");
		Gr1.setBounds(21, 30, 278, 34);
		frame.getContentPane().add(Gr1);
		Gr1.setColumns(10);
		
		Gr2 = new JTextField();
		Gr2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(Gr2.getText().equals("Enter second grade: ")) 
				{
					Gr2.setText("");
			    }
			}
		});
		Gr2.setText("Enter second grade: ");
		Gr2.setColumns(10);
		Gr2.setBounds(20, 83, 279, 34);
		frame.getContentPane().add(Gr2);
		
		Gr3 = new JTextField();
		Gr3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(Gr3.getText().equals("Enter third grade: ")) 
				{
					Gr3.setText("");
			    }
			}
		});
		Gr3.setText("Enter third grade: ");
		Gr3.setColumns(10);
		Gr3.setBounds(21, 134, 278, 34);
		frame.getContentPane().add(Gr3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(218, 191, 156, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String g1 = Gr1.getText();
				String g2 = Gr2.getText();
				String g3 = Gr3.getText();
				
				double g11 = Double.parseDouble(g1);
				double g12 = Double.parseDouble(g2);
				double g13 = Double.parseDouble(g3);
				
				double avg = (g11 + g12 + g12)/3;
				
				DecimalFormat dc = new DecimalFormat("0.0");
				
				lblNewLabel.setText("Average: "+(dc.format(avg)));
			}
		});
		btnNewButton.setBounds(21, 191, 156, 45);
		frame.getContentPane().add(btnNewButton);
	}
}
