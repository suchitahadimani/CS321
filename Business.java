import java.util.*;
import java.io.*;

public class Business {

    private boolean approvalStatus;
    private boolean approvalReceived;
    private DataEntry immigrant;
    private ArrayList<DataEntry> dataBase;

    public Business(){
        dataBase = new ArrayList<DataEntry>();
    }

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

    public void add_DB(DataEntry immigrant) {
        dataBase.add(immigrant);
    }

    public DataEntry retrieve_DB(int index) {
        return dataBase.get(index);
    }

    public boolean getApproval(DataEntry immigrant) {
        
        return false; 
    }

    public void sendApprovalEmail(DataEntry immigrant) {
        
    }

    public void sendDenialEmail(DataEntry immigrant) {
        
    }
    
}
