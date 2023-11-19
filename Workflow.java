import java.util.ArrayList;


public class Workflow {

    //create a table variable
    ArrayList<Integer> table;

    //constructor to initialze the table
    public Workflow()
    {
        table = new ArrayList<>();
    }

    //get the size of the table
    public int getSize()
    {
        return table.size();
    }

    //get the table
    public ArrayList<Integer> getTable()
    {
        return table;
    }

    //main method
    public static void main(String[] args)
    {
        //create a workflow table
        Workflow immigrantTable = new Workflow();
        //create a business object
        Business business = new Business();
        //create a temporary DataEntry variable
        DataEntry temp = new DataEntry(immigrantTable, business);

        //do while loop to keep going until the user presses quit
        while(!temp.getQuit())
        {
            if(temp.getSubmit())
            {
                temp = new DataEntry(immigrantTable, business);
            }
        }

        //create an approval object
        Approval approval;

        //if there is another business object
        while(immigrantTable.getTable().get(0) < business.getTable().size())
        {
            //make a new approval object
            approval = new Approval(business, immigrantTable.getTable().get(0));


            //if the user submitted whether or not they accepted or rejected the applicant
            if(approval.canNext())
            {
                
                
                //remove the top item to move through the workflow
                immigrantTable.getTable().remove(0);
            }
        }

    }

}
