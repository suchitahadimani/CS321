
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;


import java.io.File;

public class DataEntry extends Application{

    private String firstname;
    private String lastname;
    private String address;
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
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Account Creation");
        Text scenetitle = new Text("Welcome! Get started on making your account!");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);


        Label l_firstname = new Label("First Name:");
        Label l_lastname = new Label("Last Name:");
        Label l_dob = new Label("Date of birth:");
        Label l_address = new Label("Address:");
        Label l_city = new Label("City:");
        Label l_state = new Label("State:");
        Label l_zipcode = new Label("Zip-Code:");
        Label l_email = new Label("Email:");
        Label l_phone_number = new Label("Phone Number:");

        grid.add(l_firstname, 0, 1);
        grid.add(l_lastname, 0, 2);      
        grid.add(l_dob, 0, 3);                          
        grid.add(l_address, 0, )4;                                   
        grid.add(l_city, 0, );                                    
        grid.add(l_state, 0, 5);                                    
        grid.add(l_zipcode, 0, 6);                                    
        grid.add(l_email, 0, 7);                                   
        grid.add(l_phone_number, 0, 8);


        Label education = new Label("Enter highest education completed:");
        Label job = new Label("List of Job:");
        Label documents = new Label("Upload identification documents:");


        TextField tf_firstname = new TextField("First Name:");
        TextField tf_lastname = new TextField("Last Name:");
        TextField tf_address = new TextField("Address:");
        TextField tf_city = new TextField("City:");
        TextField tf_state = new TextField("State:");
        TextField tf_zipcode = new TextField("Zip-Code:");
        TextField tf_email = new TextField("Email:");

        grid.add(tf_firstname, 1, 1);
        grid.add(tf_astname, 1, 2);              
        grid.add(tf_dob, 1, 3);                              
        grid.add(tf_address, 1, )4;                                    
        grid.add(tf_city, 1, );                                   
        grid.add(tf_state, 1, 5);                                   
        grid.add(tf_zipcode, 1, 6);                                    
        grid.add(tf_email, 1, 7);                                    
        grid.add(tf_phone_number, 1, 8);





        Label pw = new Label("Password:");
        grid.add(pw, 0, 10);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 10);



        Button btn = new Button("SUBMIT");
        btn.setOnAction(e -> {
            btn.setFill(Color.YELLOW);
            System.out.println("Button Clicked!");
            setFirstName(l_firstname.getText());
            setLastName(l_lastname.getText());
            setAddress(l_address.getText());
            setCity(l_city.getText());
            setState(l_state.getText());
            setZipcode(l_zipcode.getText());
            setEmail(l_email.getText());
            setPhoneNumber(l_phone_number.getText());
        });

        
        grid.add(btn);


        Scene scene = new Scene(grid, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
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


<<<<<<< HEAD
    boolean displayScreen(){
        return true;
    }



=======
>>>>>>> b4c0cabed04ee33fd4081e66e3ad79462881b092
}
