import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Approval {

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


        Label firstname = new Label("First Name:");
        Label lastname = new Label("Last Name:");
        Label dob = new Label("Date of birth:");
        Label address = new Label("Address:");
        Label city = new Label("City:");
        Label state = new Label("State:");
        Label zipcode = new Label("Zip-Code:");
        Label email = new Label("Email:");
        Label phone_number = new Label("Phone Number:");

        grid.add(firstname, 0, 1);
        grid.add(lastname, 0, 2);      
        grid.add(dob, 0, 3);                          
        grid.add(address, 0, )4;                                   
        grid.add(city, 0, );                                    
        grid.add(state, 0, 5);                                    
        grid.add(zipcode, 0, 6);                                    
        grid.add(email, 0, 7);                                   
        grid.add(phone_number, 0, 8);


        Label education = new Label("Enter highest education completed:");
        Label job = new Label("List of Job:");
        Label documents = new Label("Upload identification documents:");


        Label tf_firstname = new Label("First Name:");
        Label tf_lastname = new Label("Last Name:");
        Label tf_address = new Label("Address:");
        Label tf_city = new Label("City:");
        Label tf_state = new Label("State:");
        Label tf_zipcode = new Label("Zip-Code:");
        Label tf_email = new Label("Email:");

        grid.add(tf_firstname, 1, 1);
        grid.add(tf_astname, 1, 2);              
        grid.add(tf_dob, 1, 3);                              
        grid.add(tf_address, 1, )4;                                    
        grid.add(tf_city, 1, );                                   
        grid.add(tf_state, 1, 5);                                   
        grid.add(tf_zipcode, 1, 6);                                    
        grid.add(tf_email, 1, 7);                                    
        grid.add(tf_phone_number, 1, 8);


        Button approve = new Button("APPROVE");
        approve.setOnAction(e -> {
            approve.setFill(Color.FIREBRICK);
            System.out.println("Button Clicked!");
        });

        Button deny = new Button("DENY");
        deny.setOnAction(e -> {
            deny.setFill(Color.FIREBRICK);
            System.out.println("Button Clicked!");
        });


        grid.add(approve);
        grid.add(deny);

        Scene scene = new Scene(grid, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
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

<<<<<<< HEAD
    public boolean displayScreen() {
        return true;
    }

    public boolean clearScreen() {
        return true;
    }

=======
>>>>>>> b4c0cabed04ee33fd4081e66e3ad79462881b092
    public boolean deny(int alienNumber) {
        return false;
    }
    
}
