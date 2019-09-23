package eventhandling;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {
	
	Button blueBtn, greenBtn;
	public EventRouting() {
		setLayout(new FlowLayout());
		
		blueBtn = new Button("파랑");
		greenBtn = new Button("녹색");
		
		add(blueBtn);
		add(greenBtn);
		/*
		 //버튼 2개의 이벤트 처리를 2개의 객체를 생성해서 처리
		blueBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.blue);
			}
			
		});
		
		greenBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.green);
			}
			
		});
		*/
		/*
		//이벤트 처리 객체를 생성
		ActionListener listener = new ActionListener() {
			
			@Override
			//이벤트가 발생한 객체 - e.getSource()
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == blueBtn)
				{
					setBackground(Color.blue);
				}
				else if(e.getSource() == greenBtn)
				{
					setBackground(Color.green);
				}
				
			}
			
		};
		*/
		EventHandler2 listener = new EventHandler2();
		listener.setFrame(this);
		//2개의 버튼의 액션 이벤트 처리를 동일한 객체에게 위힘 = 이벤트 라우팅
		blueBtn.addActionListener(listener);
		greenBtn.addActionListener(listener);
		
		setBounds(100,100,300,300);
		setTitle("이벤트 라우팅");
		setVisible(true);
	}
}
