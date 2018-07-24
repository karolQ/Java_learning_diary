package GUI;

import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuDemoAdv {
	public static void main(String[] arg){
		JFrame frame = new JFrame("multilayer menus");
		frame.setBounds(400, 300, 400, 300);
		frame.setLayout(new FlowLayout());
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenu menu2 = new JMenu("New");
		
		JMenuItem item = new JMenuItem("class");
		JMenuItem item2 = new JMenuItem("Open Files");
		JMenuItem item3 = new JMenuItem("Project");
		JMenuItem item4 = new JMenuItem("Package");
		JMenuItem item5 = new JMenuItem("Exit");
		
		menuBar.add(menu);
		menuBar.add(menu2);
		
		menu2.add(item3);
		menu2.add(item4);
		menu2.add(item);
		
		menu.add(menu2);
		menu.add(item2);
		menu.add(item5);
		
		frame.setJMenuBar(menuBar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}
