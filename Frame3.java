package restaurantManagementSystem;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Frame3 {

	// method to show menus
    public static void run(Menu menu1,Menu menu2,Customer customer) {
    	JFrame frame = new JFrame();
    	frame.setLayout(new GridLayout(1,2));
    	
    	//create and add panel to frame for two menus
    	JPanel menu1Panel= new JPanel();
    	frame.add(menu1Panel);
    	JPanel menu2Panel= new JPanel();
    	frame.add(menu2Panel);
    	
    	// creating components
    	JLabel menu1Label= new JLabel("Menu 1");
    	JTextArea area1 = new JTextArea();
    	JScrollPane menu1ScrollPane= new JScrollPane(area1);
    	JLabel menu2Label= new JLabel("Menu 2");
    	JTextArea area2 = new JTextArea();
    	JScrollPane menu2ScrollPane= new JScrollPane(area2);
    	JButton menu1Button= new JButton("Select");
    	JButton menu2Button= new JButton("Select");
    	
    	// adding components to panel
    	menu1Panel.add(menu1Label);
    	menu1Panel.add(menu1ScrollPane);
    	menu2Panel.add(menu2Label);
    	menu2Panel.add(menu2ScrollPane);
    	menu1Panel.add(menu1Button);
    	menu2Panel.add(menu2Button);
    	
    	// setting bounds for components
    	menu1Label.setBounds(15,10,100,20);
    	menu1ScrollPane.setBounds(10,40,200,380);
    	menu2Label.setBounds(15,10,100,20);
    	menu2ScrollPane.setBounds(10,40,200,380);
    	menu1Button.setBounds(10,425,80,20);
    	menu2Button.setBounds(10,425,80,20);
    	
    	menu1Button.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e) {
    			frame.dispose();
    			Frame4.run(menu1,menu2,customer);
    		}
    	});
    	
    	
    	menu2Button.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e) {
    			frame.dispose();
    			Frame4.run(menu1,menu2,customer);
    		}
    	});
    	
    	//set text area 1
    	area1.setText(menu1.toString());
    	
    	//set text area 2
    	area2.setText(menu2.toString());
    	
    	menu1Panel.setLayout(null);
    	menu2Panel.setLayout(null);
    	menu1Panel.setSize(250,500);
    	menu2Panel.setSize(250,500);
    	frame.setVisible(true);
    	frame.setSize(500,500);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	

    }
}
