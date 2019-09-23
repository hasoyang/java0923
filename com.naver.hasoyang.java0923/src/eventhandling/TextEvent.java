package eventhandling;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

public class TextEvent extends Frame {
	// 윈도우에 놓일 컴포넌트 변수
	TextField tf;
	Button btn;

	public TextEvent() {
		// 배치 방법 선택
		setLayout(new FlowLayout());

		// 컴포넌트들을 만들어서 배치
		tf = new TextField(20);
		add(tf);

		// 텍스트 필드의 입력이 변경될 때 이벤트를 처리하는 리스너 생성
		tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(java.awt.event.TextEvent e) {
				String k = tf.getText();
				if(k.charAt(k.length()-1)== ' ')
				{
					String x = "";
					if(k.length()!= 1)
					{
						for(int i = 0; i < k.length()-1 ; i--)
						{
							x = x+k.charAt(i);
						}
					}
					tf.setText(x);
				}
				// System.out.printf("%s\n", tf.getText());
				// 영문 대소문자, 숫자,기타문자의 개수를 저장할 변수
				int dae = 0;
				int so = 0;
				int su = 0;
				int etc = 0;

				String input = tf.getText();
				int len = input.length();
				for (int i = 0; i < len; i++) {
					char ch = input.charAt(i);
					if (ch >= 'A' && ch < 'Z')
						dae++;
					else if (ch >= 'a' && ch < 'z')
						so++;
					else if (ch >= '0' && ch <= '9')
						su++;
					else if(ch == ' ')
						continue;
					else
						etc++;
				}
				if (dae * so * su * etc != 0) {
					setBackground(Color.green);
				} else
					setBackground(Color.red);

			}

		});
		btn = new Button("확인");
		add(btn);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String input = tf.getText();
				String result = input.trim().toUpperCase();
				System.out.printf("%s\n", result);
				
			}
			
		});
		setBounds(100, 100, 300, 300);
		setTitle("TextEvent");
		setVisible(true);
	}
}
