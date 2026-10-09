package SKILLBUILDERS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class MetricConversion {

	private JFrame frame;
	private JTextField FS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Display = new JLabel("Display");
		Display.setBounds(25, 204, 110, 33);
		panel.add(Display);
		
		JComboBox Metric = new JComboBox();
		Metric.setModel(new DefaultComboBoxModel(new String[] {"Click here", "1 Inch = 2.54 Centimetres", "1 Foot = 0.308 Metres"}));
		Metric.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(Metric.getSelectedItem().equals("1 Inch = 2.54 Centimetres"));
				{
					String n = FS.getText();
					double Num = Double.parseDouble(n);
					double answer = Num * 2.54;
					
					Display.setText(Num 
							+ " inches converted to centimetres is"
							+ answer
							+ " cm");
				}
			}
		});
		Metric.setEditable(true);
		Metric.setToolTipText("");
		Metric.setBounds(156, 11, 122, 44);
		panel.add(Metric);
		
		
		
		FS = new JTextField();
		FS.setText("Enter number here:");
		FS.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(FS.getText().equals("Enter number here:"))
				{
					FS.setText(null);
				}
			}
		});
		FS.setBounds(25, 167, 110, 26);
		panel.add(FS);
		FS.setColumns(10);
	}
}
