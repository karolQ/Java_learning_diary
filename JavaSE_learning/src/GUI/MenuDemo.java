package GUI;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuDemo {
	public static void main(String[] args) {
		Frame frame = new Frame("One Layer Menu");
		frame.setBounds(400, 200, 400, 300);
		frame.setLayout(new FlowLayout());

		// menu bar
		MenuBar menuBar = new MenuBar();
		// menu
		Menu m = new Menu("File");
		// menu item
		MenuItem item = new MenuItem("Save");
		
		frame.setMenuBar(menuBar);
		m.add(item);
		menuBar.add(m);
		
		
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
	}
}
