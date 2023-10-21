import java.io.File;
public class DataEntry {

    private String name;
    private String address;
    private String email;
    private int ssn;
    private int dob;
    private int phone_number;
    private String[] job;
    private String[] education;
    private File[] files;

    // Getter and setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for 'address'
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and setter for 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter for 'ssn'
    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
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
