import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Approval {

    public Approval(){
        JFrame frame= new JFrame("Matching Game");
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(9,2));


        JLabel l_firstname = new JLabel("First Name:");
        JLabel l_lastname = new JLabel("Last Name:");
        JLabel l_dob = new JLabel("Date of birth:");
        JLabel l_address = new JLabel("Address:");
        JLabel l_city = new JLabel("City:");
        JLabel l_state = new JLabel("State:");
        JLabel l_zipcode = new JLabel("Zip-Code:");
        JLabel l_email = new JLabel("Email:");
        JLabel l_phone_number = new JLabel("Phone Number:");

       


        //Label education = new Label("Enter highest education completed:");
        //Label job = new Label("List of Job:");
        //Label documents = new Label("Upload identification documents:");


        JLabel tf_firstname = new JLabel("First Name:");
        JLabel tf_lastname = new JLabel("Last Name:");
        JLabel tf_address = new JLabel("Address:");
        JLabel tf_city = new JLabel("City:");
        JLabel tf_state = new JLabel("State:");
        JLabel tf_zipcode = new JLabel("Zip-Code:");
        JLabel tf_email = new JLabel("Email:");

        panel.add(l_firstname);
        panel.add(tf_firstname);

        panel.add(l_lastname);
        panel.add(tf_lastname);

                                 
        panel.add(l_address);
        panel.add(tf_address);

        panel.add(l_city); 
        panel.add(tf_city);

        panel.add(l_state); 
        panel.add(tf_state); 

        panel.add(l_zipcode); 
        panel.add(tf_zipcode); 

        panel.add(l_email);                                                                
        panel.add(tf_email);                                    



        Button approve = new Button("APPROVE");
        //approve.setOnAction(e -> {
        //    approve.setFill(Color.FIREBRICK);
        //    System.out.println("Button Clicked!");
        //});

        Button deny = new Button("DENY");
        //deny.setOnAction(e -> {
        //    deny.setFill(Color.FIREBRICK);
        //    System.out.println("Button Clicked!");
        //});
//

        panel.add(approve);
        panel.add(deny);

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    
    private DataEntry immigrant;
    private int alienNumber;

    public DataEntry getImmigrant() {
        return immigrant;
    }

    public void setImmigrant(DataEntry immigrant) {
        this.immigrant = immigrant;
    }

    public int getAlienNumber() {
        return alienNumber;
    }

    public void setAlienNumber(int alienNumber) {
        this.alienNumber = alienNumber;
    }

    public boolean approve(int alienNumber) {
        return true;
    }

    public boolean deny(int alienNumber) {
        return false;
    }
    
}
