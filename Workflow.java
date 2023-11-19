import java.util.ArrayList;


public class Workflow {


    public Workflow()
    {
        ArrayList<Integer> table = new ArrayList<>();
    }

    public void addNext(ArrayList<Integer> table)
    {
        //add the item to the table
        table.add(table.size() + 1);
    }

    public static void main(String[] args)
    {
        Workflow immigrantTable = new Workflow();
        DataEntry item = new DataEntry();
        int i = 0;
        while(!item.getQuit())
        {
            i = 1;
        }

    }

}
