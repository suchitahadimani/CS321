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

    public void generateTrackingNumber(DataEntry immigrant) {

    }

    public void add_DB(DataEntry immigrant) {

    }

    public DataEntry retrieve_DB(DataEntry immigrant) {

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
