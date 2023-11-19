import java.util.ArrayList;


public class Workflow {

    private int currentStep;

    public static void main(String[] args)
    {
        ArrayList<Integer> table = new ArrayList<>();
    }

    public void addNext(ArrayList<Integer> table)
    {
        //
        //add the item to the end of the table
        table.add();
    }

    public int getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(int currentStep) {
        this.currentStep = currentStep;
    }

    public int getNext(int currentStep) {
        //until we figure out how to implement this
        return currentStep + 1;
    }

    public boolean hasNext(int currentStep) {
        return true;
    }
}
