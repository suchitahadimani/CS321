public class Approval {
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

    public void displayScreen() {
    }

    public void clearScreen() {
    }

    public boolean deny(int alienNumber) {
        return false;
    }
    
}
