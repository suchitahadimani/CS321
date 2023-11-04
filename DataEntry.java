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
    

    //to launch application
    public DataEntry() {
        //create the frame
        JFrame frame= new JFrame("Enter Your Information");
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




        // JLabel l_firstname = new JLabel("First Name:");
        // JLabel l_lastname = new JLabel("Last Name:");
        // JLabel l_dob = new JLabel("Date of birth:");
        // JLabel l_address = new JLabel("Address:");
        // JLabel l_city = new JLabel("City:");
        // JLabel l_state = new JLabel("State:");
        // JLabel l_zipcode = new JLabel("Zip-Code:");
        // JLabel l_email = new JLabel("Email:");
        // JLabel l_phone_number = new JLabel("Phone Number:");


        // //Label education = new Label("Enter highest education completed:");
        // //Label job = new Label("List of Job:");
        // //Label documents = new Label("Upload identification documents:");


        // JTextField tf_firstname = new JTextField("First Name:");
        // JTextField tf_lastname = new JTextField("Last Name:");
        // JTextField tf_dob = new JTextField("Date of birth:");
        // JTextField tf_address = new JTextField("Address:");
        // JTextField tf_city = new JTextField("City:");
        // JTextField tf_state = new JTextField("State:");
        // JTextField tf_zipcode = new JTextField("Zip-Code:");
        // JTextField tf_email = new JTextField("Email:");
        // JTextField tf_phone_number = new JTextField("Phone Number:");

        // panel.add(l_firstname);
        // panel.add(tf_firstname);

        // panel.add(l_lastname);
        // panel.add(tf_lastname);

        // panel.add(l_dob);
        // panel.add(tf_dob);
                                 
        // panel.add(l_address);
        // panel.add(tf_address);

        // panel.add(l_city); 
        // panel.add(tf_city);

        // panel.add(l_state); 
        // panel.add(tf_state); 

        // panel.add(l_zipcode); 
        // panel.add(tf_zipcode); 

        // panel.add(l_email);                                                                
        // panel.add(tf_email); 

        // panel.add(l_phone_number);
        // panel.add(tf_phone_number);

        // JButton submit = new JButton("SUBMIT");

        // //approve.setOnAction(e -> {
        // //    approve.setFill(Color.FIREBRICK);
        // //    System.out.println("Button Clicked!");
        // //});
        // //
        // submit.addActionListener(new submitAction(this));
        // panel.add(submit);
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


    // Getter and setter for 'address'
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and setter for 'address'
    public String getStateLived() {
        return stateLived;
    }

    public void setState(String state) {
        this.stateLived = state;
    }

    // Getter and setter for 'address'
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
