package eventhandling;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler2 implements ActionListener {

	Frame frame;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "파랑")
		{
			frame.setBackground(Color.blue);
		}
		else if(e.getActionCommand() == "녹색")
		{
			frame.setBackground(Color.green);
		}
		
	}
	
	public void setFrame(Frame frame)
	{
		this.frame = frame;
	}
	
}
