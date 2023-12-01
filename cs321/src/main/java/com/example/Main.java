package CS321.src.main;

public class Main {
    public static void main(String[] args){
        
        DataEntry g = new DataEntry();
        Approval m = new Approval();
        Business b = new Business();
        System.out.println(b.generateTrackingNumber(g));
    }
}
