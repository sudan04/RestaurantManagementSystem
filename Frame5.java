package restaurantManagementSystem;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame5 {
	 // method to display total order and bill of the customer
    public static void run(Order order) {
    	JFrame frame = new JFrame("Restaurant Management System");
    	frame.setSize(1200, 800);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Restaurant Management System");
        label1.setFont(new Font("Serif", Font.BOLD, 24)); // Set font size to 24
        label1.setBounds(400, 20, 600, 30); // Adjusted width and height for the new font size
        frame.add(label1);

        JLabel label2 = new JLabel("Total Order");
        label2.setBounds(100, 60, 80, 20);
        frame.add(label2);

        JLabel label3 = new JLabel("Amount");
        label3.setBounds(700, 60, 80, 20);
        frame.add(label3);

        JTextArea area1 = new JTextArea(20, 20);
        JScrollPane scrollPane1 = new JScrollPane(area1);
        scrollPane1.setBounds(50, 100, 500, 200);
        frame.add(scrollPane1);

        JTextArea area2 = new JTextArea(20, 20);
        JScrollPane scrollPane2 = new JScrollPane(area2);
        scrollPane2.setBounds(650, 100, 500, 200);
        frame.add(scrollPane2);

        // Add Total Amount label and text field
        JLabel totalAmountLabel = new JLabel("Total Amount:");
        totalAmountLabel.setBounds(945, 320, 100, 25);
        frame.add(totalAmountLabel);

        JTextField totalAmountField = new JTextField();
        totalAmountField.setBounds(1050, 320, 100, 25);
        frame.add(totalAmountField);

        
        //set text area 1
        Invoice invoice = new Invoice(order);
        area1.setText(invoice.generateInvoice());
        
        //set text area 2
        area2.setText(invoice.generateAmount());
        
        //set total amount field
        totalAmountField.setText(String.valueOf(invoice.generatePayableAmount()));
        
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
