import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;


public class Approval {

    boolean approved;
    public boolean submitted;

    public Approval(Business business, int index){

        submitted = false;

        JFrame frame = new JFrame("Approval");
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(11,2));


        JLabel l_firstname = new JLabel("First Name:");
        JLabel l_lastname = new JLabel("Last Name:");
        JLabel l_dob = new JLabel("Date of birth:");
        JLabel l_address = new JLabel("Address:");
        JLabel l_city = new JLabel("City:");
        JLabel l_state = new JLabel("State:");
        JLabel l_zipcode = new JLabel("Zip-Code:");
        JLabel l_email = new JLabel("Email:");
        JLabel l_phone_number = new JLabel("Phone Number:");
        JLabel l_education = new JLabel("Enter highest education completed:");
       


        


        JLabel tf_firstname = new JLabel(business.retrieve_DB(index).getFirstName());
        JLabel tf_lastname = new JLabel(business.retrieve_DB(index).getLastName());
        JLabel tf_dob = new JLabel(Integer.toString(business.retrieve_DB(index).getDob()));
        JLabel tf_address = new JLabel(business.retrieve_DB(index).getAddress());
        JLabel tf_city = new JLabel(business.retrieve_DB(index).getCity());
        JLabel tf_state = new JLabel(business.retrieve_DB(index).getStateLived());
        JLabel tf_zipcode = new JLabel(Integer.toString(business.retrieve_DB(index).getZipecode()));
        JLabel tf_email = new JLabel(business.retrieve_DB(index).getEmail());
        JLabel tf_phone_number = new JLabel(business.retrieve_DB(index).getPhoneNumber());
        JLabel tf_education = new JLabel(business.retrieve_DB(index).getEducation());

        panel.add(l_firstname);
        panel.add(tf_firstname);

        panel.add(l_lastname);
        panel.add(tf_lastname);

        panel.add(l_dob);
        panel.add(tf_dob);

                                 
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
        
        panel.add(l_phone_number);
        panel.add(tf_phone_number);

        panel.add(l_education);
        panel.add(tf_education);


        //performed when the submit button is pressed
        JButton approve = new JButton("APPROVE");
        //performed when the reject button is pressed
        JButton deny = new JButton("DENY");
        //performed to get the next input from the business object
        JButton nextApplicant = new JButton("NEXT");

        approve.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // approveJFrame(frame);
                JOptionPane.showMessageDialog(null, "The applicant's account has been created!");
                approve.setVisible(false);
                deny.setVisible(false);
                panel.add(nextApplicant);
            }
        });

        deny.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // denyJFrame(frame);
                JOptionPane.showMessageDialog(null, "The applicant's account has been denied!");
                approve.setVisible(false);
                deny.setVisible(false);
                panel.add(nextApplicant);
            }
        });

        nextApplicant.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // denyJFrame(frame);
                submitted = true;
                frame.setVisible(false);
            }
        });

        panel.add(approve);
        panel.add(deny);

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    //setter and getter for approved
    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean getApproved() {
        return approved;
    }

    //check for next
    public boolean canNext()
    {
        return submitted;
    }
}
