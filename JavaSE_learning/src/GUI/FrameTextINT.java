package GUI;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTextINT {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setBounds(400, 200, 400, 300);
		frame.setLayout(new FlowLayout());
		
		// add label
		Label lable = new Label("Please enter numbers only");
		
		TextField tf = new TextField(40);
		
		frame.add(lable);
		frame.add(tf);
		
		// add an event to text field
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char ch = e.getKeyChar();
				if(!(ch >= '0' && ch <= '9')){
					e.consume();
				}
			}
		});
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
	}
}
