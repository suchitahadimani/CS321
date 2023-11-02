import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import java.io.File;

public class DataEntry extends JFrame{

    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private int dob;
    private int phone_number;
    private String[] job;
    private String[] education;
    private File[] files;       
    
    //to launch application
    public DataEntry() {
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


        JTextField tf_firstname = new JTextField("First Name:");
        JTextField tf_lastname = new JTextField("Last Name:");
        JTextField tf_address = new JTextField("Address:");
        JTextField tf_city = new JTextField("City:");
        JTextField tf_state = new JTextField("State:");
        JTextField tf_zipcode = new JTextField("Zip-Code:");
        JTextField tf_email = new JTextField("Email:");

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


        Button submit = new Button("SUBMIT");
        //approve.setOnAction(e -> {
        //    approve.setFill(Color.FIREBRICK);
        //    System.out.println("Button Clicked!");
        //});

//

        panel.add(submit);

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
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
    public String[] getJob() {
        return job;
    }

    public void setJob(String[] job) {
        this.job = job;
    }

    // Getter and setter for 'education'
    public String[] getEducation() {
        return education;
    }

    public void setEducation(String[] education) {
        this.education = education;
    }

     public File[] getFiles() {
        return files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    boolean submit(){
        return true;
    }

    boolean displayScreen(){
        return true;
    }
}
