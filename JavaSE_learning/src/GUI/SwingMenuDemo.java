package GUI;

import java.awt.FlowLayout;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SwingMenuDemo {
	public static void main(String[] arg){
		JFrame f = new JFrame("Menu Demo");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem item = new JMenuItem("Exit");
		
		menu.add(item);
		menuBar.add(menu);
		
		f.setJMenuBar(menuBar);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// add an event to menu item "Exit"
		item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		f.setVisible(true);
	}
}
