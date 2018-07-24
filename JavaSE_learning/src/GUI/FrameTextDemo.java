package GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTextDemo {
	public static void main(String[] arg){
		Frame f = new Frame();
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		
		//add a text field to frame
		// why final??
		final TextField tf = new TextField(20);
		
		//initialize a button
		Button bt = new Button("Add");
		final TextArea ta = new TextArea(10, 40);
		
		// add the button, text filed and text area to frame
		f.add(tf);
		f.add(bt);
		f.add(ta);
		
		//close the frame
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		// add an event when click the button
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// clear the blank
				String tf_str = tf.getText().trim();
				
				//clear the text field after add
				tf.setText("");
				
				// add the new str to original one and return
				ta.append(tf_str+"\r\n");
				// place the curser at text field
				tf.requestFocus();
			}
		});
		
		f.setVisible(true);
	}
	
}
