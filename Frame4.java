package restaurantManagementSystem;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame4 {

	// method to create Item list and Placing order system
    public static void run(Menu menu1,Menu menu2,Customer customer) {
    	JFrame frame = new JFrame("Restaurant Management System");
        frame.setSize(1200, 800);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Restaurant Management System");
        label1.setFont(new Font("Serif", Font.BOLD, 24)); // Set font size to 24
        label1.setBounds(400, 20, 600, 30); // Adjusted width and height for the new font size
        frame.add(label1);

        JLabel label2 = new JLabel("Item List");
        label2.setBounds(100, 60, 80, 20);
        frame.add(label2);

        JLabel label3 = new JLabel("Choosed item");
        label3.setBounds(700, 60, 100, 20);
        frame.add(label3);

        JTextArea area1 = new JTextArea(20, 20);
        JScrollPane scrollPane1 = new JScrollPane(area1);
        scrollPane1.setBounds(50, 100, 500, 260);
        frame.add(scrollPane1);

        JTextArea area2 = new JTextArea(20, 20);
        JScrollPane scrollPane2 = new JScrollPane(area2);
        scrollPane2.setBounds(650, 100, 500, 200);
        frame.add(scrollPane2);

        JLabel label4 = new JLabel("Item No:");
        label4.setBounds(680, 320, 80, 30);
        frame.add(label4);

        JTextField field = new JTextField();
        field.setBounds(740, 320, 100, 30);
        frame.add(field);

        JButton button1 = new JButton("Remove Order");
        button1.setBounds(630, 370, 150, 30);
        frame.add(button1);

        JButton button2 = new JButton("Place Order");
        button2.setBounds(800, 370, 150, 30);
        frame.add(button2);
        //
        Order order = new Order(customer);

        button1.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		try {
        		int itemNumber = Integer.valueOf(field.getText());
        		order.removeOrderItem(itemNumber);
        		area2.setText(null);
            	area2.setText(order.toString());
        		}
        		catch(Exception ex)
        		{
        			ex.printStackTrace();
        		}
        	}

        	
        });
        
        
        
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	try {
            		
                JPanel panel = new JPanel();
                panel.setLayout(null);

                JLabel messageLabel = new JLabel("Do you want to continue?");
                messageLabel.setBounds(50, 10, 200, 25);
                panel.add(messageLabel);
                //
                
                
                if(field.getText().isEmpty())
                {
                	frame.dispose();
                	Frame5.run(order);
                }

               int itemNumber = Integer.valueOf(field.getText());
        		order.addOrderItem(menu1,itemNumber);

        		area2.setText(null);
            	area2.setText(order.toString());

                JButton yesButton = new JButton("Yes");
                yesButton.setBounds(20, 60, 80, 30);
                panel.add(yesButton);

                JButton noButton = new JButton("No");
                noButton.setBounds(120, 60, 80, 30);
                panel.add(noButton);



                int result = JOptionPane.showOptionDialog(frame, panel, "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

                if(result==1) {
                	
                	frame.dispose();
                	Frame5.run(order);
                }
               
                }

            	catch(Exception ex)
            	{
            		System.out.println(ex);
            	}
            }
        });
        
        //set text area 1
         List<MenuItem> items = menu1.getMenuItems();
         for(MenuItem item: items)
         {
        	String oldText = area1.getText();
        	area1.setText(oldText + item);
         }
        frame.setVisible(true);
		
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
