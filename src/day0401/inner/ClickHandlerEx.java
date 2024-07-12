package day0401.inner;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//class ClickHandler implements ActionListener {
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("버튼이 눌렸습니다.");
//	}

//}

public class ClickHandlerEx {

	public static void main(String[] args) {
		Frame f = new Frame("클릭이벤트");
		Button b = new Button("click button");
//		ClickHandler c = new ClickHandler();
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭2");
			}
		});

//		b.addActionListener(new ClickHandler()); 
		f.add(b);
		f.setBounds(100, 100, 300, 300);
		f.setVisible(true);
	}

}
