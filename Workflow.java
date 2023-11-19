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
        //create an approval object
        Approval approval;

        //do while loop to keep going until the user presses quit
        while(!temp.getQuit())
        {
            if(temp.getSubmit())
            {
                temp = new DataEntry(immigrantTable, business);
            }
        }

        // int count = 0; //incorporate workflow in count
        // while(count < business.getTable().size())
        // {
        //     if(approval.getNext())
        //     {
        //         approval = new Approval(business, immigrantTable.getTable().size() - count - 1);
        //         count++;
        //     }
        // }
        //for loop to call approval for the amount of 
        for(int i = 0; i < immigrantTable.getTable().size(); i++)
        {
            approval = new Approval(business, immigrantTable.getTable().size() - i - 1);
        }

    }

}
