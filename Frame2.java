package restaurantManagementSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame2 {

	// method to take customer name and status
    public static void run(Menu menu1,Menu menu2) 
    {
    	
       JFrame frame = new JFrame();
       
       // creating components
       JLabel customerLabel = new JLabel("CUSTOMER");
       JLabel nameLabel= new JLabel("NAME:");
       JTextField nameField= new JTextField();
       JLabel statusLabel= new JLabel("STATUS:");
       JTextField statusField= new JTextField();
       JButton button= new JButton("✓");
       frame.setLayout(null);
       
       // Adding components to frame
       frame.add(customerLabel);
       frame.add(nameLabel);
       frame.add(nameField);
       frame.add(statusLabel);
       frame.add(statusField);
       frame.add(button);
       
       // setting bounds for components
       customerLabel.setBounds(60,10,100,20);
       nameLabel.setBounds(10,40,50,20);
       nameField.setBounds(70,40,100,20);
       statusLabel.setBounds(10,70,100,20);
       statusField.setBounds(70,70,100,20);
       button.setBounds(10,90,45,20);
       
       button.addActionListener(new ActionListener() {
    	   public void actionPerformed(ActionEvent e) {
    		   String name = nameField.getText();
    		   String status = statusField.getText();
    		   Customer customer = new Customer(name,status);
    		   frame.dispose();
    		   Frame3.run(menu1,menu2,customer);
    	   }
       });  
       
       frame.setSize(200,200);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
