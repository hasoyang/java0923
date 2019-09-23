package eventhandling;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
	Frame frame;
	/*
	//생성자를 이용해서 가져오기
	public EventHandler(Frame frame)
	{
		this.frame = frame;
	}
	*/
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.setBackground(Color.black);
	}
	
	//frame의 setter 메소드
	public void setFrame(Frame frame) {
		this.frame = frame;
	}

}
