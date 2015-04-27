import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class Listener {
	
	int green, blue, red;
	public JLabel label;
	static JSlider blueSlider, greenSlider, redSlider;
	
	public Listener()
	{
		redSlider = new JSlider();
		blueSlider = new JSlider();
		greenSlider = new JSlider();
		
		redSlider = new JSlider(JSlider.HORIZONTAL,0,255,0);
		redSlider.addChangeListener(new ChangeListener()
		{
			JLabel label = Slider1.label;
			
			public void stateChanged(ChangeEvent e)
			{
				JSlider source = (JSlider)e.getSource();
				red = source.getValue();
				label.setForeground(new Color(red, green, blue));
			}
		});
		blueSlider = new JSlider(JSlider.HORIZONTAL,0,255,0);
		blueSlider.addChangeListener(new ChangeListener()
		{
			JLabel label = Slider1.label;
			
			public void stateChanged(ChangeEvent e)
			{
				JSlider source = (JSlider)e.getSource();
				blue = source.getValue();
				label.setForeground(new Color(red, green, blue));
			}
		});
		greenSlider = new JSlider(JSlider.HORIZONTAL,0,255,0);
		greenSlider.addChangeListener(new ChangeListener()
		{
			JLabel label = Slider1.label;
			
			public void stateChanged(ChangeEvent e)
			{
				JSlider source = (JSlider)e.getSource();
				green = source.getValue();
				label.setForeground(new Color(red, green, blue));
			}
		});
		
	}
	
}
