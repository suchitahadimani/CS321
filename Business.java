import java.util.*;
import java.io.*;

public class Business {

    private boolean approvalStatus;
    private boolean approvalReceived;
    private DataEntry immigrant;

    public boolean isApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(boolean approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public boolean isApprovalReceived() {
        return approvalReceived;
    }

    public void setApprovalReceived(boolean approvalReceived) {
        this.approvalReceived = approvalReceived;
    }

    public DataEntry getImmigrant() {
        return immigrant;
    }

    public void setImmigrant(DataEntry immigrant) {
        this.immigrant = immigrant;
    }

    public int generateTrackingNumber(DataEntry immigrant) {
        Random randNum = new Random();
        System.out.print("Tracking Number: ");
        return randNum.nextInt(1000);
    }

    public void add_DB(DataEntry immigrant) {
        LinkedList<DataEntry> dataBase = new LinkedList<DataEntry>();
        dataBase.add(immigrant);
    }

    public DataEntry retrieve_DB(int Tracking) {

        return null; 
    }

    public boolean getApproval(DataEntry immigrant) {
        
        return false; 
    }

    public void sendApprovalEmail(DataEntry immigrant) {
        
    }

    public void sendDenialEmail(DataEntry immigrant) {
        
    }
    
}
