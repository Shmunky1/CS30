package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon placeholder = new ImageIcon("../Chapter10/src/Mastery/placeholder.gif");
		ImageIcon plates_all_broken = new ImageIcon("../Chapter10/src/Mastery/plates_all_broken.gif");
		ImageIcon plates_two_broken = new ImageIcon("../Chapter10/src/Mastery/plates_two_broken.gif");
		ImageIcon plates = new ImageIcon("../Chapter10/src/Mastery/plates.gif");
		ImageIcon sticker = new ImageIcon("../Chapter10/src/Mastery/sticker.gif");
		ImageIcon tiger_plush = new ImageIcon("../Chapter10/src/Mastery/tiger_plush.gif");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 181, 51, 69);
		frame.getContentPane().add(panel);
	   
		
		JLabel Plates = new JLabel("");
		Plates.setBounds(73, 11, 275, 84);
		frame.getContentPane().add(Plates);
		
		JLabel Prize = new JLabel("");
		Prize.setBounds(150, 159, 179, 91);
		frame.getContentPane().add(Prize);
		
		Plates.setIcon(plates);
		
		JButton btnNewButton = new JButton("Break!");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int Break;
				Break = (int)(3 * Math.random() + 1);
				
				btnNewButton.setText("Play again?");
				
				if(Break == 1)
				{
					Plates.setIcon(plates_two_broken);
				    Prize.setIcon(sticker);
				}
				
				
				if(Break == 3)
				{
					Plates.setIcon(plates_all_broken);
				    Prize.setIcon(tiger_plush);
				}
				
				
				if(Break == 2)
				{
					Plates.setIcon(plates_two_broken);
				    Prize.setIcon(sticker);
				}
				
				
			}
		});
		
	    btnNewButton.setBounds(150, 106, 124, 41);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
