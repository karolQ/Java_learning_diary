package GUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class FrameBGColoer {
	public static void main(String[] arg){
		Frame f = new Frame();
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		
		//initialize a button
		Button btRd = new Button("red");
		Button btBl = new Button("blue");
		Button btGr = new Button("green");
		Button btYl = new Button("yellow");


		
		//close the frame
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		// add event to the button
//		btRd.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				f.setBackground(Color.RED);
//				
//			}
//		});
		
		// add event when click the mouse
//		btRd.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e){
//				f.setBackground(Color.RED);
//			}
//		});
		
		// add an event when mouse hover over the button
		btRd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e){
				f.setBackground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent e){
				f.setBackground(Color.WHITE);
			}
		});
		
		btBl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e){
				f.setBackground(Color.BLUE);
			}
			
			@Override
			public void mouseExited(MouseEvent e){
				f.setBackground(Color.WHITE);
			}
		});
		
		btGr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e){
				f.setBackground(Color.GREEN);
			}
			
			@Override
			public void mouseExited(MouseEvent e){
				f.setBackground(Color.WHITE);
			}
		});
		
		btYl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e){
				f.setBackground(Color.YELLOW);
			}
			
			@Override
			public void mouseExited(MouseEvent e){
				f.setBackground(Color.WHITE);
			}
		});
		
		f.add(btRd);
		f.add(btBl);
		f.add(btGr);
		f.add(btYl);
		f.setVisible(true);
	}
}
