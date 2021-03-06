package GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 
 */

public class FrameDemo {
	public static void main(String[] arg){
		Frame f = new Frame("adding a button");
		// setting the attributes
		f.setBounds(400, 200, 400, 300);
		
		//set the layout
		f.setLayout(new FlowLayout());
		
		// set a button
		Button bt = new Button("click me");
		bt.setSize(20,10);
		
		// adding the button to frame
		f.add(bt);
		
		// close window
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		bt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Stop it!");
			}
		});
		// 
		f.setVisible(true);
	}
}
