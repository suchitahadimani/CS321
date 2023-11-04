import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.io.File;

//main data entry class
public class DataEntry extends JFrame{

    //all the variables needed for the data entry
    private String firstname;
    private JTextField enterFirst;
    private String lastname;
    private JTextField enterLast;
    private String email;
    private JTextField enterEmail;
    private String address;
    private JTextField enterAddress;
    private String city;
    private JTextField enterCity;
    private String stateLived;
    private JTextField enterState;
    private String zipcode;
    private JTextField enterZipcode;
    private int dob;
    private JTextField enterDob;
    private int phone_number;
    private JTextField enterPhone;
    private String job;
    private JTextField enterJob;
    private String education;
    private JTextField enterEducation;
    private JButton saveIt;
    
    public void makeNewJFrame(JFrame frame)
    {
        //create the frame
        JFrame submitted = new JFrame("Submitted!");
        //set size
        submitted.setSize(400, 150);
        //make a new Jpanel
        JPanel panel = new JPanel();
        //add a message to panel
        panel.add(new JLabel("Congrats on submitting, your application will be reviewed."));
        //display the frame
        submitted.add(panel, BorderLayout.CENTER);
        submitted.setSize(500,500);
        submitted.setVisible(true);
        //hide the data entry frame
        frame.setVisible(false);
    }

    //to launch application
    public DataEntry() {
        //create the frame
        JFrame frame = new JFrame("Enter Your Information");
        //set size
        frame.setSize(400, 150);

        //allocate sizing for fields
        enterFirst = new JTextField(10);
        enterLast = new JTextField(10);
        enterEmail = new JTextField(10);
        enterAddress = new JTextField(10);
        enterCity = new JTextField(10);
        enterState = new JTextField(10);
        enterZipcode = new JTextField(10);
        enterDob = new JTextField(10);
        enterPhone = new JTextField(10);
        enterJob = new JTextField(10);
        enterEducation = new JTextField(10);
        saveIt = new JButton("Submit");

        //performed when the submit button is pressed
        saveIt.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                firstname = enterFirst.getText();
                lastname = enterLast.getText();
                email = enterEmail.getText();
                address = enterAddress.getText();
                city = enterCity.getText();
                stateLived = enterState.getText();
                zipcode = enterZipcode.getText();
                dob = Integer.parseInt(enterDob.getText());
                phone_number = Integer.parseInt(enterPhone.getText());
                job = enterJob.getText();
                education = enterEducation.getText();
                makeNewJFrame(frame);
            }
        });
    
        //create the JPanel
        JPanel panel = new JPanel();
        //add all the labels and text boxes for user input
        panel.add(new JLabel("First Name: "));
        panel.add(enterFirst);
        panel.add(new JLabel("Last Name: "));
        panel.add(enterLast);
        panel.add(new JLabel("Address: "));
        panel.add(enterAddress);
        panel.add(new JLabel("Email: "));
        panel.add(enterEmail);
        panel.add(new JLabel("City: "));
        panel.add(enterCity);
        panel.add(new JLabel("State: "));
        panel.add(enterState);
        panel.add(new JLabel("Zipcode: "));
        panel.add(enterZipcode);
        panel.add(new JLabel("DOB: "));
        panel.add(enterDob);
        panel.add(new JLabel("Phone Number: "));
        panel.add(enterPhone);
        panel.add(new JLabel("Recent Job: "));
        panel.add(enterJob);
        panel.add(new JLabel("Highest Level of Education: "));
        panel.add(enterEducation);
        //add the save button
        panel.add(saveIt);
        //add the panel to the frame
        frame.add(panel);

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(500,500);
        frame.setVisible(true);
    }





    // Getter and setter for 'name'
    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    // Getter and setter for 'name'
    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    // Getter and setter for 'address'
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    // Getter and setter for 'city'
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and setter for 'state'
    public String getStateLived() {
        return stateLived;
    }

    public void setState(String state) {
        this.stateLived = state;
    }

    // Getter and setter for 'zipcode'
    public String getZipecode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    // Getter and setter for 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter for 'dob'
    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    // Getter and setter for 'phone_number'
    public int getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(int phone_number) {
        this.phone_number = phone_number;
    }

    // Getter and setter for 'job'
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    // Getter and setter for 'education'
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }


    boolean submit(){
        return true;
    }

    boolean displayScreen(){
        return true;
    }
}
