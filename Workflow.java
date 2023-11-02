public class Workflow {
    private int currentStep;

    public int getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(int currentStep) {
        this.currentStep = currentStep;
    }

    public int getNext(int currentStep) {
        //until we giure out how to implement this
        return currentStep + 1;
    }

    public boolean hasNext(int currentStep) {
        return true;
    }
}
