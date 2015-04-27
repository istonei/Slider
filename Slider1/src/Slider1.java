import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class Slider1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame frame;
	int red, blue, green;
	public static JPanel panel, displayPanel;
	public static JLabel label;
	
	public Slider1()
	{
		displayPanel = new JPanel();
		displayPanel.setLayout(new BorderLayout());
		label = new JLabel("Show Colors");
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,1));
		panel.setBorder(new CompoundBorder(new TitledBorder("Choose Colors"), new EmptyBorder(2,2,2,2)));
		
		Listener colors = new Listener();
		panel.add(Listener.redSlider, BorderLayout.NORTH);
		panel.add(Listener.blueSlider, BorderLayout.AFTER_LAST_LINE);
		panel.add(Listener.greenSlider, BorderLayout.AFTER_LAST_LINE);
		
		displayPanel.add(panel, BorderLayout.CENTER);
		displayPanel.add(label, BorderLayout.NORTH);
		add(displayPanel);
		setTitle("Slider");
		setSize(new Dimension(300,200));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
