package restaurantManagementSystem;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Frame1{
//method to create welcome page 
public static void run(Menu menu1,Menu menu2) {
	JFrame frame = new JFrame("Restaurant Management System");
    frame.setSize(400, 400);
    frame.setLayout(null);

    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBounds(50, 20, 300, 250);
    panel.setBorder(new TitledBorder(""));
    frame.add(panel);

	JLabel label1 = new JLabel("Restaurant Management System");
    label1.setFont(new Font("Serif", Font.BOLD, 17)); // Set font size to 24
	label1.setBounds(26, 30, 260, 25); // Adjusted width and height for the new font size
    panel.add(label1);

    JLabel label2 = new JLabel("Anish");
    label2.setBounds(110, 60, 100, 20);
    panel.add(label2);

    JLabel label3 = new JLabel("Sudan");
    label3.setBounds(110, 80, 100, 20);
    panel.add(label3);

    JLabel label4 = new JLabel("Nisil");
    label4.setBounds(110, 100, 100, 20);
    panel.add(label4);

    JLabel label5 = new JLabel("Do you want to Place Order?");
    label5.setBounds(50, 140, 200, 20);
    panel.add(label5);

    JButton button1 = new JButton("Yes");
    button1.setBounds(60, 170, 60, 20);
    panel.add(button1);

    JButton button2 = new JButton("No");
    button2.setBounds(140, 170, 60, 20);
    panel.add(button2);

    button1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            Frame2.run(menu1,menu2);
        }
    });

    button2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}

