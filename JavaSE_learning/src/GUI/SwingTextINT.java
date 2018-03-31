package GUI;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingTextINT {
	public static void main(String[] arg){
		JFrame f = new JFrame("Swing Text only INT");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		
		JLabel lable = new JLabel("Please enter numbers ONLY");
		JTextField tField = new JTextField(20);
		
		f.add(lable);
		f.add(tField);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char ch = e.getKeyChar();
				if(ch < '0' || ch > '9'){
					e.consume();
				}
			}
		});
		f.setVisible(true);
	}
}
